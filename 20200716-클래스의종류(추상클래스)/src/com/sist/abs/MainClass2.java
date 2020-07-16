package com.sist.abs;
/*
 *  게시판
 *    => 답변형 게시판 => 답변하기
 *    => 댓글형 게시판 => 댓글달기
 *    => 갤러리 게시판 => 업로드
 *    => 자료실 	   => 업로드, 다운로드
 *    
 *  글쓰기
 *  내용보기
 *  수정 
 *  삭제 
 *  찾기
 *  ========   추상클래스, 인터페이스  
 */
abstract class Board{
	
	public abstract void write(); // 게시판마다 기능이 다르기 때문에 선언만 완료
	public abstract void content();
	
	// 다른 기능 추가가 가능하다
    // Board가 가진 기능을 재정의 가능
	
	public void update() {
		
		System.out.println("게시물 수정");
	}
		
	public void delete() {
		
		System.out.println("게시물 삭제");
	}
	 	
	public void find () {
		
		System.out.println("게시물 찾기");
	}

}

// 상속
class ReplyBoard extends Board{

	@Override
	public void write() {
		
		System.out.println("답변형 게시판 글쓰기");
	}

	@Override
	public void content() {
		
		System.out.println("내용보기");
	}
	
}
class DataBoard extends Board{

	@Override
	public void write() {
		
		System.out.println("글쓰기+업로드");
	}

	@Override
	public void content() {
		
		System.out.println("내용보기+다운로드");
	}
	
}
class GalleryBoard extends Board{

	@Override
	public void write() {
		
		System.out.println("글쓰기+이미지업로드");
	}

	@Override
	public void content() {
		
		System.out.println("내용보기+이미지출력 => 후기게시판");
	}
	
}
class ReplayBoard2 extends Board{

	@Override
	public void write() {
		
		System.out.println("글쓰기");
	}

	@Override
	public void content() {
		
		System.out.println("내용보기+댓글");
	}
	
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=====답변형게시판=====");
		Board b=new ReplyBoard();
			b.write();
			b.content();
			
		System.out.println("=====갤러리게시판=====");
		b= new GalleryBoard();
			b.write();
			b.content();
			
		System.out.println("=====자료실=====");
		b= new DataBoard();
			b.write();
			b.content();
			
		System.out.println("=====댓글형게시판=====");
		b= new ReplayBoard2();
			b.write();
			b.content();
	}

}
