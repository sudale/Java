package 파일위치;

import java.io.File;

public class App {

	public static void main(String[] args) {

		String fileLocation = "C:\\Java\\WORKSPACE\\CH19_Reading+Writing\\test.txt";
		System.out.println(new File(fileLocation).exists());
	}

}
