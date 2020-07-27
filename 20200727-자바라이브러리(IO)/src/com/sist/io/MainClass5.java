package com.sist.io;

import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// 파일 업로드 (파일 카피)

public class MainClass5 extends JFrame implements ActionListener{
	
	JTextField tf=new JTextField(25); 
	JButton b=new JButton("파일 선택");
	
	public MainClass5() {
		
		JPanel p=new JPanel();
		p.add(tf);
		p.add(b);
		add("Center",p);
		setSize(450, 250);
		setVisible(true);
		
		b.addActionListener(this);
	}

	public static void main(String[] args) {

		// 생성자호출
		new MainClass5();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b) { //e.getSource => 클릭한 버튼이 무엇인지
			
			JFileChooser jc=new JFileChooser();
			if(jc.showOpenDialog(this)==jc.APPROVE_OPTION) {
				
				tf.setText(jc.getSelectedFile().getPath());
				
				// 파일 카피 (업로드(
				try {
					
					FileInputStream fis=new FileInputStream(tf.getText());
					FileOutputStream fos=new FileOutputStream("c:\\upload\\"+jc.getSelectedFile().getName());
					
					int i=0;
					byte[] buffer=new byte[1024];
					
					while((i=fis.read(buffer, 0, 1024))!=-1) {
						
						fos.write(buffer, 0, i);
					}
					
					fis.close();
					fos.close();
					JOptionPane.showMessageDialog(this, "파일업로드 완료");	
					
				} catch (Exception e2) {

				}
				
			}
			
		}
	}

}
