/*
 *  indexOf , lastIndexOf => ������ ��ġ ã�� => ����
 *  ���� �ڸ��� => substring()
 */
public class ���ڿ�4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="kjsdlf.kjljljelwrjil.java";
		System.out.println(msg.indexOf("."));
		System.out.println(msg.lastIndexOf("."));
		System.out.println("Ȯ���ڴ�:"+msg.substring(msg.lastIndexOf(".")+1));
		System.out.println(msg.substring(msg.indexOf(".")));
	}

}
