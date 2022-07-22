package 배열;

public class AEIOU {

	public static void main(String[] args) {

		String s = "Programming is fun! right?";

		int[] result = count(s);

		System.out.printf("%s\n=> 자음 %d개, 모음 %d개", s, result[0], result[1]);

	}

	private static int[] count(String s) {
		int conso = 0;
		int vowel = 0;

		char[] characters = s.toUpperCase().toCharArray();
		
		for (int i = 0; i<characters.length; i++) {
			switch (characters[i]) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				vowel++;
				break;
				
			case ' ':
			case '\t':
			case '\n':
			case ',':
			case '.':
			case '?':
			case '!':
				break;
				
			default:
				conso++;
				break;
			}
		}
		return new int[] {conso,vowel};
	}

}
