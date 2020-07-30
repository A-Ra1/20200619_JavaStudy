package com.sist.ann;

import java.lang.reflect.Method;
import java.util.*;

public class UserMain2 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("요청:");
		
		String ss=scan.next();
		
		try {
			
			// 클래스 정보 읽기 
			Class clsName=Class.forName("com.sist.ann.MovieModel");
			
			// new없이 메모리 생성 가능(new=결합성이 강하다)
			Object obj=clsName.newInstance(); // 메모리 할당
			
			//메소드 찾기
			Method[] methods=clsName.getDeclaredMethods();
			
			for(Method m:methods) {
				
			//	System.out.println(m.getName());
				RequestMapping rm=m.getAnnotation(RequestMapping.class);
				if(rm.value().equals(ss)) { // rm = request, ss = 사용자입력값
					
					m.invoke(obj, null);
				}
			}
			
		} catch (Exception e) {

		}
	}

}
