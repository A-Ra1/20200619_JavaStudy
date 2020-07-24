package com.sist.front;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.*;
// ��¥
import java.text.*; // SimpleDateFormat

import com.sist.back.*;

public class BoardMainFrame extends JFrame implements ActionListener{
	
	//CardLayout card=new CardLayout();
	BoardListPanel bp=new BoardListPanel();
	BoardInsertPanel bi=new BoardInsertPanel();
	JTabbedPane tp=new JTabbedPane();
	// ���α׷� ���� => ArrayList => BoardManager
	BoardManager bm=new BoardManager();
	
	
	public BoardMainFrame() {
		
	//	setLayout(card);
	//	add("Center",bp);
		
		tp.addTab("�Խ��� ���", bp);
		tp.addTab("�۾���", bi);
		tp.setTabPlacement(tp.BOTTOM);
	//	tp.setSelectedIndex(1);
		add("Center",tp);
		setSize(640,480);
		setVisible(true);
		
		bp.b.addActionListener(this); // ����
		bi.b1.addActionListener(this); // �۾����ư
		bi.b2.addActionListener(this); // ��ҹ�ư
	}

	public static void main(String[] args) {
		new BoardMainFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==bp.b) {// ���۹�ư Ŭ��
			// �۾��� ȭ�� �̵�
			tp.setSelectedIndex(1);
		
		}else if(e.getSource()==bi.b1) { // �۾��� ��ư
			 // ArrayList�� ����
			// �Է��� �����͸� �б�
			String name=bi.tf1.getText();
			String subject=bi.tf2.getText();
			String content=bi.ta.getText();
			String pwd=String.valueOf(bi.pf.getPassword()); // ĳ���� �迭�� ���������� ��ȯ
			// password�� char[]�� 
			
			BoardVO vo=new BoardVO();
			vo.setName(name);
			vo.setSubject(subject);
			vo.setContent(content);
			vo.setPwd(pwd);
			bm.insert(vo); // ArrayList�� �߰�
			// ��� �߰� => �޼ҵ�
			listPrint();
			// ��� �̵�
			tp.setSelectedIndex(0);
			
		}else if(e.getSource()==bi.b2) { // ��ҹ�ư
			 // ������� �̵�
			tp.setSelectedIndex(0);
		}
	}
	public void listPrint() {
		// ���(ArrayList) �ޱ�
		ArrayList<BoardVO> list=bm.select();
		// ���̺� ���
		// ���̺� �����
		for(int i=bp.model.getRowCount()-1; i>=0; i--) { // �������������� 0���� �ɶ����� �����
			bp.model.removeRow(i);
		}
		// ���
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		// MM (��) mm(��, �ð�)
		for(BoardVO vo:list) {
			String[] data= {
					String.valueOf(vo.getNo()),
					vo.getSubject(),
					vo.getName(),
					sdf.format(vo.getRegdate()), //.toString(), // Ŭ������ ���ڿ���
					String.valueOf(vo.getHit())
			};
			
			bp.model.addRow(data);
		}
	}
		
}
