package com.sist.project;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MainClass3 {
	
	public void find( ) {
	
		try {
			
			Document doc=Jsoup.connect("https://editorial.rottentomatoes.com/guide/best-netflix-movies-to-watch-right-now").get();
			Element title=doc.selectFirst("h2 a");
			System.out.println(title.text());
			
		} catch (Exception e) {

		}
	}

	public static void main(String[] args) {

	MainClass3 m=new MainClass3();
	m.find();
	
	}

}
