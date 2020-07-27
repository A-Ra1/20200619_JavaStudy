package com.sist.io;
// 파일에 쓰기 => 회원가입, 댓글, 게시판
/*
 *  파일 => 저장- => ArrayList
 *  데이터 => ArrayList에 모아서 => 저장
 */

import java.io.*;

public class MainClass2 {

	public static void main(String[] args) {
		/*
		 *  파일입출력
		 *  ----------
		 *  r => read
		 *  w => write => create
		 *  a => append
		 * 
		 *  FileOutputStream(1byte)
		 *  생성자
		 *    new FileOutputStream ("경로명")
		 *    new FileOutputStream ("경로명",true/false) => false는 Default
		 *  FileWriter(2byte)
		 */
		//FileOutputStream fos=null;
		
		 FileWriter fos=null;
		try {
			
		//	fos=new FileOutputStream("c:\\javaDev\\temp.txt",true);
			
			fos=new FileWriter("c:\\javaDev\\temp.txt",true);
			
			 // true => 기존 파일의 내용을 덮어쓰지 말고 덧붙이기 
			String str="ABCDEFG";
			
			// \r\n ~ 다음줄 출력
			
//			fos.write('l'); // 1개씩만 저장가능
//			fos.write('m');
//			fos.write('n');
			
			fos.write(str+"\r\n");
			// 문자열을 바이트 배열로 변경할때 사용 => getBytes()
			System.out.println("저장완료");
			
		} catch (Exception e) {
			

			System.out.println(e.getMessage()); // 에러처리 
			
		}finally {
			
			// 파일 닫기
			// finally => 파일닫기, 서버닫기, 오라클 연결 해제
			try {
				fos.close();
			} catch (Exception e2) {
				
			}
			
		}
		
		
	}

}
