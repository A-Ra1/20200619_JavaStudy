// ����ڰ� ���ĺ��� �Է��ϸ� B ==> AB , D ==>ABCD
// char => scan.next().charAt(0)
/*
 *  "ABCDE" => scan.next() => ���ڿ� ��ü�� �о�ö�
 *  ======
 *  'A' => charAt(0)
 *  'B' => charAt(1)
 *  == �������� => �ݺ��� ����� ����
 */
import java.util.*;
public class �ݺ���_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.print("���ĺ� �Է�(�빮��):");
     Scanner scan = new Scanner(System.in);
     char user = ' ';
     // while => ����Ǵ� ������ false�� �� �� ���� �����ϴ� ���� : ��������
     char c = 'A';
     // ���� ���� ���
     user = scan.next().charAt(0);
     while(c<=user)
     {
    	 System.out.print(c);
    	 c++;   	 
     }
	}

}
