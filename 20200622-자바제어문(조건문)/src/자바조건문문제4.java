/*
 *  두개의 정수를 받아서 
 *  최대값,최소값
 */
import java.util.*;
public class 자바조건문문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
/*System.out.print("두개의 정수 입력:");
int a = scan.nextInt();
int b = scan.nextInt();

int max, min;
if(a>b)
    {
	max=a;
	min=b;
	}
else 
{
	max=b;
    min=a;
}
 System.out.println("max="+max);
 System.out.println("min="+min);
*/	
// 정수를 입력을 받아서 절대값을 출력하는 프로그램
 System.out.print("정수 입력 :");
 int a = scan.nextInt();
 
 if(a<0)
 {
	System.out.println(a=-a);
 }
 else
 {
	System.out.println(a); 
 }

	
	}
	
	

}
