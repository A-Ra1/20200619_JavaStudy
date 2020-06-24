/*
 * switch 중첩
 * 
 *    if(조건)
 *     {
 *       if(조건문)
 *       {
 *       }
 *       else
 *       {
 *       }
 *     }
 *     
 *     switch(정수)
 *     {
 *     case 1:
 *       switch(정수)
 *        {
 *         case'A':
 *        }
 *     }   
 *     
 *     => computer -> 가위
 *                        user = 가위
 *                             = 바위
 *                             = 보
 *   
 */
import java.util.*;
public class 선택문6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int user = 0;
     int com = (int)(Math.random()*3); // 0.1.2
     //              ================
     /*                     1     = 
      *  		====		      2    = 우선순위
      *          3
      *          1. Math.random() => 0.0~0.99 => 0.0~2.9...=>0~2
      *          0 : 가위
      *          1 : 바위
      *          2 : 보
      *          
      */         
     Scanner scan = new Scanner(System.in);
     System.out.print("가위(0),바위(1),보(2):");
     
     user = scan.nextInt();
     
     // 결과값 출력
     /* switch 중첩
     switch (com) {
	case 0:
		switch (user) 
		{
		case 0:
			System.out.println("컴퓨터:가위,사용자:가위");
			System.out.println("비겼다");			
		   break;
		case 1:
			System.out.println("컴퓨터:가위,사용자:바위");
			System.out.println("사용자 win");
		   break;
		case 2:
			System.out.println("컴퓨터:가위,사용자:보");
			System.out.println("컴퓨터 win");
		   break;
		}
		break;
	case 1:
		switch (user) 
		{
		case 0:
			System.out.println("컴퓨터:바위,사용자:가위");
			System.out.println("컴퓨터 win");
		   break;
		case 1:
			System.out.println("컴퓨터:바위,사용자:바위");
			System.out.println("비겼다");
		case 2:
			System.out.println("컴퓨터:바위,사용자:보");
			System.out.println("사용자 win");
		   break;
		}
		
	case 2:
		switch (user) 
		{
		case 0:
			System.out.println("컴퓨터:보,사용자:가위");
			System.out.println("사용자 win");
		   break;
		case 1:
			System.out.println("컴퓨터:보,사용자:바위");
			System.out.println("컴퓨터 win");
		case 2:
			System.out.println("컴퓨터:보,사용자:보");
			System.out.println("비겼다");
		   break;
		}	
	

	default:
		break;
	}
     */
     String[] string= {"가위","바위","보"};
     
     
	 System.out.println("컴퓨터:"+string[com]+",사용자:"+string[user]);
     
    switch (com-user) 
     {
	case 2: case -1:
		System.out.println("사용자 win");
		break;
	case 1: case -2:
		System.out.println("컴퓨터 win");
		break;	
	default:
		System.out.println("비겼다");
		break;
	}
     
	}

}
