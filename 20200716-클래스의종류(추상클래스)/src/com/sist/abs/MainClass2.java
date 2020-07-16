package com.sist.abs;
/*
 *  �Խ���
 *    => �亯�� �Խ��� => �亯�ϱ�
 *    => ����� �Խ��� => ��۴ޱ�
 *    => ������ �Խ��� => ���ε�
 *    => �ڷ�� 	   => ���ε�, �ٿ�ε�
 *    
 *  �۾���
 *  ���뺸��
 *  ���� 
 *  ���� 
 *  ã��
 *  ========   �߻�Ŭ����, �������̽�  
 */
abstract class Board{
	
	public abstract void write(); // �Խ��Ǹ��� ����� �ٸ��� ������ ���� �Ϸ�
	public abstract void content();
	
	// �ٸ� ��� �߰��� �����ϴ�
    // Board�� ���� ����� ������ ����
	
	public void update() {
		
		System.out.println("�Խù� ����");
	}
		
	public void delete() {
		
		System.out.println("�Խù� ����");
	}
	 	
	public void find () {
		
		System.out.println("�Խù� ã��");
	}

}

// ���
class ReplyBoard extends Board{

	@Override
	public void write() {
		
		System.out.println("�亯�� �Խ��� �۾���");
	}

	@Override
	public void content() {
		
		System.out.println("���뺸��");
	}
	
}
class DataBoard extends Board{

	@Override
	public void write() {
		
		System.out.println("�۾���+���ε�");
	}

	@Override
	public void content() {
		
		System.out.println("���뺸��+�ٿ�ε�");
	}
	
}
class GalleryBoard extends Board{

	@Override
	public void write() {
		
		System.out.println("�۾���+�̹������ε�");
	}

	@Override
	public void content() {
		
		System.out.println("���뺸��+�̹������ => �ı�Խ���");
	}
	
}
class ReplayBoard2 extends Board{

	@Override
	public void write() {
		
		System.out.println("�۾���");
	}

	@Override
	public void content() {
		
		System.out.println("���뺸��+���");
	}
	
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=====�亯���Խ���=====");
		Board b=new ReplyBoard();
			b.write();
			b.content();
			
		System.out.println("=====�������Խ���=====");
		b= new GalleryBoard();
			b.write();
			b.content();
			
		System.out.println("=====�ڷ��=====");
		b= new DataBoard();
			b.write();
			b.content();
			
		System.out.println("=====������Խ���=====");
		b= new ReplayBoard2();
			b.write();
			b.content();
	}

}
