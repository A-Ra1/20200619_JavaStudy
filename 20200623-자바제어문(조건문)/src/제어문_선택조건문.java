/*
 *   ���� ���ǹ�
 *   if (���ǹ�)
 *   {
 *     ���ǹ��� true�� �����ϴ� ���� ����
 *   }
 *   else
 *   {
 *     ���ǹ��� false�϶� �����ϴ� ���� ����
 *   }
 *   
 *   ���ǹ� => �ٽ� (���� ����)
 *   
 *   =======> 137 page
 *   == ����
 *   <
 *   >
 *   !=
 *   ======= 
 *   &&
 *   || ������ �������� ���
 *   =======
 *  
 *   ch>='A' && ch<='Z'
 *   ch>='0' && ch<='9'
 *   ch>='��' && ch<='�R'  => ��ȣ�� �Ϸ������� �̷����
 *   
 *   ���ڿ� => !=, == ������� �ʴ´�
 *   equals() 
 *   !equals() 
 *   
 *   
 *   
 */
import java.util.*;


public class ���_�������ǹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         �����Ѱ��� �Է��� �޾Ƽ� => ���ĺ����� ���� Ȯ��
	    // ���� ����
		char a = 'A'; //���� => �ʱ�ȭ
		/* 
		 *  int => 0
		 *  double => 0.0
		 *  long => 0L
		 *  boolean => false
		 */
		// ���� �Ѱ� �Է�
		Scanner scan=new Scanner(System.in);
		System.out.print("�Է�:");
		//"ABC" => 012 �ڹٴ� ��� ���� ��ȣ 0���� �����Ѵ�
		a=scan.next().charAt(0);
		// a>='0' && a<='9'
		
		
		if((a>='A' && a<='Z') || (a>='a' && a<='z'))
		{
		 System.out.println(a+"�� ���ĺ��Դϴ�!");
		}
		else
		{
	     System.out.println(a+"�� ���ĺ��� �ƴմϴ�!");		
		}
	
	
	}

	
}
