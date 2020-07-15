package com.sist.method;

/*
 *  => 메소드
 *     = 리턴값
 *     = 매개변수 : 애매한 경우
 *      printf("%d%d%d",1,2,3)
 *      printf("%d",1)
 *      ======================= 가변매개변수
 *      String...a 
 *      Object...obj
 */
public class 메소드 {
	public static void concat(String s, String... s1) { 
		for(String ss:s1) {
			s+=ss;
		}
		System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Object o=10;
		Object o1=0.5;
		Object o2='A';
		Object o3="aa"; // Object => 모든 데이터형을 통합할 수 있다
		Object o4=new 메소드();
				*/
		concat("Hello", "홍길동","심청이","박문수","춘향이");
	 
	}

}
