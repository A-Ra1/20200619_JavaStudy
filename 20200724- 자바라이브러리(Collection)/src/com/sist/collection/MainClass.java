package com.sist.collection;

import java.util.ArrayList;

/*
 *  Collection
 *  ========== 자료구조
 *  메모리에 저장해서 사용시 편리하게 사용 가능
 *  => 사용되는 프로그램 : 입출력 => CURD 프로그램 => 단점 (메모리) <=> 파일
 *  											   => 모든 데이터를 저장할 수 있다
 *  											CURD => 읽기, 저장, 삭제, 수정, 저장갯수
 *  										읽기 : get()
 *  										갯수 : size()
 *  										수정 : set()
 *  										삭제 : remove()
 *  										저장 : add()
 *  => 가변형 => 배열을 대체
 *  => 종류
 *   1) 순서가 존재, 중복된 데이터 추가
 *   	List (인터페이스) ==> 데이터베이스 프로그램
 *    => 구현한 클래스
 *    *** ArrayList : 비동기화
 *    *** Vector : 동기화
 *     LinkedList
 *     Queue
 *     Stack
 *   2) 순서가 없고 중복이 없는 데이터 추가 ==> 탐색기
 *   	Set
 *   	  HashSet
 *   	  TreeSet
 *   3) 키, 데이터 ==> 두개를 동시에 저장 ==> 클래스 관리(Spring)
 *   	Map
 *   	  HashTable
 *   	*** HashMap	
 */
public class MainClass {

	public static void main(String[] args) {

		ArrayList list=new ArrayList();
//		// 추가
//		list.add(10); //0
//		list.add(10.5); //1
//		list.add("홍길동"); //2
//		list.add('A'); //3
//		
//		//값 읽기
//		int a=(int)list.get(0);
//		double d=(double)list.get(1);
//		String s=(String)list.get(2);
//		char c=(char)list.get(3);
//		
//		System.out.println(a);
//		System.out.println(d);
//		System.out.println(s);
//		System.out.println(c);
		
		list.add("홍길동");
//		list.add("강감찬");
		list.add("심청이");
		list.add("이순신");
		list.add("박문수");
		list.add("춘향이");
		
		for(int i=0; i<list.size(); i++) {
			String name=(String)list.get(i);
			System.out.println(name);
		}
		
		list.remove(2);
		// 자동으로 인덱스번호 재정렬됨
		
		for(int i=0; i<list.size(); i++) {
			String name=(String)list.get(i);
			System.out.println(name);
		}
		
	    list.add(1,"강감찬"); // 인덱스번호 1번에 저장하라
	    /*
	     * 0
	     * 1
	     * 2
	     * 3
	     * 4
	     * 
	     */
	    for(int i=0; i<list.size(); i++) {
			String name=(String)list.get(i);
			System.out.println(name);
		}
		
		
	}

}
