package com.sist.abs;
/*
 *  추상 클래스
 *    => 미완성된 클래스
 *    => new를 사용해서 메모리 할당이 불가능
 *    class A
 *     => A a = new A();
 *    abstract class B
 *       => B b = new B(); ==> error
 *     => 항상 상속을 내려서 하위 클래스에서 구현한 다음에 사용
 *     => 기본 틀이 존재
 *     => 제시만 한다 : 구현하는 내용이 프로그램마다 다를 수도 있다
 *        예) 
 *        	  도형
 *     
 *   예)
 *    	1. 게시판을 만들어라       
 *      2. 게시판에는 글쓰기, 내용보기, 수정, 삭제, 찾기를 만들어라  => 추상클래스의 방식 (기본틀을 갖춤)
 *      
 *   예)
 *   	영화관
 *   	======
 *   		영화 목록
 *   		예매
 *   		영화 상세보기
 *   		이벤트
 *   		극장 설명  
 *        ================
 *      cgv  메가박스  롯데시네마 
 */
abstract class 도형{
	public abstract void draw();
	public void color() {
		System.out.println("검정색으로 그림을 그린다"); // 하위 클래스에서 기본적으로 구현되는 메소드
	}
}
class 삼각형 extends 도형{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("삼각형을 그린다");
		
	} // draw를 구현해야 에러가 나지 않음
	
}
class 원 extends 도형{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그린다");
	}
	
	// 정의변경 => 재정의
	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("빨간색으로 그림을 그린다"); 
	}
}
class 사각형 extends 도형{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("사각형을 그린다");
	}
	
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		도형 g=new 삼각형(); // 추상클래스 변수명 = new 구현된클래스
		
		g.color();
		g.draw();
		
		g=new 사각형();
		g.color();
		g.draw();
		
		g=new 원(); // 클래스 여러개를 한번에 묶어서 처리 가능 (추상클래스와 인터페이스의 기능)
		g.color();
		g.draw();
		
	}

}
