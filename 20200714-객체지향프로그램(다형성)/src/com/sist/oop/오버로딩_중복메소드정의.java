package com.sist.oop;
/*
 *  �ڹ�
 *   1��° �� => package�� (�ѹ��� ����� ����)
 *   2��° �� => import (������ ����� ����)
 *   3��° �� => 
 *     public class className{
 *     		�ʿ��� �������� => �������
 *     		������ ���� �ʱ�ȭ => ������
 *     		��� => �޼ҵ�
 *     }
 *     
 *     => �ٸ� Ŭ�������� ���ÿ��� 
 *     	  import com.sist.oop.*
 *        ��Ű��
 *        	com.ȸ���.��ɸ� => com.sist.client , com.sist.surver
 *        	org.������.��ɸ� => org.springframework.web.servlet.view.*
 *     
 *      ĸ��ȭ
 *        => ������ private
 *        => �޼ҵ�� public ==> ����(getter/setter)
 *      ���
 *        => extends : ������ Ŭ���� ����� ������ �´�
 *           ���� ��Ӹ� ����
 *      ������
 *        => ����, �߰�
 *      ========================================= ���������� �ƴ϶� �������            
 *     		
 *     �����ε� (�����ڿ��� �ַ� ���)
 *      = ���� �޼ҵ������ �������� ����� �����
 *        =============
 *        1. �Ű������� �ٸ��� (������ ���������� �ٸ���)
 *        2. �������� �������
 *        3. ���� Ŭ���� �ȿ��� �����
 *        
 *        plus() :
 *        int + int => plusInt(int a, int b) =>  plus(int a, int b)
 *        double + double  => plusDouble(double d, double d1) => plus(double d, double d1)
 *        int +  double => plusIntDouble(int a, double d) => plus(int a, double d)
 *        String + String => plusString(String s1, String s2) => plus(String s1, String s2)
 *        													����� ���� �޼ҵ�� �޼ҵ�� ���� ���� (�����ε�)
 *        
 *        float + double => 
 *        long + int
 *        int + char
 *        char + double
 *        String + char
 *        
 */
class Calc{
//	 �ν��Ͻ� �޼ҵ� : new�� ���ø��� ���� ����Ǵ� �޼ҵ�
	public void plus(int a, int b) {
		System.out.printf("%d+%d=%d\n",a,b,a+b);
	}
	public void plus(double a, double b) {
		System.out.printf("%f+%f=%f\n",a,b,a+b);
	}
	public void plus(String a, String b) {
		System.out.printf("%s+%s=%s\n",a,b,a+b);
	}
	public double plus(double d, char c) {
		return d+c;
	}
}
/*
 *  ����
 *  ==== 
 *   �������
 *   static ��������
 *  �޼ҵ�
 *  ======
 *   ����޼ҵ�
 *   static �޼ҵ�  
 *   
 *   class A
 *   {
 *     int a;
 *     static int b;
 *     
 *     public void disp1()
 *     { 
 *       => a,b ����� ����
 *       => disp2() ȣ���� ����
 *     }
 *     public static void disp2()
 *     {
 *       => b�� ����� ����
 *       => disp1(), a�� ����� �� ����
 *          ============
 *           => ���ÿ��� �ݵ�� new �� ����ؼ� ���
 *     }
 *   }
 */
public class �����ε�_�ߺ��޼ҵ����� {
	int a=10;
	static int b=20;
	public �����ε�_�ߺ��޼ҵ�����() {
		System.out.println("this:"+this);
	}
	public void disp1() {
		System.out.println(this.b);
		System.out.println(a); // this �����Ǿ�����
		
	}
	public static void disp2() {
		System.out.println(b);
		
		�����ε�_�ߺ��޼ҵ����� aa=new �����ε�_�ߺ��޼ҵ�����();
		System.out.println("aa="+aa);
		System.out.println(aa.a); // static������ �ν��Ͻ������� ����� �� ����
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc cc=new Calc(); // �޼ҵ� ��ü�� ����
	    cc.plus("Hello", "Java");
	    cc.plus(100, 200);
	    �����ε�_�ߺ��޼ҵ����� aa=new �����ε�_�ߺ��޼ҵ�����();
	    System.out.println("aa="+aa);
		System.out.println(aa.a); // static������ �ν��Ͻ������� ����� �� ����
			
	}

}
