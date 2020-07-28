package com.sist.temp;

import java.io.*;
import java.util.*;
 // split, StringTokenizer

public class MainClass {

	public static void main(String[] args) {
		// 파일읽기 => 예외처리
		
		FileReader fr=null;
		
		// 파일 저장 ~ FileWriter => 문자스트림 (한글포함) 
		/*
		 *  FileInputStream
		 *  FileOutputStream
		 *  ===============1byte (한글X, 그림파일(png,jpg...zip) OK)
		 */
		
		try {
			
			fr=new FileReader("c:\\javaDev\\daum_movie.txt");
			int i=0; // 한글자씩 읽기 => 문자의 번호
			
			StringBuffer sb=new StringBuffer(); // 문자열 결합
			
			
			while((i=fr.read())!=-1) {
				
				//System.out.print((char)i);
				sb.append(String.valueOf((char)i));
			}
			System.out.println(sb.toString());
		} catch (Exception e) {

			// 에러처리 => 디버깅
			/*
			 *  에러 메세지 확인 getMessage()
			 *  Trace => 실행과정 => 해당위치찾기 printStackTrace()
			 */
			e.printStackTrace();
			
		} finally {
			// 파일 닫기, 쓰레드 종료, 네트워크 서버 종료, 오라클 연결 해제
			try {	
			
				fr.close();
		
			}catch (Exception e) {
			
			}
	}

  }
}
