package com.sist.io;
/*
 *  IO 
 *  ==
 *   Input/Output
 *    ����/�б�
 *    1. �޸� �����
 *    2. ���� �����
 *    3. ��Ʈ��ũ �����
 *    
 *    => IO
 *       ==
 *        ��Ʈ�� �̿� => ������ ��� (��Ȯ�� ���� ����)
 *        ���� = �ܹ��� (�Է�, ��� ��ΰ� �ٸ���)
 *        
 *        = 1byte (�Ϲ� ����)
 *          ����Ʈ ��Ʈ��
 *          	InputStream / OutputStream => �������̽�
 *                ���ε� 	    �ٿ�ε�
 *        = 2byte (���ڸ� ������) => �ѱ�
 *          ���� ��Ʈ��
 *          	***Reader  /  Writer (O) => �������̽�
 *          
 *        = ��ü ��ü�� ���� : ����ȭ*
 *          ================
 *          = ObjectInputStream
 *          = ObjectOutputStream
 *        
 *        = �ӵ��� ������ => Buffer
 *          ***BufferedInputStream
 *          BufferedOutputStream   
 *          
 *          ==> XML, JSON (������ �Ľ��ϴ� ����� ���� �ִ�)
 *          
 *          ** ������
 *          1. �ݵ�� import java.io ���
 *          2. �ݵ�� ����ó��(CheckException)
 *          
 *          
 *          1. ���� �б�
 *             =========
 *              FileInputStream (1byte) -> �ѱ��� �ִ� ��� ������
 *              FileReader (2byte) 
 *              =================
 *              1) ������ �б�
 *                 FileInputStream fis=new FileInputStream("���� ��θ�")
 *                 										c:\\javaDev\\a.txt
 *                 
 *                 while(���ϳ�) ~ -1
 *                 {
 *                  ���
 *                 }
 *                 fis.close()
 *                 =========== finally
 *                 
 *               ** ������ �б� ���
 *               1) �ѱ��� �б�
 *                int read() =>  ���ڹ�ȣ
 *                   A => 65 => (char)i
 *               2) �������� ���ÿ� �д� ���
 *                int read() => ���� ����Ʈ ����
 *                
 *               ** ������ ����(����)
 *                FileOutputStream
 *                ================
 *                 write() => �ѱ��ھ� ����
 *                 
 *           IO 
 *            = FileInputStream , FileReader
 *            = FileOutputStream, FileWriter
 *            = BufferedReader, BufferedWriter
 *            = ObjectInputStream / ObjectOutputStream
 *            = BufferedInputStream / BufferedOutputStream
 *            --------------------------------------------
 *            
 *                   ������
 *                   ------
 *                    ����ȭ�� ������ : ����Ŭ
 *                    ������ȭ�� ������ : ������ ������ �ʿ���� �����͵� ����
 *                    					  html, xml, json
 *                    ������ȭ ������ : ���о���
 *                   
 *          
 */	
import java.io.*;

public class MainClass {

	public static void main(String[] args) {
		
		//FileInputStream fis=null; // �ݵ�� �ʱⰪ�ο�, ���� ���� (close����ϱ� ���ؼ�)
		
		FileReader fis=null; // �ѱ��� ���Ե� ������ �о�ö�
		// �ڹٿ��� ���� -> Ansi�� ������ �ȴ�
		
		try {
			
			// �����б�
			 fis=new FileReader("c:\\javaDev\\news1.txt");
			//fis=new FileInputStream("c:\\javaDev\\news1.txt");
			// ������ �о ����â�� ���
			int i=0; // �ѱ��ھ� �д´� => �ѱ��ھ� ������ �´�, ���ڹ�ȣ
			while((i=fis.read())!=-1) { // -1 EOF 
			
				System.out.print((char)i);
			}
			
		} catch (Exception e) {
			
			// ����ó��
			System.out.println(e.getMessage());
		}
		finally {
			
			// ���ϴݱ�
			try {
				
				fis.close(); // ����ó�� �ʿ�
				
			} catch (Exception e2) {
			}
		}
	}

}
