/*
 * �ڹ� => �⺻��
 *         �ڹٿ��� �����ϴ� ��������
 *         ���� ==> boolean ==> �� : true / false : if(���ǹ�)�� ����� �� �ַ� ����ϴ� ��������
 *                                                    ��������
 *                                                    ��(TURN)
 */  
//   ===> upcasting (�ڵ�����ȯ)
//   byte < short (char) < int < long < float < double
/*   <=== downcasting (��������ȯ)
 *   double d = 'a'; ==> d=97.0 (�ڵ� ����ȭ upcastng)
 *   char c = 'a' ==> c=a
 *   int i = 'A' ==> i=65
 *   
 *   byte b1=10;
 *   byte b2=20;
 *   byte b3=b1+b2 ===> Error (byte+byte = int) 
 *   
 *   byte a = 10;
 *   byte b = 30;
 *   byte c = (byte)(a*b)
 *                  ===== 
 *                  
 *   ==> (int)10.5+(int)10.5 ==> 20.0
 *       (int)(10.5+10.5) ==> 21
 *                  
 *   
 */
public class �ڹٱ⺻�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ��� ���
		boolean b=false; //False(X) ==> 1byte (�������� ���� �Ұ�)
		System.out.println("b="+b);
		b=true;
		System.out.println("b="+b);
		
		System.out.println(Integer.toBinaryString(300));
		//byte�� �Ѿ�� 2������ �� 8�ڸ��� 
		
		System.out.println('A');
		// ==> 
		System.out.println((int)'A');
		
		System.out.println((int)'ȫ');
		System.out.println((char)54861);
	 // �����ڴ� ���ڹ�ȣ�� ������ �ִ� (char�� ���������� �ν��Ѵ�)
	
		
		
		
	}

}
