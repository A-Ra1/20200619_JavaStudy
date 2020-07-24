package com.sist.util;

// java.util : 프로그램에서 많이 사용하는 클래스의 집합
// java.util => 반드시 import를 사용한다

import java.util.*;
/*
 *  Random
 *  StringTokenizer
 *  Date
 *  Calendar
 *  ArrayList , Vector
 *  HashMap
 *  ===============
 *    = regex
 *    = reflect
 *  =============== web  
 *  
 */
public class MainClass {
	/*
	 *  Random() => 난수 (임의수를 컴퓨터가 결정)
	 *  =======
	 *    => 정수 nextInt() => 0~21억 4천 (int 범위) 
	 *    		  nextInt(int n) ==> 오버로딩 => 지정된 범위 사이의 수가 발생
	 *    										 n번은 제외
	 *    		  nextInt(100) => 0~99 => nextInt(101) => 0~100
	 *    		  ============================================= static이 아니다
	 *    		  
	 *    		  static => Random.nextInt()
	 *    		  instance => 저장 
	 *    					  Random r=new Random();
	 *    					  r.nextInt()
	 *    		  static => 컴파일과 동시에 저장
	 *    		  instance => 메모리 할당시에 저장
	 *    					  =============
	 *    						new 생성자() 
	 */
	
	public void random() {
		Random r=new Random();
		int a=r.nextInt(101); // int a=(int)(Math.Random()*101)
		System.out.println(a);
	}
	
	public static void main(String[] args) {

		MainClass m=new MainClass(); // m=> random
		m.random();
		MainClass m1=new MainClass();
		m1.random();
		
		// static 이었다면 => MainClass.random();
		// 사용자 정의 메소드는 자동 호출이 없다
	}

}
