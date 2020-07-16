package com.sist.abs;
/*
 *  클래스의 종류
 *    ==============
 *    = 추상 클래스
 *    = 인터페이스 => 추상클래스를 확장 (추상클래스보다 기능이 많음)
 *    				  여러개의 클래스를 모아서 관리 (서로 다른 클래스를 연결하여 사용)
 *    				  *** 결합성이 낮은 프로그램
 *    					  ====== 
 *    						= 결합성 = 클래스를 수정하면 다른 클래스 영향을 미치는가
 *    						= 응집성 = 한개의 기능 수행할 수 있는 능력 (메소드)
 *    				  *** 주 사용 용도
 *    						1. 기능이 여러개로 나눠지는 경우
 *    						 예) 버튼 
 *    							 ==== 로그인, 취소, 시작, 종료 등
 *    						2. 여러개의 클래스를 한개의 클래스로 제어할 때 사용
 *    ============================================================
 *    	   	추상클래스						인터페이스
 *    ============================================================
 *     	   1. 단일상속						 다중상속
 *    ============================================================
 * 		   2. 구현이 안된 메소드 			구현이 안된 메소드만
 * 			  구현이 된 메소드				가지고 있다
 *    ============================================================
 *    	   3. 형식
 *    		추상클래스
 *    		public abstract class A{
 *    		  public abstract void display();
 *    		  public void aaa(){
 *    			}
 *     		}
 *     
 *     		인터페이스
 *     		public interface B{
 *     		 void display(); => public abstract void display();
 *     		 void aaa(); => public abstract void aaa();
 *     		}
 *     			public abstract 생략가능, 컴파일시 자동생성
 *    ============================================================
 *   	   4. 멤버변수
 *   		  public abstract class A{
 *   		   private int a;
 *   		  } 
 *   
 *   		  public interface B{
 *   		   int a; => error
 *   		   =====
 *   			인터페이스가 가지고 있는 변수 => 상수형변수
 *   			int a; => public final static int a;
 *   			int a=10; 
 *      	  }
 *      	  => 단점 : 기능 설정을 추가하면 모든 클래스가 error
 *      	  => 인터페이스, 추상클래스를 사용 => 상속을 받아야한다
 *      		 구현이 안된 메소드는 반드시 구현해서 사용
 *      
 *      	  예) 
 *      		 public interface A{
 *      		  public void aaa();
 *      		  public void bbb();
 *      		 }
 *      			
 *      		 class B implement A{
 *      		  public void aaa(){}
 *      		  public void bbb(){}
 *      		 }
 *    = 내부클래스 => 멤버클래스
 *    = 외부클래스 => 익명클래스
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class 추상클래스 extends JFrame implements MouseListener{ //mouselistener 안에 구현이 안된 메소드가 있다

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

@Override
public void mouseClicked(MouseEvent e) { // {} 블럭이 열고 닫히면 구현완료
	// TODO Auto-generated method stub
	
}

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}	

}
