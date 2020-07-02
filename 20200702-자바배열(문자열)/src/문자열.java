/*
 *  1. 배열
 *    => 같은 타입을 여러개 묶어서 관리
 *    => 배열생성 => 연속적인 메모리구조 (인덱스)
 *    => 일차원 배열 [], [][] , [][][]
 *    				====
 *    				1) 문자열 배열
 *    					String[] arr ==== String arr[]
 *    							==== 배열명
 *    				2) 정수 배열
 *    					int[] arr ==== int arr[]
 *    				3) 논리 배열
 *    					boolean[] arr ==== boolean arr[]
 *    => 선언 방식
 *     	  문자열 10개 
 *        ===========
 *        String[] arr;
 *        정수 10개
 *        intp[ arr;
 *    => 초기값
 *        1) String[] arr;
 *           arr=new String[10];
 *        2) int[] arr ==> 선언과 동시에 초기값 ***int[] arr=new int[10]
 *           int[] arr={10,20,30,40,50} => 등록된 갯수 (5개 배정)
 *          
 *          ===> 선언시에 메모리 저장 갯수를 등록 => 고정적이다 
 *    => 인덱스 사용
 *        예)
 *           int[] arr={10,20,30,40,50}
 *           ===
 *           배열의 첫번째 주소
 *           0x100
 *           
 *           index번호는 0부터 시작
 *           arr[0] => 일반변수와 동일 역할 수행
 *           arr[0]=100           
 *    -> 출력 => 번호 (0~~) => 연속적으로 인덱스번호를
 *       ====
 *         => for, while문을 이용하여 출력
 *            === 횟수 지정된 상태
 *           =for
 *            1) 일반 for문 => 인덱스를 이용한다 (제어)
 *                               => 값을 변경, 삭제
 *            2) 향상된 for문 (for-each) => 실제 저장된 값
 *            					 => 값변경 불가능 
 */
public class 문자열 {

	public static void main(String[] args) {
		// 정수 ==> 5개 저장 => 평균
		// 1. 정수 5개 저장하는 메모리 공간을 설정 (연속적으로 사용)
	
		int[] arr= {30,50,70,90,10};
		/*
		int total=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
		double avg=total/5.0;
		System.out.println("저장된 정수의 평균:"+avg);
	    */
	    int total=0;
		for(int i=0; i<5; i++) {
			total+=arr[i];
		}
		//"7"+7+7+7 => "7777"
	
		System.out.println("저장된 정수의 평균:"+total/5.0);
			
		// 향상된 for
		
//		for(실제 저장된 데이터형 : 배열명)
		/*
		 *  arr => 30,50,70,90,10
		 *  for(int i:arr)
		 *  
		 *  => i=30
		 *  => i=50
		 *  => i=70
		 *  => i=90
		 *  => i=10
		 *  ==> 값이 없을때 자동종료
		 *  
		 */
		total=0;
		for(int i:arr) {
			total+=i;
		}
		System.out.println("저장된 정수의 평균:"+total/5.0);
		
		
		int sum=0, i=1;
		while(i<100) {
			if(i%3!=0) {
				i++;
				continue;
			}
			else sum+=i;
			i++;
		}
		
		char[] c= new char[10];
		int[] n= {0,1,2,3,4,5};
		char[] day= {'일','월','화','수','목','금','토'};
		boolean[] bool= {true,false,false,true};
		
		

	}

}
