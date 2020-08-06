package com.sist.client;

import javax.swing.*;


import java.awt.*;

public class Login extends JPanel {
	// 스킨
	private Image back;
	private JLabel la1,la2,la3; // ID, pwd
	// Login
	JTextField tf;
	JTextField pf;
	JButton b1,b2; // login, 취소
	JRadioButton rb1,rb2;
	// MainForm
	public Login() {
//		 이미지 정보 읽기
		back=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\back.jpg");
		
		setLayout(null); // 직접배치
		la1=new JLabel("아이디",JLabel.RIGHT);
		la1.setBounds(745, 730, 80, 30);
		tf=new JTextField();
		tf.setBounds(830, 730, 150, 30);
		
		add(la1); add(tf);
		
		la2=new JLabel("대화명",JLabel.RIGHT);
		la2.setBounds(745, 765, 80, 30);
		pf=new JTextField();
		pf.setBounds(830, 765, 150, 30);
		
		add(la2); add(pf);
		
		rb1=new JRadioButton("남자");
		rb2=new JRadioButton("여자");
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1); bg.add(rb2);
		rb1.setSelected(true);
		la3=new JLabel("성별",JLabel.RIGHT);
		la3.setBounds(745, 800, 80, 30);
		rb1.setBounds(830, 800, 70, 30);
		rb2.setBounds(910, 800, 70, 30);
		rb1.setOpaque(false);
		rb2.setOpaque(false);
		
		add(la3); add(rb1); add(rb2);
		
		
		b1=new JButton("로그인");
		b2=new JButton("취소");
		JPanel p=new JPanel(); // 묶어서 한번에 배치
		p.add(b1);
		p.add(b2);
		p.setOpaque(false); // 투명모드
		
		p.setBounds(745, 850, 235, 35);
		add(p);
	}
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(back, 0,0,getWidth(),getHeight(),this);
	}
	
}
