/*
 *  =====
 *  3 6 9
 *  =====  int[] com={3,6,9};
 *  
 *  ====== ��� ======
 *  S:�� => �ڸ����� �´� ���
 *   
 *  B:�ܡ� => �ڸ����� Ʋ������ ���ڴ� �´� ���
 *  ==================
 */
import java.util.*;

import sun.print.resources.serviceui;

public class �ڹٹ迭_�뵵2 {

	public static void main(String[] args) {
		
		int[] com= {3,6,9};
		//����ڰ� �Է��� �� ����
		int[] user=new int[3];
		
		// �Է¹ޱ�
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.print("3�ڸ� ������ �Է�:");// 100~999
			// ����
			int input=scan.nextInt();
			if(input<100 || input>999) {
				// || => �߸��� �Է��� ��� �ַ� ó��
				// && => ���������� �Է��� �� ���
				System.out.println("�߸��� �Է��Դϴ�"); // while ó������ �̵�
				continue; // while�� ���ǽ����� �̵�
			}
	        // �߸��� �Է�
			// �ߺ��� ���� ������ �ȵȴ�
			// ���� => 123
			user[0]=input/100; // 123/100 =1
			user[1]=(input%100)/10; // 123%100 => 23/10 => 2
			user[2]=input%10; // ȭ��ż� ���ϱ�
			
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2]) {
				System.out.println("�ߺ��� ���� ����� �� ����");
				continue;
			}
		  // ��
			int s=0,b=0;
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					
					if(com[i]==user[j])	{
						
						if(i==j)
							s++;
						else 
							b++;
						
	     			}
				}
			}
				
			// ����� ���	
			
			System.out.println("======���======");
			System.out.print("S:");
			 for(int i=0; i<s; i++) {
				 System.out.print("��");
			 }
			System.out.print("\nB:"); 
			for(int i=0; i<b; i++) {
				 System.out.print("��");
			 }
			System.out.println("\n================");
				
		 if(s==3) {
			 System.out.println("Game Over");
			 break;
		 }
		}
		

	}

}
