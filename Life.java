package F.T.W.P;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Life {
	JLabel[] label = new JLabel[5];
	ImageIcon i = new ImageIcon("���.jpeg");
	Image im = i.getImage();
	MyPanel panel = new MyPanel();
	
	public Life() {
		label[0] = new JLabel();
		label[1] = new JLabel();
		label[2] = new JLabel();
		label[3] = new JLabel();
		label[4] = new JLabel();
		
		label[0].setBounds(30, 30, 100, 100); // �� ũ��� ��ġ ����
		label[1].setBounds(30, 30, 100, 100);
		label[2].setBounds(30, 30, 100, 100);
		label[3].setBounds(30, 30, 100, 100);
		label[4].setBounds(30, 30, 100, 100);

		panel.add(label[0]);
		panel.add(label[1]);
		panel.add(label[2]);
		panel.add(label[3]);
		panel.add(label[4]);
		panel.setLayout(null);
		//add(panel);
	}
	
	class MyPanel extends JPanel{                             // ��� �̹����� ����
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(im,0,0,getWidth(),getHeight(),this);
        }
 }
}
