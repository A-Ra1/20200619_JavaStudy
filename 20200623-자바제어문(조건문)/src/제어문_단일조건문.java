/*
 *  �ڹٿ��� �����ϴ� ��� (��-��)
 *  = ���ǹ� , ���ù�
 *   ***= ���� ���ǹ� : if 
 *      ����)
 *         if(���ǹ�)==> ���ǹ��� �ݵ�� (����, ��, ��)
 *         {
 *          ������ true�϶��� �����ϴ� ����
 *         }
 *   ***= ���� ���ǹ� : if ~ else
 *           => �α���ó��, ID�ߺ�üũ
 *      ����)
 *         if(���ǹ�)
 *         {
 *          ������ true�� ��쿡 ó������
 *         }
 *         else
 *         {
 *          ������ false�� ��쿡 ó������
 *         }
 *          
 *   ***= ���� ���ǹ� : if ~ else if ~ else if ~ else
 *      ����)
 *         if(���ǹ�)
 *         {
 *          ������ true�� �����ϴ� ����
 *          => ������ ����
 *         }
 *         else if(���ǹ�)
 *         {
 *         ������ true�� �����ϴ� ����
 *          => ������ ����
 *         }
 *         else if(���ǹ�)
 *         {
 *         ������ true�� �����ϴ� ����
 *          => ������ ����
 *         }
 *         else
 *         {
 *         �ش� ������ ���� ��쿡 ������ �����ϴ� ����
 *         => ���� 
 *         }
 *         
 *    = ���ù� : switch ~ case
 *    = �ݺ���
 *   ***= �ݺ�Ƚ���� ������ ��� (for)
 *   ***= �ݺ�Ƚ���� ������ �ȵ� ��� (while)
 *    = �ݵ�� �ѹ� �̻� ���� (do~while)
 *    = �ݺ����
 *   ***= break : �ݺ��� ����
 *    = continue : Ư���κ��� ����
 *  
 */
import java.util.*;
// ���� 2��, char 1(+,-,*,/)
// ��Ģ����
public class ���_�������ǹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a,b,c;
	// a, b => ����ڰ� �Է�
	// c => ���� ����� ����
	
	char op = '+';
	
	// ������� �Է°��� �޴´�
	Scanner scan = new Scanner(System.in);
	System.out.print("ù��° ���� �Է� :");
	 a = scan.nextInt();
	 
	 System.out.print("�ι�° ���� �Է� :");
	 b = scan.nextInt();
	 // '+' => "+"
	 
	 System.out.print("������(+,-,*,/):");
	 op = scan.next().charAt(0);
	 // "+" ==>'x'
	 // Scanner => char�� �޾Ƽ� ó���ϴ� ����� ���� => ���ڿ�
	 // System.in => ����ó���� �ؾ� �Ѵ�
	 
	 // ����ó��
	 if (op=='+') // �� ������ �����ɶ� �Ʒ� ���� ����
	 {
	  System.out.printf("%d+%d=%d \n", a,b,a+b);
	 }
	 if (op=='-')
	 {
	  System.out.printf("%d-%d=%d \n", a,b,a-b);
	 }
	 if (op=='*')
	 {
	  System.out.printf("%d*%d=%d \n", a,b,a*b); 
	 }
	 if (op=='/') // �����⿡�� �ݵ�� ����ó�� => 0���� ���� �� ����
	 {
	  System.out.printf("%d/%d=%d \n", a,b,a/b);
	 	}
	    if (b==0)
	    {
	    System.out.println("0���� ���� �� �����ϴ�");
	    }
	    else 
	    {
	    System.out.printf("%d/%d=%.2f\n", a,b,a/(double)b);	
	
	    }
	  System.out.println("���α׷� ����"); 
	
	} // main => end  ���α׷� ����
//	 main : ���α׷� ���� , ���� �޼ҵ�
//	 ���α׷� ==> Ŭ���� (1) ==> ������
	}


