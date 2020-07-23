package com.sist.lang;

class Change{
	
	int x,y;
	/*
	 *  int => 0;
	 *  String => null
	 *  Class => null
	 *  double => 0.0
	 *  boolean => false
	 */
}
// change => x=0,y=0

public class MainClass2 {
	
	/*
	 * int x=10;
	 * int y=20;  => x=20 , y=10
	 * 
	 * x=y; => 20
	 * y=x; => 20
	 */
	
	
	public void swap2(Change c) {
		
		int temp=c.x;
		c.x=c.y;
		c.y=temp;
		
	}
	
	public void swap(int x, int y) {
		
		int temp=x;
		x=y;
		y=temp;
	}

	public static void main(String[] args) {
		
		MainClass2 m=new MainClass2();
		int x=10;
		int y=20;
		System.out.println("변경전: x="+x+" ,y="+y);
		
		m.swap (x,y);
		System.out.println("변경후: x="+x+" ,y="+y);
		
		Change ccc=new Change();
		ccc.x=10;
		ccc.y=20;
		System.out.println("변경전: ccc.x="+ccc.x+" ,ccc.y="+ccc.y);
		m.swap2(ccc);
		System.out.println("변경후: ccc.x="+ccc.x+" ,ccc.y="+ccc.y);
		
		
	}

}
