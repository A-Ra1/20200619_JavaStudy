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
		
		day=day.substring(0,day.lastIndexOf("|")); // �� ������ |���� ����
		
		System.out.println(day);
		
		// ��¥�� �и�
		
		String[] resdays=day.split("\\|"); // ���Խ�
		
		/*
		 *  ���Խ�
		 *  
		 *  ^ => ���۹��� ^A (A�� �����ϴ�~) => ^[��-�R] (�ѱ۷� �����ϴ�~) ^[A-Za-z] (����� �����ϴ�)
		 *  									[^��-�R] (�ѱ��� ������ ������)
		 *  $ => ������ A$ (A�� ������~)
		 *  . => ������ �ѱ��� (��� ����) ==> \\.
		 *  | => ����
		 *  ? => ������ ���, ������ ���X
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
