package com.sist.abs;
/*
 *  Ŭ������ ����
 *    ==============
 *    = �߻� Ŭ����
 *    = �������̽� => �߻�Ŭ������ Ȯ�� (�߻�Ŭ�������� ����� ����)
 *    				  �������� Ŭ������ ��Ƽ� ���� (���� �ٸ� Ŭ������ �����Ͽ� ���)
 *    				  *** ���ռ��� ���� ���α׷�
 *    					  ====== 
 *    						= ���ռ� = Ŭ������ �����ϸ� �ٸ� Ŭ���� ������ ��ġ�°�
 *    						= ������ = �Ѱ��� ��� ������ �� �ִ� �ɷ� (�޼ҵ�)
 *    				  *** �� ��� �뵵
 *    						1. ����� �������� �������� ���
 *    						 ��) ��ư 
 *    							 ==== �α���, ���, ����, ���� ��
 *    						2. �������� Ŭ������ �Ѱ��� Ŭ������ ������ �� ���
 *    ============================================================
 *    	   	�߻�Ŭ����						�������̽�
 *    ============================================================
 *     	   1. ���ϻ��						 ���߻��
 *    ============================================================
 * 		   2. ������ �ȵ� �޼ҵ� 			������ �ȵ� �޼ҵ常
 * 			  ������ �� �޼ҵ�				������ �ִ�
 *    ============================================================
 *    	   3. ����
 *    		�߻�Ŭ����
 *    		public abstract class A{
 *    		  public abstract void display();
 *    		  public void aaa(){
 *    			}
 *     		}
 *     
 *     		�������̽�
 *     		public interface B{
 *     		 void display(); => public abstract void display();
 *     		 void aaa(); => public abstract void aaa();
 *     		}
 *     			public abstract ��������, �����Ͻ� �ڵ�����
 *    ============================================================
 *   	   4. �������
 *   		  public abstract class A{
 *   		   private int a;
 *   		  } 
 *   
 *   		  public interface B{
 *   		   int a; => error
 *   		   =====
 *   			�������̽��� ������ �ִ� ���� => ���������
 *   			int a; => public final static int a;
 *   			int a=10; 
 *      	  }
 *      	  => ���� : ��� ������ �߰��ϸ� ��� Ŭ������ error
 *      	  => �������̽�, �߻�Ŭ������ ��� => ����� �޾ƾ��Ѵ�
 *      		 ������ �ȵ� �޼ҵ�� �ݵ�� �����ؼ� ���
 *      
 *      	  ��) 
 *      		 public interface A{
 *      		  public void aaa();
 *      		  public void bbb();
 *      		 }
 *      			
 *      		 class B implement A{
 *      		  public void aaa(){}
 *      		  public void bbb(){}
 *      		 }
 *    = ����Ŭ���� => ���Ŭ����
 *    = �ܺ�Ŭ���� => �͸�Ŭ����
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class �߻�Ŭ���� extends JFrame implements MouseListener{ //mouselistener �ȿ� ������ �ȵ� �޼ҵ尡 �ִ�

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

@Override
public void mouseClicked(MouseEvent e) { // {} ���� ���� ������ �����Ϸ�
	// TODO Auto-generated method stub
	
}

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}	

}
