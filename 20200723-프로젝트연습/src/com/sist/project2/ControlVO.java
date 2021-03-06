package com.sist.project2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

import com.sist.data.MovieVO;


public class ControlVO {

	private static ArrayList<MovieVO> list=new ArrayList<MovieVO>();
	
	
	static {
		
		try {
			
			FileInputStream fr=new FileInputStream("c:\\javaDev\\Best_movie.txt");
			
			BufferedReader in=new BufferedReader(new InputStreamReader(fr));
			
			while(true) {
				
				String movie=in.readLine();
				if(movie==null) break;
				
//				StringTokenizer st=new StringTokenizer(movie,"|");
				
				//	while(st.hasMoreTokens()) {
						
						String[] data=movie.split("\\|");
						
						MovieVO vo=new MovieVO();
						
						vo.setMno(Integer.parseInt(data[0]));
						vo.setCno(Integer.parseInt(data[1]));
						vo.setTitle(data[2]);
						
					//	String regyear=data[3];
//						regyear=regyear.substring(regyear.indexOf("("+1,regyear.lastIndexOf(")")));
						vo.setRegyear(data[3]);
						
						vo.setScore(data[4]);
						
						String actor=data[5];
//						actor=actor.substring(actor.indexOf(":"+1));
					    vo.setActor(actor);
					    
					    String critics=data[6];
//					    critics=critics.substring(critics.indexOf(":"+1));
					    vo.setCritics(critics);
					    
					    String poster=data[7];
					    vo.setPoster(poster);
//					    story=story.substring(story.indexOf(":"+1),story.lastIndexOf("["));
					    
					    String story=data[8];
					    vo.setStory(story);
					
						
						list.add(vo);
					}
		//	}
			
		} catch (Exception e) {
		
			// TODO: handle exception
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
		
		
		for(MovieVO vo:list) {
			
			System.out.println(vo.getTitle()+
							   vo.getRegyear()+
							   vo.getScore()+
							   vo.getActor()+
							   vo.getCritics()+
							   vo.getStory()+
							   vo.getPoster()
					
					);
			
		}
	}
}
