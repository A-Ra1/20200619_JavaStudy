package com.sist.db;

import java.sql.*;
import java.util.*;

public class DataBaseMain {

	public static void main(String[] args) {

		try {
			// conn hr/happy
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 연결할때는 반드시 드라이버 설치 => 클래스로 제작
			String url="jdbc:oracle:thin:@localhost:1521:XE"; // 경로명
			
			// 연결
			Connection conn=DriverManager.getConnection(url,"hr","happy");
			// conn hr/happy 완료
			
			//SQL 문장 전송
			Scanner scan=new Scanner(System.in);
			System.out.print("검색어 입력:");
			String data=scan.next();
			String sql="SELECT ename FROM emp WHERE ename LIKE '%'||?||'%'";
			// || => 문자열 결합, 논리연산자 (조건 OR 조건) , && => 입력값요청==> AND 
			PreparedStatement ps=conn.prepareStatement(sql); // PreparedStatement => oracle로 문장전송
			ps.setString(1, data);
			
			// 데이터 읽기
			ResultSet rs=ps.executeQuery();
			while(rs.next()) { // next() => 커서위치 맨위로 이동 , 한칸씩 내려온다
				
				System.out.println(rs.getString(1));
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
