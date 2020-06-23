import java.util.*;
public class 문제13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// 변수 => 한개의 데이터만 저장
		//     정수 , 실수, 문자, true/false
		/*     ==> 메모리크기 설정
		 *         ==============
		 *          자바에서 메모리 크기를 지원 => 기본형
		 *     ==> 데이터형 (자료형)
		 *         실수 : double(8byte), float(4byte)
		 *         default => double
		 *         정수 : byte(1), short(2), int(4), long(8)     
		 *         문자 : char(2byte) 0~65535 => Unicode
		 *         논리 : boolean => true / false
		 */

	/*
	 * int a,b,c;
	Scanner scan = new Scanner(System.in);
	System.out.print("세개의 정수 입력 :");
    a=scan.nextInt();
    b=scan.nextInt();
    c=scan.nextInt();
    
    System.out.println(a*b+c);*/
		
		int a;
		Scanner scan = new Scanner(System.in);
		System.out.print("(10~99):89>");
		a = scan.nextInt();
		if(a%11==0)
		{
			System.out.println("10자리와 1자리가 같다");
		}
		else {
			System.out.println("10자리와 1자리가 다르다");
		}
		
	}

}
