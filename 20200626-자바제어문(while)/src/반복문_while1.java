/*
 *   while => 무한루프(데이터베이스 (오라클), 파일읽기, 서버제작, 게임)
 *   				  ==============					========
 *   				  파일 : XML, JSON
 *   				  => break(종료) for문은 횟수가 지정되어 있어서 break 사용X
 *   형식) 
 *        초기값 ====1
 *        while (조건식) ===2 => true=> {안에 있는 내용 수행}
 *        {
 *          반복 수행 문장 ===3
 *          증가식 ===4 => 조건식 비교
 *        }
 *       1 ~ 10 정수를 출력
 *       1) 1 ~ 10까지 변경되는 변수 => 루프변수
 *          int i = 1; 시작 => 1
 *          while(i<=10) => 10
 *          {
 *           System.out.println(i);
 *           i++; // i=2 => i<=10 ... i=11 i<=10 => false (종료)
 *          }
 *       
 *        초기값 설정
 *        어디까지 수행 => 조건식 i<=10
 *        i를 어떻게 변경 i++, i+=2, i+=3 ..
 */
// 정수값을 받아서 => 받은 정수 갯수만큼 ★을 출력
import java.util.*;




public class 반복문_while1 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.print("입력:");
	  int user = 0;
      int i = 1;// 사용자 요청한 값까지 변경할 변수 => while에서 사용하는 변수
      
      Scanner scan = new Scanner(System.in);
      user = scan.nextInt();
      
      while(i<=user)
      {
    	  System.out.print("★");
    	  i++;//user의 갯수가 될 때까지 루프 실행
      }
    		  
      
      
	}

}
