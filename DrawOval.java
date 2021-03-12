package F.T.W.P;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;

public class DrawOval {
boolean [] answer = new boolean [4];
boolean check = false;
boolean OX = false;
int i = 0;
static int a1 = 5;

      public void paint(Graphics g) {
         Graphics2D g2 = (Graphics2D)g;
         g.setColor(Color.RED);
         g2.setStroke(new BasicStroke(5));
         if(OX == false) {
         if(GameStart.aa > 18) {
            if(GameStart.aa <108) {
               if(GameStart.bb > 449) {
                  if(GameStart.bb < 660) {
                     answer[0] = true;
                  }
               }
            }
         }
         if(GameStart.aa > 513) {
            if(GameStart.aa < 603) {
               if(GameStart.bb > 447) {
                  if(GameStart.bb < 558) {
                    answer[0] = true;
                  }
               }
            }
         }
         if(GameStart.aa > 76) {
            if(GameStart.aa < 161) {
               if(GameStart.bb > 583) {
                  if(GameStart.bb < 665) {
                     answer[1] = true;
                  }
               }
            }
         }
         if(GameStart.aa > 570) {
            if(GameStart.aa < 655) {
               if(GameStart.bb > 584) {
                  if(GameStart.bb < 666) {
                     answer[1] = true;
                  }
               }
            }
         }
         if(GameStart.aa > 421) {
            if(GameStart.aa < 491) {
               if(GameStart.bb > 523) {
                  if(GameStart.bb < 640) {
                   answer[2] = true;
                  }
               }
            }
         }
         if(GameStart.aa > 912) {
            if(GameStart.aa < 982) {
               if(GameStart.bb > 518) {
                  if(GameStart.bb < 635) {
                    answer[2] = true;
                  }
               }
            }
         }
         	i = 0;
        }
         else
        	 GameStart.panel1.addMouseListener(new java.awt.event.MouseAdapter() {
                 @Override
                 public void mouseClicked(MouseEvent e) {
                    {
                      a1 --;
                      if(a1 == 0) {
                    	  new GameSet();
                      }
                    }
                 }
             });
   for(int i = 0; i < answer.length; i++){
      if(answer[i] == true){
         i++;
      }
   }
         if(answer[0]) {
            g.drawOval(18, 449, 90, 111);  // 왼쪽 그림 안경
              g.drawOval(513, 447, 90, 111);  // 오른쪽 그림 안경
         }
         if(answer[1]) {
           g.drawOval(76, 583, 85, 82);  // 왼쪽  그림 콜라
             g.drawOval(570, 584, 85, 82);  // 오른쪽 그림 콜라
         }
         if(answer[2]) {
            g.drawOval(421, 523, 70, 117);  // 왼쪽 그림 음표
             g.drawOval(912, 518, 70, 117);  // 오른쪽 그림 음표
         }
   if(answer[0] && answer[1] && answer[2]){
      answer[3] = true;
   }
   if(answer[3]) {

	   answer[0] = false;
	   answer[1] = false;
	   answer[2] = false;
	   answer[3] = false;
	      i = 3;
   }
         if(i == 3 && answer[3] == false){
            new GameStart("틀린그림 2");
            i = 0;
         }
    }
}