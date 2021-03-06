package com.sist.util;
import java.util.*;

public class MainClass3 {

	public static void main(String[] args) {

		Random r=new Random();
		int[] resDay=new int[r.nextInt(10)+5];
		
		
		String day="";
		
		for(int i=0; i<resDay.length; i++) {
			resDay[i]=r.nextInt(31)+1;
			day+=resDay[i]+"|";
		}
		
		day=day.substring(0,day.lastIndexOf("|")); // 맨 마지막 |문자 제거
		
		System.out.println(day);
		
		// 날짜별 분리
		
		String[] resdays=day.split("\\|"); // 정규식
		
		/*
		 *  정규식
		 *  
		 *  ^ => 시작문자 ^A (A로 시작하는~) => ^[가-힣] (한글로 시작하는~) ^[A-Za-z] (영어로 시작하는)
		 *  									[^가-힣] (한글을 제외한 나머지)
		 *  $ => 끝문자 A$ (A로 끝나는~)
		 *  . => 임의의 한글자 (모든 글자) ==> \\.
		 *  | => 선택
		 *  ? => 있으면 출력, 없으면 출력X
		 */
		
		for(String s:resdays) {
			System.out.println(s);
		}
		System.out.println("===================");
		
		StringTokenizer st=new StringTokenizer(day, "|");
		while(st.hasMoreTokens()) {
			
			System.out.println(st.nextToken());
		}
	}

}
