package com.sist.exception;

public class MainClass2 {

	public static void main(String[] args) {

		try {
			
		} catch (ArithmeticException e) {
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			
		}
		catch (NumberFormatException e) { // web에서 주로 출력하는 error
			
		}
		
		
		try {
			
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e) {

		}
	}

}
