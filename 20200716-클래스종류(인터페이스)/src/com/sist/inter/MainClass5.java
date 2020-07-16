package com.sist.inter;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
import java.awt.event.*;
public class MainClass5 extends JFrame{
	JTable table; // 모양
	DefaultTableModel model; // 테이블 안의 데이터 제어 => MV
	
	public MainClass5() {
		String[] col={"","이름","성별","주소"};
		Object[][] row=new Object[0][4]; // 데이터갯수 맞추기
		
		model=new DefaultTableModel(row,col){

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			} // 익명의 클래스 ~ 상속없이 오버라이딩

			@Override
			public Class<?> getColumnClass(int columnIndex) {
				// TODO Auto-generated method stub
				return getValueAt(0, columnIndex).getClass();
			}
			
			
			
		}; // 생성자뒤에서 재정의가능
		// table에 첨부
		table=new JTable(model);
		table.setRowHeight(100);
		JScrollPane js=new JScrollPane(table);
		
		// 윈도우에 추가
		add("Center",js);
		setSize(350, 450);
		
		//데이터 추가
		Object[] data= {new ImageIcon("c:\\javaDev\\a.png"),"홍길동","남자","서울"};
		model.addRow(data);
		model.addRow(data);
		model.addRow(data);
		setVisible(true);
	}
 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성자 호출
		new MainClass5();
	}

}
