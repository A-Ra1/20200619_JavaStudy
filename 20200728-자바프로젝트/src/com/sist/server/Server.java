package com.sist.server;

import java.util.*;

import com.sist.common.Function;

import java.net.*;
import java.io.*;

public class Server implements Runnable {

	// 서버에서 실행된 Socket 
	ServerSocket ss;
	final int PORT=3355; //1024~65535
//	클라이언트 정보를 저장
	Vector<Client> waitVc=new Vector<Client>(); // Arraylist, LinkedList
	// 서버 가동
	public Server() {
		
		try {
		
			ss=new ServerSocket(PORT);
			// bind() : 개통 listen() : 접속시까지 대기
			System.out.println("Server Start..");
		} catch (Exception e) {

		}
	}
	// 클라이언트가 접속할 때마다 처리 기능
	public void run() {
		
		
		while(true) {
		try {
			
			Socket s=ss.accept();
			// Socket => 발신자 정보를 가지고 있다(IP,PORT)
			/*
			 * 접속하면 => 쓰레드를 생성해서 클라이언트마다 통신을 다르게 할 수 있게 한다
			 */
			// 쓰레드와 연결 => Socket만 연결하면 한사람과만 통신 가능
			Client client=new Client(s);
			client.start();
		} catch (Exception e) {

		}
		}
	}
	// 통신이 가능하게 만든다
	class Client extends Thread {
		// 클라이언트의 정보 수집
		Socket s;
		// 송수신
		OutputStream out;
		BufferedReader in;
		// 클라이언트의 기본 정보
		String id,name,sex;
		public Client(Socket s) {
			
			// 변수는 지역변수 우선순위
			// 변수명 => 지역변수, 매개변수 => 멤버변수 (멤버변수 사용 => this.변수명)
			try {
			this.s=s; // Connection (오라클)
				
			// s => 클라이언트와 연결
			out=s.getOutputStream();
			// 클라이언트에 응답을 전송할 때 (값) // PreparedStatement
			in=new BufferedReader(new InputStreamReader(s.getInputStream()));
			// 클라이언트의 요청값을 받을 경우에 사용 // ResultSet => 결과값받기
			/*
			 *  out=s.getOutputStream() => HttpServletResponse
			 *  in=new BufferedReader  => HttpServletRequest
			 */
			
			} catch (Exception e) {

			}
			// 통신
			// 전체적 메세지 전송
			// 개인적 메세지 전송
		}
		// synchronized => 동기화 프로그램
		public void run () {
			try {

				while (true) {
					String msg=in.readLine();
					System.out.println("clien =>"+msg);
					// 클라이언트 요청한 데이터
					StringTokenizer st=new StringTokenizer(msg,"|");
					int protocol=Integer.parseInt(st.nextToken());
					//100|id|name|sex
					switch (protocol) {
					
					case Function.LOGIN:{
						
						id=st.nextToken();
						name=st.nextToken();
						sex=st.nextToken();
						
						messageAll(Function.LOGIN+"|"+id+"|"+name+"|"+sex);
						// LOGIN테이블에 출력
						
						// 추가
						waitVc.add(this);
						
						// 화면 변경
						// 로그인 => 대기실
						messageTo(Function.MYLOG+"|"+id);
						
						// 이미 접속한 사람들의 정보 받기
						for(Client user:waitVc) {
							messageTo(Function.LOGIN+"|"+user.id+"|"+user.name+"|"+user.sex);
							
						}
					}
					break;
					
					case Function.CHAT:{
						
						messageAll(Function.CHAT+"|["+name+"]"+st.nextToken());
					}
					break;
					
					case Function.EXIT:{
						
						String mid=id;
						messageAll(Function.EXIT+"|"+mid); // 남아있는 사람
						//EXIT => 대기실 테이블에서 id를 제거
						
						//제거
						for(Client user:waitVc) {
							if(user.id.equals(id)) {
								messageTo(Function.MYEXIT+"|");
								waitVc.remove(user);
								in.close();
								out.close();
								// 통신을 중단한다
								break;
							}
						}
					}
					break;
					}
					
				}
				
			} catch (Exception e) {
			}
		}
		public void messageAll(String msg) {
			
			
				for(Client user:waitVc) {
					try {
						user.messageTo(msg);
					}catch (Exception e) {
						waitVc.remove(user);
					}
				}
			 
		}
		
		public void messageTo(String msg) {
			try {
			
				out.write((msg+"\n").getBytes());
				// 인코딩 => 디코딩 => UTF-8
			} catch (Exception e) {

			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Server server=new Server(); // 서버가동
		new Thread(server).start(); // 접속시까지 대기

	}

}
