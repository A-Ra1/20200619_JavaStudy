package com.sist.front;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.*;
// 날짜
import java.text.*; // SimpleDateFormat

import com.sist.back.*;

public class BoardMainFrame extends JFrame implements ActionListener{
	
	//CardLayout card=new CardLayout();
	BoardListPanel bp=new BoardListPanel();
	BoardInsertPanel bi=new BoardInsertPanel();
	JTabbedPane tp=new JTabbedPane();
	// 프로그램 연결 => ArrayList => BoardManager
	BoardManager bm=new BoardManager();
	
	
	public BoardMainFrame() {
		
	//	setLayout(card);
	//	add("Center",bp);
		
		tp.addTab("게시판 목록", bp);
		tp.addTab("글쓰기", bi);
		tp.setTabPlacement(tp.BOTTOM);
	//	tp.setSelectedIndex(1);
		add("Center",tp);
		setSize(640,480);
		setVisible(true);
		
		bp.b.addActionListener(this); // 새글
		bi.b1.addActionListener(this); // 글쓰기버튼
		bi.b2.addActionListener(this); // 취소버튼
	}

	public static void main(String[] args) {
		new BoardMainFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==bp.b) {// 새글버튼 클릭
			// 글쓰기 화면 이동
			tp.setSelectedIndex(1);
		
		}else if(e.getSource()==bi.b1) { // 글쓰기 버튼
			 // ArrayList에 저장
			// 입력한 데이터를 읽기
			String name=bi.tf1.getText();
			String subject=bi.tf2.getText();
			String content=bi.ta.getText();
			String pwd=String.valueOf(bi.pf.getPassword()); // 캐릭터 배열을 문자형으로 변환
			// password는 char[]로 
			
			BoardVO vo=new BoardVO();
			vo.setName(name);
			vo.setSubject(subject);
			vo.setContent(content);
			vo.setPwd(pwd);
			bm.insert(vo); // ArrayList에 추가
			// 목록 추가 => 메소드
			listPrint();
			// 목록 이동
			tp.setSelectedIndex(0);
			
		}else if(e.getSource()==bi.b2) { // 취소버튼
			 // 목록으로 이동
			tp.setSelectedIndex(0);
		}
	}
	public void listPrint() {
		// 목록(ArrayList) 받기
		ArrayList<BoardVO> list=bm.select();
		// 테이블에 출력
		// 테이블 지우기
		for(int i=bp.model.getRowCount()-1; i>=0; i--) { // 마지막에서부터 0번이 될때까지 지우기
			bp.model.removeRow(i);
		}
		// 출력
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		// MM (월) mm(분, 시간)
		for(BoardVO vo:list) {
			String[] data= {
					String.valueOf(vo.getNo()),
					vo.getSubject(),
					vo.getName(),
					sdf.format(vo.getRegdate()), //.toString(), // 클래스를 문자열로
					String.valueOf(vo.getHit())
			};
			
			bp.model.addRow(data);
		}
	}
		
}
