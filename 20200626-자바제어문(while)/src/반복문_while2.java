// 사용자가 알파벳을 입력하면 B ==> AB , D ==>ABCD
// char => scan.next().charAt(0)
/*
 *  "ABCDE" => scan.next() => 문자열 전체를 읽어올때
 *  ======
 *  'A' => charAt(0)
 *  'B' => charAt(1)
 *  == 일정패턴 => 반복문 사용이 가능
 */
import java.util.*;
public class 반복문_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.print("알파벳 입력(대문자):");
     Scanner scan = new Scanner(System.in);
     char user = ' ';
     // while => 변경되는 조건이 false가 될 때 까지 변경하는 변수 : 루프변수
     char c = 'A';
     // 변수 설정 방법
     user = scan.next().charAt(0);
     while(c<=user)
     {
    	 System.out.print(c);
    	 c++;   	 
     }
	}

}
