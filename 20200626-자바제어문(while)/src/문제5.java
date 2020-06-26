import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;
import com.sun.org.apache.bcel.internal.generic.StackConsumer;

public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 
	 int b = 0;
	 int a = 0;
	 for(int i =1; i<=1000; i++)
	 {
		 if
		 (i%7 == 0)
			 a+=i;
		 if(i%9 == 0)
			 b+=i;
		 
			 
			 
			 
		 
	 }
	 System.out.println("7의 배수:"+a);
	 System.out.println("9의 배수:"+b);
	 System.out.println("7의 배수+9의배수:"+(a+b));
	
	 a=0; b=0;int i =1;
	 while (i<=1000)
	 {
		 if
		 (i%7 == 0)
			 a+=i;
		 if(i%9 == 0)
			 b+=i;
	
		 i++;
	 }
	 System.out.println("7의 배수:"+a);
	 System.out.println("9의 배수:"+b);
	 System.out.println("7의 배수+9의배수:"+(a+b));
	}
	
	

}
