package 한줄씩읽기;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		String fileLocation = "C:\\Java\\WORKSPACE\\CH19_Reading+Writing\\test.txt";
		System.out.println(new File(fileLocation).exists());
		System.out.println();

//		BufferedReader reader = null;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileLocation));
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line); // 파일에서 읽는 한줄을 그대로 출력
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못함 : " + fileLocation);
		} catch (IOException e) {
			System.out.println("파일을 읽지 못함 : " + fileLocation);
		}

	}

}
