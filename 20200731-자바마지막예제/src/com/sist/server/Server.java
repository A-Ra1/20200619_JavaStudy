package com.sist.server;

/*
 *  network => new => 라이브러리
 */
import java.util.*;

import com.sist.common.Function;

import java.io.*;  // 입출력 (서버와 클라이언트가 데이터 주고받을때)
import java.net.*; // 다른 컴퓨터와 연결

/*
 *  일반 서버 (Application) => Socket(연결 기계=>소프트웨어로 제작)
 *  웹 서버 => URL
 *  ============================================================ 연결지향적 프로그램 TCP
 */

// Server => 접속만 담당 => 저장
// Client => 실제 통신 담당 => 클라이언트마다 따로 통신 => 쓰레드 이용
public class Server implements Runnable {
	private ServerSocket ss; // 접속을 받는 클래스 => 정보 저장
	private final int PORT=3333;
//	클라이언트 접속시에 저(IP,PORT)
//	Vector => 쓰레드에서 동기화 프로그램 (한프로그램 끝나고 => 한프로그램 실행)
	private Vector<Client> waitVc=new Vector<Client>();
	
	public Server() {
		
		try {
			
			ss=new ServerSocket(PORT);
			/*
			 *  bind() => IP, PORT 묶어주는 역할
			 *    => 휴대폰 개통
			 *  listen() => 대기상태 (클라이언트가 접속하기 전까지 대기)
			 */
			System.out.println("Server Start..");
			
		} catch (Exception ex) {

		}
	}
	
	// 클라이언트가 접속을 했을 경우 => 각자 통신이 가능하도록 쓰레드와 연결
	@Override
	public void run() {
		
		try {
			while (true) {
				Socket s=ss.accept();
//			    accept() : 특수한 메소드 => 클라이언트가 접속시에만 호출되는 메소드
				Client client=new Client(s);
				client.start(); // 클라이언트와 통신 승인
			}
		} catch (Exception ex) {

		}
		
	}	
	public static void main(String[] args) {

		// 서버가동
		Server server=new Server();
		new Thread(server).start();
		// Server클래스에 있는 run()을 호출
		
	}
	
//	내부클래스 => Server가 가지고 있는 데이터를 쉽게 공유가 가능하게 만든다
	class Client extends Thread {
		
//		클라이언트와 연결
		Socket s;
//		클라이언트로부터 요청을 받는다
		BufferedReader in;
//		요청을 처리한 다음에 결과를 응답
		OutputStream out;
//		변수설정
		String id,name,sex,pos;
		
		public Client(Socket s) { // 접속한 사람의 소켓을 넘겨받는다
			
			try {
				
				this.s=s;
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				// 클라이언트 요청한 메소드를 읽어오는 메모리 공간
				out=s.getOutputStream();
				
			} catch (Exception ex) {

			}
			
		}
//	 	통신
		public void run() {
			
			try {
				
				while (true) {
					// 클라이언트가 요청한 내용을 받는다
					String msg=in.readLine();
					StringTokenizer st=new StringTokenizer(msg,"|");
					int protocol=Integer.parseInt(st.nextToken());
					// 100|id|대화명|성별
					switch (protocol) {
					
					case Function.LOGIN:
					{
						// 로그인 처리
						// 데이터값 받기
						id=st.nextToken();
						name=st.nextToken();
						sex=st.nextToken();
						pos="대기실"; // 사용자의 기본 정보
						
						// 접속한 모든 사용자 => 로그인한 정보를 보내준다
					this.messageAll(Function.LOGIN+"|"+id+"|"+name+"|"+sex+"|"+pos);
						// 접속한 사람의 정보를 저장
						waitVc.add(this);
						// Client client = new Client();
						
						messageTo(Function.MYLOG+"|"+id);
						// 로그인창에서 => 대기실창으로 변경 (Client는 MYLOG를 입력받고 전환)
						
						for(Client user:waitVc) {
							
							messageTo(Function.LOGIN+"|"+user.id+"|"+user.name+"|"+user.sex+"|"+user.pos);
						}
						
						// 입장메세지 출력
						messageAll(Function.WAITCHAT+"|[☞"+name+"님이 입장하셨습니다]");
						// 개설된 방정보를 전송
					}
						break;
					case Function.WAITCHAT:
					{
						messageAll(Function.WAITCHAT+"|["+name+"]"+st.nextToken());
					}
						break;
					}
				}
			} catch (Exception ex) {

			}
		}
//		응답 처리
//		개인적으로 전송
		public synchronized void messageTo(String msg) {
			
			// synchronized
			/*
			 *  쓰레드는 default : 비동기화
			 *  synchronized => 동기화
			 */
			try {
				out.write((msg+"\n").getBytes()); // 한명에게만 전송
//				인코딩 => 디코딩
			} catch (Exception ex) {

			}
		}
//		전체적으로 응답
		public synchronized void messageAll(String msg) {
			
			try {
				
				for(Client user:waitVc) { // 접속한 모두에게
					
					user.messageTo(msg);
				}
			} catch (Exception ex) {

			}
		}
	}

	

}
