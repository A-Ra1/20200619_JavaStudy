/*
 *  자바에서 사용하는 데이터형 (자료형) => 메모리의 크기 지정
 *  =========================================================
 *  
 *      컴퓨터는 0,1 => bit
 *  정수 
 *   = byte  (0,1을 8개를 저장하는 공간) => 8bit(1byte)
 *     111111111
 *     = 음수 ==> -128
 *     011111111
 *     = 양수 ==>  127
 *     ======> 파일읽기, 파일쓰기, 파일업로드, 파일다운로드, 네트워크 전송
 *     oq=%EC%9E%90%EB%B0%94 (한글을 byte로 변환)
 *     
 *   = short (0,1을 => 16개를 저장하는 공간) => 16bit(2byte)
 *     1111  1111  1111  1111 ==> -32768
 *     0111  1111  1111  1111 ==> 32767
 *     ======> C언어와 호환성 (사용빈도가 없다)
 *      
 *   = int (평상시에 사용하는 모든 정수는 컴퓨터에서 int로 인식) => default
 *     (0,1 => 32개를 저장하는 공간)
 *     1111  1111  1111  1111  1111  1111  1111  1111
 *     0111  1111  1111  1111  1111  1111  1111  1111
 *     ======> 자바 코딩의 정수는 대부분 사용
 *     
 *   = long (0,1 => 64개의 저장공간) : 빅데이터
 *   
 *    국어점수 : byte, short , int , long ==> int
 *    수학점수 : byte, short , int , long ==> int
 *    영어점수 : byte, short , int , long ==> int
 *    총점 : (300)  : byte(X), short , int , long ==> int
 *    우리나라의 연봉 : long
 *    
 *  실수
 *   = 4byte ==> 소수점 (6자리)  ==> float
 *   = 8byte ==> 소수점 (15자리) ==> double ==> default
 *   ***문제점
 *      float f=10.5 (x) float f=10.5f (O)
 *            = ====
 *  저장공간 => 첨부할 값
 *  =====================
 *  저장공간이 첨부할 값보다 크거나 같다
 *  
 *  문자
 *   = char (0,1 => 16bit) : 음수는 없이 양수만 ==> 0~65535
 *    * 문자마다 고유의 번호
 *     'A' = 65
 *     '0' = 49
 *     'a' = 97
 *  
 *  논리
 *   = true/false 저장 => boolean (1byte)
 *     login , idcheck
 *     
 *  메모리에 저장하는 크기 (표현할 수 있는 문자, 숫자의 크기) 정수보다 실수가 표현력 ↑
 *   byte < short < int < long < float < double
 *          char
 *          
 *    long => 1
 *    float => 1.00000000
 *    double => 1.0000000000000000
 *  
 *  int => 10 , 20
 *  long => 10L , 20L
 *  
 *  float => 10.5f
 *  double => 10.5
 *  
 *  ==================================================================================
 *  
 *  변수 :  한개의 데이터를 저장하는 메모리 공간의 별칭      
 *  변수명 제작
 *   1) 알파벳이나 한글로 시작한다
 *     ======= 알파벳은 반드시 대소문자 구분 a != A
 *   2) 숫자 사용이 가능 (단 앞에는 사용할 수 없다)
 *     a1, a2...(2a(error))
 *   3) 특수문자 사용이 가능 (_ , $)
 *     _ => 임시파일, 단어가 여러개 일 경우에 주로 사용
 *        file_size, file_name...
 *   4) 키워드(자바에서 사용중인 단어)는 사용할 수 없다             
 *    int int (x) , int int1 (O)
 *   5) 변수의 길이는 15자 이내로 한다 (3~7자리) 
 *   
 *   ==================================================================================
 *   
 *   변수 선언 / 초기화
 *   1) 변수선언 ===> 변수는 반드시 => 초기값을 설정
 *      ======== 저장해야되는 데이터가 존재
 *      형식)
 *           데이터형 변수명; 
 *           
 *           점수를 저장 ==> int jumsu; 
 *                           jumsu = 100; // 키보드로 입력을 받거나, 파일에 있는 데이터 읽기
 *                          
 *                           int jumsu = 100;
 *           여러개
 *            int a = 0;
 *            int b = 0;
 *            int c = 0;
 *            ==========
 *             int a,b,c;
 *             int a=0, b=0, c=0;
 *             
 *        ============================
 *        변수에 초기화
 *        1.정수형
 *          byte ==> 0
 *          short ==> 0
 *          int ==> 0
 *          long ==> 0L
 *        2.실수형
 *          float ==> 0.0f(F)
 *          double ==> 0.0d(D) d(D)는 생략이 가능
 *        3.문자형 ==> 'A' ==> ''(error)
 *        
 *        4.논리형
 *          boolean ==> false/true
 *          
 *             *** 모든 변수는 초기화를 해야 한다

 */

 
 
public class 자바데이터형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 국어, 영어, 수학, 총점, 평균, 학점
		int kor = 80;
		int eng = 80;
		int math = 80;
		
		int total = 240;
		double avg = 80.0;
		char score= 'B';
		
		//출력
		
		System.out.println("국어점수:"+kor); //문자열 결합
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점:"+total);
		System.out.println("평균:"+avg);
		System.out.println("학점:"+score);
		
	    
				

	}

}
