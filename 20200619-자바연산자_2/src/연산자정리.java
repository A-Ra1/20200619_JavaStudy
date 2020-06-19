/*
 *  
 */
public class 연산자정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    char c = 'A';
    char ccc = 65;//다이렉트로 데이터 넣기는 가능
    char cc = (char)(c+32); //(소문자처리) 연산처리에는 형변화 필요 
    System.out.println(cc);
    
    System.out.println(c >= 'A' && c <='Z' ? "대문자":"소문자");
//    cc >= 'A' && cc <= 'Z' ==> 대문자
//    cc >= 'a' && cc <= 'z' ==> 소문자
	}

}
