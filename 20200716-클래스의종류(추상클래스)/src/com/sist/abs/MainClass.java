package com.sist.abs;
/*
 *  �߻� Ŭ����
 *    => �̿ϼ��� Ŭ����
 *    => new�� ����ؼ� �޸� �Ҵ��� �Ұ���
 *    class A
 *     => A a = new A();
 *    abstract class B
 *       => B b = new B(); ==> error
 *     => �׻� ����� ������ ���� Ŭ�������� ������ ������ ���
 *     => �⺻ Ʋ�� ����
 *     => ���ø� �Ѵ� : �����ϴ� ������ ���α׷����� �ٸ� ���� �ִ�
 *        ��) 
 *        	  ����
 *     
 *   ��)
 *    	1. �Խ����� ������       
 *      2. �Խ��ǿ��� �۾���, ���뺸��, ����, ����, ã�⸦ ������  => �߻�Ŭ������ ��� (�⺻Ʋ�� ����)
 *      
 *   ��)
 *   	��ȭ��
 *   	======
 *   		��ȭ ���
 *   		����
 *   		��ȭ �󼼺���
 *   		�̺�Ʈ
 *   		���� ����  
 *        ================
 *      cgv  �ް��ڽ�  �Ե��ó׸� 
 */
abstract class ����{
	public abstract void draw();
	public void color() {
		System.out.println("���������� �׸��� �׸���"); // ���� Ŭ�������� �⺻������ �����Ǵ� �޼ҵ�
	}
}
class �ﰢ�� extends ����{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("�ﰢ���� �׸���");
		
	} // draw�� �����ؾ� ������ ���� ����
	
}
class �� extends ����{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("���� �׸���");
	}
	
	// ���Ǻ��� => ������
	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("���������� �׸��� �׸���"); 
	}
}
class �簢�� extends ����{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("�簢���� �׸���");
	}
	
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		���� g=new �ﰢ��(); // �߻�Ŭ���� ������ = new ������Ŭ����
		
		g.color();
		g.draw();
		
		g=new �簢��();
		g.color();
		g.draw();
		
		g=new ��(); // Ŭ���� �������� �ѹ��� ��� ó�� ���� (�߻�Ŭ������ �������̽��� ���)
		g.color();
		g.draw();
		
	}

}
