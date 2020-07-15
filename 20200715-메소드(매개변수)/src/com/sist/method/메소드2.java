package com.sist.method;

import java.lang.reflect.Method;

class A{
	public void display1(String name) {
		System.out.println("Hello~~\n"+name);
	}
	public void display2(String name) {
		System.out.println("Hello~~\n"+name);
	}
}
public class 메소드2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A a=new A();
//		a.display("홍길동");
		try {
			Class clsName=Class.forName("com.sist.method.A");
			Object obj=clsName.newInstance();
//			System.out.println(obj);
//			A a=(A)obj; // 형변환
//			a.display("심청이");
			Method[] method=clsName.getDeclaredMethods();
		//	method[0].invoke(obj, "이순신"); // invoke => 메소드 통신
			// new를 사용하지 않아도 메모리 생성 가능
			// class의 이름을 몰라도 호출 가능
			for(Method m:method) {
				System.out.println(m.getName());
			}
		}catch (Exception ex) {
		}
	}

}
