package 반복문;

public class While반복문 {

	public static void main(String[] args) {
		// while(조건문) {명령문;}
		int counter = 0;
		
		while (counter<=10) {
			System.out.printf("카운터 : %d \n", counter);
//			counter = counter+1;
//			counter++;
			counter +=1;
		}

	}

}
