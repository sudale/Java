package 한줄씩쓰기;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {

		String fileLocation = "C:\\Java\\WORKSPACE\\CH19_Reading+Writing\\text.txt";

		try {
			BufferedWriter br = new BufferedWriter(new FileWriter(fileLocation));
			br.write("오렌지");
			br.newLine(); //한줄뛰움
			br.write("apple");
			br.newLine(); //한줄뛰움
			br.write("banana");
			br.newLine(); //한줄뛰움
			br.write("배");
			br.newLine();
			br.close(); //파일을 닫아야 함

		} catch (IOException e) {
			// 파일을 쓸떄 파일 없으면 새로 만듬
			System.out.println("파일을 쓸 수 없음 : " + fileLocation);
		}
		System.out.println("파일 쓰기 완료 : " + fileLocation);
	}

}
