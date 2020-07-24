package com.sist.util;

// java.util : ���α׷����� ���� ����ϴ� Ŭ������ ����
// java.util => �ݵ�� import�� ����Ѵ�

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
	 *  Random() => ���� (���Ǽ��� ��ǻ�Ͱ� ����)
	 *  =======
	 *    => ���� nextInt() => 0~21�� 4õ (int ����) 
	 *    		  nextInt(int n) ==> �����ε� => ������ ���� ������ ���� �߻�
	 *    										 n���� ����
	 *    		  nextInt(100) => 0~99 => nextInt(101) => 0~100
	 *    		  ============================================= static�� �ƴϴ�
	 *    		  
	 *    		  static => Random.nextInt()
	 *    		  instance => ���� 
	 *    					  Random r=new Random();
	 *    					  r.nextInt()
	 *    		  static => �����ϰ� ���ÿ� ����
	 *    		  instance => �޸� �Ҵ�ÿ� ����
	 *    					  =============
	 *    						new ������() 
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
		
		// static �̾��ٸ� => MainClass.random();
		// ����� ���� �޼ҵ�� �ڵ� ȣ���� ����
	}

}
