// A - Z���� ���
public class �ݺ���_for6 {

	public static void main(String[] args) {
		
	for(char ch ='A'; ch <= 'Z'; ch++)
	{
		System.out.print(ch);   // => for�� ����� �ٲ�� ������ �������
	}
	System.out.println(); //=> �ٹٲٱ�
	for(char ch ='a'; ch <= 'z'; ch++)
	{
		System.out.print(ch);
	}
	for(int i = 10; i>=1; i--)
	{
		System.out.println(i);
	}
	System.out.println("=============");
	
	for(int i = 1, j = 10; i <= 10; i++,j--)
	{
		System.out.println("i="+i+",j="+j);
	}
	}

}
