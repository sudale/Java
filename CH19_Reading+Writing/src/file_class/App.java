package file_class;

import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {

		File currenDirectory = new File(".");

		System.out.println(currenDirectory.getAbsolutePath());
		System.out.println(currenDirectory.getCanonicalPath());

		for (String f : currenDirectory.list()) {
			System.out.println(f);
		}

	}

}
