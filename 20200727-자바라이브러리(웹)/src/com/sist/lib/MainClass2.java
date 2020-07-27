package com.sist.lib;
/*
 *  ArrayList 사용법, Vector 사용법, Map 사용법
 */
import java.util.*;
public class MainClass2 {

	public static void main(String[] args) {

	//	ArrayList<String> names=new ArrayList<String>();
		// => names라는 메모리 안에는 String만 저장하겠다
		
		
		
	//	Vector<String> names=new Vector<String>();
		
		LinkedList<String> names=new LinkedList<String>();
		
		// 속도 : LinkedList
		// 접근성 : ArrayList
		
		// ArrayList Vector 
		//  (동기화) / (비동기화)
		
		
		names.add("홍길동"); // indexNum = 0
		names.add("심청이"); // 1
		names.add("이순신"); // 2
		names.add("강감찬"); // 3
		names.add("춘향이"); // 4
		
		// 출력
		
		System.out.println("저장된 갯수:"+names.size());
		for(int i=0; i<names.size(); i++) { //size => 저장된 갯수
			
			// 데이터를 받을때
			String name=names.get(i);
			// 원하는 위치에 저장된 데이터를 읽을때
			
			System.out.println(name+":"+i); // 인덱스는 자동생성 => 0번부터~
			
		}
		
		//add() => 5
		//add(index,"값")
		
		names.add(3,"을지문덕");
		System.out.println("저장된 갯수:"+names.size());
		for(int i=0; i<names.size(); i++) { //size => 저장된 갯수
			
			// 데이터를 받을때
			String name=names.get(i);
			// 원하는 위치에 저장된 데이터를 읽을때
			
			System.out.println(name+":"+i); // 인덱스는 자동생성 => 0번부터~
			
		}
		
		// 삭제하기
		names.remove(2);
		
		System.out.println("저장된 갯수:"+names.size());
		for(int i=0; i<names.size(); i++) { //size => 저장된 갯수
			
			// 데이터를 받을때
			String name=names.get(i);
			// 원하는 위치에 저장된 데이터를 읽을때
			
			System.out.println(name+":"+i); // 인덱스는 자동생성 => 0번부터~
			
		}
		
		// 수정
		
		names.set(2, "박문수");
		
		System.out.println("저장된 갯수:"+names.size());
		for(int i=0; i<names.size(); i++) { //size => 저장된 갯수
			
			// 데이터를 받을때
			String name=names.get(i);
			// 원하는 위치에 저장된 데이터를 읽을때
			
			System.out.println(name+":"+i); // 인덱스는 자동생성 => 0번부터~
			
		}
		
		names.clear(); //전체삭제
		System.out.println("저장된 갯수:"+names.size());
	}

}
