package com.sist.lang;
/*
 *  finalize() ; 소멸자
 *  
 *  => 생성자
 */
class C{

	public void display() {
		System.out.println("C:display() Call...");
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("메모리 해제");
	}
	
}
public class MainClass5 {

	public static void main(String[] args) {

		C c=new C();
		c.display();
		// 소멸
		c=null; // GC 대상 (더이상 사용X)
		System.gc();
	}

}
