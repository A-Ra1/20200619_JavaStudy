package com.sist.project2;

import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.border.TitledBorder;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.sist.project.MovieVO;

public class BestMovieManager {
	

	
	public void movieAllData() {
		
		try {
			
			ArrayList<MovieVO> list=new ArrayList<MovieVO>();
		
		
		
		String[] site={
				"https://editorial.rottentomatoes.com/guide/best-netflix-movies-to-watch-right-now/", // BEST MOVIES ON NETFLIX
				"https://editorial.rottentomatoes.com/guide/best-disney-movies-to-watch-now/", // THE 150 BEST MOVIES ON DISNEY
				"https://editorial.rottentomatoes.com/guide/best-movies-on-amazon-prime-right-now/", // 100 BEST MOVIES ON AMAZON PRIME
				"https://editorial.rottentomatoes.com/guide/best-movies-3-hours-or-longer-ranked/" // THE 95 BEST MOVIES 3 HOURS OR LONGER
				};
		
		
			
			int mno=501;
			int cno=4;
			
			for(int i=1; i<=2; i++) {
			Document doc=Jsoup.connect("https://editorial.rottentomatoes.com/guide/best-movies-3-hours-or-longer-ranked/").get();
			Elements link=doc.select("h2 a");
			
			
			
			for(int j=0; j<link.size(); j++) {
				
			
			Elements title=doc.select("h2 a");
			System.out.println(title.get(j).text());
			
			Elements regyear=doc.select("span.subtle"); // 菊第褒龋力芭
			System.out.println(regyear.get(j).text());
			
			Elements score=doc.select("span.tMeterScore");
			System.out.println(score.get(j).text());
			
			Elements actor=doc.select("div.cast"); // "Starring:" 力芭 
			System.out.println(actor.get(j).text());
			
			Elements critics=doc.select("div.critics-consensus"); // "Critics Consensus:"力芭
			System.out.println(critics.get(j).text());
			
			Elements poster=doc.select("a.article_movie_poster img");
			System.out.println(poster.get(j).attr("src"));
			
			Elements story=doc.select("div.synopsis"); //"Synopsis:, [More]" 力芭
			System.out.println(story.get(j).text());
			
			
			
			
			//	System.out.println(link.get(j).attr("href"));
				
				FileWriter fw=new FileWriter("c:\\javaDev\\Best_movie.txt",true);
				
				
				
//				String img=poster.get(j).attr("style");
//				img=img.substring(img.indexOf("(")+1,img.lastIndexOf(")"));
				
//				
//				String r=regyear.text();
//				r=r.substring(r.indexOf("("+1,r.lastIndexOf(")")));
//				
//				String a=actor.text();
//				a=a.substring(a.indexOf(":"+1));
//				
//				String c=critics.text();
//				c=c.substring(c.indexOf(":"+1));
//				
//				String s=story.text();
//				s=s.substring(s.indexOf(":"+1,s.lastIndexOf("[")));
////				.
				
				String data=mno+"|"+cno+"|"+title.get(j).text()+"|"+regyear.get(j).text()+"|"+score.get(j).text()+"|"
						+actor.get(j).text()+"|"+critics.get(j).text()+"|"+poster.attr("src")+"|"+story.get(j).text()+"\r\n";
//////						
//				String data=mno+"|"+cno+"|"+title.get(j).text()+"|"+r+"|"+score.get(j).text()+"|"
//						+a+"|"+c+"|"+poster.attr("src")+"|"+s+"\r\n";
				
				fw.write(data);
				fw.close();
				
				mno++;
			}
			}
			
		
	}
		catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {

		 // 按眉积己 
		BestMovieManager m=new BestMovieManager();
		m.movieAllData();
		
		
	}

}
