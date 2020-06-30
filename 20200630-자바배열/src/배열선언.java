/*
 *   배열 :
 *     1) 같은 타입의 여러개의 변수를 묶어서 관리하는 프로그램
 *        =========
 *        double[] a={100.10.5..} => 자동으로 double type으로 변환됨
 *        숫자(정수, 실수, 문자), 문자열
 *     2) 한개의 변수명을 이용해서 => 여러개의 변수를 제어
 *        ============= 구분자 : 번호 (index)로 구분을 한다     
 *        							   ===== 인덱스번호 => 0번부터 시작한다
 *        예) int[] arr={10,20,30,40,50} => 크게 늘릴 수는 있다
 *        
 *        == arr ==   ================
 *        			   10 20 30 40 50   메모리 주소를 이용해 접근하는 변수 => 참조변수 (배열, 클래스)
 *        =========   |==|==|==|==|===  **인덱스 번호는 중간에 비는 번호가 없다(순차적) => for
 *        			100	104 108 112	116		
 *                arr[0] arr[1]...
 *      => 배열 선언 방식
 *         ==============
 *         데이터형 [] 배열명;
 *          		   ====== 변수의 명칭법
 *         데이터형 배열명[];
 *         
 *         예)
 *            메모리 공간(기억 공간) 미리 만든 다음에 나중에 값을 채우는 방법
 *            
 *            영화제목을 10개 모아서 관리
 *            String[] title=new String[10]; => null
 *            10명의 학생 학점을 관리
 *            char[] hakjum;=new char[10] =>'\0'
 *            10명의 학생 총점을 관리
 *            int[] total;=new int[10]
 *            ==> new를 사용하면 메모리 공간이 생성 => 0값으로 초기화된다
 *            
 *            double => 0.0
 *            float => 0.0f
 *            long => 0L
 *          
 *          예) 직접 값을 주입하는 방법
 *            int[] arr={10,20,30,40,50}  
 *            
 *          => 주의점
 *            1. 배열의 크기를 초과하면 error : ArrayIndexOutofBoundsException
 *               ==================
 *               n개 => 0~n-1 => 만약에 갯수를 모르는 경우 : length
 *            2. 제어문을 이용시에는 => 주로 for문으 이용해서 처리
 *               ==============> for에서 사용하는 초기값 => 0    
 *                
 *               
 */
public class 배열선언 {

	public static void main(String[] args) {
		// 5명에 대한 점수 => 저장 , 총점, 평균
		
		int a=80;
		int b=90;
		int c=75;
		int d=90;
		int e=85;

		int total=a+b+c+d+e;
		double avg=total/5.0;
		
		System.out.println("총점:"+total);
		System.out.println("평균:"+avg);
		
		
		// 배열
		
		int[] score= {80,90,75,90,85};
		// 80 => score[0]
		int total2=0;
		double avg2=0.0;
		
		for(int i=0; i<score.length; i++) {
			
			total2+=score[i]; //누적 score[0]+score[1]+...+score[4]
			
		}
			avg2=total2/5.0;
			
			System.out.println("총점:"+total2);
			System.out.println("평균:"+avg2);
	}

}
