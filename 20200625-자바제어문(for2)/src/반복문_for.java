

/*
 *  변수명칭법 => 식별자
 *  1) 알파벳 (대소문자), 한글로 시작하다
 *  2) 숫자는 사용가능 (앞에 사용금지)
 *  3) 키워드는 사용할 수 없다
 *  4) _, $ 사용이 가능
 *  ===================================== 적용 (클래스명, 메소드명)
 *  
 *  for 형식)
 *     
 *      for (초기화; 조건식; 증감식)
 *      {
 *        반복 수행 문장
 *        실행문장         => 두문장이 반복 수행됨
 *      }
 *      
 *        for (초기화; 조건식; 증감식) 
 *      
 *        반복 수행 문장
 *        실행문장 <= for 문이 끝난 이후 수행됨
 *        
 *      출력 ==>>
 *        AaBbCb...Zz
 *     
 */
public class 반복문_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1; i<=5; i++)
		{
			System.out.println("Hello");
			System.out.println("Java=>for");
		}
		
		System.out.println("=============================");
		for(int i =1; i <= 5; i++)
			System.out.println("Hello");
			System.out.println("Java=>for");
			
		
		char c ='a';
		for(char ch ='A';ch<='Z';ch++)
		{
			//System.out.print(ch+""+c++);
			System.out.println(ch+""+c);
			c++;
		}
			
		// 조건이 없이 1~10 => 홀수만 출력
		
		for(int a = 1; a<=10; a+=2)
			System.out.print(a+"\t");
		
		for(int a = 2; a<=10; a+=2)
			System.out.print(a+"\t");
		// 영문  => char
		// 1~5 ==> 1,2,3,4,5
		for(int a =1; a<=5; a++)
			{
			System.out.print(a);
		
			if(a < 5)
			System.out.print(",");
			}
		// 10 => 1010
		System.out.println();
		int su = 10;
		String s = "";
		for(;;)
		{
			int a = su%2;
			//System.out.print(a);
			s+=a+"";
			su = su/2;
			if(su == 0)
				break;
			
		}
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.print(s.charAt(i));
		}
		
		
		
		
	}

}
