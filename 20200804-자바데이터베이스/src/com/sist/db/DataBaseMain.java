package com.sist.db;

import java.sql.*;
import java.util.*;

public class DataBaseMain {

	public static void main(String[] args) {

		try {
			// conn hr/happy
			Class.forName("oracle.jdbc.driver.OracleDriver"); // �����Ҷ��� �ݵ�� ����̹� ��ġ => Ŭ������ ����
			String url="jdbc:oracle:thin:@localhost:1521:XE"; // ��θ�
			
			// ����
			Connection conn=DriverManager.getConnection(url,"hr","happy");
			// conn hr/happy �Ϸ�
			
			//SQL ���� ����
			Scanner scan=new Scanner(System.in);
			System.out.print("�˻��� �Է�:");
			String data=scan.next();
			String sql="SELECT ename FROM emp WHERE ename LIKE '%'||?||'%'";
			// || => ���ڿ� ����, �������� (���� OR ����) , && => �Է°���û==> AND 
			PreparedStatement ps=conn.prepareStatement(sql); // PreparedStatement => oracle�� ��������
			ps.setString(1, data);
			
			// ������ �б�
			ResultSet rs=ps.executeQuery();
			while(rs.next()) { // next() => Ŀ����ġ ������ �̵� , ��ĭ�� �����´�
				
				System.out.println(rs.getString(1));
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
