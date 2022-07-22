package 배열;

public class Bacteria {

	public static void main(String[] args) {
		
		int[] bacteriaCountLogs = new int[10];
		
		writeLog(bacteriaCountLogs);
		
		printLog(bacteriaCountLogs);

	}

	private static void writeLog(int[] bacteriaCountLogs) {
		for(int i =0; i<bacteriaCountLogs.length; i++) {
			bacteriaCountLogs [i] = (int)Math.pow(2, i);
		}
		
	}

	private static void printLog(int[] bacteriaCountLogs) {
		System.out.print("[");
		for(int i=0;i<bacteriaCountLogs.length;i++) {
			System.out.printf("%d", bacteriaCountLogs[i]);
			if (i != bacteriaCountLogs.length -1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}

}
