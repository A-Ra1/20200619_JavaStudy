package com.sist.data;

// 데이터관리

import java.util.*;
import java.io.*;
/*
 *  프로그램 작성
 *  = 파일 : 분리할 수 없다 => 전체를 통으로 저장
 *    = 1. 전체 파일을 읽어서 분리 => 메모리에 저장
 *    								  ------ ArrayList
 *    		FileReader
 *    	    StringTokenizer, split
 *      2. 메모리에서 제어 
 *  = 오라클 : 분리가 되어 있는 상태
 *     = 필요시마다 오라클에 연결 => 메소드 안에서 처리+
 */

public class MovieManager {
	
	// 데이터저장
	
	private static ArrayList<MovieVO> list=new ArrayList<MovieVO>();
	
	// 모든 자바파일에서 공통으로 사용 => 반드시 static 사용
	
	// 프로그램 시작 => 데이터 수집 => ArrayList에 저장 후 시작
	
	static {
		
		try {
			/*
			 *  파일 읽기 =>
			 *    1. 한글자씩 읽는 방법 => read()
			 *    	FileInputStream
			 *    	FileReader
			 *    2. 한줄씩 읽는 방법 => readLine()
			 *      전체 데이터를 임시저장공간[BufferedReader]에 저장 후 사용
			 *      			 
			 */			

			// 저장된 파일 읽기
			FileInputStream fr=new FileInputStream("c:\\javaDev\\daum_movie.txt");
			
			// 메모리에 전체 데이터를 모아서 관리
			BufferedReader in=new BufferedReader(new InputStreamReader(fr));
			while(true) {
				
				String movie=in.readLine(); // readLine() => \n
				if(movie==null) break; // 종료 => 파일을 다 읽은 경우
				
				StringTokenizer st=new StringTokenizer(movie,"|");
				
				while(st.hasMoreTokens()) {
					
					MovieVO vo=new MovieVO();
					vo.setMno(Integer.parseInt(st.nextToken()));
					vo.setCno(Integer.parseInt(st.nextToken()));
					vo.setTitle(st.nextToken());
					vo.setPoster("http:"+st.nextToken());
					String score=st.nextToken();
					score=score.substring(score.indexOf("점")+1); //"평점"을 자름
					vo.setScore(score.trim());
					vo.setDirector(st.nextToken());
					vo.setActor(st.nextToken());
					vo.setGenre(st.nextToken());
					String regdate=st.nextToken();
					regdate=regdate.substring(0,regdate.lastIndexOf("개")); //"개봉"을 자름
					vo.setRegdate(regdate);
					String grade=st.nextToken();
					grade=grade.substring(grade.indexOf(",")+1);
					vo.setGrade(grade.trim());
					
					// 90,000 => 90000
					vo.setShowUser(Integer.parseInt(st.nextToken().replace(",", "")));
					
					vo.setStory(st.nextToken());
							
					list.add(vo);
				}
			}
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
	
	public ArrayList<MovieVO> movieListData(int page){
		ArrayList<MovieVO> movies=new ArrayList<MovieVO>();
		
		int i=0;
		int j=0;
		int pagecnt=(page*10)-10;
		
		/*
		 * 1page  => 0~9
		 * 2page  => 10~19
		 */
		for(MovieVO vo:list) {
			
			if(i<10 && j>=pagecnt) { //j => for문 돌아가는 횟수, i => 10개씩 나눠주는 변수
				
//				pagecnt => 저장하는 위치
				
				movies.add(vo);
				i++;
			}
			j++;
		}
		return movies;
	}
	
	public int movieTotalPage() {
		
		return (int)(Math.ceil(list.size()/10.0));
		
		// ceil => 올림 메소드
	}
	
	// 상세보기
	
	public MovieVO movieDatailData(int mno) {
		
		return list.get(mno-1);
	}
	
	
	// 영화 전체 읽기
	public ArrayList<MovieVO> movieAllData(int cno){
		
		ArrayList<MovieVO> movies=new ArrayList<MovieVO>();
		
		for(MovieVO vo:list) {
			if(vo.getCno()==cno) { //  같은 cno만 모아준다
				movies.add(vo);
			}
		}
		return movies;
	}
	
	public ArrayList<MovieVO> movieFindData(String ss){
		
		ArrayList<MovieVO> movies=new ArrayList<MovieVO>(); // 가변 배열 
		// list
		
		for(MovieVO vo:list) {
			if(vo.getTitle().contains(ss)) {
				movies.add(vo); // 데이터 묶어서 출력 
			}
		}
		
		return movies;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("페이지:");
		int page=scan.nextInt();
		
		MovieManager m=new MovieManager();
		System.out.println(page+" page / "+m.movieTotalPage()+" pages");
		
		// 데이터 읽기
		
		ArrayList<MovieVO> list = m.movieListData(page);
		
		for(MovieVO vo:list) {
			System.out.println(vo.getTitle());
		}
		
		
//		for(MovieVO vo:list) {
//			
//			if(vo.getTitle().contains(ss)) {
//				
//				System.out.println(vo.getTitle());
//			}
//		}
	}

}
