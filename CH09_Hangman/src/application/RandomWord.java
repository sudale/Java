package application;

import java.util.Random;

/*
 * 랜덤 단어를 생성해주는 클래스 
 */

public class RandomWord {

	private String books = "mourning paragraph adoption philosophy houseplant diplomat absolute acquisition occasion constitution satisfaction property grandmother monopoly headline advertising dialogue beneficiary secretion restoration generation twilight tradition ancestor volunteer construct judicial courtship incredible bathroom";
	private String[] words = books.split(" "); // 스페이스로 단어들을 분리해서 배열
	private Random random = new Random();

	private String selectWord; // 랜덤으로 선택된 단어
	private char[] characters;

	/* 생성자로 생성시 단어가 선택됨 */
	public RandomWord() {
		selectWord = words[random.nextInt(words.length)]; // 첫번째 단어
		characters = new char[selectWord.length()];
	}

	/* 단어배열 words에 있는 모든 단어 출력 */
	public void getWords() {
		for (String word : words) {
			System.out.println(word);
		}
	}

	/* 선택된 한개의 단어 출력 */
	public String toString() {
		String text = "";
		// 철자를 맞췃을때
//		characters[3] = 'X';
		for (char c : characters) {
//			if (c == '\u0000') { //처음 상태 공백
//				text += '_';
//			} else { //문자를 맞췄을때
//				text += c;
//			}
			text += (c == '\u0000') ? '_' : c;
			text += ' ';
		}
//		System.out.println(selectWord); //임시로 단어를 보여줌
		return text;
	}

	/* 입력된 문자와 같은 문자가 있는지 확인해서 문자배열 characters에 입력 */
	public boolean addGuess(char c) {
		// 선택된 문자열 전체를 확인
		boolean ok = false;
		for (int i = 0; i < selectWord.length(); i++) {
			if (c == selectWord.charAt(i)) {
				characters[i] = c;
				ok = true;
			}
		}
		return ok ? true :false;
	}

	public boolean isCompleted() {
		for (char c : characters) {
			if (c == '\u0000') {
				return false;
			}
		}
		return true;
	}

	// 잠깐 테스트
//	public static void main(String[] args) {
//		RandomWord randomWord = new RandomWord();
//		System.out.println(randomWord.words[1]);
//	}
}
