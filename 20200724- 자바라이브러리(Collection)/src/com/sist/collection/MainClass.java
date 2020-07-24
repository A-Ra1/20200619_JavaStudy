package com.sist.collection;

import java.util.ArrayList;

/*
 *  Collection
 *  ========== �ڷᱸ��
 *  �޸𸮿� �����ؼ� ���� ���ϰ� ��� ����
 *  => ���Ǵ� ���α׷� : ����� => CURD ���α׷� => ���� (�޸�) <=> ����
 *  											   => ��� �����͸� ������ �� �ִ�
 *  											CURD => �б�, ����, ����, ����, ���尹��
 *  										�б� : get()
 *  										���� : size()
 *  										���� : set()
 *  										���� : remove()
 *  										���� : add()
 *  => ������ => �迭�� ��ü
 *  => ����
 *   1) ������ ����, �ߺ��� ������ �߰�
 *   	List (�������̽�) ==> �����ͺ��̽� ���α׷�
 *    => ������ Ŭ����
 *    *** ArrayList : �񵿱�ȭ
 *    *** Vector : ����ȭ
 *     LinkedList
 *     Queue
 *     Stack
 *   2) ������ ���� �ߺ��� ���� ������ �߰� ==> Ž����
 *   	Set
 *   	  HashSet
 *   	  TreeSet
 *   3) Ű, ������ ==> �ΰ��� ���ÿ� ���� ==> Ŭ���� ����(Spring)
 *   	Map
 *   	  HashTable
 *   	*** HashMap	
 */
public class MainClass {

	public static void main(String[] args) {

		ArrayList list=new ArrayList();
//		// �߰�
//		list.add(10); //0
//		list.add(10.5); //1
//		list.add("ȫ�浿"); //2
//		list.add('A'); //3
//		
//		//�� �б�
//		int a=(int)list.get(0);
//		double d=(double)list.get(1);
//		String s=(String)list.get(2);
//		char c=(char)list.get(3);
//		
//		System.out.println(a);
//		System.out.println(d);
//		System.out.println(s);
//		System.out.println(c);
		
		list.add("ȫ�浿");
//		list.add("������");
		list.add("��û��");
		list.add("�̼���");
		list.add("�ڹ���");
		list.add("������");
		
		for(int i=0; i<list.size(); i++) {
			String name=(String)list.get(i);
			System.out.println(name);
		}
		
		list.remove(2);
		// �ڵ����� �ε�����ȣ �����ĵ�
		
		for(int i=0; i<list.size(); i++) {
			String name=(String)list.get(i);
			System.out.println(name);
		}
		
	    list.add(1,"������"); // �ε�����ȣ 1���� �����϶�
	    /*
	     * 0
	     * 1
	     * 2
	     * 3
	     * 4
	     * 
	     */
	    for(int i=0; i<list.size(); i++) {
			String name=(String)list.get(i);
			System.out.println(name);
		}
		
		
	}

}
