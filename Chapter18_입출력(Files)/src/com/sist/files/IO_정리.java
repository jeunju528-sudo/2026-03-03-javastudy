package com.sist.files;
/*
 * 18장
 * IO : 데이터의 흐름 관리 (통로)
 * --- 데이터 흐름(Stream)=>  데이터 이동 공간
 * --- IO는 기본적으로 단방향, 입력과 출력을 동시에 하려면 쓰레드를 사용해야함
 * --- ex) 카톡
 *      1. 서버로 메세지 전송 (입력내용을 서버로) output
 *      2. 화면에 출력 (서버에서 화면으로) input
 * 사용처
 * ----
 *   파일 읽기/쓰기 => 파일 이동 / 텍스트 변경 / 설정 파일
 *   네트워크 통신(주고/받기) : 서버와 클라이언트 통신
 *   사용자 입력 => 콘솔에서 값 받을 때
 *   => InputStream =====> HttpServletRequest
 *   => OutputStream ====> HttpServletResponse
 *   -------------- 오라클 : PreparedStatement
 *   
 *  주요 글래스
 *   InputStream : 읽기
 *        |
 *   FileInputStream (1byte 씩 전송)
 *   BufferedInputStream
 *   
 *   OutputStream : 쓰기
 *        |
 *   FileOutputStream
 *   BufferedOutputStream
 *   
 *   Reader : 읽기
 *      |
 *   FileReader (2byte 씩 전송)
 *   BufferedReader : 크롤링 => Jsoup
 *   
 *   Writer : 쓰기
 *      |
 *   FileWriter
 *   BufferedWriter
 *   
 *   ObjectInputStream / ObjectOutputStream
 *     
 *     
 *   Files : java.nio.*;
 *   => 대부분이 static 메소드로 만들어져있다. Files.
 *   => 주요기능
 *     exists(경로명) : 파일 존재여부 확인
 *     createFile(경로명) : 새파일 생성
 *     createDirectory(경로명) : 폴더 생성 
 *     delete(경로명) : 파일 삭제
 *     readAllLine(경로명) : 모든 줄을 List<String>으로 읽음
 *     write(경로명, content) : 파일 쓰기
 *     copy(source, target)
 *     move() : 파일 이동
 *     size() : 파일 크기
 *     list() : 파일 목록 출력
 *     -----------------------------------
 *     경로명 => Paths => Path 객체 생성후에 사용
 *             ---------------------------
 *             파일이나 폴더를 찾기위한 정보를 가지고 있는 클래스
 *             
 * */

import java.nio.file.*;
import java.io.*;
import java.util.*;

public class IO_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. path 생성
		Path filePath = Paths.get("C:\\javadev\\고객2.txt");
		Path dirPath = Paths.get("C:\\javadev2");
		
		try {
			// 1. 파일 생성
			if(!Files.exists(filePath)) {
				Files.createFile(filePath);
				System.out.println("파일 생성 완료");
			}
			// 2. 폴더 생성
			if(!Files.exists(dirPath)) {
				Files.createDirectories(dirPath);
				System.out.println("디렉터리 생성 완료");
			}
			// 3. 파일쓰기
			String content = "Files 클래스는 파일관련 제어, File 클래스 확장";
			Files.write(filePath, content.getBytes());
			System.out.println("파일 쓰기 완료");
		
			// 4. 파일 읽기 : FileInputStream 대신
			Path custFile = Paths.get("C:\\javadev\\고객.txt");
			List<String> data = Files.readAllLines(custFile);
			data.stream().forEach(s->System.out.println(s));
			
			//5. 파일 복사
			Path copyFile = Paths.get("C:\\javadev\\고객2.txt");
			Files.copy(custFile, copyFile, StandardCopyOption.REPLACE_EXISTING); // REPLACE_EXISTING: 존재하는 것 전체를 복사
			System.out.println("파일 복사 완료");
			
			//6. 파일 이동 (이름 변경)
			Path moveFile = Paths.get("C:\\javadev2\\고객3.txt");
			Files.move(copyFile, moveFile, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("파일 이동 완료 / 파일명 변경");
			
			//7. 파일 삭제
			Path delDir = Paths.get("C:\\javadev2");
			Files.delete(moveFile);
			Files.delete(moveFile);
			Files.delete(dirPath); // 디렉토리 삭제 전 안에 있는 파일을 다 지워야 가능
			System.out.println("디렉토리 삭제");
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
