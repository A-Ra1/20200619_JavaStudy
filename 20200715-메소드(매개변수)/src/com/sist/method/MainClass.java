package com.sist.method;
class AA{
	public void AA() { //void�� ������ �Ϲ� �ν��Ͻ� �޼ҵ�, ������(X)
		System.out.println("AA() Call...");
//		void => �������� ���� (������� �������� �ʴ´�)
	}
	// �������� �������� �ʴ´� : Ư���޼ҵ� => �޸𸮿� ����
	public AA() {
		System.out.println("AA() Call...");
	}
	
}  
//����� => �ʱ�ȭ ��� => ������
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a=new AA();
		a.AA();
	}

}
