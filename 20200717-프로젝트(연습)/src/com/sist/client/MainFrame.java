package com.sist.client;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MainFrame extends JFrame implements ActionListener {

	JLabel title=new JLabel("사이트 이름", JLabel.CENTER);
	MenuForm mf=new MenuForm();
	FindForm findform=new FindForm();
	
	public MainFrame() {
		
		title.setFont(new Font("굴림체", Font.BOLD, 55));
		
		setLayout(null);
		
		title.setBounds(10, 15, 800, 100);
		add(title);
		
		mf.setBounds(50, 120, 1500, 75); 
		add(mf);
		
		findform.setBounds(1500, 10, 150, 30);
		add(findform);
		
		setSize(1600, 1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) throws Exception{
		
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new MainFrame();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
