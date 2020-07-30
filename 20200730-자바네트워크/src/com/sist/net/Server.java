package com.sist.net;

import java.io.*;
import java.net.*;
import java.util.*;
/*
 *  ���� ����
 *  	ServerSocket (Socket = ��ȭ��)
 *  ���ӽÿ� ó��
 *  	accept()
 *  ���
 *  	write()
 *  	read()	
 */

public class Server implements Runnable {

	// ���� �޴� Socket => ��ȯ ����
	ServerSocket ss=null;
	
	// ���� ����
	// �Ѱ��� ��ǻ�Ϳ����� ���� �������� ���ÿ� ������ �� ����
	
	// ������ ���� ����
	Vector<Client> waitVc=new Vector<Client>(); // server , client class ����
	
	public Server() {
		
		try {
			
			ss=new ServerSocket(3333); // bind(ip,port) => listen()���� ���ԵǾ� �ִ� ������
			System.out.println("Server Start!");
			
		} catch (Exception ex) {

		}
	}
	
	// ���ӽÿ� ó���ϴ� �κ�
	public void run() {
	
		try {
			while (true) {
				
			Socket s=ss.accept(); // �������� ��� => �������� IP,PORT�� Ȯ��
			
				// IP,PORT�� ���� �ִ� => Socket (�߽��� ����)
//			System.out.println("������ IP:"+s.getInetAddress().getHostAddress());
//			System.out.println("�������� PORT(���ἱ):"+s.getPort());
			
			Client c=new Client(s); // �����ڿ� �����带 �����Ų�� , ������ ���� ������ �ϳ��� ,
			waitVc.add(c); // Ŭ���̾�Ʈ ����
			c.start(); // �����ڿ� ����� �����϶�
			}
		} catch (Exception ex) {
			
		}
	}
	
	// �����ڸ��� ���� ����� ����
	class Client extends Thread { // ����Ŭ���� (Vector�� ����ϱ� ���ؼ�)
		
		Socket s; // ������ client�� ����
		OutputStream out; // client�� ����� ����
		BufferedReader in; // Ŭ���̾�Ʈ ��û�ÿ� ���� �޴� Ŭ����
		
		public Client(Socket s) {
			
			try {
			
			this.s=s; // ���� ������ ���Ͽ� this��� , �Ű������� ss��� ex) s=ss; 
			out=s.getOutputStream(); // s => client�Ҽ�
			
			in=new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			} catch (Exception ex) 
			{
			}
			// ��Ž���
			
		}
		public void run() {
			
			try {
				
				while(true) {
					
					String msg=in.readLine();
					// ä�� ���ڿ� �ޱ�
					for(Client user:waitVc) {
						user.out.write((msg+"\n").getBytes());
					}
					
				}
			} catch (Exception e) {
			
			}
		}
		
	}
	
	public static void main(String[] args) {

		Server server=new Server(); // ��������
		new Thread(server).start(); // start���� -> run���� ����� (������ ��ٸ���)
	}

}
