/*
 *  �������� 
 *  ========
 *     ���� 
 *       = byte (-128 ~ 127)
 *       = int (-21�� 4õ ~ 21�� 4õ) 
 *       = long 
 *     �Ǽ�
 *       = double
 *     ����
 *       = char 
 *     ��
 *       = boolean (true / false)
 *      ============================== �⺻��
 *      ������ ���� : �迭, Ŭ����
 *      ===========
 *        ���ڿ� ���� ���� => String
 *        ����)
 *          char c = 'A' => ���� �Ѱ��� ����
 *          String s = "ABCDEFG" => ��, ������ (��� ������ ���ڿ�) 
 *          ====== =
 *        �������� ���� 
 *        
 *       => String : Ŭ����
 *          ��� (����)
 *          => ���� ���� Ȯ��
 *             String s = "ABCDEF";
 *             s.length() => 6
 *          => String s = "ABCDEF";
 *             s.charAt(0) => 'A'
 *                 
 *       
 */		
// ����ڰ� ���ڿ��� �Է�
// �빮�� ����, �ҹ��� ������ ����� Ȯ��
import java.util.*;

public class �ݺ���_while3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "ABCDEFG"; // ���� ������ ����
       // System.out.println(s);
       Scanner scan = new Scanner(System.in);
       System.out.print("���ڿ��� �Է��ϼ���:");
       s = scan.next(); //String���� ���� ���� ���� => scan.nextLine(); ~ ��������ν�
       
       System.out.println(s);
     //  System.out.println("����:"+s.length());
       int a=0, b=0;
       // a => �ҹ��� ����
       // b => �빮�� ����
       /*
        *  ABCDEFG => 7
        *  =======     
        *  0123456 => 6
        */
       int i = 0; // ������ ������ŭ �����ϴ� ���� - ��������
       while (i<s.length())
       {
    	   char c = s.charAt(i); 
    	   if(c >= 'A' && c <='Z')
           b++; //����Ȯ�� => �� +=
    	   if(c >='a' && c <= 'z')
    	   a++;
    	   
    	   i++;
       }     
       System.out.println("�빮�� ����:"+b);
       System.out.println("�ҹ��� ����:"+a);
	}

}
