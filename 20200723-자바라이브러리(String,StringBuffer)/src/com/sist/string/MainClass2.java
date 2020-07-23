package com.sist.string;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.*;

/*
 *  Find 
 *   => 포함 contains()
 *   => 시작 문자열 startsWith()
 *   => 끝 문자열 endsWith()
 */
public class MainClass2 {
	
	public void find(String ss) {
		
		try {
			
			for(int i=1; i<=3; i++) { // 3페이지 한번에 읽기
				
			Document doc=Jsoup.connect("https://movie.daum.net/premovie/released?reservationOnly=N&sort=reservation&page="+i).get();
			Elements title=doc.select("a.name_movie");
			
			  for(int j=0; j<title.size(); j++) {
				  
				
				  if(title.get(j).text().endsWith(ss))
				  
				  // if(title.get(j).text().startsWith(ss))
				  
				  //if(title.get(j).text().contains(ss))
				  {
					
				    System.out.println(title.get(j).text()); 
				
				    
				    /*
				     *  실제찾기 => contains()
				     *  자동완성(서제스트) => startsWith()
				     */
				}
			  }
			}
			
		} catch (Exception ex) {
		}
	}

	public static void main(String[] args) {

		MainClass2 m=new MainClass2();
		Scanner scan=new Scanner(System.in);
		System.out.print("검색어:");
		String ss=scan.next();
		m.find("ss");
		
	}

}
