

public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		int sum = 0;
		
		
		for(int a = 100; a <= 999; a++)
		{
			if(a%4 != 0)
			{
				count++;
				sum+=a;
			}
			
		}
		System.out.println("4의 배수가 아닌 수의 갯수:"+count);
		System.out.println("4의 배수가 아닌 수의 합:"+sum);

	  

		
	 count = 0;
	 sum = 0;
	 int a = 100;
	 
	 while(a <= 999)
	 {
		 if(a%4 != 0)
			{
				count++;
				sum+=a;
			}
		 a++;
	 }
	 System.out.println("4의 배수가 아닌 수의 갯수:"+count);
		System.out.println("4의 배수가 아닌 수의 합:"+sum);

	
	}
	
	

}
