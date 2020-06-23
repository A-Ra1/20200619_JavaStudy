/*
 *   º±≈√ ¡∂∞«πÆ
 *   if (¡∂∞«πÆ)
 *   {
 *     ¡∂∞«πÆ¿Ã true∏È ºˆ«‡«œ¥¬ πÆ¿Â ±∏«ˆ
 *   }
 *   else
 *   {
 *     ¡∂∞«πÆ¿Ã false¿œ∂ß ºˆ«‡«œ¥¬ πÆ¿Â ±∏«ˆ
 *   }
 *   
 *   ¡∂∞«πÆ => «ŸΩ… (¡∂∞« ¡¶¿€)
 *   
 *   =======> 137 page
 *   == ¥‹¿œ
 *   <
 *   >
 *   !=
 *   ======= 
 *   &&
 *   || ¡∂∞«¿Ã ø©∑Ø∞≥¿œ ∞ÊøÏ
 *   =======
 *  
 *   ch>='A' && ch<='Z'
 *   ch>='0' && ch<='9'
 *   ch>='∞°' && ch<='∆R'  => π¯»£∞° ¿œ∑¸¿˚¿∏∑Œ ¿Ã∑ÁæÓ¡¸
 *   
 *   πÆ¿⁄ø≠ => !=, == ªÁøÎ«œ¡ˆ æ ¥¬¥Ÿ
 *   equals() 
 *   !equals() 
 *   
 *   
 *   
 */
import java.util.*;


public class ¡¶æÓπÆ_º±≈√¡∂∞«πÆ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         πÆ¿⁄«—∞≥∏¶ ¿‘∑¬¿ª πﬁæ∆º≠ => æÀ∆ƒ∫™¿Œ¡ˆ ø©∫Œ »Æ¿Œ
	    // ∫Øºˆ º≥¡§
		char a = 'A'; //∫Øºˆ => √ ±‚»≠
		/* 
		 *  int => 0
		 *  double => 0.0
		 *  long => 0L
		 *  boolean => false
		 */
		// πÆ¿⁄ «—∞≥ ¿‘∑¬
		Scanner scan=new Scanner(System.in);
		System.out.print("¿‘∑¬:");
		//"ABC" => 012 ¿⁄πŸ¥¬ ∏µÁ Ω√¿€ π¯»£ 0∫Œ≈Õ Ω√¿€«—¥Ÿ
		a=scan.next().charAt(0);
		// a>='0' && a<='9'
		
		
		if((a>='A' && a<='Z') || (a>='a' && a<='z'))
		{
		 System.out.println(a+"¥¬ æÀ∆ƒ∫™¿‘¥œ¥Ÿ!");
		}
		else
		{
	     System.out.println(a+"¥¬ æÀ∆ƒ∫™¿Ã æ∆¥’¥œ¥Ÿ!");		
		}
	
	
	}

	
}
