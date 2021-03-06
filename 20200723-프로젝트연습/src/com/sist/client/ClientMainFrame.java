package com.sist.client;
// 윈도우 => JFrame
// 윈도우와 관련된 클래스를 읽어온다
import javax.swing.*;

import com.sist.common.Function;

import java.awt.*; // Color, Layout (배치)
import java.awt.event.*; // interface
import java.io.*;
import java.net.*;
import java.util.*;

/*
 *  재사용
 *   = 상속 (is-a) : 기존의 클래스를 변경해서 사용
 *   public class ClientMainFrame extends JFrame
 *   			 =================
 *   			 JFrame의 기능을 전체 다 가지고 온다
 *   = 포함 (has-a) : 기존의 클래스를 변경하지 않고 사용
 */
public class ClientMainFrame extends JFrame implements ActionListener, MouseListener, Runnable{
	/*
	 * 1. 사용자가 서버에 요청
	 * 2. 서버에서 들어오는 응답을 받아서 출력 (쓰레드) => 자동화
	 */
	
	// 윈도우 크기 결정 => 거의 대부분 생성자에서 사용 (291page)
	
	JLabel title=new JLabel("영화 예매 & 추천 프로그램", JLabel.CENTER);
	
	MenuForm mf=new MenuForm();
	ChatForm cf=new ChatForm();
	DetailForm df=new DetailForm();
	Login login=new Login();
	ControlPanel cp;

	int curpage=1;
	int totalpage=60;
	
	// 네트워크 관련 프로그램
	Socket s; // 연결기계
	OutputStream out; // 서버로 요청값 전송 => 로그인, 채팅문자열, 종료
	BufferedReader in; // 서버로부터 값을 받아온다 => 쓰레드
	
	
	public ClientMainFrame() {
		/*
		 *  클래스에서 생성자 사용 => 선언이 아니라 구현할때
		 *  예) 
		 *  	데이터베이스 : 오라클연결 (생성자에서)
		 *  	네트워크 : 세팅 => IP, PORT 연결
		 *  	웹 : 쿠키에서 값 읽기 => 자동로그인
		 */
	cp=new ControlPanel(this);	
	// this ~ 새로운 창=> 현재 실행중인 윈도우창을 전송
	
	title.setFont(new Font("굴림체", Font.BOLD, 35));
	// title.setOpaque(true);
	// title.setBackground(Color.magenta);
	setLayout(null);	// JFrame (BorderLayout) ==> 사용자 정의로 배치 (null)
	title.setBounds(10, 15, 1570, 100);
	
	// 윈도우 추가 => add()
	add(title);
	
	// 메뉴배치
	mf.setBounds(10, 120, 100, 300); 
	add(mf);
	
	// 채팅폼
	cf.setBounds(115, 760, 1465, 200);
	add(cf);
	
	// 출력화면
	cp.setBounds(115, 120, 1465, 635);
	add(cp);
	
	setSize(1600, 1000);
	setVisible(true);
	setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); // X버튼 클릭시 종료
	
	mf.b1.addActionListener(this);
	mf.b2.addActionListener(this);
	mf.b5.addActionListener(this);
	
	cp.ff.b1.addActionListener(this); // 이전버튼
	cp.ff.b2.addActionListener(this); // 다음버튼
	
	cp.df.b2.addActionListener(this); // 목록으로
	
	cp.lf.b1.addActionListener(this);
	cp.lf.b2.addActionListener(this);
	cp.lf.b3.addActionListener(this);
	cp.lf.b4.addActionListener(this);
	cp.lf.b5.addActionListener(this);
	
	
	cp.lf.tf.addActionListener(this);
	
	// 로그인처리
	login.b1.addActionListener(this);
	login.b2.addActionListener(this);
	
	//종료
	mf.b7.addActionListener(this);
	
