package com.sist.inter;
interface A{
	public void display();
}
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A() {
			public void display() {
				System.out.println("A:displayCall...");
			}
		}; // �͸��� Ŭ���� => �������̽��� �̿��� ������ => �������̵�
		   // class => implements ���� �������̽��� ������ �� �ִ�
		a.display();
	}

}
