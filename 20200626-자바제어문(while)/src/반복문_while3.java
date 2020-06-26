/*
 *  데이터형 
 *  ========
 *     정수 
 *       = byte (-128 ~ 127)
 *       = int (-21억 4천 ~ 21억 4천) 
 *       = long 
 *     실수
 *       = double
 *     문자
 *       = char 
 *     논리
 *       = boolean (true / false)
 *      ============================== 기본형
 *      참조형 변수 : 배열, 클래스
 *      ===========
 *        문자열 저장 변수 => String
 *        형식)
 *          char c = 'A' => 문자 한개만 저장
 *          String s = "ABCDEFG" => 웹, 윈도우 (모든 데이터 문자열) 
 *          ====== =
 *        데이터형 변수 
 *        
 *       => String : 클래스
 *          기능 (제공)
 *          => 문자 갯수 확인
 *             String s = "ABCDEF";
 *             s.length() => 6
 *          => String s = "ABCDEF";
 *             s.charAt(0) => 'A'
 *                 
 *       
 */		
// 사용자가 문자열을 입력
// 대문자 갯수, 소문자 갯수가 몇개인지 확인
import java.util.*;

public class 반복문_while3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "ABCDEFG"; // 문자 여러개 저장
       // System.out.println(s);
       Scanner scan = new Scanner(System.in);
       System.out.print("문자열을 입력하세요:");
       s = scan.next(); //String으로 받은 값을 저장 => scan.nextLine(); ~ 공백까지인식
       
       System.out.println(s);
     //  System.out.println("갯수:"+s.length());
       int a=0, b=0;
       // a => 소문자 갯수
       // b => 대문자 갯수
       /*
        *  ABCDEFG => 7
        *  =======     
        *  0123456 => 6
        */
       int i = 0; // 문자의 갯수만큼 증가하는 변수 - 루프변수
       while (i<s.length())
       {
    	   char c = s.charAt(i); 
    	   if(c >= 'A' && c <='Z')
           b++; //갯수확인 => 합 +=
    	   if(c >='a' && c <= 'z')
    	   a++;
    	   
    	   i++;
       }     
       System.out.println("대문자 갯수:"+b);
       System.out.println("소문자 갯수:"+a);
	}

}
