package com.sist.io;

import java.io.*; //try-catch
import java.util.*;

/*
 *  FileInputStream, FileReader
 *  FileOutputStream, FileWriter
 *  BufferedReader, 
 *  
 *  자바 프로그램
 *  자바 웹프로그램 (스프링)
 *  
 *  
 */

public class MainClass4 {

	public static void main(String[] args) {
		
		ObjectInputStream ois=null;

		try {
			
			ois=new ObjectInputStream(new FileInputStream("c:\\javaDev\\movie_test.txt"));
			
			ArrayList<Movie> list=(ArrayList<Movie>)ois.readObject(); //형변환!
			
			// 출력
			
			for(Movie m:list) { 
				
				System.out.println(m.getMno()+" "+m.getTitle()+" "+m.getActor());
			}
		} catch (Exception e) {

			// 에러 처리
			System.out.println(e.getMessage());
			
		} finally {
			
			try {
				
				ois.close();
				
			} catch (Exception e2) {
				
			}
		}
	}

}
