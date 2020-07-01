import java.util.*;
//startsWith / endsWith / contains ==> 검색과 관련
//
public class 문자열4 {

	public static void main(String[] args) throws Exception {
	
		String[] data= {
				"Java Program",
				"Oracle Program",
				"JSP Program",
				"Oracle AND Java",
				"Java AND JSP",
				"AJax Pragram",
				"Spring AND Mobile",
				"Kotlin Program",
				"XML AND Annotation",
				"Java AND JQuery"
		};
		//startswith
		Scanner scan=new Scanner(System.in);
		System.out.print("검색어 입력:");
		String ss=scan.nextLine();// next(space,enter), nextLine(enter만 적용) 
				
		for(String s:data) {
			if(s.startsWith(ss) || s.endsWith(ss)) {
				System.out.println(s);
				Thread.sleep(500);
			}
		}
	}

}
