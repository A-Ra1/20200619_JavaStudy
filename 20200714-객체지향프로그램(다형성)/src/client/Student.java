package client;

public class Student {
	private int hakbun; // ���� Ŭ���� �ȿ��� ��밡��
	public String name;
	String subject; // ���� ��Ű�� �ȿ��� ��밡��
	protected String tel; // ��ӹ��� Ŭ���� ������ ��밡�� (�ٸ� ��Ű��ok)
	
	public int getHakbun() {
		return hakbun;
	}

	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Student() { //�����ڴ� public���� ���
		hakbun=1;
		name="ȫ�浿";
		subject="����";
		tel="010-1111-1111";
				
	}
}
