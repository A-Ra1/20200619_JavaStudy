package com.sist.project2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

import com.sist.data.MovieManager;
import com.sist.data.MovieVO;


public class ControlVO2 {

	private static ArrayList<MovieVO> list=new ArrayList<MovieVO>();
	
	static {
		try {
			
			FileInputStream fr=new FileInputStream("c:\\javaDev\\Best_movie.txt");
			
			BufferedReader in=new BufferedReader(new InputStreamReader(fr));
			
			while(true) {
				String movie=in.readLine();
				if(movie==null) break;
				
				StringTokenizer st=new StringTokenizer(movie,"|");
				
				while(st.hasMoreTokens()) {
					
					
					MovieVO vo=new MovieVO();
					
					vo.setMno(Integer.parseInt(st.nextToken()));
					vo.setCno(Integer.parseInt(st.nextToken()));
					vo.setTitle(st.nextToken());
				//	vo.setRegyear(st.nextToken());
					vo.setScore(st.nextToken());
					vo.setActor(st.nextToken());
				//	vo.setCritics(st.nextToken());
					vo.setStory(st.nextToken());
					vo.setPoster(st.nextToken());
					
					list.add(vo);
					
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public ArrayList<MovieVO> movieListData(int page) {
		
		ArrayList<MovieVO> movies=new ArrayList<MovieVO>();
		
		int i=0;
		int j=0;
		int pagecnt=(page*10)-10;
		
		for(MovieVO vo:list) {
			
			if(i<10 && j>pagecnt) {
				
				movies.add(vo);
				i++;
			}
			j++;
		}
		return movies;
	}
	
	public int movieTotalPage() {
		
		return (int)(Math.ceil(list.size()/10.0));
	}
	
	public MovieVO movieDatailData(int mno) {
		
		return list.get(mno-1);
	}
	
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
	}

}
