package com.sist.data;

// �����Ͱ���

import java.util.*;
import java.io.*;
/*
 *  ���α׷� �ۼ�
 *  = ���� : �и��� �� ���� => ��ü�� ������ ����
 *    = 1. ��ü ������ �о �и� => �޸𸮿� ����
 *    								  ------ ArrayList
 *    		FileReader
 *    	    StringTokenizer, split
 *      2. �޸𸮿��� ���� 
 *  = ����Ŭ : �и��� �Ǿ� �ִ� ����
 *     = �ʿ�ø��� ����Ŭ�� ���� => �޼ҵ� �ȿ��� ó��+
 */

public class MovieManager {
	
	// ����������
	
	private static ArrayList<MovieVO> list=new ArrayList<MovieVO>();
	
	// ��� �ڹ����Ͽ��� �������� ��� => �ݵ�� static ���
	
	// ���α׷� ���� => ������ ���� => ArrayList�� ���� �� ����
	
	static {
		
		try {
			/*
			 *  ���� �б� =>
			 *    1. �ѱ��ھ� �д� ��� => read()
			 *    	FileInputStream
			 *    	FileReader
			 *    2. ���پ� �д� ��� => readLine()
			 *      ��ü �����͸� �ӽ��������[BufferedReader]�� ���� �� ���
			 *      			 
			 */			

			// ����� ���� �б�
			FileInputStream fr=new FileInputStream("c:\\javaDev\\daum_movie.txt");
			
			// �޸𸮿� ��ü �����͸� ��Ƽ� ����
			BufferedReader in=new BufferedReader(new InputStreamReader(fr));
			while(true) {
				
				String movie=in.readLine(); // readLine() => \n
				if(movie==null) break; // ���� => ������ �� ���� ���
				
				StringTokenizer st=new StringTokenizer(movie,"|");
				
				while(st.hasMoreTokens()) {
					
					MovieVO vo=new MovieVO();
					vo.setMno(Integer.parseInt(st.nextToken()));
					vo.setCno(Integer.parseInt(st.nextToken()));
					vo.setTitle(st.nextToken());
					vo.setPoster("http:"+st.nextToken());
					String score=st.nextToken();
					score=score.substring(score.indexOf("��")+1); //"����"�� �ڸ�
					vo.setScore(score.trim());
					vo.setDirector(st.nextToken());
					vo.setActor(st.nextToken());
					vo.setGenre(st.nextToken());
					String regdate=st.nextToken();
					regdate=regdate.substring(0,regdate.lastIndexOf("��")); //"����"�� �ڸ�
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
			
			if(i<10 && j>=pagecnt) { //j => for�� ���ư��� Ƚ��, i => 10���� �����ִ� ����
				
//				pagecnt => �����ϴ� ��ġ
				
				movies.add(vo);
				i++;
			}
			j++;
		}
		return movies;
	}
	
	public int movieTotalPage() {
		
		return (int)(Math.ceil(list.size()/10.0));
		
		// ceil => �ø� �޼ҵ�
	}
	
	// �󼼺���
	
	public MovieVO movieDatailData(int mno) {
		
		return list.get(mno-1);
	}
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("������:");
		int page=scan.nextInt();
		
		MovieManager m=new MovieManager();
		System.out.println(page+" page / "+m.movieTotalPage()+" pages");
		
		// ������ �б�
		
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
