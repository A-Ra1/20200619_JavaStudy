
public class 선택문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		switch (a) {
		
		case 10:
		{
			int b = 100; // 블럭을 사용하여 변수 재사용이 가능하게 한다
			System.out.println("a="+a+", b="+b);
			break;
		}
		case 11:
		{
			int b = 200;
			System.out.println("a="+a+",b="+b);
			break;
		}
		default:
			break;
		}
	}

}
