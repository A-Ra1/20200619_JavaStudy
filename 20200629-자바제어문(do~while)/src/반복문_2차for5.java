import jdk.internal.org.objectweb.asm.tree.IntInsnNode;

/*
 * 1
 * 22
 * 333
 * 4444
 * 55555
 * 
 * 1차 for => 5 => 1~5
 * 1차 for => 1-1, 2-2, 3-3, 4-4, 5-5
 * 
 * 1 1
 * 2 2 i=j => j<=i
 * 3 3
 * 4 4
 * 5 4
 * 
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 
 * 11111
 * 2222
 * 333
 * 44
 * 5
 * 
 */
public class 반복문_2차for5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=i; j++) {
				
				//정수출력
				System.out.print(i);
			}
		 System.out.println();
		}

	
		System.out.println();
	
	
	
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=6-i; j++) {
				
				//정수출력
				System.out.print(i);
			}
		 System.out.println();
	}

	}
}
