package com.sist.temp;

import java.io.*;
import java.util.*;
 // split, StringTokenizer

public class MainClass {

	public static void main(String[] args) {
		// �����б� => ����ó��
		
		FileReader fr=null;
		
		// ���� ���� ~ FileWriter => ���ڽ�Ʈ�� (�ѱ�����) 
		/*
		 *  FileInputStream
		 *  FileOutputStream
		 *  ===============1byte (�ѱ�X, �׸�����(png,jpg...zip) OK)
		 */
		
		try {
			
			fr=new FileReader("c:\\javaDev\\daum_movie.txt");
			int i=0; // �ѱ��ھ� �б� => ������ ��ȣ
			
			StringBuffer sb=new StringBuffer(); // ���ڿ� ����
			
			
			while((i=fr.read())!=-1) {
				
				//System.out.print((char)i);
				sb.append(String.valueOf((char)i));
			}
			System.out.println(sb.toString());
		} catch (Exception e) {

			// ����ó�� => �����
			/*
			 *  ���� �޼��� Ȯ�� getMessage()
			 *  Trace => ������� => �ش���ġã�� printStackTrace()
			 */
			e.printStackTrace();
			
		} finally {
			// ���� �ݱ�, ������ ����, ��Ʈ��ũ ���� ����, ����Ŭ ���� ����
			try {	
			
				fr.close();
		
			}catch (Exception e) {
			
			}
	}

  }
}
