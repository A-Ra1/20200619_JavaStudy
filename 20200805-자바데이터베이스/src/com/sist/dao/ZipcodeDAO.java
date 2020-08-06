package com.sist.dao;

import java.sql.*;
import java.util.*;

public class ZipcodeDAO {

	// 연결
	private Connection conn; // 오라클과 연결
	
	// 문장전송 => SQL
	private PreparedStatement ps;
	
	// 연결 => 오라클주소
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	
	// 드라이버 등록
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
	
	// 닫기
	public void disConnection() {
		
		try {
			
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
			// exit
			
		} catch (Exception e) {
		}
	}
	// 우편번호 찾기
	
	public ArrayList<ZipcodeVO> postfind(String dong) { // 사용자가 동을 넘기면 우편번호를 찾아준다
		
		ArrayList<ZipcodeVO> list=new ArrayList<ZipcodeVO>();
		
		try {
			
			// 연결
			getConnection();
			
			//SQL문장 전송
			String sql="SELECT * FROM zipcode "
					+ "WHERE dong LIKE '%'||?||'%'";
			
			ps=conn.prepareStatement(sql);
			ps.setString(1, dong); // 첫번째 '?'에 dong의 값이 채워진다
			ResultSet rs=ps.executeQuery(); // 실행 (rs에 결과값이 들어감)
			
			while (rs.next()) { // 커서를 첫번째 줄로 이동 (커서는 반드시 데이터가 존재하는 위치에 있어야한다)
				
				ZipcodeVO vo=new ZipcodeVO(); // while이 돌때마다 vo저장
				
				vo.setZipcode(rs.getString(1)); // oracle은 1번부터 시작 , 한 공간에 5개를 따로 저장
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
