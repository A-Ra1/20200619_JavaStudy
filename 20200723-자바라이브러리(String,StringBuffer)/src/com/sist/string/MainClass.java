package com.sist.string;
/*
 *  java.lang
 *  =========
 *   String / StringBuffer
 *   ======
 *   1) 문자열은 주소다 "Hello","Java' ...
 *   2) char[] 캐릭터 배열을 제어하는 클래스이다 => "Hello" => {'H','e','l','l','o'};
 *   3) 주요 기능(메소드)
 *   ====================
 *    1. length() : 문자의 갯수
 *    2. trim() : 좌우의 공백제거
 *    3. substring() : 문자를 분해
 *    4. indexOf(), lastIndexOf() => 문자의 위치
 *    5. equals() : 저장된 문자를 비교
 *    6. 찾기 => 
 *    		포함 : contains
 *    		시작 : startsWith
 *    		끝 : endsWith
 *    ======================== 인스턴스 메소드 (따로 작동)
 *    
 *    7. static 메소드 : valueOf() => 모든 기본형을 문자열로 변환
 *   
 *   
 *   String s1="Hello"
 *    s1.length()
 *   String s2="Hello Java"
 *    s2.length()
 *    
 *   String.valueOf()  
 *   
 */
public class MainClass {
	/*
	 *  String s="012345678"
	 *   s.substring(3,7)= end-1
	 */

	public static void main(String[] args) {

		String s="background-image: url('https://mp-seoul-image-production-s3.mangoplate.com/a4283e5725fb56755b9bbeb8f285d0dc.jpg')";
		String temp=s.substring(s.indexOf("'")+1,s.lastIndexOf("'"));
		System.out.println(temp.trim());
		
		String ss="예쁜 서해바다를 보면서 즐기는 애프터눈티. 조식먹는 곳 보다 뷰가 시원하지 않은게 아쉽지만 날 좋은 때 오후를 보내기에 나쁘지 않다. 샌드위치는";
		if(ss.length()>20) {
			String sss=ss.substring(0,20)+"...";
			System.out.println(sss);
		}
		
		String s1="Hello";
		String s2="Hello";
		String s3=new String("Hello");
		
//		if(s1==s3) {
//			System.out.println("s1==s3");
//		}else {
//			System.out.println("s1!=s3");
//		}
		
		// equalsIgnoreCase : 대소문자 구분이 없다 => 검색
		// equals : 대소문자 구분 => LOGIN, ID중복
		
		if(s1.equalsIgnoreCase(s3)) {
			System.out.println("s1==s3");
		}else {
			System.out.println("s1!=s3");
		}
		
		
	}

}
