package com.sist.client;

import java.awt.*;
import javax.swing.*;

public class MenuForm extends JPanel {

	JButton b1, b2, b3, b4;
	
	public MenuForm() {
		
		b1=new JButton("영화");
		b2=new JButton("예매");
		b3=new JButton("이벤트");
		b4=new JButton("채팅");
		
		setLayout(new GridLayout(1, 4, 5, 5));
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
	}
	
}
