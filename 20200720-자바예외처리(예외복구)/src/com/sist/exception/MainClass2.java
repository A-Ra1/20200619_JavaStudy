package com.sist.exception;

public class MainClass2 {

	public static void main(String[] args) {

		System.out.println("���α׷� ����"); //1
		
		try {
			
			System.out.println("���� ���� int i = 10;"); //2
			System.out.println("���� ���� int j = 0;"); //3 
			System.out.println(10/0); // => �����߻� => catch �̵�
			System.out.println("����� ���:"+(10/0)); // ����
			// ���������� �����ϴ� ����
		}catch(Exception e)	{
			
			System.out.println("������ ���� �߻�(/zero)"); // 4
			// �����ϴ� �������� error�߻��� ��쿡 ��� 
		}
		finally {
			
			System.out.println("�ٽ� �Է��Ͻÿ�"); //5 ==> try,catch�� ������� ������ ����
		}
		
		System.out.println("���α׷� ����"); //6
	}

}
