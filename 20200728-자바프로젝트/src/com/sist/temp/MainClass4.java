package com.sist.temp;

import java.io.*;
import java.util.*;



public class MainClass4 {

	public static void main(String[] args) {

		try {
			
			// 파일 읽기
			FileReader fr=new FileReader("c:\\javaDev\\daum_movie.txt");
			int i=0;
			
//			데이터를 저장할 문자열
			String data="";
			while((i=fr.read())!=-1){
				
				data+=String.valueOf((char)i);
			}
			fr.close();
			System.out.println(data);
			
//			String[] movies=data.split("\n");
//			for(String s:movies) {
//				System.out.println(s);
//				System.out.println("=========================");
//			}
			
			StringTokenizer st=new StringTokenizer(data,"\n");
			while(st.hasMoreTokens()) {
				
				System.out.println(st.nextToken());
				System.out.println("=======================================================");
			}
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}

}
