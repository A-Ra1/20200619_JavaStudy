/*
 *  ������
 *   1) while�� ������ ���� ��� error => for (;;)
 *      while () => ���ǽ��� ����
 *      {
 *      } ==> �����߻�
 *   2) while���� ���ѷ���
 *     => for(;;) => while(true) : ���� ���� ����
 *     
 *     for(int i = 0; i<10; i++)
 *     
 *     int i=0;
 *     while(i<10)
 *     {
 *       i++;
 *     }
 */
// 5 => 1~5 ������ ��
import java.util.*;
public class �ݺ���_while5 {

	public static void main(String[] args) {
	
		int user=0; // ����ڰ� ��û�� ����
		int i=1; // ����ڰ� ��û�� �������� ����
		int sum=0; // ����(��)
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�����Է�:");
		user = scan.nextInt();
		
		while(i<=user)
			
		{
			sum+=i; //����ڰ� ��û�� ����
			i++; // ����
		}
		 // i=6; => i=1; �ʱⰪ �缳��
		  System.out.println("i:"+i);
          System.out.println("sum:"+sum);		
		
          i=1;
          while(i<=5)
          {
        	  System.out.println(i);
        	  i++;
          }
		   // i = 6
          
          System.out.println();
          i=5;
          while (i>=1)
          {
        	 System.out.println("i:"+i);
        	 i--;
	    }
        //i=0 
		

	}

}
