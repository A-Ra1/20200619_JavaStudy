package com.sist.oop;
/*
 *  자바
 *   1번째 줄 => package명 (한번만 사용이 가능)
 *   2번째 줄 => import (여러번 사용이 가능)
 *   3번째 줄 => 
 *     public class className{
 *     		필요한 변수설정 => 멤버변수
 *     		변수에 대한 초기화 => 생성자
 *     		기능 => 메소드
 *     }
 *     
 *     => 다른 클래스에서 사용시에는 
 *     	  import com.sist.oop.*
 *        패키지
 *        	com.회사명.기능명 => com.sist.client , com.sist.surver
 *        	org.조직명.기능명 => org.springframework.web.servlet.view.*
 *     
 *      캡슐화
 *        => 변수는 private
 *        => 메소드는 public ==> 변수(getter/setter)
 *      상속
 *        => extends : 기존의 클래스 기능을 가지고 온다
 *           단일 상속만 가능
 *      다형성
 *        => 수정, 추가
 *      ========================================= 문법사항이 아니라 권장사항            
 *     		
 *     오버로딩 (생성자에서 주로 사용)
 *      = 같은 메소드명으로 여러개의 기능을 만든다
 *        =============
 *        1. 매개변수가 다르다 (갯수나 데이터형이 다르다)
 *        2. 리턴형은 관계없다
 *        3. 같은 클래스 안에서 만든다
 *        
 *        plus() :
 *        int + int => plusInt(int a, int b) =>  plus(int a, int b)
 *        double + double  => plusDouble(double d, double d1) => plus(double d, double d1)
 *        int +  double => plusIntDouble(int a, double d) => plus(int a, double d)
 *        String + String => plusString(String s1, String s2) => plus(String s1, String s2)
 *        													기능이 같은 메소드는 메소드명 공유 가능 (오버로딩)
 *        
 *        float + double => 
 *        long + int
 *        int + char
 *        char + double
 *        String + char
 *        
 */
class Calc{
//	 인스턴스 메소드 : new를 사용시마다 따라 저장되는 메소드
	public void plus(int a, int b) {
		System.out.printf("%d+%d=%d\n",a,b,a+b);
	}
	public void plus(double a, double b) {
		System.out.printf("%f+%f=%f\n",a,b,a+b);
	}
	public void plus(String a, String b) {
		System.out.printf("%s+%s=%s\n",a,b,a+b);
	}
	public double plus(double d, char c) {
		return d+c;
	}
}
/*
 *  변수
 *  ==== 
 *   멤버변수
 *   static 공유변수
 *  메소드
 *  ======
 *   멤버메소드
 *   static 메소드  
 *   
 *   class A
 *   {
 *     int a;
 *     static int b;
 *     
 *     public void disp1()
 *     { 
 *       => a,b 사용이 가능
 *       => disp2() 호출이 가능
 *     }
 *     public static void disp2()
 *     {
 *       => b만 사용이 가능
 *       => disp1(), a를 사용할 수 없다
 *          ============
 *           => 사용시에는 반드시 new 를 사용해서 사용
 *     }
 *   }
 */
public class 오버로딩_중복메소드정의 {
	int a=10;
	static int b=20;
	public 오버로딩_중복메소드정의() {
		System.out.println("this:"+this);
	}
	public void disp1() {
		System.out.println(this.b);
		System.out.println(a); // this 생략되어있음
		
	}
	public static void disp2() {
		System.out.println(b);
		
		오버로딩_중복메소드정의 aa=new 오버로딩_중복메소드정의();
		System.out.println("aa="+aa);
		System.out.println(aa.a); // static에서는 인스턴스변수를 사용할 수 없다
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc cc=new Calc(); // 메소드 전체가 저장
	    cc.plus("Hello", "Java");
	    cc.plus(100, 200);
	    오버로딩_중복메소드정의 aa=new 오버로딩_중복메소드정의();
	    System.out.println("aa="+aa);
		System.out.println(aa.a); // static에서는 인스턴스변수를 사용할 수 없다
			
	}

}
