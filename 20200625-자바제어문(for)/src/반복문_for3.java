/*
 * ==================
 *  i=1 i<=5 true => 문장수행 => i++
 * ==================
 *  i=2 i<=5 true => 문장수행 => i++
 *  ==================
 *  i=3 i<=5 true => 문장수행 => i++
 * ==================
 *  i=4 i<=5 true => 문장수행 => i++ 
 *  ==================
 *  i=5 i<=5 true => 문장수행 => i++
 *  ==================
 *  i=6 i<=5 false => 반복 종료
 */  
public class 반복문_for3 {

	public static void main(String[] args) {
	    
		for (int i = 1; i<=5; i++)
		 {
		 System.out.println(i);
		 }

	}

}
