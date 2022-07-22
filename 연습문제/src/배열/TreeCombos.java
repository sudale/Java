package 배열;

public class TreeCombos {

	public static void main(String[] args) {

		printCombos(10);

	}

	public static void printCombos(int n) {
		int count = 0;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				for (int k = 0; k <= n; k++) {
					if(i*j*k==10) {
						System.out.printf("%d = %d x %d x %d\n",n,i,j,k);
						count++;
					}
				}
			}
		}
		System.out.println("======================");
		System.out.printf("경우의 수:%d",count);
	}

}
