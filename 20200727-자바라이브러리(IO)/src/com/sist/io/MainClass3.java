package com.sist.io;

import java.io.*;
import java.util.*;

class Movie implements Serializable{ // 객체를 통째로 저장하려면 필요
	
	private int mno;
	private String title;
	private String actor;
	
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	
}
public class MainClass3 {

	public static void main(String[] args) {

		try {
			
			ArrayList<Movie> list=new ArrayList<Movie>();
			
			Movie m=new Movie(); //데이터 추가 입력시 new를 매번 생성해야함
			m.setMno(1);
			m.setTitle("홍길동");
			m.setActor("홍길동");
			
			list.add(m);
			
			// index = 0
			m=new Movie();
			m.setMno(2);
			m.setTitle("홍길동1");
			m.setActor("홍길동1");
			
			list.add(m);
			
			// index = 1
			m=new Movie();
			m.setMno(3);
			m.setTitle("홍길동2");
			m.setActor("홍길동2");
			
			list.add(m);
			
			// index = 2
			
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("c:\\javaDev\\movie_test.txt"));
			
			oos.writeObject(list);
			System.out.println("저장완료");
//			
			
//			for(int i=0; i<list.size(); i++) {
//				
//				Movie mm=list.get(i);
//				System.out.println(mm.getActor());
//			}
//			
		} catch (Exception e) {

			System.out.println(e.getMessage());
			
		}finally {
			
		}
	}

}
