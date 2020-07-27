package com.sist.io;
// ���Ͽ� ���� => ȸ������, ���, �Խ���
/*
 *  ���� => ����- => ArrayList
 *  ������ => ArrayList�� ��Ƽ� => ����
 */

import java.io.*;

public class MainClass2 {

	public static void main(String[] args) {
		/*
		 *  ���������
		 *  ----------
		 *  r => read
		 *  w => write => create
		 *  a => append
		 * 
		 *  FileOutputStream(1byte)
		 *  ������
		 *    new FileOutputStream ("��θ�")
		 *    new FileOutputStream ("��θ�",true/false) => false�� Default
		 *  FileWriter(2byte)
		 */
		//FileOutputStream fos=null;
		
		 FileWriter fos=null;
		try {
			
		//	fos=new FileOutputStream("c:\\javaDev\\temp.txt",true);
			
			fos=new FileWriter("c:\\javaDev\\temp.txt",true);
			
			 // true => ���� ������ ������ ����� ���� �����̱� 
			String str="ABCDEFG";
			
			// \r\n ~ ������ ���
			
//			fos.write('l'); // 1������ ���尡��
//			fos.write('m');
//			fos.write('n');
			
			fos.write(str+"\r\n");
			// ���ڿ��� ����Ʈ �迭�� �����Ҷ� ��� => getBytes()
			System.out.println("����Ϸ�");
			
		} catch (Exception e) {
			

			System.out.println(e.getMessage()); // ����ó�� 
			
		}finally {
			
			// ���� �ݱ�
			// finally => ���ϴݱ�, �����ݱ�, ����Ŭ ���� ����
			try {
				fos.close();
			} catch (Exception e2) {
				
			}
			
		}
		
		
	}

}
