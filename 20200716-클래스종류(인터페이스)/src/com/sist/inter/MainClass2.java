package com.sist.inter;
/*
 *  자바에서 지원하는 인터페이스
 *  1. Window (javax.swing)
 *  	
 *  	ActionListener : 버튼, 메뉴, text에서 엔터
 *  	 = actionPerformed()
 *  
 *  	MouseListener : 마우스 관련, JTable, JTree, JLabel
 *       = mouseClicked()
 *       = mouseReleased()
 *       = mousePressed()
 *       = mouseEntered()
 *       = mouseExited()
 *       
 *  	MouseMotionListener : 마우스 관련
 *  	 = mouseMoved()
 *  	 = mouseDragged()
 *  
 *  	KeyListener : 키보드
 *  	 = KeyPressed()
 *  	 = KeyReleased()
 *  	 = KeyTyped()
 *  
 *  	FocusListener
 *  	 = FocusLost()
 *  	 = FocusGained()
 *  
 *  	ItemListener
 *  	 = ComboBox, JList
 *  	 = itemStateChaned()
 *  ======================================★★★★★
 *  2. 데이터베이스 연결 
 *   	Connection
 *   	Statement
 *   	ResultSet
 *  ====================================== 
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MainClass2 extends JFrame implements ActionListener,MouseListener,ItemListener {
	
	JButton b1;
	JTextField tf;
	JLabel la;
	JComboBox box;
	
	// 초기화 => 메모리에 저장 (생성자)
	public MainClass2() {
		b1=new JButton("클릭");
		tf=new JTextField();
		la=new JLabel(new ImageIcon("c:\\javaDev\\air.png"));
		box=new JComboBox();
		box.addItem("홍길동");
		box.addItem("박문수");
		box.addItem("이순신");
		
		// JFrame => BorderLayout
		add("West",b1); // 위쪽배치
		add("Center",la); // 가운데
		add("South",tf);
		add("North",box);
		// East, West  
		// 여러군데 배치하고 싶다면 setBounds 사용
		
		//화면 크기
		setSize(450, 500);
		setVisible(true);
		
		// 이벤트 등록
		// => b1이라는 버튼을 클릭하면 => actionPerformed() 호출
		b1.addActionListener(this); // this => 자신 (MainClass2)
		tf.addActionListener(this); //actionPerformed
		la.addMouseListener(this);
		box.addItemListener(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass2();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==la) {
			if(e.getClickCount()==2) { // 더블클릭
				JOptionPane.showMessageDialog(this, "상세보기로 이동");
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

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==b1) { //b1을 클릭했다 
			JOptionPane.showMessageDialog(this, "버튼 클릭 !"); // 어느 Window위에 띄울것인가
		}
		
		else if(e.getSource()==tf) { // enter
			String msg=tf.getText();
			JOptionPane.showMessageDialog(this, msg);
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==box) {
			String name=(String)box.getSelectedItem(); // 형변환
			JOptionPane.showMessageDialog(this, name);
		}
	}

}
