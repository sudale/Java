package application;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class HelloWorld {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(() -> {
			// JFrame은 윈도우 창
			JFrame mainFrame = new JFrame(); //새창

			mainFrame.setSize(600, 400);
			mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			mainFrame.setVisible(true); //창을 보이게함

		});
	}

}
