/*
 *  문자열을 저장할 수 있는 공간 : String
 *  String : 일반변수의 역할
 *  		 클래스의 역할 => 기능(메소드)
 *  
 *  		 주요 기능
 *  			= 문자열 비교 : equals()
 *  			= 포함 문자 : contains()
 *  			= 문자열중에 한개 문자 : charAt()
 *  			= 저장된 문자의 갯수 : length()
 *  			= 문자 자르기 : substring()
 *  			= 찾는 문자의 위치 : indexOf(), lastIndexOf()
 *  			= 모든 데이터형을 문자열로 변환 => valueOf()
 *  			= 공백문자 제거 : trim() => 좌우만 비교
 *  				" Hello Java " => "Hello Java" (가운데 공백은 불가)
 *  			= 문자열=>char[] => toCharArray()
 *  			= startsWith, endsWith => 검색기
 *            ==========================================================
 *            Wrapper Class
 *            =============
 *            기본형 데이터 (정수, 실수, 문자, 논리)
 *            int => Integer
 *            double => Double Boolean, Float,Byte ...
 */
// substring : 필요한 문자만 추출 => 형태소 분석(명사, 부사, 형용사)
/*
 *  "Hello Java" => String => char[]
 *  	   ====
 *     ===
 *  substring (int start)
 *  substring (int start, int end)
 */
public class 문자열3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String msg="100-010";
		          //0123456
//		System.out.println(msg.substring(3));
//		System.out.println(msg.substring(3,6)); // 끝위치는 제외
		System.out.println(msg.substring(0,3));
		System.out.println(msg.substring(4,7));
		System.out.println(msg.substring(4));
	}

}
