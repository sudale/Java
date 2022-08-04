package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;

class ColorListener implements ActionListener {
	private MainPanel mainPanel;
	private Color color;

	public ColorListener(MainPanel mainPanel, Color color) {
		this.mainPanel = mainPanel;
		this.color = color;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		mainPanel.setBackground(color);

	}

}

//class BlueListener implements ActionListener {
//
//	private MainPanel mainPanel;
//
//	public BlueListener(MainPanel mainPanel) {
//		this.mainPanel = mainPanel;
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("블루버튼 클릭!");
//		mainPanel.setBackground(Color.BLUE);
//
//	}
//}

public class Toolbar extends JToolBar {

	private static final long serialVersionUID = 1L;

	public Toolbar(MainPanel mainPanel) {

		JButton redButton = new JButton("Red");
		JButton blueButton = new JButton("Blue");

		redButton.addActionListener(e -> mainPanel.setBackground(Color.red));
		
		blueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanel.setBackground(Color.blue);
			}
		});

		add(redButton);
		add(blueButton);

	}

}
