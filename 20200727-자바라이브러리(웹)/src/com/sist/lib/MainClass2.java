package com.sist.lib;
/*
 *  ArrayList ����, Vector ����, Map ����
 */
import java.util.*;
public class MainClass2 {

	public static void main(String[] args) {

	//	ArrayList<String> names=new ArrayList<String>();
		// => names��� �޸� �ȿ��� String�� �����ϰڴ�
		
		
		
	//	Vector<String> names=new Vector<String>();
		
		LinkedList<String> names=new LinkedList<String>();
		
		// �ӵ� : LinkedList
		// ���ټ� : ArrayList
		
		// ArrayList Vector 
		//  (����ȭ) / (�񵿱�ȭ)
		
		
		names.add("ȫ�浿"); // indexNum = 0
		names.add("��û��"); // 1
		names.add("�̼���"); // 2
		names.add("������"); // 3
		names.add("������"); // 4
		
		// ���
		
		System.out.println("����� ����:"+names.size());
		for(int i=0; i<names.size(); i++) { //size => ����� ����
			
			// �����͸� ������
			String name=names.get(i);
			// ���ϴ� ��ġ�� ����� �����͸� ������
			
			System.out.println(name+":"+i); // �ε����� �ڵ����� => 0������~
			
		}
		
		//add() => 5
		//add(index,"��")
		
		names.add(3,"��������");
		System.out.println("����� ����:"+names.size());
		for(int i=0; i<names.size(); i++) { //size => ����� ����
			
			// �����͸� ������
			String name=names.get(i);
			// ���ϴ� ��ġ�� ����� �����͸� ������
			
			System.out.println(name+":"+i); // �ε����� �ڵ����� => 0������~
			
		}
		
		// �����ϱ�
		names.remove(2);
		
		System.out.println("����� ����:"+names.size());
		for(int i=0; i<names.size(); i++) { //size => ����� ����
			
			// �����͸� ������
			String name=names.get(i);
			// ���ϴ� ��ġ�� ����� �����͸� ������
			
			System.out.println(name+":"+i); // �ε����� �ڵ����� => 0������~
			
		}
		
		// ����
		
		names.set(2, "�ڹ���");
		
		System.out.println("����� ����:"+names.size());
		for(int i=0; i<names.size(); i++) { //size => ����� ����
			
			// �����͸� ������
			String name=names.get(i);
			// ���ϴ� ��ġ�� ����� �����͸� ������
			
			System.out.println(name+":"+i); // �ε����� �ڵ����� => 0������~
			
		}
		
		names.clear(); //��ü����
		System.out.println("����� ����:"+names.size());
	}

}
