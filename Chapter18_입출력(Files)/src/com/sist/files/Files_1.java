package com.sist.files;

import java.nio.file.*;

public class Files_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Path file = Paths.get("C:\\javadev\\고객.txt");
			System.out.println(file.toAbsolutePath()); // 파일명 포함 절대경로
			System.out.println(file.getFileName()); // 파일명
			System.out.println(file.getParent()); // 파일 앞 경로
			System.out.println(file.getRoot()); // Root 디렉토리 명
			
			long size = Files.size(file);
			System.out.println(size);
			
			Path dir = Paths.get("C:\\javadev");
			Files.list(dir).forEach(p->System.out.println(p.getFileName())); // javadev 아래 파일 목록 가지고 옴
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
