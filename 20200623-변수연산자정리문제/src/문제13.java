import java.util.*;
public class ����13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// ���� => �Ѱ��� �����͸� ����
		//     ���� , �Ǽ�, ����, true/false
		/*     ==> �޸�ũ�� ����
		 *         ==============
		 *          �ڹٿ��� �޸� ũ�⸦ ���� => �⺻��
		 *     ==> �������� (�ڷ���)
		 *         �Ǽ� : double(8byte), float(4byte)
		 *         default => double
		 *         ���� : byte(1), short(2), int(4), long(8)     
		 *         ���� : char(2byte) 0~65535 => Unicode
		 *         �� : boolean => true / false
		 */

	/*
	 * int a,b,c;
	Scanner scan = new Scanner(System.in);
	System.out.print("������ ���� �Է� :");
    a=scan.nextInt();
    b=scan.nextInt();
    c=scan.nextInt();
    
    System.out.println(a*b+c);*/
		
		int a;
		Scanner scan = new Scanner(System.in);
		System.out.print("(10~99):89>");
		a = scan.nextInt();
		if(a%11==0)
		{
			System.out.println("10�ڸ��� 1�ڸ��� ����");
		}
		else {
			System.out.println("10�ڸ��� 1�ڸ��� �ٸ���");
		}
		
	}

}
