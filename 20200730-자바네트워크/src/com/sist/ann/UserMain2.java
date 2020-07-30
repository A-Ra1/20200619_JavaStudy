package com.sist.ann;

import java.lang.reflect.Method;
import java.util.*;

public class UserMain2 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("��û:");
		
		String ss=scan.next();
		
		try {
			
			// Ŭ���� ���� �б� 
			Class clsName=Class.forName("com.sist.ann.MovieModel");
			
			// new���� �޸� ���� ����(new=���ռ��� ���ϴ�)
			Object obj=clsName.newInstance(); // �޸� �Ҵ�
			
			//�޼ҵ� ã��
			Method[] methods=clsName.getDeclaredMethods();
			
			for(Method m:methods) {
				
			//	System.out.println(m.getName());
				RequestMapping rm=m.getAnnotation(RequestMapping.class);
				if(rm.value().equals(ss)) { // rm = request, ss = ������Է°�
					
					m.invoke(obj, null);
				}
			}
			
		} catch (Exception e) {

		}
	}

}
