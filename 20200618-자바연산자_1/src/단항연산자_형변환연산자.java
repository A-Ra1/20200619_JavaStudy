
/*
 *  �ʿ�ÿ� ���������� �����ؼ� ��� : ���� ����ȯ
 *  int + double = double (�ڵ� ����ȯ)
 *  char + int = int (�ڵ� ����ȯ)
 *  int + long  = long (�ڵ� ����ȯ)
 *  
 *  char + int + long + double = double (�ڵ� ����ȯ)
 *  ===
 *   int
 *   ====

 *     ====
 *      long
 *      ====
 *       double
 *       
 *       (int)double ==> int ==> ū�����͸� ���� �����ͷ� ����
 *       char(int) ==> char
 *       
 *       1) boolean�� ����
 *       2) int���ϴ� ������ �ϸ� ������� int
 *          byte + byte = int
 *          char + char = int
 *          short + byte = int
 *          char + byte + short = int
 *          
 *         byte b = 10;
    byte c = 20;
    int d = b + c;   
 */
public class ���׿�����_����ȯ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
    
    int a = 'A'; //a = 65
    double d = 10; // d = 10.0
    //         int
    char c = 65; //c='A'
    
    System.out.println("a="+a);
    System.out.println("d="+d);
    System.out.println("c="+c);
    
    // ��������ȯ
    
    int i = (int)10.5;
    int ii = (int) 'A';
    System.out.println("i="+i);
    System.out.println("ii="+ii);
	}  
    

}
