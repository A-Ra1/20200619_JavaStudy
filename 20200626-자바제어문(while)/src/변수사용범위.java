/*
 *  ���� Scope
 *  ==========
 *  ���� ����
 *  ==========
 *    = ��������
 *    = �������
 *    = ��������
 *    
 *    public class A
 *    {
 *      int a; ==> ������� => Ŭ���� A�� ������ �ɶ� ���� ����
 *      static int b; ==> �������� => JVM class�� �ε��Ҷ� 
 *      ================================================
 *      public static void main(String[] args)
 *      {
 *        int c; => �������� => 
 *      } // c���� => main������ ����� ����
 *    }
 *    �ʱⰪ
 *    do{
 *     ���๮��
 *     ������
 *     }
 *     while(���ǽ�) 
 *    
 */
public class ���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	/*	
		for(int i=1;i<=10;i++){
    	  
    	  System.out.println("i="+i);
      }//i�� ������
      System.gc(); // �޸� ȸ�� (�������÷���)
      
      */
		
		int i=1;
		
		for(i=1;i<=5;i++) {
			
			System.out.println(i+" ");
		}
		
		System.out.println();
		
		
		i=1;
		while(i<=5) {
			
			System.out.println(i+" ");
			i++;
		}
		System.out.println();
		
		
		
		i=1;
		do {			
			System.out.println(i+" ");			
			i++;
		} 
		while(i<=5);
			
	}

}
