/*
 *  사용자 정수 입력 => 짝수, 홀수
 *  
 *  메소드 => 결과값 => 리턴값
 *  		  메소드 자체에서 출력 => 리턴값(X) void
 *   1) => 입력
 *   2) => 입력 처리 // 리턴값(O)
 *   3) => 결과 출력
 */
import java.util.*;

public class 자바메소드3 {
	static int userInput() {
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		int num=scan.nextInt();
		
		return num;
	}
	// 연산자+제어문
	static void process(int num) {
		if(num%2==0) {
			System.out.println(num+"는 짝수입니다");
		}
		else {
			System.out.println(num+"는 홀수입니다");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자 입력값
		int num=userInput();
		
		process(num);
	}

}
