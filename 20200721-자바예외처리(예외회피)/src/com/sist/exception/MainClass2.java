package com.sist.exception;

public class MainClass2 {

	public static void main(String[] args) {

		
		try {
			int a=10;
			if(a%2==0) {
				throw new ArithmeticException("로그인창으로 이동");
			}
			else {
				throw new Exception("회원가입 창으로 이동");
			}
			
		} catch (ArithmeticException e) {
			
			System.out.println(e.getMessage());
		}catch (NumberFormatException e) {
			
			System.out.println(e.getMessage());
		}catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e.getMessage());
		}catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}

}
