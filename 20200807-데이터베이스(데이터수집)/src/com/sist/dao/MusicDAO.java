package com.sist.dao;

import java.util.*;

import oracle.net.aso.p;

import java.sql.*;

public class MusicDAO {
	
	// 연결
	private Connection conn;
	
	// 오라클에 sql전송
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
	
	
	// 드라이버 등록
	public MusicDAO() {
		
		try {
			
			Class.forName("oracle.jdbc.drever.OracleDriver");
		
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
	
	// 연결
	public void getConnection() {
		
		try {
			
			conn=DriverManager.getConnection(URL,"hr", "happy");
		
		} catch (Exception e) {
		}
	}
	
	// 해제
	public void disConnection() {
		
		try {
			
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
			
		} catch (Exception e) {
		}
	}
	
	// 데이터 추가
	public void musicInsert(MusicVO vo) {
		
		try {
			
			getConnection();
//			String sql="INSERT INTO genie_music VALUES("
//						+vo.getMno()+"','"+vo.getTitle()+"','"+vo.getSinger()+"','"+vo.getAlbum()+"','"
//						+vo.getPoster()+"','"+vo.getState()+"','"+vo.getIdcrement()+",'"+vo.getKey()+"')";
			
			String sql="INSERT INTO genie_music VALUES(?,?,?,?,?,?,?,?)"; 
			ps=conn.prepareStatement(sql);
			
			// ? 값을 채운다
			ps.setInt(1, vo.getMno());
			ps.setString(2, vo.getTitle()); // String은 자동으로 '' 첨부된다
			ps.setString(3, vo.getSinger());
			ps.setString(4, vo.getAlbum());
			ps.setString(5, vo.getPoster());
			ps.setString(6, vo.getState());
			ps.setInt(7, vo.getIdcrement());
			ps.setString(8, vo.getKey());
			
			// 실행
			ps.executeUpdate(); // 데이터 가져오기 : executeQuery()  
			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		finally {
			
			disConnection();
		}
	}
}
