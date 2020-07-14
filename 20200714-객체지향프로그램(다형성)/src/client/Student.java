package client;

public class Student {
	private int hakbun; // 같은 클래스 안에서 사용가능
	public String name;
	String subject; // 같은 패키지 안에서 사용가능
	protected String tel; // 상속받은 클래스 내에서 사용가능 (다른 패키지ok)
	
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

	public Student() { //생성자는 public으로 사용
		hakbun=1;
		name="홍길동";
		subject="물리";
		tel="010-1111-1111";
				
	}
}
