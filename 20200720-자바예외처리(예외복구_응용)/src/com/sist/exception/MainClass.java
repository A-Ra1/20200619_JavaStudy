package com.sist.exception;
/*
 *  예외처리
 *    형식) 
 *        1. 직접처리 (try~catch)
 *        try{
 *          실행이 가능한 코딩 (정상수행 가능한 문장)
 *        }catch(예외클래스 객체){
 *			에러가 날 경우 처리문장        
 *        }
 *        *** catch는 여러번 사용이 가능
 *        *** finally를 사용할 수 있다 (필요한 경우만)
 *        	  서버, 데이터베이스 관련 => 서버닫기, 오라클 연결 해제
 *        
 *        2. 자바에서 제공하는 예외처리
 *        한개만 처리
 *          NumberFormatException
 *          ArrayIndexOutOfBoundsException
 *          IOException
 *          SQLException
 *        여러개 처리
 *        	RuntimeException : 실행시 에러 전체를 묶어서 한번에 처리 가능
 *        	Exception
 *          Throwable
 *        
 *        3. catch는 여러개를 사용할 수 있다
 *          해당 에러를 찾는 경우에는 처음부터 마지막까지 검색 => 예외처리 순서대로 코딩
 *            
 *        4. try에서 에러가 발생하면 발생위치에서 catch로 이동
 *        	 ================================ 밑에 있는 소스는 실행되지 않는다
 *        	int a=10; =>실행
 *        	int b=0; => 실행
 *          int c=a/b; => 에러
 *          System.out.println(c) => 실행안됨
 *        
 *        5. 목적 : 에러체크 (에러확인 => 소스변경) => 디버깅
 *        
 *        6. 예외처리 => 수정이 가능한 에러 
 *        
 *        7. 자바의 모든 코딩은 예외처리가 존재한다
 *        	 단 실행시는 생략이 가능하다
 *        
 *        8. 예외처리는 반드시 처리해야하는 클래스가 존재
 *           =======================
 *           IO와 관련
 *           쓰레드와 관련
 *           네트워크 관련
 *           데이터베이스 관련    
 *        
 */
import javax.swing.*;
public class MainClass {

	public static void main(String[] args) {
	
		try {
			
		String num1=JOptionPane.showInputDialog("첫번째 정수 입력:");
		String num2=JOptionPane.showInputDialog("두번째 정수 입력:");
		
		// 배열에 첨부
		int[] arr=new int[2];
		
		// 문자열을 정수로 변환
		arr[0]=Integer.parseInt(num1); // 숫자 ==> "10" 
		arr[2]=Integer.parseInt(num2);
		
		int result=arr[0]/arr[1];
		System.out.println("result:"+result);
	}
//		catch (NumberFormatException e) {
//		
//			System.out.println("정수만 입력");
//		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			
//			System.out.println("배열범위 초과");
//		}
//		catch (ArithmeticException e) {
//			
//		}	System.out.println("0으로 나눌 수 없다");
		
		catch (RuntimeException e) {
			
			// System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("처음부터 다시 입력");
				
	}

}
