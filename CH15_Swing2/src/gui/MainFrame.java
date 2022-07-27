package gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public MainFrame(String title) {
		super(title);
		
		MainPanel mainPanel = new MainPanel();
		mainPanel.setBackground(Color.PINK);
		// 레이아웃 설정
		setLayout(new BorderLayout());
		// 패널 생성하여 창의 가운데 붙이기
//		JPanel panel = new JPanel();
//		panel.setBackground(Color.GREEN);
		add(new Toolbar(mainPanel), BorderLayout.NORTH);
		add(mainPanel, BorderLayout.CENTER);

		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
