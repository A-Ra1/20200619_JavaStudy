/*
 *  char ���� ���� => ���� ����
 *  
 *  => char alpha = 'A';
 *  
 *  => alpha�� �빮�ڸ� => �ҹ��ڷ� ���
 *  
 *  => alpha�� �ҹ��ڸ� => �빮�ڷ� ���
 */
/*
 * 1. ���
 *    ������ (�񱳿�����, ��������, ����������)
 *    = �񱳿�����
 *       ���� : ==
 *       �����ʴ� : !=
 *       �۴� : <
 *       ũ�� : >
 *       �۰ų� ���� : <=
 *       ũ�ų� ���� : >=      ==> ���� ����� : true / false
 *                                 �ַ� ���ǹ�(if)���� ����Ѵ�
 *    = ��������
 *       ���� && ���� ==> ������ �� �� true�϶� true
 *       && : ���� (�Ⱓ, ����) =
 *       ���� || ���� ==> ���� �߿� �Ѱ� �̻��� true�϶� true
 *       || : ������
 *    = ���������� : �ݴ� ==> !
 *                                       
 *    �ܵ�ó�� => ���������, ����������, ���Կ�����
 *               ====================================
 *                  ���� => ���
 *    ����ó�� => ����ȯ             
 *               double => int ===> (int)double
 *               int => char => (char) int 
 */ 
public class �ڹ����ǹ�����5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

   int alpha = '0';
   
   if (alpha >'A' && alpha <'Z')
   {
	   System.out.println((char)(alpha+32));
   }
   
   else// (alpha >'a' && alpha <'z')
  
   {
	   System.out.println((char)(alpha-32));
   }
	}

}
