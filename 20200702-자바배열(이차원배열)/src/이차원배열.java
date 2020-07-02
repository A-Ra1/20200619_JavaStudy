import sun.net.www.content.text.plain;

/*
 * 이차원배열 
 * ==========
 * [][]
 * 
 *  * 형식 
 *   1) 데이터형[][] 배열명; <=권장 
 *   2) 데이터형 배열명[][];
 *   3) 데이터형[] 배열명[]
 *      => 행/열
 *      데이터형[행][열]
 *      
 *  * 초기화
 *   예) int[][] arr={{1,2,3},{4,5,6},{7,8,9}};    
 *      => 3행 , 3열
 *  
 *  		 0			1		   2
 *      =============================
 *  0        1          2          3
 *  	arr[0][0]  arr[0][1]  arr[0][2]
 *      =============================
 *  1        4          5          6
 *  	arr[1][0]  arr[1][1]  arr[1][2]
 *      =============================
 *  2        7          8          9
 *      arr[2][0]  arr[2][1]  arr[2][2]
 *      =============================
 *      
 *      => 2중 for : 퍼즐게임, 지뢰찾기, 빙고게임
 *      
 *      초기값 1~25
 *      
 *      =============================
 *       1 	    2      3      4      5
 *      =============================
 *      =============================
 *      =============================
 *      =============================
 *      =============================
 *      
 *      
 *      
 */
public class 이차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
		int[][] arr=new int[5][5]; //전체 => 0으로 초기화
	    
	    int k=1;
	    // 초기값
	    for(int i=0; i<5; i++) { //행
	    	for(int j=0; j<5; j++) { //열
	    		arr[i][j]=k;//[0][0]~[0][4]
	    		k++;
	    		
	    	}
	    }
	    //출력
	    for(int i=0; i<5; i++) {
	    	for(int j=0; j<5; j++) {
	    		System.out.printf("arr[%d][%d]=%d\t",i,j,arr[i][j]);
	    	}
	    	System.out.println();
	    			
	    }
	*/	
		
		
		//5행 5열 배열
		int[][] arr=new int[5][5]; //int[5,5] => c#
		/*
		 *     12345
		 *      678
		 *       9
		 *    101112
		 *  1314151617 
		 *  
		 *      j-s  j-e
		 *  i=0  0   4
		 *  i=1  1   3
		 *  i=2  2   2
		 *  
		 *     i와 j_s => j_s=i
		 *     i와 j_e => j_e=4-i
		 *   for(int i=0; i<3; i++){
		 *     for(int j=1; j<4-i; j++){
		 *     }
		 *   }  
		 *  ==========
		 *      j-s j-e
		 *  i=3  1   3
		 *  i=4  0   4
		 *     i와 j-s => j-s=4-i
		 *     i와 j-e => j-e=i
		 *  
		 */
		int k=1;
		for(int i=0; i<3; i++) {
			for(int j=i; j<=4-i; j++) {
				arr[i][j]=k;
				k++;
			}
		}
		for(int i=3; i<=4; i++) {
			for(int j=4-i; j<=i; j++) {
				arr[i][j]=k;
				k++;
			}
		}
 // 		출력	
	 for(int i=0; i<5; i++) {
		 for(int j=0; j<5; j++) {
			 if(arr[i][j]==0)
				 System.out.print("\t");
			 else 
				System.out.print(arr[i][j]+"\t");
		
		
		 }
		 System.out.println("\n");
	 }
	}

}
