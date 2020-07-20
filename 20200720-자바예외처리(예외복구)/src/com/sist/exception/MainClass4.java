package com.sist.exception;
/*
 *  ����ó�� ==> ����Ǵ� ������ ������ �ִ� ���
 *  
 *  try{
 *  
 *   ���������� ����Ǵ� ����
 *  }catch(����Ǵ� ����Ŭ����) {
 *  
 *   ����ó�� 
 *  }
 *  catch(����Ǵ� ����Ŭ����) {
 *  
 *   ����ó��
 *  }
 *  catch(����Ǵ� ����Ŭ����) {
 *   
 *   ����ó��
 *  }
 *  
 *  catch�� ������ ���ÿ��� ������ ����
 *  ����ó�� ���� ����
 *  ======================================
 *  			�ֻ��� Ŭ���� => ��� Ŭ������ ���� Ŭ����
 *  			 
 *  
 */
public class MainClass4 {

	public static void main(String[] args) {

		try {
			
			int[] arr=new int[2];
			arr[0]=100;
			arr[2]=0;
			
			int a=arr[0]/arr[2];  //=> �ذᰡ���� catch�����Ƿ� ����������
			
			
			
		}catch (NumberFormatException e) {
			System.out.println("������ȯ�� �ȵ�");
		}
		 catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� ������ ���"); 
		}
		 catch (ArithmeticException e) {
			System.out.println("0���� ����������"); 
		}
		 catch (RuntimeException e) { // ������ߴ� ������ ó��
			System.out.println("����� ��� ������ ó��");
		 }
		 catch (Exception e) {
			System.out.println("������ ������ ��� ����"); 
		}
		 catch (Throwable e) {
			System.out.println("���ܿ� ������ ���ÿ� ó��"); 
		}
		System.out.println("���α׷� ����");
	}

}
