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
		
		day=day.substring(0,day.lastIndexOf("|")); // ¸Ç ¸¶Áö¸· |¹®ÀÚ Á¦°Å
		
		System.out.println(day);
		
		// ³¯Â¥º° ºĞ¸®
		
		String[] resdays=day.split("\\|"); // Á¤±Ô½Ä
		
		/*
		 *  Á¤±Ô½Ä
		 *  
		 *  ^ => ½ÃÀÛ¹®ÀÚ ^A (A·Î ½ÃÀÛÇÏ´Â~) => ^[°¡-ÆR] (ÇÑ±Û·Î ½ÃÀÛÇÏ´Â~) ^[A-Za-z] (¿µ¾î·Î ½ÃÀÛÇÏ´Â)
		 *  									[^°¡-ÆR] (ÇÑ±ÛÀ» Á¦¿ÜÇÑ ³ª¸ÓÁö)
		 *  $ => ³¡¹®ÀÚ A$ (A·Î ³¡³ª´Â~)
		 *  . => ÀÓÀÇÀÇ ÇÑ±ÛÀÚ (¸ğµç ±ÛÀÚ) ==> \\.
		 *  | => ¼±ÅÃ
		 *  ? => ÀÖÀ¸¸é Ãâ·Â, ¾øÀ¸¸é Ãâ·ÂX
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
