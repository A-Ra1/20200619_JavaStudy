package com.sist.temp;

import java.awt.*;
import javax.swing.*;

public class GameView extends JPanel {
	
	Image img;
//	int x=850, y=500;
	HorseThread[] ht=new HorseThread[5];
	
	public GameView () {
		
		img=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\horse.gif");
	
		ht[0]=new HorseThread(850, 690);
		ht[1]=new HorseThread(850, 570);
		ht[2]=new HorseThread(850, 450);
		ht[3]=new HorseThread(850, 330);
		ht[4]=new HorseThread(850, 210);
		
		for(int i=0; i<5; i++) {
			
			ht[i].start();
		}
	}
	
	public void paint(Graphics g) {
	
		g.setColor(Color.white);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		for(int i=0; i<5; i++) {
			
			g.drawImage(img, ht[i].x, ht[i].y, 150, 100, this);
		}
		
	}
	
	class HorseThread extends Thread { // 내부클래스,멤버클래스
		
		int x,y;
		// 쓰레드 동작 메소드
		public HorseThread(int x,int y) {
			
			this.x=x;
			this.y=y;
			
		}
		public void run() {
			
			while(true) { // 무한반복
		
				try {
			
				x-=5; // 공유하는 대상이 많을때 내부클래스를 생성해서 공유한다
//						 상속없이 재정의 => 익명의 클래스
				if(x<-150) {
					
					interrupt(); // 쓰레드 종료
					
				}
			
				int a=(int)(Math.random()*101);
				
				Thread.sleep(a);
				
			} catch (Exception ex) {
			
			}
			
		  }
		}
		
	}
	
}
