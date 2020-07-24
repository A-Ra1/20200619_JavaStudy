package com.sist.util;

import java.util.StringTokenizer;

/*
 *  StringTokenizer
 *  =============== 단어별 분리
 *  	= hasMoreTokens()
 *  	= nextToken()
 *  
 *   String msg="Red,Green,Blue,Black,Yellow";
 *   
 *   => StringTokenizer st=new StringTokenizer(msg,",");
 *   	String color=st.nextToken();
 *   
 *   String color1=st.nextToken();
 *   String color2=st.nextToken();
 *   String color3=st.nextToken();
 *   String color4=st.nextToken();
 *   String color5=st.nextToken();
 *   
 *   => StringTokenizer st=new StringTokenizer(msg,","); => ,을 구분문자로 사용
 *   
 *    while(st.hasMoreTokens())
 *    {
 *    
 *     String color=st.nextToken();
 *     
 *    } 
 *   
 *   => StringTokenizer st=new StringTokenizer(msg); => 공백을 구분문자로 사용
 *   
 *   
 */
public class MainClass1 {

	public static void main(String[] args) {
		
		String msg="Red,Blue,Green,Yellow,Black";
		StringTokenizer st=new StringTokenizer(msg,",");
		
		// , 별로 단어를 추출한다
		
		String color1=st.nextToken();
		String color2=st.nextToken();
		String color3=st.nextToken();
		String color4=st.nextToken();
		String color5=st.nextToken();
		
		System.out.println(color1);
		System.out.println(color2);
		System.out.println(color3);
		System.out.println(color4);
		System.out.println(color5);
	
		st=new StringTokenizer(msg,",");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
				
				
 
	}

}
