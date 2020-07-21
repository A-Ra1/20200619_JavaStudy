package com.sist.exception;
/*
 *  ����ȸ��
 *     = ������ ���� ������ �����ϰ� ����� 
 *       ��κ��� ���α׷��� ����ó�� (try~catch)
 *       ==> API(�ڹ�, ���̺귯��)
 *     = ���α׷��Ӱ� ����ó���� ���� ���α׷��� �°� ó�� ����
 *     = ����)
 *     		�޼ҵ�() throws ������ ���� Ŭ�������
 *     		
 *     ��) �������� ������ ����
 *     	  	   public void display() throws Exception, ArrayIndexOutOfBoundsException
 *     			{
 *     				
 *     			}
 *    	==> ����ó���� ȣ���ϴ� �޼ҵ忡�� ó��
 */
public class MainClass {
 
	public int div(int a, int b) throws Exception { // b�� 0�̸� ������ �� ���� �ִ�
		
		return a/b; 
	}
	
	
	public static void main(String[] args) {
		
		MainClass m = new MainClass(); // ==> �ν��Ͻ� , static�� ���� �޼ҵ�� �ڵ�������� �ʴ´� 
	
		int res=0;
		
		try {
			
			res = m.div(2, 2);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
		System.out.println(res);
		
		/*
		try {
			Thread.sleep(1000);	// ����ó��
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}

}
