package com.sist.net;

import java.io.*;
import java.net.*;
import java.util.*;
/*
 *  서버 가동
 *  	ServerSocket (Socket = 전화기)
 *  접속시에 처리
 *  	accept()
 *  통신
 *  	write()
 *  	read()	
 */

public class Server implements Runnable {

	// 접속 받는 Socket => 교환 소켓
	ServerSocket ss=null;
	
	// 서버 가동
	// 한개의 컴퓨터에서는 서버 여러개를 동시에 수행할 수 없다
	
	// 접속자 정보 저장
	Vector<Client> waitVc=new Vector<Client>(); // server , client class 공유
	
	public Server() {
		
		try {
			
			ss=new ServerSocket(3333); // bind(ip,port) => listen()까지 포함되어 있는 생성자
			System.out.println("Server Start!");
			
		} catch (Exception ex) {

		}
	}
	
	// 접속시에 처리하는 부분
	public void run() {
	
		try {
			while (true) {
				
			Socket s=ss.accept(); // 접속했을 경우 => 접속자의 IP,PORT를 확인
			
				// IP,PORT를 갖고 있는 => Socket (발신자 정보)
//			System.out.println("접속자 IP:"+s.getInetAddress().getHostAddress());
//			System.out.println("접속자의 PORT(연결선):"+s.getPort());
			
			Client c=new Client(s); // 접속자와 쓰레드를 연결시킨다 , 접속자 마다 쓰레드 하나씩 ,
			waitVc.add(c); // 클라이언트 저장
			c.start(); // 접속자와 통신을 시작하라
			}
		} catch (Exception ex) {
			
		}
	}
	
	// 접속자마다 따로 통신이 가능
	class Client extends Thread { // 내부클래스 (Vector를 사용하기 위해서)
		
		Socket s; // 접속한 client와 연결
		OutputStream out; // client에 결과값 전송
		BufferedReader in; // 클라이어트 요청시에 값을 받는 클래스
		
		public Client(Socket s) {
			
			try {
			
			this.s=s; // 변수 구분을 위하여 this사용 , 매개변수가 ss라면 ex) s=ss; 
			out=s.getOutputStream(); // s => client소속
			
			in=new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			} catch (Exception ex) 
			{
			}
			// 통신시작
			
		}
		public void run() {
			
			try {
				
				while(true) {
					
					String msg=in.readLine();
					// 채팅 문자열 받기
					for(Client user:waitVc) {
						user.out.write((msg+"\n").getBytes());
					}
					
				}
			} catch (Exception e) {
			
			}
		}
		
	}
	
	public static void main(String[] args) {

		Server server=new Server(); // 서버가동
		new Thread(server).start(); // start실행 -> run에서 대기중 (접속을 기다린다)
	}

}
