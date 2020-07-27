package com.sist.io;

import java.io.*; //try-catch
import java.util.*;

/*
 *  FileInputStream, FileReader
 *  FileOutputStream, FileWriter
 *  BufferedReader, 
 *  
 *  �ڹ� ���α׷�
 *  �ڹ� �����α׷� (������)
 *  
 *  
 */

public class MainClass4 {

	public static void main(String[] args) {
		
		ObjectInputStream ois=null;

		try {
			
			ois=new ObjectInputStream(new FileInputStream("c:\\javaDev\\movie_test.txt"));
			
			ArrayList<Movie> list=(ArrayList<Movie>)ois.readObject(); //����ȯ!
			
			// ���
			
			for(Movie m:list) { 
				
				System.out.println(m.getMno()+" "+m.getTitle()+" "+m.getActor());
			}
		} catch (Exception e) {

			// ���� ó��
			System.out.println(e.getMessage());
			
		} finally {
			
			try {
				
				ois.close();
				
			} catch (Exception e2) {
				
			}
		}
	}

}
