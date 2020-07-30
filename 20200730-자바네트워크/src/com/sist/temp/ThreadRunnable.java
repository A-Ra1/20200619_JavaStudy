package com.sist.temp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ThreadRunnable extends JFrame implements Runnable, ActionListener{

	JProgressBar bar1=new JProgressBar();
	JProgressBar bar2=new JProgressBar();
	JProgressBar bar3=new JProgressBar();
	
	JButton b1,b2;
	
	public ThreadRunnable() {
		
		bar1.setMinimum(0);
		bar1.setMaximum(100);
		bar1.setBackground(Color.white);
		bar1.setForeground(Color.cyan);
		bar1.setStringPainted(true); // 100% 중 진행률을 나타낸다
		
		bar2.setMinimum(0);
		bar2.setMaximum(100);
		bar2.setBackground(Color.white);
		bar2.setForeground(Color.pink);
		bar2.setStringPainted(true);
		
		bar3.setMinimum(0);
		bar3.setMaximum(100);
		bar3.setBackground(Color.white);
		bar3.setForeground(Color.yellow);
		bar3.setStringPainted(true);
		
		b1=new JButton("Start");
		b2=new JButton("Exit");
		
		// 배치
		setLayout(null);
		
		bar1.setBounds(10, 15, 500, 30);
		bar2.setBounds(10, 50, 500, 30);
		bar3.setBounds(10, 85, 500, 30);
		
		JPanel p=new JPanel();
		p.add(b1); p.add(b2);
		p.setBounds(10, 120, 500, 35);
		
		add(bar1);
		add(bar2);
		add(bar3);
		add(p);
		
		setSize(540, 200);
		setVisible(true);
		
		b1.addActionListener(this);
		
	}
	
	public void go() { // 프로그래스바 실행
	
		try {
			
			int a=(int)(Math.random()*101);
			
			for(int i=0; i<=a; i++) {
				
				bar1.setValue(i);
				Thread.sleep(100); //0.1초마다 시행되게
				
			}
			
			int b=(int)(Math.random()*101);
			
			for(int i=0; i<=b; i++) {
				
				bar2.setValue(i);
				Thread.sleep(100); //0.1초마다 시행되게
				
			}
			
			int c=(int)(Math.random()*101);
			
			for(int i=0; i<=c; i++) {
				
				bar3.setValue(i);
				Thread.sleep(100); //0.1초마다 시행되게
				
			}
		} catch (Exception ex) {

		}
	}
	
	public static void main(String[] args) {

		new ThreadRunnable();
	}

	@Override
	public void run() {
		
		// Thread가 어떻게 동작할건지 쓰는 위치
		go();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1) {
			
			new Thread(this).start();
		}
	}

}
