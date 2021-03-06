

/*
 *  클래스
 *  ======
 *  	= 변수 => 여러개를 저장할 때 (반드시 공통으로 들어가는 데이터)
 *  								  ===============================
 *  										공통화작업 => 추상화
 *  		예) 
 *  			영화 정보
 *  			=========
 *  			영화명, 감독, 출연, 장르, 개봉, 줄거리,
 *      = 변수의 종류
 *        ===========   246page**********
 *         = 멤버변수 => new를 사용할 때마다 따로 저장되는 변수
 *         	 (인스턴스 변수)
 *         	*** 메모리가 만들어지는 시점 => new 사용시 만들어짐
 *          *** heap : 프로그래머가 관리하는 영역 (자동처리가 안된다)
 *          		   메모리를 사용하지 않을 경우 (직접처리, GC)
 *         = 공유변수 => 메모리가 한개 => 공통으로 사용되는 변수
 *           (정적변수) => static
 *          *** 컴파일러가 컴파일할때 자동으로 생성 (메모리 공간이 1개여서 사용빈도 높지 않다) 
 *          *** 메소드영역 (static, 메소드)
 *          ==================================================================================
 *          멤버변수, 공유변수 => 프로그램이 종료될 때 까지 메모리 유지
 *         = 지역변수 => 지역변수, 매개변수
 *          *** 메모리가 만들어지는 시점 => 메소드 호출시에 
 *          *** 메모리가 자체 관리 {}을 벗어나면 자동 회수 => stack(LIFO)
 *          														==== Last In First Out 
 *          														나중에 들어온 것을 먼저 제거
 *          int a;
 *          int b;
 *          int c; => 제거
 *         
 *         = 생성자
 *            => 멤버변수의 초기값 부여
			  => 제어문을 이용하거나, 파일 읽기..
			     구현하고 데이터값 가져올때, 보안
			     => 생략할 수도 있다 (자동으로 컴파일러가 추가 => default 생성자 => 매개변수가 없는 생성자)
			     => 생성자는 반드시 필요하다
			     => 메모리에 저장(클래스) ==> 호출되는 메소드
			        ==================== 
			        new 생성자() => 한번만 호출한다 => this(자신)
 *         
 *         class A
 *         {
 *          int a;   // 지역변수와 매개변수는 이름이 같아도 된다
 *          A(int a)
 *          {
 *           this.a=a => A클래스의 a에 지역변수 a를 대입
 *          }
 *         }
 *         
 *         = 메소드 : 기능
 *             메소드 : 선언부, 구현부
 *             리턴형 메소드명(매개변수...) => 선언부
 *             {
 *              구현부
 *             } 
 *             ====> 선언부+구현부 = 저장
 *            = 인스턴스 메소드 : 클래스마다 따로 사용하는 메소드
 *            = 정적 메소드 ==> static => 모든 클래스 공통으로 사용되는 메소드
 *            = 추상 메소드 ==> 선언부만 존재 (구현이 안된 메소드) (377page)
 *            					==> 프로그래머가 구현 후 사용
 *           
 */

class Student{
	// 학생 1명에 대한 정보 ==> 메모리 공간 여러개만들 수 있다(new)
	String name;
	String subject; 
	int year;
	static String school; // 메모리에 저장
	
	Student() {} // 292page , default 생성자
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// static변수 사용
		Student.school="SIST"; 
		Student s=new Student(); // name, year, subject => 저장(s라는 주소에 저장)
		System.out.println(s);
		//Student@15db9742
		
		System.out.println(s.name);
		System.out.println(s.subject);
		System.out.println(s.year);
		
		s.name="홍길동";
		s.subject="개발과";
		s.year=3;
		
		// 메소드도 동일
		System.out.println(s.name);
		System.out.println(s.subject);
		System.out.println(s.year);
		
		System.out.println(Student.school);
		Student s1=new Student();
		System.out.println(s1);
		System.out.println(s1.name); //null
		System.out.println(s1.subject); //null
		System.out.println(s1.year);//0
		
		s1.name="심청이";
		s1.subject="광고과";
		s1.year=2;
		System.out.println(s1.name);
		System.out.println(s1.subject);
		System.out.println(s1.year);
		System.out.println(Student.school);
		
		String ss="Hello Java";
		ss.replace('H', 'K');
		String ss1="1234567890";
		String.valueOf(10); //static 메소드  class이름.메소드 = 제어해야 하는 대상이 없을때 사용
		
	}

}
