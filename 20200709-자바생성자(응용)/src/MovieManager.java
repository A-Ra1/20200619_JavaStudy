import java.io.*; // file입출력 
import java.util.Scanner;


public class MovieManager {
	static MovieVO[] movies=new MovieVO[1938]; // 사용자 정의 데이터형 
	// static => 모든 클래스에서 공유를 할 경우
	// 프로그램이 구동되면 자동으로 => 파일을 읽어서 배열에 저장
	// 초기화 블럭
	/*
	 *  변수설정 : 초기값
	 *  = 선언과 동시에 부여
	 *  = 초기화 블럭
	 *  = 생성자
	 */
	
	static {
		try {				
		 // file을 읽는 경우에는 반드시 예외처리 (throw exception = 메소드뒤에만)
			StringBuffer data=new StringBuffer();
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			
			int i=0;
			while((i=fr.read())!=-1) {// -1 EOF(End of File)
				data.append(String.valueOf((char)i)); // char를 String으로 변환
			}
			fr.close();
			
			String[] movieData=data.toString().split("\n"); // 한줄씩 자르기
			int k=0; // 인덱스번호
			for(String s:movieData) {
				
				String[] ss=s.split("\\|"); // |마다 자르기
				/*
				 * ss={1,쇼생크 탈출,드라마,https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2|팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩),2016 .02.24 재개봉, 1995 .01.28 개봉,15세 관람가,프랭크 다라본트}
				 */
				movies[k]=new MovieVO(); // 메모리에 저장
				movies[k].mno=Integer.parseInt(ss[0]);
				// 문자열 => 정수로 변환 "1" => 1
				movies[k].title=ss[1];
				movies[k].genre=ss[2];
				movies[k].poster=ss[3];
				movies[k].actor=ss[4];
				movies[k].regdate=ss[5];
				movies[k].grade=ss[6];
				movies[k].director=ss[7];				
				k++; 
				
			}
		}catch(Exception ex) {}		
	}
	
	// 페이지 나누기
	static MovieVO[] movieListData(int page) {
		MovieVO[] m=new MovieVO[10];
		int i=0; // i => 10개씩 나눠주는 변수
		int j=0; // j => for 횟수
		int rowSize=10; // 각 페이지당 몇개를 출력할 것인지
		int pagecnt=(page*rowSize)-rowSize; // 시작위치
		/*
		 *  1 page => 0~9
		 *  2 page => 10~19
		 */
		for(MovieVO vo:movies) {
			if(i<10 && j>=pagecnt) {
				m[i]=vo;
				i++;
			}
		 j++;
		}
		return m;
	}
	
	static MovieVO[] movieFindData(int page) {
		MovieVO[] m=new MovieVO[50];
		int i=0; // i => 10개씩 나눠주는 변수
		int j=0; // j => for 횟수
		int rowSize=50; // 각 페이지당 몇개를 출력할 것인지
		int pagecnt=(page*rowSize)-rowSize; // 시작위치
		/*
		 *  1 page => 0~9
		 *  2 page => 10~19
		 */
		for(MovieVO vo:movies) {
			if(i>50) break;
			if(i<50 && j>=pagecnt) {
				m[i]=vo;
				i++;
			}
		 j++;
		}
		return m;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("페이지 입력:");
		int page=scan.nextInt();
		MovieVO[] movie=movieListData(page);
		for(MovieVO vo:movie) {
			System.out.println("영화번호:"+vo.mno);
			System.out.println("영화명:"+vo.title);
			System.out.println("========================================");
		}
	}
	/*
   public static void main(String[] args) {
	//System.out.println(data.toString());
	   for(MovieVO vo:movies) {
		   System.out.println("영화번호:"+vo.mno);
		   System.out.println("영화명:"+vo.title);
		   System.out.println("장르:"+vo.genre);
		   System.out.println("출연:"+vo.actor);
		   System.out.println("감독:"+vo.director);
		   System.out.println("등급:"+vo.grade);
		   System.out.println("개봉일:"+vo.regdate);
		   System.out.println("=============================");
	   }
  
   }
*/
}
	
	

