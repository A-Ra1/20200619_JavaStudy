package com.sist.dao;

// �����ͺ��̽� ����

import java.util.*;
import java.sql.*;

public class EmpDAO {
	
	// �����ͺ��̽� (����Ŭ) ���� => Socket 
	private Connection conn;
	
	// �۽�, ����
	private PreparedStatement ps; // BufferedReader, OutputStream ����
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	
	// ����̹� ��� => �ѹ��� ����
	private static EmpDAO dao;
	public EmpDAO() {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	// �̱��� ���� : �����ͺ��̽����� Connection�� �Ѱ��� �����ؼ� ����Ҷ� (����)
	public static EmpDAO newInstance() {
		
		if(dao==null) 
			dao=new EmpDAO();
		
		return dao;
	}
	
	// ����
	public void getConnection() {
		
		try {
			
			conn=DriverManager.getConnection(URL,"hr","happy");
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

	public Connection getConn() {
		return conn;
	}

	public PreparedStatement getPs() {
		return ps;
	}
	
	// ===== ��� �����ͺ��̽��� ���� ����
	// ���
	
	
}
