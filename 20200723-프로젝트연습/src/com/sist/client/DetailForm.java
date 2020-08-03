package com.sist.client;
import java.awt.*;
import javax.swing.*;
import java.net.*; //url

import com.sist.data.MovieManager;
import com.sist.data.MovieVO;

public class DetailForm extends JPanel {

	JLabel poster=new JLabel();
	JLabel la1=new JLabel("",JLabel.CENTER);
	JLabel[] la=new JLabel[4];
	JTextPane ta=new JTextPane(); // �ڵ����� �ٳѱ� 
	JButton b1,b2;
	
	public DetailForm() {

		setLayout(null);
		
		poster.setBounds(10, 15, 350, 400);
//		poster.setOpaque(true);
//		poster.setBackground(Color.red);
		add(poster);
		
		la1.setBounds(365, 15, 500, 45);
//		la1.setOpaque(true);
//		la1.setBackground(Color.blue);
		la1.setFont(new Font("����ü",Font.BOLD,20));
		add(la1);
		
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(4,1,5,5));
		String[] str= {"����","�⿬","����","���"};
		
		
		for(int i=0; i<4; i++) {
			la[i]=new JLabel(str[i]);
			la[i].setFont(new Font("����ü",Font.BOLD,20));
			p.add(la[i]);
		}
		
		p.setBounds(365, 80, 500, 300);
		add(p);
		
		ta.setEditable(false); // ��Ȱ��ȭ
		JScrollPane js=new JScrollPane(ta);
		js.setBounds(10, 470, 855, 150);
		add(js);
		
		b1=new JButton("��û");
		b2=new JButton("���");	
		b1.setBackground(Color.red);
		b2.setBackground(Color.green);
		
		JPanel p2=new JPanel();
		p2.add(b1);
		p2.add(b2);
		
		p2.setBounds(365, 385, 200, 35);
		add(p2);
		
	}
	
	public void detailPrint(int mno) {
		MovieManager m=new MovieManager();
		MovieVO vo=m.movieDatailData(mno);
		la1.setText(vo.getTitle());
		
		try {
			URL url=new URL(vo.getPoster());
			Image img=ClientMainFrame.getImage(new ImageIcon(url), poster.getWidth(), poster.getHeight()); // ����(Label)ũ��
			
			poster.setIcon(new ImageIcon(img));
		} catch (Exception e) {

		}
		
		la[0].setText("����:"+vo.getRegyear());
		la[1].setText(""+vo.getActor());
		la[2].setText("����"+vo.getScore());
		la[3].setText(""+vo.getStory());

		
		ta.setText(vo.getCritics());
	}
}
