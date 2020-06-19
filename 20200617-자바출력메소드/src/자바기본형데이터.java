/*
 * 자바 => 기본형
 *         자바에서 지원하는 데이터형
 *         논리형 ==> boolean ==> 값 : true / false : if(조건문)을 사용할 때 주로 사용하는 데이터형
 *                                                    데이터형
 *                                                    턴(TURN)
 */  
//   ===> upcasting (자동형변환)
//   byte < short (char) < int < long < float < double
/*   <=== downcasting (강제형변환)
 *   double d = 'a'; ==> d=97.0 (자동 형변화 upcastng)
 *   char c = 'a' ==> c=a
 *   int i = 'A' ==> i=65
 *   
 *   byte b1=10;
 *   byte b2=20;
 *   byte b3=b1+b2 ===> Error (byte+byte = int) 
 *   
 *   byte a = 10;
 *   byte b = 30;
 *   byte c = (byte)(a*b)
 *                  ===== 
 *                  
 *   ==> (int)10.5+(int)10.5 ==> 20.0
 *       (int)(10.5+10.5) ==> 21
 *                  
 *   
 */
public class 자바기본형데이터 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 사용 방법
		boolean b=false; //False(X) ==> 1byte (데이터형 변경 불가)
		System.out.println("b="+b);
		b=true;
		System.out.println("b="+b);
		
		System.out.println(Integer.toBinaryString(300));
		//byte를 넘어서면 2진법의 뒤 8자리만 
		
		System.out.println('A');
		// ==> 
		System.out.println((int)'A');
		
		System.out.println((int)'홍');
		System.out.println((char)54861);
	 // 각문자는 숫자번호를 가지고 있다 (char는 정수형으로 인식한다)
	
		
		
		
	}

}
