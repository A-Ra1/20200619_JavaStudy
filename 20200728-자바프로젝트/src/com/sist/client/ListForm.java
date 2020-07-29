package com.sist.client;
import com.sist.data.*;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import com.sist.data.MovieVO;
import com.sun.org.apache.bcel.internal.generic.NEW;

import java.net.*; //url


public class ListForm extends JPanel implements MouseListener{
	
	JButton b1,b2,b3,b4,b5,b6;
	JTextField tf;
	JTable table;
	DefaultTableModel model;
	MovieDetailForm mdf=new MovieDetailForm();
	
	/*
	 *  기능 => 메소드 => 리턴형, 매개변수
	 * 
	 */
	public ListForm() {
		
		setLayout(null); // FlowLayout 
		
		b1=new JButton("현재상영영화");
		b2=new JButton("개봉예정영화");
		b3=new JButton("박스오피스(주간)");
		b4=new JButton("박스오피스(월간");
		b5=new JButton("박스오피스(연간)");
		b6=new JButton("검색");
		
		tf=new JTextField(20);
		
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2); // add => 패널을 한번에 묶어줌 => 순서O
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(tf);
		p.add(b6);
		
		p.setBounds(10, 25, 900, 35);
		
		add(p);
		
		String[] col= {"번호","","제목","감독","장르","등급"};
		Object[][] row=new Object[0][6];
		
		// DefaultTableModel => 오버라이딩할 메소드가 있다(익명의 클래스 => 내부클래스)
		/*
		 *  내부클래스
		 *  ==========
		 *   class A
		 *   {
		 *   
		 *    	
		 *     class B  => A클래스의 멤버 => 멤버클래스
		 *     {
		 *     
		 *     }
		 *   }
		 */
		model=new DefaultTableModel(row,col) {

			// 편집방지
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}

			// 이미지첨부 
			@Override
			public Class<?> getColumnClass(int columnIndex) {
				// TODO Auto-generated method stub
				return getValueAt(0, columnIndex).getClass();
			}
			
		};
		
		table=new JTable(model);
		table.setRowHeight(50);
		
		JScrollPane js=new JScrollPane(table);
		
		
		
		js.setBounds(10, 70, 700, 600);
		add(js);
		
		mdf.setBounds(715, 70, 800, 650);
		add(mdf);
		
		movieAllData(1);
		
		mdf.detailPrint(1);
		
		table.addMouseListener(this);
	}
	
	
	public void movieAllData(int cno) {
		
		// 데이터 가지고 오기
		MovieManager m=new MovieManager(); // 인스턴스 ~ 객체생성 후 데이터 가져오기
		ArrayList<MovieVO> list=m.movieAllData(cno);
		
		//테이블 한번 지우기
		//맨 마지막부터 지운다
		for(int i=model.getRowCount()-1; i>=0; i--) {// 출력된 전체 갯수
		
			model.removeRow(i);}
		
		
		/*
		 *  데이터 출력 
		 *  java.io, java.net => CheckException => 반드시 예외처리
		 */
		for(MovieVO vo:list) {
			try {
				
			URL url=new URL(vo.getPoster()); // http: => url 사용, 다운된 이미지 => 경로명
			Image img=ClientMainFrame.getImage(new ImageIcon(url), 50, 50);
			
			Object[] data= {
					
					vo.getMno(),
					new ImageIcon(img),
					vo.getTitle(),
					vo.getDirector(),
					vo.getGenre(),
					vo.getGrade()
			};
			model.addRow(data);
			}
			catch (Exception e) {
				
			}
		}
	}
	
public void movieFindData(String ss) {
		
		// 데이터 가지고 오기
		MovieManager m=new MovieManager(); // 인스턴스 ~ 객체생성 후 데이터 가져오기
		ArrayList<MovieVO> list=m.movieFindData(ss);
		
		//테이블 한번 지우기
		//맨 마지막부터 지운다
		for(int i=model.getRowCount()-1; i>=0; i--) {// 출력된 전체 갯수
		
			model.removeRow(i);}
		
		
		/*
		 *  데이터 출력 
		 *  java.io, java.net => CheckException => 반드시 예외처리
		 */
		for(MovieVO vo:list) {
			try {
				
			URL url=new URL(vo.getPoster()); // http: => url 사용, 다운된 이미지 => 경로명
			Image img=ClientMainFrame.getImage(new ImageIcon(url), 50, 50);
			
			Object[] data= {
					
					vo.getMno(),
					new ImageIcon(img),
					vo.getTitle(),
					vo.getDirector(),
					vo.getGenre(),
					vo.getGrade()
			};
			model.addRow(data);
			}
			catch (Exception e) {
				
			}
		}
	}


@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==table) {
		if(e.getClickCount()==2) {
			int row=table.getSelectedRow(); // 몇번째 줄 선택했는지
			String mno=model.getValueAt(row, 0).toString();
			mdf.detailPrint(Integer.parseInt(mno));
		}
	}
}


@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
		
	
}
