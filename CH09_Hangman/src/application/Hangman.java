package application;

import java.util.Scanner;

/*
 * 전체행맨 게임을 실행하는 클래스
 */

public class Hangman {

	private boolean running = true;
	private RandomWord word = new RandomWord();
	private Scanner scanner = new Scanner(System.in);
	private int remainTries = 20;
	private char lastGuess;

	public void run() {
		do {
			displayWord(); // 화면에 단어표시(완료)
			getUserInput(); // 입력받음
			checkUserInput(); // 맞는지 체크 => 맞을시 running=false

		} while (running);

	}

	public void displayWord() {
		// 단어 표시하기
		System.out.println(word.toString()); // 랜덤으로 선택된 단어
	}

	public void checkUserInput() {

		boolean isCorrect = word.addGuess(lastGuess);

		if (isCorrect) {
			if (word.isCompleted()) {
				System.out.println("승리했습니다!");
				System.out.println("시도횟수 : " + remainTries);
				System.out.println("정답은 : " + word);
				running = false;
			}
		} else {
			remainTries--;
			if (remainTries == 0) {
				System.out.println("Game Over!");
				running = false;
			}
			if (remainTries < 20) {
				System.out.printf("&d번의 기회가 남았습니다!\n", remainTries);
			}
		}
	}

	public void close() {
		scanner.close(); // 게임 종료시 스캐너 닫기
	}

	public void getUserInput() {
		System.out.print("한 문자 입력 : ");
		String guess = scanner.nextLine();
		// 문자열에서 빼낸 한 문자를 랜덤워드 메서드 addGuess에 입력
		lastGuess = guess.charAt(0);
	}
}
