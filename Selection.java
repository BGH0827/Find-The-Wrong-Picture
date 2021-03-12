package F.T.W.P;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;

public class Selection extends JFrame {
	JButton[] button = new JButton[3];
	JLabel label = new JLabel("틀 린 그 림 찾 기");
	MyPanel panel = new MyPanel();           // 라벨과 버튼을 패널에 넣는다
	ImageIcon i = new ImageIcon("배경.jpg"); // 메뉴 배경
	Image im = i.getImage();
	LineBorder line = new LineBorder(Color.white,1);
	BevelBorder borderb = new BevelBorder(BevelBorder.RAISED);
	SoftBevelBorder bordera = new SoftBevelBorder(SoftBevelBorder.LOWERED);
	public Selection() {
		Font font = new Font("나눔고딕", Font.BOLD, 37); // 가운데 상단 라벨 틀린그림찾기 폰트
		Font font1 = new Font("나눔고딕", Font.BOLD, 25); // 버튼 글씨 폰트
		button[0] = new JButton("게임 시작");
		button[1] = new JButton("랭킹");
		button[2] = new JButton("게임 종료");
		button[0].addActionListener(e -> {
			new GameStart("틀린그림 1");  // 게임시작 버튼을 누르면 
			dispose();
		});
		button[1].addActionListener(e -> {
			new Ranking();
		});
		button[2].addActionListener(e -> {
			dispose();
		});
		label.setBounds(100, 50, 300, 50);
		label.setForeground(Color. blue);
		label.setFont(font);
		button[0].setBounds(140, 150, 200, 50); // 버튼 크기와 위치 조절
		button[1].setBounds(140, 250, 200, 50);
		button[2].setBounds(140, 350, 200, 50);
		button[0].setBorder(line);
		button[1].setBorder(line);
		button[2].setBorder(line);
		button[0].setBorder(borderb);
		button[1].setBorder(borderb);
		button[2].setBorder(borderb);
		button[0].setContentAreaFilled(false);
		button[1].setContentAreaFilled(false);
		button[2].setContentAreaFilled(false);
		button[0].setFocusPainted(false);
		button[1].setFocusPainted(false);
		button[2].setFocusPainted(false);
		button[0].setFont(font1);
		button[0].setForeground(Color.cyan);
		button[1].setFont(font1);
		button[1].setForeground(Color.cyan);
		button[2].setFont(font1);
		button[2].setForeground(Color.cyan);
		panel.add(label);
		panel.add(button[0]);
		panel.add(button[1]);
		panel.add(button[2]);
		panel.setLayout(null);
		add(panel);
		setSize(500, 500);
		setTitle("틀린 그림 찾기");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창의 X를 눌러도 게임 종료
		setLocationRelativeTo(null); // 창을 화면의 가운데 위치
	}

	 class MyPanel extends JPanel{ // 배경을 넣음
	        public void paintComponent(Graphics g){
	            super.paintComponent(g);
	            g.drawImage(im,0,0,getWidth(),getHeight(),this);
	        }
	 }
}