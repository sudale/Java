package game;

import java.util.Random;
import java.util.Scanner;

import game.objects.GameObject;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scissor;

public class Game {

	GameObject[] objects = { new Scissor(), new Rock(), new Paper() };
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);

	public void run() {
		System.out.println("삼세판 게임 시작합니다.");
		int wins = 0;

		for (int i = 1; i <= 3; i++) {
			System.out.println(i + "번째 게임 시작...");

			System.out.println("가위(0),바위(1),보(2) 중 숫자로 선택 : ");

			GameObject ob1 = objects[scanner.nextInt()];
			GameObject ob2 = objects[random.nextInt(objects.length)];

			System.out.println("당신의 선택은 : " + ob1.getName());
			System.out.println("컴퓨터 선택은 : " + ob2.getName());

			// 누가 이겼는지 표시
			int score = ob1.compareTo(ob2);
			wins += score;
		}

		if (wins > 0) {
			System.out.println("당신의 승리!");
		} else if (wins < 0) {
			System.out.println("당신의 패배!");
		} else {
			System.out.println("비겼습니다!");
		}
		scanner.close();
	}
}
