/*
 *   ���� =>
 *      ��� : ������� �� �� ����
 *             int + int = int
 *             double + int = double
 *             float + long = float
 *      =======================                    
 *      �� : true / false     
 *      �� : true / false
 *      ======================= ���ǹ� (if)
 *      ����    
 *   �񱳿����� : ���� ���� �� => ����, �Ǽ�, ����, �� 
 *                ���ڿ��� ���� �� ����
 *                "Hello"=="Hello" ==> equals()
 *                ==> ���ڿ��� �����ϴ� �������� => String
 *                char c = 'Hello' (X) 
 *                String s "Hello" (O)
 *     1) ���� 
 *        == : ����       => 10 == 20 (false)
 *        != : ���� �ʴ�  => 10 != 20 (true)
 *        < : �۴�        => 10 <  10 (false)
 *        > : ũ��        => 10 >  10 (false)
 *        <= : �۰ų� ����=> 10 <= 10 (true)
 *        				     10 < 10 || 10 == 10
 *        >= : ũ�ų� ����=> 10 >= 10 (true)
 *        					 10 >10  || 10 == 10
 *     2) ����� : boolean
 */
public class ���׿�����_�񱳿����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 9;
		char c = 'A';
		System.out.println(c++); // C�� ����(X)
		System.out.println(c); // C�� ���� (O)
		System.out.println(++b==a);//b  = 10 (true)
		
		System.out.println(b++==a); // b = 10 (true)

		System.out.println(10 == 20);
        System.out.println(10 != 20);
        System.out.println(10 < 10);
        System.out.println(10 > 10);
        System.out.println(10 <= 10);
        System.out.println(10 >= 10);
        
        System.out.println('A'== 65);
        //char�� ������ �����ϸ� ������ ��ȯ�ȴ�
	}

}
