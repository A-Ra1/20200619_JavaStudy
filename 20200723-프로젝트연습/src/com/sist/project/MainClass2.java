package com.sist.project;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MainClass2 {

	
public void find (String ss){
	
	 	MovieVO[] movies=new MovieVO[1];
		
		try {
			
			Document doc=Jsoup.connect("https://movie.naver.com/movie/sdb/rank/rmovie.nhn?sel=cur&date=20200722").get();
			Elements link=doc.select("div.tit5 a");
			
			int j=0;
			for(int i=0; i<50; i++) {
				
				Document doc2=Jsoup.connect("https://movie.naver.com"+link.get(j).attr("href")).get();
				Element title=doc2.selectFirst("h3.h_movie a");
				System.out.println(title.text());
				
				j++;
			}
			
		} catch (Exception e) {

		}

	
}
	
	public static void main(String[] args) {

		
		MainClass2 m=new MainClass2();
		m.find("");
	}

}
