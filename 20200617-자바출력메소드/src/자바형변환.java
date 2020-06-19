// 형변환 => 자신의 데이터형을 다른 형식의 데이터형으로 변환
/*
 *  boolean : 제외
 *  byte < char < int < long < float < double
 *  
 *  정수 => 실수, 문자, 정수  int a = (int)10L => long a =(long) 10 
 *                                                ================
 *                                             =  long a = 10 (자동형변환)  
 *                            double d = (double) 10 
 *                            =====================
 *                      =     double d = 10 (자동형변환)
 *  실수 => 정수, 문자
 *  문자 => 실수, 정수
 *  
 *  int i = 'A' ==> 'A' = 65 ==> (char)65 
 *  
 *  10.5 + 10 
 *         ==
 *         10.0
 *  'A'+1
 *  ===
 *   65
 *       큰 데이터형으로 자동변경 (자동형변환)       
 *       
 *        
 *      
 */
public class 자바형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		//double d = 5/2; 
		
	    // ===> 2.0
        
		double d = 5/(double) 2;
		// == double d = 5/2.0;
        System.out.println("d="+d);
        
        
        
        
	}

}
