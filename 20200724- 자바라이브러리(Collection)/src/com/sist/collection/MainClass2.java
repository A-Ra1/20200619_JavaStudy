package com.sist.collection;
/*
 *  제네릭스 타입 : 전체의 데이터형을 변경
 *   <String> ==> Object ==> String 으로 변경
 *   
 *   class Box<T>
 *   {
 *     T t;
 *     public void setT(T t)
 *     {
 *       this.t=t;
 *     }
 *     public T getT()
 *     {
 *       return t;
 *     }     
 *   }
 *   
 *   Box<String> box=new Box<String>()
 */
import java.util.*;

class Movie{
	
	private int mno;
	private String title;
	private String director;
	
	
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
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	private String actor;
}
public class MainClass2 {

	public static void main(String[] args) {

		ArrayList<Movie> list =new ArrayList<Movie>();
		
		
	}

}
