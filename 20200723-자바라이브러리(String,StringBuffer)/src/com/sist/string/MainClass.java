package com.sist.string;
/*
 *  java.lang
 *  =========
 *   String / StringBuffer
 *   ======
 *   1) ���ڿ��� �ּҴ� "Hello","Java' ...
 *   2) char[] ĳ���� �迭�� �����ϴ� Ŭ�����̴� => "Hello" => {'H','e','l','l','o'};
 *   3) �ֿ� ���(�޼ҵ�)
 *   ====================
 *    1. length() : ������ ����
 *    2. trim() : �¿��� ��������
 *    3. substring() : ���ڸ� ����
 *    4. indexOf(), lastIndexOf() => ������ ��ġ
 *    5. equals() : ����� ���ڸ� ��
 *    6. ã�� => 
 *    		���� : contains
 *    		���� : startsWith
 *    		�� : endsWith
 *    ======================== �ν��Ͻ� �޼ҵ� (���� �۵�)
 *    
 *    7. static �޼ҵ� : valueOf() => ��� �⺻���� ���ڿ��� ��ȯ
 *   
 *   
 *   String s1="Hello"
 *    s1.length()
 *   String s2="Hello Java"
 *    s2.length()
 *    
 *   String.valueOf()  
 *   
 */
public class MainClass {
	/*
	 *  String s="012345678"
	 *   s.substring(3,7)= end-1
	 */

	public static void main(String[] args) {

		String s="background-image: url('https://mp-seoul-image-production-s3.mangoplate.com/a4283e5725fb56755b9bbeb8f285d0dc.jpg')";
		String temp=s.substring(s.indexOf("'")+1,s.lastIndexOf("'"));
		System.out.println(temp.trim());
		
		String ss="���� ���عٴٸ� ���鼭 ���� �����ʹ�Ƽ. ���ĸԴ� �� ���� �䰡 �ÿ����� ������ �ƽ����� �� ���� �� ���ĸ� �����⿡ ������ �ʴ�. ������ġ��";
		if(ss.length()>20) {
			String sss=ss.substring(0,20)+"...";
			System.out.println(sss);
		}
		
		String s1="Hello";
		String s2="Hello";
		String s3=new String("Hello");
		
//		if(s1==s3) {
//			System.out.println("s1==s3");
//		}else {
//			System.out.println("s1!=s3");
//		}
		
		// equalsIgnoreCase : ��ҹ��� ������ ���� => �˻�
		// equals : ��ҹ��� ���� => LOGIN, ID�ߺ�
		
		if(s1.equalsIgnoreCase(s3)) {
			System.out.println("s1==s3");
		}else {
			System.out.println("s1!=s3");
		}
		
		
	}

}
