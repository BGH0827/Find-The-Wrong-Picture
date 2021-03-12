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
	JLabel label = new JLabel("Ʋ �� �� �� ã ��");
	MyPanel panel = new MyPanel();           // �󺧰� ��ư�� �гο� �ִ´�
	ImageIcon i = new ImageIcon("���.jpg"); // �޴� ���
	Image im = i.getImage();
	LineBorder line = new LineBorder(Color.white,1);
	BevelBorder borderb = new BevelBorder(BevelBorder.RAISED);
	SoftBevelBorder bordera = new SoftBevelBorder(SoftBevelBorder.LOWERED);
	public Selection() {
		Font font = new Font("�������", Font.BOLD, 37); // ��� ��� �� Ʋ���׸�ã�� ��Ʈ
		Font font1 = new Font("�������", Font.BOLD, 25); // ��ư �۾� ��Ʈ
		button[0] = new JButton("���� ����");
		button[1] = new JButton("��ŷ");
		button[2] = new JButton("���� ����");
		button[0].addActionListener(e -> {
			new GameStart("Ʋ���׸� 1");  // ���ӽ��� ��ư�� ������ 
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
		button[0].setBounds(140, 150, 200, 50); // ��ư ũ��� ��ġ ����
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
		setTitle("Ʋ�� �׸� ã��");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â�� X�� ������ ���� ����
		setLocationRelativeTo(null); // â�� ȭ���� ��� ��ġ
	}

	 class MyPanel extends JPanel{ // ����� ����
	        public void paintComponent(Graphics g){
	            super.paintComponent(g);
	            g.drawImage(im,0,0,getWidth(),getHeight(),this);
	        }
	 }
}