	//채팅
	cf.tf.addActionListener(this);
	
	
//	for(int i=0; i<10; i++) {
//		
//		cp.ff.mc[i].addMouseListener(this);
//		
//	 }
	}
	
	public static void main(String[] args) throws Exception {
 
		// 생성자는 호출시에 반드시 => new 생성자()
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new ClientMainFrame();
	}

	public static Image getImage(ImageIcon ii,int w,int h) {
	      Image dimg=ii.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);
	      return dimg;
	   }
	
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==mf.b1) { // 화면 전환 mf-메뉴폼 b1-홈  
			cp.card.show(cp, "FF");
		}
		else if(e.getSource()==mf.b2) {
			cp.card.show(cp, "LF");
		}
		else if(e.getSource()==mf.b5) {
			cp.card.show(cp, "NF");
		}
		else if(e.getSource()==cp.df.b2) {
			cp.card.show(cp, "FF");
		}
		else if (e.getSource()==cp.ff.b1) {
			
			if(curpage>1) {
				
				curpage--;
				cp.ff.p.removeAll(); // Jpanel의 모든 기능을 삭제
				cp.ff.moviePrint(curpage);
				cp.ff.repaint(); // paint 다시 호출
				cp.ff.p.validate(); // Jpanel의 원래 기능을 재배치
			}
		}
		else if (e.getSource()==cp.ff.b2) {
	
			if(curpage<totalpage) {
				
				curpage++;
				cp.ff.p.removeAll();
				cp.ff.moviePrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate();
			}
		}
		
		else if(e.getSource()==cp.lf.b1) {
			cp.lf.movieAllData(1);
		}
		else if(e.getSource()==cp.lf.b2) {
			cp.lf.movieAllData(2);
		}
		else if(e.getSource()==cp.lf.b3) {
			cp.lf.movieAllData(3);
		}
		else if(e.getSource()==cp.lf.b4) {
			cp.lf.movieAllData(4);
		}
		
		else if(e.getSource()==cp.lf.b5 || e.getSource()==cp.lf.tf) {
			
			// 1.입력된 값 읽기
			String ss=cp.lf.tf.getText();
			if(ss.length()<1) {
				JOptionPane.showMessageDialog(this, "검색어를 입력하세요");
				cp.lf.tf.requestFocus(); // 커서 올려놓기
				return; // 메소드 종료
			}
			cp.lf.movieFindData(ss);
			
		}
		
		else if (e.getSource()==login.b1) {
			
			String id=login.tf1.getText();
			if(id.length()<1) { // ID를 입력하지 않았다면
				JOptionPane.showMessageDialog(this, "ID를 입력하세요");
				login.tf1.requestFocus(); // 반드시 입력
				return;
			}
			
			String name=login.tf2.getText();
			if(name.length()<1) {
				JOptionPane.showMessageDialog(this, "대화명을 입력하세요");
				login.tf2.requestFocus();
				return;
			}
			
			String sex="";
			if(login.rb1.isSelected())
				sex="남자";
			else 
				sex="여자";
			
			// 입력받은 데이터를 서버로 전송
			try {
				
				// 연결 => 서버에 대한 정보를 가지고 있다
				s=new Socket("localhost",3355);
				
				// 송수신 위치 확인
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				out=s.getOutputStream();
				
				// 로그인 요청
				out.write((Function.LOGIN+"|"+id+"|"+name+"|"+sex+"|"+"\n").getBytes());
			} catch (Exception e2) {
			}
			
			// 서버에서 전송하는 데이터를 읽어서 출력
			new Thread(this).start();
			// run()의 위치 확인 => 자신의 클래스 안에 존재 => (this)
		}
		
		else if (e.getSource()==login.b2) {
			
			System.exit(0);
		}
		else if (e.getSource()==cf.tf) {
			String msg=cf.tf.getText();
			if(msg.length()<1)
				return;
			// 데이터를 서버로 전송
			try {
				out.write((msg+"\n").getBytes());
			} catch (Exception e2) {
			}
			 	cf.tf.setText("");
		}
		
		else if (e.getSource()==mf.b7) {
		
			try {
				
				out.write((Function.EXIT+"|\n").getBytes());
				
			} catch (Exception e2) {
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		for(int i=0; i<10; i++) {
			if(e.getSource()==cp.ff.mc[i]) {
				if(e.getClickCount()==2) {
					int a=(i+1)+((curpage*10)-10);
					//JOptionPane.showMessageDialog(this, "mno="+a);
					cp.df.detailPrint(a);
					cp.card.show(cp, "DF"); //df를 cp위에 띄우기
					break;
				}
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
	public void run() {
		// 서버에서 들어오는 데이터를 받아서 처리
		try {
			while (true) {
				String msg=in.readLine();
				System.out.println("server => "+msg);
				StringTokenizer st=new StringTokenizer(msg,"|");
				int protocol=Integer.parseInt(st.nextToken());
				
				switch (protocol) {
				case Function.MYLOG:
				{
					setTitle(st.nextToken());
					login.setVisible(true); // 로그인창
					setVisible(true); // 영화창(Main)
				}
					break;

				case Function.LOGIN:
				{
					// 테이블에 출력
					String[] data= {
							st.nextToken(), // id
							st.nextToken(), // name
							st.nextToken() // sex
					};
					cf.model.addRow(data);
				}
					break;
				
				case Function.CHAT:
				{
					cf.ta.append(st.nextToken()+"\n");
				}
					
					break;
				
				case Function.EXIT:
				{
					String id=st.nextToken();
					
					for(int i=0; i<cf.model.getRowCount(); i++) {
						
						String mid=cf.model.getValueAt(i, 0).toString();
						
						if(id.equals(mid)) {
							
							cf.model.removeRow(i);
							break;
						}
					}
				}
					break;
				
				case Function.MYEXIT:
				{
					dispose();
					System.exit(0);
				}
					break;
				}
			}
		} catch (Exception e) {
		}
	}

	

}
