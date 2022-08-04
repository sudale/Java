package example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Book_wordSet {

	public static void main(String[] args) {

		File wordsFrankenstein = new File("Frankenstein.txt");

		System.out.println(wordsFrankenstein.exists());

		TreeSet<String> Frankenstein = loadWords(wordsFrankenstein);
		System.out.println(Frankenstein.size());

		displayWords(Frankenstein);

	}

	private static void displayWords(TreeSet<String> list) {
		// 단어길이 6자 이상만 콘솔에 한줄에 6개씩 출력
		int count = 0;
		for (String word : list) {

			if (word.length() < 6)
				continue;
			System.out.printf("%-10s \t", word);
			count++;
			if (count % 6 == 0) {
				System.out.println();
				count = 0;
			}
		}

	}

	private static TreeSet<String> loadWords(File file) {
		// 책 파일의 모든 단어들을 set 리스트에 넣어서 리턴한다
		TreeSet<String> wordSet = new TreeSet<String>();

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] words = line.split("[^a-zA-Z]+");
				for (String word : words) {
					wordSet.add(word.toLowerCase());
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못함");
		} catch (IOException e1) {
			System.out.println("파일을 못 읽음");
		}

		return wordSet;
	}

}
