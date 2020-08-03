package com.sist.project2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;


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
//					    vo.setCritics(critics);
					    
					    String story=data[7];
//					    story=story.substring(story.indexOf(":"+1),story.lastIndexOf("["));
					
						
						list.add(vo);
					}
		//	}
			
		} catch (Exception e) {
		
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void main(String[] args) {
		
		
		for(MovieVO vo:list) {
			
			System.out.println(vo.getTitle()+
							   vo.getRegyear()+
							   vo.getScore()
							   
					
					);
			
		}
	}
}
