package com.sist.dao;

import java.sql.*;
import java.util.*;

public class ZipcodeDAO {

	// ����
	private Connection conn; // ����Ŭ�� ����
	
	// �������� => SQL
	private PreparedStatement ps;
	
	// ���� => ����Ŭ�ּ�
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	
	// ����̹� ���
	public ZipcodeDAO () {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
	
	public void getConnection() {
		
		try {
			
			conn=DriverManager.getConnection(URL,"hr","happy");
			//conn hr/happy
		} catch (Exception e) {
		}
	}
	
	// �ݱ�
	public void disConnection() {
		
		try {
			
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
			// exit
			
		} catch (Exception e) {
		}
	}
	// �����ȣ ã��
	
	public ArrayList<ZipcodeVO> postfind(String dong) { // ����ڰ� ���� �ѱ�� �����ȣ�� ã���ش�
		
		ArrayList<ZipcodeVO> list=new ArrayList<ZipcodeVO>();
		
		try {
			
			// ����
			getConnection();
			
			//SQL���� ����
			String sql="SELECT * FROM zipcode "
					+ "WHERE dong LIKE '%'||?||'%'";
			
			ps=conn.prepareStatement(sql);
			ps.setString(1, dong); // ù��° '?'�� dong�� ���� ä������
			ResultSet rs=ps.executeQuery(); // ���� (rs�� ������� ��)
			
			while (rs.next()) { // Ŀ���� ù��° �ٷ� �̵� (Ŀ���� �ݵ�� �����Ͱ� �����ϴ� ��ġ�� �־���Ѵ�)
				
				ZipcodeVO vo=new ZipcodeVO(); // while�� �������� vo����
				
				vo.setZipcode(rs.getString(1)); // oracle�� 1������ ���� , �� ������ 5���� ���� ����
				vo.setSido(rs.getString(2));
				vo.setGugun(rs.getString(3));
				vo.setDong(rs.getString(4));
				vo.setBunji(rs.getString(5));
				
				list.add(vo);
			}
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		finally {
			
			disConnection();
		}
		return list;
	}
}
