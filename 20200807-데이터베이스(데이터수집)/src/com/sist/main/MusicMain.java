package com.sist.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.sist.dao.MusicDAO;
import com.sist.dao.MusicVO;

public class MusicMain {

	public static void main(String[] args) {

		MusicDAO dao=new MusicDAO();
		
		try {
			
			int k=1;
			
			for(int i=1; i<=4; i++) {
				
				Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20200807&hh=09&rtm=Y&pg="+i).get();
//				System.out.println(doc);
				
				Elements title=doc.select("td.info a.title");
				Elements singer=doc.select("td.info a.artist");
				Elements album=doc.select("td.info a.albumtitle");
				Elements poster=doc.select("a.cover img");
				Elements temp=doc.select("span.rank");
				
				for(int j=0; j<title.size(); j++) {
					
					System.out.println("¼øÀ§:"+k);
					System.out.println("³ë·¡¸í:"+title.get(j).text());
					System.out.println("°¡¼ö¸í:"+singer.get(j).text());
					System.out.println("¾Ù¹ü¸í:"+album.get(j).text());
					System.out.println("Æ÷½ºÅÍ:"+poster.get(j).attr("src"));
//					System.out.println("»óÅÂ:"+temp.get(j).text());
					String str=temp.get(j).text();
					String idcrement="";
					String state="";	
					if(str.equals("À¯Áö")) {
						
						idcrement="0";
						state="À¯Áö";
					}
					else if (str.equals("new")) {
						
						idcrement="0";
						state="new";
					}
					else {
						
						idcrement=str.replaceAll("[^0-9]", ""); // ¼ýÀÚ¸¦ Á¦¿ÜÇÏ°í ³ª¸ÓÁö´Â °ø¹é
						state=str.replaceAll("[^°¡-ÆR]", ""); // ÇÑ±ÛÀ» Á¦¿ÜÇÏ°í ³ª¸ÓÁö´Â °ø¹é
					}
					System.out.println("»óÅÂ:"+state);
					System.out.println("µîÆø:"+idcrement);
				//	System.out.println("µ¿¿µ»ó Å°:"+youtubeKeyData(title.get(j).text()));
					System.out.println("===========================================");
					
					MusicVO vo=new MusicVO();
					vo.setMno(k);
					vo.setTitle(title.get(j).text());
					vo.setSinger(singer.get(j).text());
					vo.setAlbum(album.get(j).text());
					vo.setPoster(poster.get(j).attr("src"));
					vo.setState(state);
					vo.setIdcrement(Integer.parseInt(idcrement));
					vo.setKey(youtubeKeyData(title.get(j).text()));
					
					dao.musicInsert(vo);
					
					Thread.sleep(100);
					
					k++;
				}
			}
		} catch (Exception e) {
		}
		 
		// youtubeKeyData("´Ù½Ã ¿©±â ¹Ù´å°¡");
	}
	
	public static String youtubeKeyData(String title) {
		
		String key="";
		
		try {
			
			Document doc=Jsoup.connect("https://www.youtube.com/results?search_query="+title).get();
			Pattern p=Pattern.compile("/watch\\?v=[^°¡-ÆR]+"); // '?' °Ë»ö½Ã \\ Ã·ºÎ
			Matcher m=p.matcher(doc.toString()); // doc ¾È¿¡¼­ /watch?v=[^°¡-ÆR] À» Ã£±â
			
			while (m.find()) {
				///watch?v=ESKfHHtiSjs"
				//System.out.println(m.group());
				String str=m.group();
				str=str.substring(str.indexOf("=")+1,str.indexOf("\"")); 
				key=str;
				
				break;
			}
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		return key;
	}

}
