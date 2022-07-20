package 메소드;

public class ProgrammingGrades {

	public static void main(String[] args) {

		int score1 = 96;
		int score2 = 85;
		int score3 = 76;

		System.out.printf("%d점 -> %s\n", score1, grade(score1));
		System.out.printf("%d점 -> %s\n", score2, grade(score2));
		System.out.printf("%d점 -> %s\n", score3, grade(score3));
	}

	private static String grade(int score) {
		String grade;
		if(score>=95) {
			grade = "A+";
		} else if(score>=90) {
			grade = "A0";
		} else if(score>=80) {
			grade = "B+";
		} else if(score>=70) {
			grade = "B0";
		} else {
			grade = "C+";
		}
		return grade;
	}

}
