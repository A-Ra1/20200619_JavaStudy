/*
 *  1. 정수를 입력받아서 짝수인지 홀수인지 확인 => 10은 짝수다, 11은 홀수다
 *                                                 ===========  ===========
 *  
 *  2. 정수 3개를 입력받아서 총점, 평균, 학점 => 조건문
 *      60 이상 => D
 *      70 이상 => C
 *      80 이상 => B
 *      90 이상 => A
 *      나머지는 F
 *      
 *      국어점수 : 80
 *      영어점수 : 80
 *      수학점수 : 80
 *      
 *      총점 : 240
 *      평균 : 80.0
 *      학점 : B
 *    
 *     
 */

import java.util.*;
public class 자바조건문문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scan = new Scanner(System.in);
 int number = 0;
 System.out.print("정수 입력 :");
 // 키보드로 입력된 정수 받기
 number=scan.nextInt();

 if (number%2 ==0)
     System.out.println(number+"은(는)짝수다");
 else    
     System.out.println(number+"은(는)홀수다");
 
 

	}

}


