/*
 *  ���ڿ��� ������ �� �ִ� ���� : String
 *  String : �Ϲݺ����� ����
 *  		 Ŭ������ ���� => ���(�޼ҵ�)
 *  
 *  		 �ֿ� ���
 *  			= ���ڿ� �� : equals()
 *  			= ���� ���� : contains()
 *  			= ���ڿ��߿� �Ѱ� ���� : charAt()
 *  			= ����� ������ ���� : length()
 *  			= ���� �ڸ��� : substring()
 *  			= ã�� ������ ��ġ : indexOf(), lastIndexOf()
 *  			= ��� ���������� ���ڿ��� ��ȯ => valueOf()
 *  			= ���鹮�� ���� : trim() => �¿츸 ��
 *  				" Hello Java " => "Hello Java" (��� ������ �Ұ�)
 *  			= ���ڿ�=>char[] => toCharArray()
 *  			= startsWith, endsWith => �˻���
 *            ==========================================================
 *            Wrapper Class
 *            =============
 *            �⺻�� ������ (����, �Ǽ�, ����, ��)
 *            int => Integer
 *            double => Double Boolean, Float,Byte ...
 */
// substring : �ʿ��� ���ڸ� ���� => ���¼� �м�(���, �λ�, �����)
/*
 *  "Hello Java" => String => char[]
 *  	   ====
 *     ===
 *  substring (int start)
 *  substring (int start, int end)
 */
public class ���ڿ�3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String msg="100-010";
		          //0123456
//		System.out.println(msg.substring(3));
//		System.out.println(msg.substring(3,6)); // ����ġ�� ����
		System.out.println(msg.substring(0,3));
		System.out.println(msg.substring(4,7));
		System.out.println(msg.substring(4));
	}

}
