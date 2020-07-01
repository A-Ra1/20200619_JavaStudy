/*
 *  =====
 *  3 6 9
 *  =====  int[] com={3,6,9};
 *  
 *  ====== 결과 ======
 *  S:● => 자리수가 맞는 경우
 *   
 *  B:●● => 자리수가 틀리지만 숫자는 맞는 경우
 *  ==================
 */
import java.util.*;

import sun.print.resources.serviceui;

public class 자바배열_용도2 {

	public static void main(String[] args) {
		
		int[] com= {3,6,9};
		//사용자가 입력한 값 저장
		int[] user=new int[3];
		
		// 입력받기
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.print("3자리 정수를 입력:");// 100~999
			// 조건
			int input=scan.nextInt();
			if(input<100 || input>999) {
				// || => 잘못된 입력일 경우 주로 처리
				// && => 정상적으로 입력이 된 경우
				System.out.println("잘못된 입력입니다"); // while 처음으로 이동
				continue; // while의 조건식으로 이동
			}
	        // 잘못된 입력
			// 중복된 수가 있으면 안된다
			// 저장 => 123
			user[0]=input/100; // 123/100 =1
			user[1]=(input%100)/10; // 123%100 => 23/10 => 2
			user[2]=input%10; // 화폐매수 구하기
			
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2]) {
				System.out.println("중복된 수는 사용할 수 없다");
				continue;
			}
		  // 비교
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
				
			// 결과값 출력	
			
			System.out.println("======결과======");
			System.out.print("S:");
			 for(int i=0; i<s; i++) {
				 System.out.print("●");
			 }
			System.out.print("\nB:"); 
			for(int i=0; i<b; i++) {
				 System.out.print("●");
			 }
			System.out.println("\n================");
				
		 if(s==3) {
			 System.out.println("Game Over");
			 break;
		 }
		}
		

	}

}
