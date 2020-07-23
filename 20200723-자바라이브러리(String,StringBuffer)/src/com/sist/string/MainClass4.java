package com.sist.string;

/*
 *   StringBuffer : 문자열을 결합할 경우 => append()
 */

import java.io.*; // => CheckException => 예외처리 하고 사용

public class MainClass4 {

	public static void main(String[] args) {

		try {
			// 파일 읽기
			// String data="";
			StringBuffer data1=new StringBuffer();
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			int i=0;
			while((i=fr.read())!=-1){ // -1 EOF
				
				data1.append(String.valueOf((char)i));
				
			}
			fr.close();
			
			System.out.println(data1.toString());
			
		} catch (Exception ex) {
		}
		
	}

}
