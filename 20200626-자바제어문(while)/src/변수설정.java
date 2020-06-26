/*
 *  영화 => 정보 저장하는 변수
 *  변수 => 변경이 가능
 *  
 *  
결백(2019)상영중
 潔白 평점 08 . 8 
드라마
한국
2020.06.10 개봉 
110분, 15세이상관람가 
감독 박상현 주연 신혜선, 배종옥, 허준호 
예매 2위 누적관객 617,898명 


온워드: 단 하루의 기적(2020)상영중 
Onward 평점 08 . 1 
판타지/어드벤처
미국
2020.06.17 개봉 
102분, 전체관람가 
감독 댄 스캔론 주연 크리스 프랫, 톰 홀랜드, 옥타비아 스펜서, 줄리아 루이스 드레퓌스 
예매 3위 누적관객 192,053명 



 */
public class 변수설정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 제목
		String title="결백(2019)";
		boolean isOpen=true;
		double score=8.8;
		String na="한국";
		String genre="드라마";
        String regdate="2020.06.10";
        String director="박상현";
        String actor="신혜선,배종옥,허준호";
        int time=110;
        int grade=15;
        int rank=2;
        int showUser=617898;
        
        System.out.println("======= 영화정보 =======");
        System.out.println("영화명:"+title);
        System.out.println(" "+(isOpen==true?"상영중":"미개봉"));
        System.out.println("기타:"+na+" "+grade+"세 관람가");
        System.out.println("시간:"+time+"분");
        System.out.println("개봉일"+regdate+"개봉");
        System.out.println("감독:"+director);
        System.out.println("출연:"+actor);
        System.out.println("순위:"+rank);
        System.out.println("누적관객수:"+showUser);
        
        
        
       System.out.println();
      
				
         title="온워드: 단 하루의 기적(2020)";
		 isOpen=true;
		 score=8.1;
		 na="미국";
	     genre="";
         regdate="2020.06.17";
         director="댄 스캔론";
         actor="크리스 프랫, 톰 홀랜드, 옥타비아 스펜서, 줄리아 루이스 드레퓌스";
         time=102;
         grade=0;
         rank=3;
         showUser=192053;
         
         System.out.println("======= 영화정보 =======");
         System.out.println("영화명:"+title);
         System.out.println(" "+(isOpen==true?"상영중":"미개봉"));
         System.out.println("기타:"+na+" "+grade+"세 관람가");
         System.out.println("시간:"+time+"분");
         System.out.println("개봉일"+regdate+"개봉");
         System.out.println("감독:"+director);
         System.out.println("출연:"+actor);
         System.out.println("순위:"+rank);
         System.out.println("누적관객수:"+showUser);
         
	}

}
