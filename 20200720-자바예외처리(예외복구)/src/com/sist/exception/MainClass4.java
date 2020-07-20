package com.sist.exception;
/*
 *  다중처리 ==> 예상되는 에러가 여러개 있는 경우
 *  
 *  try{
 *  
 *   정상적으로 실행되는 문장
 *  }catch(예상되는 예외클래스) {
 *  
 *   에러처리 
 *  }
 *  catch(예상되는 예외클래스) {
 *  
 *   에러처리
 *  }
 *  catch(예상되는 예외클래스) {
 *   
 *   에러처리
 *  }
 *  
 *  catch를 여러개 사용시에는 순서가 존재
 *  예외처리 계층 구조
 *  ======================================
 *  			최상위 클래스 => 모든 클래스의 상위 클래스
 *  			 
 *  
 */
public class MainClass4 {

	public static void main(String[] args) {

		try {
			
			int[] arr=new int[2];
			arr[0]=100;
			arr[2]=0;
			
			int a=arr[0]/arr[2];  //=> 해결가능한 catch없으므로 비정상종료
			
			
			
		}catch (NumberFormatException e) {
			System.out.println("정수변환이 안됨");
		}
		 catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위가 벗어남"); 
		}
		 catch (ArithmeticException e) {
			System.out.println("0으로 나누었을때"); 
		}
		 catch (RuntimeException e) { // 예상못했던 에러를 처리
			System.out.println("실행시 모든 에러를 처리");
		 }
		 catch (Exception e) {
			System.out.println("수정이 가능한 모든 에러"); 
		}
		 catch (Throwable e) {
			System.out.println("예외와 에러를 동시에 처리"); 
		}
		System.out.println("프로그램 종료");
	}

}
