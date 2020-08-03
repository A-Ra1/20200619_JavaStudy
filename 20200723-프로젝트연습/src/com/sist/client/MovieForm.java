package com.sist.client;

import java.awt.*;
import javax.swing.*;
import java.util.*; // data를 받을 수 있는 ArrayList포함
import com.sist.data.*;

public class MovieForm extends JPanel{ 
	
//	Jpanel = 전체
	
	JButton b1,b2;
	JPanel p=new JPanel();
	MovieCard[] mc=new MovieCard[10];
	
	ClientMainFrame c;
	
	
	public MovieForm(ClientMainFrame c) {
		
		this.c=c;
		setLayout(new BorderLayout());
		b1=new JButton("◀");
		b2=new JButton("▶");
		
		p.setLayout(new GridLayout(2,5,5,5));
		
		moviePrint(1);
		
			add("West",b1); // borderlayout은 위치지정해야한다
			add("Center",p);
			add("East",b2);
	}
	
	public void moviePrint(int page) {
		
		MovieManager m=new MovieManager(); 
		ArrayList<MovieVO> list=m.movieListData(page);
				
		int i=0;
		
			for(MovieVO vo:list) {
			mc[i]=new MovieCard(vo.getTitle(), vo.getPoster());
			p.add(mc[i]);
			
			mc[i].addMouseListener(c); 
			i++;
		}
		
		
	}
}
