/*
 *  ����� �Է� => 0, 1, 2
 *  
 *  => 0�̸� => ����
 *  => 1�̸� => ����
 *  => 2�� => ��
 */

import java.util.*;

import com.sun.media.jfxmedia.events.PlayerEvent;
public class �ڹ����ǹ�����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scan = new Scanner(System.in);

 System.out.print("����(0), ����(1), ��(2) �Է�:");
 // �Է°�
 int number = scan.nextInt();

 if (number == 0)
 {
	System.out.println(number+"����");
 }
 if (number == 1)
 {
	System.out.println(number+"����");
 }
 if (number == 2)
 {
	System.out.println(number+"��");
 }
  // ��ǻ��
 int com = (int)(Math.random()*3);
 //             =================
 //               0.0~0.99 *3 ==> 0.0 ~ 2.9 => 0~2
 // ==> ����, �Ǽ�, ������ ��쿡�� ����� ����
 // "" ���ڿ��� ==���� �񱳰� �Ұ��� => equals()
 if (com == 0)
 {
	 System.out.println("��ǻ�� : ����");
 }
 if (com == 1)
 {
	 System.out.println("��ǻ�� : ����");	 
 }
 if (com == 2)
 {
	 System.out.println("��ǻ�� : ��");
 }
  //����� ��
 /*
  * ��ǻ�� :
  *       ����
  *            �����
  *            ����
  *            ���� 
  *            ��
  *           
  *       ���� 
  *            �����
  *            ����
  *            ����
  *            ��          
  *       ��
  *            �����
  *            ����
  *            ����
  *            ��
  *            
  */
  // ��ǻ�Ͱ� �����϶�
/*  if(com==0)
  {
	  if(number==0)
	  {
		 System.out.println("����"); 
	  }
	  if(number==1)
	  {
		  System.out.println("Player win!");
	  }	
	  if(number==2)
	  {
		  System.out.println("Computer win!");
	  }
  }
  // ��ǻ�Ͱ� �����϶�
  if(com==1)
  {
	  if(number==0)
	  {
		  System.out.println("Computer win!");
	  }
	  if(number==1)
	  {
		  System.out.println("����");
	  }	
	  if(number==2)
	  {
		  System.out.println("Player win!");
	  } 
  }
  // ��ǻ�Ͱ� ���϶�
  if(com==2)
  {
	  if(number==0)
	  {
		  System.out.println("Player win!");
	  }
	  if(number==1)
	  {
		  System.out.println("Computer win!");
	  }	
	  if(number==2)
	  {
		  System.out.println("����");
	  }
  }
  */
 if (com-number == -2 || com-number == 1 )
 {
	 System.out.println("Computer win!");
 }
	}

}
