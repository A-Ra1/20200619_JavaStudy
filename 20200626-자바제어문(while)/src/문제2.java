

public class ����2 {

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
		System.out.println("4�� ����� �ƴ� ���� ����:"+count);
		System.out.println("4�� ����� �ƴ� ���� ��:"+sum);

	  

		
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
	 System.out.println("4�� ����� �ƴ� ���� ����:"+count);
		System.out.println("4�� ����� �ƴ� ���� ��:"+sum);

	
	}
	
	

}
