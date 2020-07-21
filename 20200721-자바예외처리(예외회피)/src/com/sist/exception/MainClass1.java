package com.sist.exception;

public class MainClass1 {
	
	public void display() throws ArrayIndexOutOfBoundsException, ArithmeticException, NumberFormatException, Exception {
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass1 m=new MainClass1();
		try {
			m.display();
		} catch (RuntimeException e) {
		
		}
		  catch (Exception e) { // 예외처리를 각 다르게 하고 싶을때는 catch절을 각각 추가한다
			  
		}	
	}

}
