
public class ����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int odd = 0,even=0;
     
     for(int a = 0; a <= 30; a++)
     {
    	 if(a%2 ==0)
    	 {
    	   even+=a;
    	 }
    	 else {
    		 odd+=a;
    	 }
     }
     
        System.out.println("Ȧ����:"+odd);
        System.out.println("¦����:"+even);
	 
      odd = 0; even = 0;
      int a = 0;
      while (a <= 30)
      {
    	  if(a%2 ==0)
     	 {
     	   even+=a;
     	 }
     	 else {
     		 odd+=a;
     	 }
    	  a++;
    	  
    	  
      }
      System.out.println("Ȧ����:"+odd);
      System.out.println("¦����:"+even);
	 
	
	}

	
}
