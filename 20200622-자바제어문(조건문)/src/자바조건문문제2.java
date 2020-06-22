import java.util.*; // Scanner 클래서를 가지고 온다
public class 자바조건문문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scan = new Scanner(System.in);
 //scan ==> 여러번 받을 수 있다.
 System.out.print("국어점수 영어점수 수학점수 입력");
 // 키보드로 입력된 정수를 받기
 int kor = scan.nextInt();
 int eng = scan.nextInt();
 int math = scan.nextInt();
 int total = kor + eng + math ;
 double avg = total/3.0;
 char score = 'A';
 
 	 if (avg >= 90 && avg <100)
 	 {
     score = 'A';
 	 }	 
	 if (avg >= 80 && avg < 90)
	 {
     score = 'B';
	 }
     if (avg >= 70 && avg < 80)
     { 
    score = 'C'; 	 
     }
     if (avg >= 60 && avg <70)
     {
    score = 'D';	 
     }
     if (avg < 60)
     {
    score = 'F'; 
     }
    	 System.out.println("총점:"+total);
    	 System.out.printf("평균:%n"+avg);
    	 System.out.println("학점:"+score); 
    	 
     }
     } 
     
	

	 
	
