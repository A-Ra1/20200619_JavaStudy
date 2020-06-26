/*
 *  주의점
 *   1) while은 조건이 없는 경우 error => for (;;)
 *      while () => 조건식이 없다
 *      {
 *      } ==> 오류발생
 *   2) while에서 무한루프
 *     => for(;;) => while(true) : 가장 많이 등장
 *     
 *     for(int i = 0; i<10; i++)
 *     
 *     int i=0;
 *     while(i<10)
 *     {
 *       i++;
 *     }
 */
// 5 => 1~5 까지의 합
import java.util.*;
public class 반복문_while5 {

	public static void main(String[] args) {
	
		int user=0; // 사용자가 요청한 변수
		int i=1; // 사용자가 요청한 변수까지 증가
		int sum=0; // 누적(합)
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력:");
		user = scan.nextInt();
		
		while(i<=user)
			
		{
			sum+=i; //사용자가 요청한 내용
			i++; // 증감
		}
		 // i=6; => i=1; 초기값 재설정
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
