
import java.util.*;


public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= new int[10]; //10개의 메모리 공간 생성
		for(int i=0; i<10; i++) {
			arr[i]=(int)(Math.random()*10)+1; //필요한 값 설정
		}
		
		int total=0;
		for(int i:arr) {
			total+=i;
		}
		System.out.println("평균:"+total/10.0);
	/*
		for(int i:arr) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
		*/
	String course[]= {"Java","C++","HTML5","컴퓨터구조","안드로이드"};
			int jumsu[]= {95,88,76,62,55};
	
		
	Scanner scan=new Scanner(System.in);
   
	
	while(true) {
	
	boolean bCheck=false;
	System.out.println("과목 이름:");
	String subject=scan.nextLine();	
	if(subject.equals("그만")) {
		break;
	}
	
	for(int i=0; i<course.length; i++) {
		if(subject.equals(course[i])) {
			bCheck=true; //과목유무
			System.out.println(jumsu[i]);
		}
	}
    if(bCheck==false) {
    	System.out.println("없는 과목입니다");
    }
	}
	}

}
