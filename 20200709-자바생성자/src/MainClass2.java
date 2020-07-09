
// 차량 => 색상, 연비, 연도
public class MainClass2 {
 // 변수선언
	int a=10;
	int b=20;
	MainClass2(){
		a=100;
		b=200;
	}
	
	// 사용자가 직접 => a,b값을 주는 경우
	MainClass2(int c, int d){ // 생성자는 여러개 존재할 수 있다
		a=c;				  // 매개변수가 다르거나 갯수가 다르면 다른 메소드로 인식
		b=d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass2 m=new MainClass2();
		System.out.println("a="+m.a);
		System.out.println("b="+m.b);
		MainClass2 m1=new MainClass2(1000, 2000); // 매개변수가 있는 생성자를 사용하면 값을 계속 변경할 수 있다
		System.out.println("a="+m1.a);
		System.out.println("b="+m1.b);
		MainClass2 m2=new MainClass2(10000, 20000);
		System.out.println("a="+m2.a);
		System.out.println("b="+m2.b);
		
	}

}
