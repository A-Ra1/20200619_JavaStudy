/*
 * switch ��ø
 * 
 *    if(����)
 *     {
 *       if(���ǹ�)
 *       {
 *       }
 *       else
 *       {
 *       }
 *     }
 *     
 *     switch(����)
 *     {
 *     case 1:
 *       switch(����)
 *        {
 *         case'A':
 *        }
 *     }   
 *     
 *     => computer -> ����
 *                        user = ����
 *                             = ����
 *                             = ��
 *   
 */
import java.util.*;
public class ���ù�6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int user = 0;
     int com = (int)(Math.random()*3); // 0.1.2
     //              ================
     /*                     1     = 
      *  		====		      2    = �켱����
      *          3
      *          1. Math.random() => 0.0~0.99 => 0.0~2.9...=>0~2
      *          0 : ����
      *          1 : ����
      *          2 : ��
      *          
      */         
     Scanner scan = new Scanner(System.in);
     System.out.print("����(0),����(1),��(2):");
     
     user = scan.nextInt();
     
     // ����� ���
     /* switch ��ø
     switch (com) {
	case 0:
		switch (user) 
		{
		case 0:
			System.out.println("��ǻ��:����,�����:����");
			System.out.println("����");			
		   break;
		case 1:
			System.out.println("��ǻ��:����,�����:����");
			System.out.println("����� win");
		   break;
		case 2:
			System.out.println("��ǻ��:����,�����:��");
			System.out.println("��ǻ�� win");
		   break;
		}
		break;
	case 1:
		switch (user) 
		{
		case 0:
			System.out.println("��ǻ��:����,�����:����");
			System.out.println("��ǻ�� win");
		   break;
		case 1:
			System.out.println("��ǻ��:����,�����:����");
			System.out.println("����");
		case 2:
			System.out.println("��ǻ��:����,�����:��");
			System.out.println("����� win");
		   break;
		}
		
	case 2:
		switch (user) 
		{
		case 0:
			System.out.println("��ǻ��:��,�����:����");
			System.out.println("����� win");
		   break;
		case 1:
			System.out.println("��ǻ��:��,�����:����");
			System.out.println("��ǻ�� win");
		case 2:
			System.out.println("��ǻ��:��,�����:��");
			System.out.println("����");
		   break;
		}	
	

	default:
		break;
	}
     */
     String[] string= {"����","����","��"};
     
     
	 System.out.println("��ǻ��:"+string[com]+",�����:"+string[user]);
     
    switch (com-user) 
     {
	case 2: case -1:
		System.out.println("����� win");
		break;
	case 1: case -2:
		System.out.println("��ǻ�� win");
		break;	
	default:
		System.out.println("����");
		break;
	}
     
	}

}
