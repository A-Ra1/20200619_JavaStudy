package com.sist.io;
/*
 *  IO 
 *  ==
 *   Input/Output
 *    저장/읽기
 *    1. 메모리 입출력
 *    2. 파일 입출력
 *    3. 네트워크 입출력
 *    
 *    => IO
 *       ==
 *        스트림 이용 => 데이터 통로 (정확한 전송 가능)
 *        단점 = 단방향 (입력, 출력 통로가 다르다)
 *        
 *        = 1byte (일반 파일)
 *          바이트 스트림
 *          	InputStream / OutputStream => 인터페이스
 *                업로드 	    다운로드
 *        = 2byte (문자를 읽을때) => 한글
 *          문자 스트림
 *          	***Reader  /  Writer (O) => 인터페이스
 *          
 *        = 객체 자체를 저장 : 직렬화*
 *          ================
 *          = ObjectInputStream
 *          = ObjectOutputStream
 *        
 *        = 속도를 빠르게 => Buffer
 *          ***BufferedInputStream
 *          BufferedOutputStream   
 *          
 *          ==> XML, JSON (별도로 파싱하는 방법이 따로 있다)
 *          
 *          ** 주의점
 *          1. 반드시 import java.io 사용
 *          2. 반드시 예외처리(CheckException)
 *          
 *          
 *          1. 파일 읽기
 *             =========
 *              FileInputStream (1byte) -> 한글이 있는 경우 깨진다
 *              FileReader (2byte) 
 *              =================
 *              1) 파일을 읽기
 *                 FileInputStream fis=new FileInputStream("절대 경로명")
 *                 										c:\\javaDev\\a.txt
 *                 
 *                 while(파일끝) ~ -1
 *                 {
 *                  출력
 *                 }
 *                 fis.close()
 *                 =========== finally
 *                 
 *               ** 데이터 읽기 방법
 *               1) 한글자 읽기
 *                int read() =>  글자번호
 *                   A => 65 => (char)i
 *               2) 여러개를 동시에 읽는 경우
 *                int read() => 읽은 바이트 리턴
 *                
 *               ** 데이터 저장(쓰기)
 *                FileOutputStream
 *                ================
 *                 write() => 한글자씩 저장
 *                 
 *           IO 
 *            = FileInputStream , FileReader
 *            = FileOutputStream, FileWriter
 *            = BufferedReader, BufferedWriter
 *            = ObjectInputStream / ObjectOutputStream
 *            = BufferedInputStream / BufferedOutputStream
 *            --------------------------------------------
 *            
 *                   데이터
 *                   ------
 *                    정형화된 데이터 : 오라클
 *                    반정형화된 데이터 : 구분은 되지만 필요없는 데이터도 존재
 *                    					  html, xml, json
 *                    비정형화 데이터 : 구분없음
 *                   
 *          
 */	
import java.io.*;

public class MainClass {

	public static void main(String[] args) {
		
		//FileInputStream fis=null; // 반드시 초기값부여, 선언만 먼저 (close사용하기 위해서)
		
		FileReader fis=null; // 한글이 포함된 파일을 읽어올때
		// 자바에서 저장 -> Ansi로 저장이 된다
		
		try {
			
			// 파일읽기
			 fis=new FileReader("c:\\javaDev\\news1.txt");
			//fis=new FileInputStream("c:\\javaDev\\news1.txt");
			// 파일을 읽어서 도스창에 출력
			int i=0; // 한글자씩 읽는다 => 한글자씩 가지고 온다, 문자번호
			while((i=fis.read())!=-1) { // -1 EOF 
			
				System.out.print((char)i);
			}
			
		} catch (Exception e) {
			
			// 에러처리
			System.out.println(e.getMessage());
		}
		finally {
			
			// 파일닫기
			try {
				
				fis.close(); // 예외처리 필요
				
			} catch (Exception e2) {
			}
		}
	}

}
