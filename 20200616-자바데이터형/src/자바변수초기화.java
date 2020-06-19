
public class 자바변수초기화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int kor = 78;
       int eng = 85;
       int math = 96;
       /*
        * 문자열 결합
        * ===========
        *   7+7+"1"+7+7
        *   ===
        *   14+"1"
        *   =====
        *   "141"+7
        *   "1417"+7
        *   "14177"
        *   
        *   "총점:78"+85 ==> 총점:7885 
        *  System.out.println("총점:"+(kor+eng+math));
        */
    
    int a = 65 ;
    char c = 65 ;
    		
    ; //char => 문자, 숫자
    System.out.println("a:"+a);
    System.out.println("c:"+c);
   
    int d = 1;
    int e = '1';
    System.out.println("d="+d);
    System.out.println("e="+e);
	//char는 문자, 정수 취급한다
    /*
     * long = int
     *  8      4
     *  
     * int = long
     *  4      8 
     *  
     *  double = int,long,float
     *  int = double (x)
     *  
     *  예외 ==> char = int
     *  
     */
     // byte < char < int <long < float < double
    
    System.out.println(100); //100은 int
    System.out.println(10.8); //10.8은 double
    
    //int i = 2140000000L; 8byte를 4byte에 대입하기 때문에 오류
    
    double i = 2140000000;
    System.out.println(i);
    
    
    
    
    
	
	}
	
	
}
