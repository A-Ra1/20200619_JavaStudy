/*
 * *
 * **
 * ***
 * ****
 * => 사용자가 입력한 갯수만큼 출력
 */
import java.util.*;
public class 반복문_2차for6 {

	public static void main(String[] args) {
	/*
		// 사용자 입력값
		int user=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		// user에 저장
		user=scan.nextInt(); // 줄수
		
		for(int i=1; i<=user; i++) {
			
			for(int j=1; j<=user+1-i; j++) { // j<=i
				System.out.print("*");
			}
		 System.out.println();
		}
*/
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=5; j++) {
				
			System.out.printf("[%d,%d]",i,j);
			
			}
	    System.out.println();

		}
		
	}

}
