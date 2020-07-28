package com.sist.project;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import sun.applet.Main;

public class MainClass {

	public void find (String ss){
		
		try {
			
			Document doc=Jsoup.connect("https://movie.naver.com/movie/sdb/rank/rmovie.nhn?sel=cur&date=20200722").get();
			Elements link=doc.select("div.tit5 a");
			
			int j=0;
			for(int i=0; i<50; i++) {
				
				Document doc2=Jsoup.connect("https://movie.naver.com"+link.get(j).attr("href")).get();
				Element title=doc2.selectFirst("h3.h_movie a");
				System.out.println(title.text());
				
				Element genre=doc2.selectFirst("p.info_spec");
				System.out.println(genre.text());
			}
			
		} catch (Exception e) {
//			
//			MainClass m=new MainClass();
//			m.find("");
		}

		
	  
	}

}
