package F.T.W.P;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameStart extends JFrame implements Runnable{
   public static JPanel panel1 = new JPanel();
   JPanel panel2 = new JPanel();
   public static Image image ;
   public static int time = 0;
   JButton button = new JButton("종료");
   JButton buttonck = new JButton();
   JLabel label = new JLabel();
   JLabel timer = new JLabel();
   public static JLabel life = new JLabel();
   static String [] hart = new String[5];
   String[] heart = new String[10];
   boolean a = false;
   boolean b = false;
   boolean c = false;
   DrawOval oval = new DrawOval();
   public static int aa;
   public static int bb;
   public static int i = 0;
   public GameStart(String title) {
      setSize(1000, 1000);
      setLocationRelativeTo(null);
      setResizable(false);
      
      Thread t1 = new Thread(this);
      t1.start();
      for(int i = 0; i < hart.length; i++) {
    	  hart[i] = "♥";
      }
      life.setText("♥♥♥♥♥");
      panel2.add(timer);
      Font font = new Font("나눔 고딕", Font.BOLD, 25);
      timer.setFont(font);
      life.setFont(font);
      panel2.add(life);
      panel2.setLayout(new GridLayout(0,2));
      add(panel2, BorderLayout.NORTH);
      
      image = new ImageIcon(title+".jpg").getImage();
      MyPanel panel = new MyPanel();
      panel.setLayout(null);
      add(panel);
      
      panel1.setLayout(new GridLayout(1,0));
      panel1.add(button);
      add(panel1, BorderLayout.SOUTH);
      button.addActionListener(e -> {
         dispose();
      });
      panel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               {
                 aa = e.getX();
                 bb = e.getY();
                 a = true;
               }
            }
        });
      setTitle("틀린 그림 찾기");
      setVisible(true);
      requestFocus();
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   class MyPanel extends JPanel{
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(image,0,0,getWidth(),getHeight(),this);
            if(a) {
               oval.paint(g);
            }
            repaint();
        }
    }
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
				i++;
				timer.setText(Integer.toString(i));
				time += 1 ;
				if(time == 60) {
					new GameSet();
					dispose();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}