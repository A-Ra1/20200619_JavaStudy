/*
 *  재사용 => 기존에 만들어진 클래스를 사용 (반복 코딩을 제거)
 *   1) 상속 (is - a)
 *   	 이미 만들어진 기능을 변경해서 사용
 *   	 public class MyWindow extends JFrame
 *   						   =======
 *   							확장된 클래스
 *   2) 포함 (has - a)
 *   	 이미 만들어진 기능을 변경없이 그대로 사용
 *    	 public class MyWindow
 *    {
 *       JFrame f=new JFrame(); 
 *    }
      
      A클래스가 가지고 있는 모든것이 상속 => 예외(private, static, 생성자)
      public class A
      {
      	String name;
      	int age;
      	public void display()
      }
      public class B extends A => 눈에 보이지 않지만 A의 모든 메소드,변수를 B가 지님
     				 =========	
      {
        String name;
      	int age;   
      	public void display()
      }
      *** 자바 상속은 단일 상속
      
 */
import javax.swing.*;
public class MainClass extends JFrame{
//	public MainClass() { //생성자는 가급적이면 public메소드로 만든다
//		
//	}
	
	public MainClass() {
		super.setSize(300, 300); // JFrame 소환
		this.setVisible(true); // MainClass 소환
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass();
	}

}
