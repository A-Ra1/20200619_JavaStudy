package com.sist.exception;
/*
 *  예외회피
 *     = 에러에 대한 예측이 가능하게 만든다 
 *       대부분의 프로그램은 직접처리 (try~catch)
 *       ==> API(자바, 라이브러리)
 *     = 프로그래머가 예외처리를 각자 프로그램에 맞게 처리 유도
 *     = 형식)
 *     		메소드() throws 예측한 예외 클래스등록
 *     		
 *     예) 순서없이 나열이 가능
 *     	  	   public void display() throws Exception, ArrayIndexOutOfBoundsException
 *     			{
 *     				
 *     			}
 *    	==> 예외처리는 호출하는 메소드에서 처리
 */
public class MainClass {
 
	public int div(int a, int b) throws Exception { // b가 0이면 문제가 될 수도 있다
		
		return a/b; 
	}
	
	
	public static void main(String[] args) {
		
		MainClass m = new MainClass(); // ==> 인스턴스 , static이 없는 메소드는 자동저장되지 않는다 
	
		int res=0;
		
		try {
			
			res = m.div(2, 2);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
		System.out.println(res);
		
		/*
		try {
			Thread.sleep(1000);	// 직접처리
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}

}
