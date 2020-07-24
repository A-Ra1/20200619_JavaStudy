package com.sist.util;

import java.util.StringTokenizer;

/*
 *  StringTokenizer
 *  =============== �ܾ �и�
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
 *   => StringTokenizer st=new StringTokenizer(msg,","); => ,�� ���й��ڷ� ���
 *   
 *    while(st.hasMoreTokens())
 *    {
 *    
 *     String color=st.nextToken();
 *     
 *    } 
 *   
 *   => StringTokenizer st=new StringTokenizer(msg); => ������ ���й��ڷ� ���
 *   
 *   
 */
public class MainClass1 {

	public static void main(String[] args) {
		
		String msg="Red,Blue,Green,Yellow,Black";
		StringTokenizer st=new StringTokenizer(msg,",");
		
		// , ���� �ܾ �����Ѵ�
		
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
