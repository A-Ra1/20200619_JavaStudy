/*
 *  변수 Scope
 *  ==========
 *  변수 종류
 *  ==========
 *    = 지역변수
 *    = 멤버변수
 *    = 공유변수
 *    
 *    public class A
 *    {
 *      int a; ==> 멤버변수 => 클래스 A가 저장이 될때 마다 생성
 *      static int b; ==> 공유변수 => JVM class를 로드할때 
 *      ================================================
 *      public static void main(String[] args)
 *      {
 *        int c; => 지역변수 => 
 *      } // c변수 => main에서만 사용이 가능
 *    }
 *    초기값
 *    do{
 *     수행문장
 *     증가식
 *     }
 *     while(조건식) 
 *    
 */
public class 변수사용범위 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	/*	
		for(int i=1;i<=10;i++){
    	  
    	  System.out.println("i="+i);
      }//i는 삭제됨
      System.gc(); // 메모리 회수 (가비지컬렉션)
      
      */
		
		int i=1;
		
		for(i=1;i<=5;i++) {
			
			System.out.println(i+" ");
		}
		
		System.out.println();
		
		
		i=1;
		while(i<=5) {
			
			System.out.println(i+" ");
			i++;
		}
		System.out.println();
		
		
		
		i=1;
		do {			
			System.out.println(i+" ");			
			i++;
		} 
		while(i<=5);
			
	}

}
