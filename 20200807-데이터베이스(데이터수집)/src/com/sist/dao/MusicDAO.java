package com.sist.dao;

import java.util.*;

import oracle.net.aso.p;

import java.sql.*;

public class MusicDAO {
	
	// ����
	private Connection conn;
	
	// ����Ŭ�� sql����
	private PreparedStatement ps;

	// url
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	/*
   mno NUMBER(3), where mno=1
   title VARCHAR2(300),
   singer VARCHAR2(100),
   album VARCHAR2(200),
   poster VARCHAR2(1000),
   state CHAR(6), 
   idcrement NUMBER(3),
   key VARCHAR2(50)
	 */
	
	
	// ����̹� ���
	public MusicDAO() {
		
		try {
			
			Class.forName("oracle.jdbc.drever.OracleDriver");
		
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
	
	// ����
	public void getConnection() {
		
		try {
			
			conn=DriverManager.getConnection(URL,"hr", "happy");
		
		} catch (Exception e) {
		}
	}
	
	// ����
	public void disConnection() {
		
		try {
			
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
			
		} catch (Exception e) {
		}
	}
	
	// ������ �߰�
	public void musicInsert(MusicVO vo) {
		
		try {
			
			getConnection();
//			String sql="INSERT INTO genie_music VALUES("
//						+vo.getMno()+"','"+vo.getTitle()+"','"+vo.getSinger()+"','"+vo.getAlbum()+"','"
//						+vo.getPoster()+"','"+vo.getState()+"','"+vo.getIdcrement()+",'"+vo.getKey()+"')";
			
			String sql="INSERT INTO genie_music VALUES(?,?,?,?,?,?,?,?)"; 
			ps=conn.prepareStatement(sql);
			
			// ? ���� ä���
			ps.setInt(1, vo.getMno());
			ps.setString(2, vo.getTitle()); // String�� �ڵ����� '' ÷�εȴ�
			ps.setString(3, vo.getSinger());
			ps.setString(4, vo.getAlbum());
			ps.setString(5, vo.getPoster());
			ps.setString(6, vo.getState());
			ps.setInt(7, vo.getIdcrement());
			ps.setString(8, vo.getKey());
			
			// ����
			ps.executeUpdate(); // ������ �������� : executeQuery()  
			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		finally {
			
			disConnection();
		}
	}
}
