package com.sist.dao;

// 데이터베이스 연결

import java.util.*;
import java.sql.*;

public class EmpDAO {
	
	// 데이터베이스 (오라클) 연결 => Socket 
	private Connection conn;
	
	// 송신, 수신
	private PreparedStatement ps; // BufferedReader, OutputStream 포함
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	
	// 드라이버 등록 => 한번만 실행
	private static EmpDAO dao;
	public EmpDAO() {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	// 싱글턴 패턴 : 데이터베이스에서 Connection을 한개만 생성해서 사용할때 (재사용)
	public static EmpDAO newInstance() {
		
		if(dao==null) 
			dao=new EmpDAO();
		
		return dao;
	}
	
	// 연결
	public void getConnection() {
		
		try {
			
			conn=DriverManager.getConnection(URL,"hr","happy");
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

	public Connection getConn() {
		return conn;
	}

	public PreparedStatement getPs() {
		return ps;
	}
	
	// ===== 모든 데이터베이스의 공통 사항
	// 기능
	
	
}
