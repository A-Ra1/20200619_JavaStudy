import java.util.*;
public class ���ù�2 {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
        int menu = 0;
        Scanner scan=new Scanner(System.in); 
        System.out.println(
        	    "======= �޴� ======\n"
        	   +"Ȩ(1)\n����󿵿�ȭ(2)\n����������ȭ(3)\n�󿵽ð�ǥ(4)\n"
        	   +"��ȭ����(5)\n�̺�Ʈ(6)\n"
        	   +"==================="
        		);
        System.out.println("�޴� �����ϼ���");
        menu = scan.nextInt();
        
        switch (menu) 
        {
		case 1:
			Runtime.getRuntime().exec("C:\\Program Files\\Internet Explorer\\iexplore.exe http://www.cgv.co.kr/");
			break;
		case 2:
			Runtime.getRuntime().exec("C:\\Program Files\\InteRrnet Explorer\\iexplore.exe http://www.cgv.co.kr/movies/");
			break;
		case 3:
			Runtime.getRuntime().exec("C:\\Program Files\\InteRrnet Explorer\\iexplore.exe www.cgv.co.kr/movies/pre-movies.aspx/");
			break;
		case 4:
			Runtime.getRuntime().exec("C:\\Program Files\\Internet Explorer\\iexplore.exe http://www.cgv.co.kr/reserve/show-times/");
			break;
		case 5:
			Runtime.getRuntime().exec("C:\\Program Files\\Internet Explorer\\iexplore.exe http://www.cgv.co.kr/ticket/");
			break;
		case 6:
			Runtime.getRuntime().exec("C:\\Program Files\\Internet Explorer\\iexplore.exe http://www.cgv.co.kr/culture-event/event/defaultNew.aspx?mCode=001#1");
			break;

		default:
			System.out.println("�޴��� �������� �ʽ��ϴ�");
		}

   }
}