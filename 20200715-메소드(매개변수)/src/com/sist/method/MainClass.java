package com.sist.method;
class AA{
	public void AA() { //void가 있으면 일반 인스턴스 메소드, 생성자(X)
		System.out.println("AA() Call...");
//		void => 리턴형의 일종 (결과값이 존재하지 않는다)
	}
	// 리턴형이 존재하지 않는다 : 특수메소드 => 메모리에 저장
	public AA() {
		System.out.println("AA() Call...");
	}
	
}  
//명시적 => 초기화 블록 => 생성자
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a=new AA();
		a.AA();
	}

}
