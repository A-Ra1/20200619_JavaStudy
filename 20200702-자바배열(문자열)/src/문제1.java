
import java.util.*;


public class ����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= new int[10]; //10���� �޸� ���� ����
		for(int i=0; i<10; i++) {
			arr[i]=(int)(Math.random()*10)+1; //�ʿ��� �� ����
		}
		
		int total=0;
		for(int i:arr) {
			total+=i;
		}
		System.out.println("���:"+total/10.0);
	/*
		for(int i:arr) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
		*/
	String course[]= {"Java","C++","HTML5","��ǻ�ͱ���","�ȵ���̵�"};
			int jumsu[]= {95,88,76,62,55};
	
		
	Scanner scan=new Scanner(System.in);
   
	
	while(true) {
	
	boolean bCheck=false;
	System.out.println("���� �̸�:");
	String subject=scan.nextLine();	
	if(subject.equals("�׸�")) {
		break;
	}
	
	for(int i=0; i<course.length; i++) {
		if(subject.equals(course[i])) {
			bCheck=true; //��������
			System.out.println(jumsu[i]);
		}
	}
    if(bCheck==false) {
    	System.out.println("���� �����Դϴ�");
    }
	}
	}

}
