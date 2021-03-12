package F.T.W.P;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameSet extends JFrame {
	JLabel label = new JLabel("다시 도전하세요.");
	JPanel panel = new JPanel();
	
	public GameSet() {
		Font font = new Font("나눔고딕", Font.BOLD, 35);
		label.setForeground(Color.white);
		label.setFont(font);
		add(panel, BorderLayout.CENTER);
		panel.add(label);
		panel.setOpaque(true);
		setSize(500, 500);
		setTitle("틀린 그림 찾기");
		setVisible(true);
		panel.setLayout(null);
		label.setBounds(100, 200, 300, 40);
		panel.setBackground(Color.black);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
}
