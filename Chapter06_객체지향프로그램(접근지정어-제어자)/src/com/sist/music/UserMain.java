package com.sist.music;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenieMusicSystem gm = new GenieMusicSystem();
		
		while(true) {
			int m = gm.menu();
			if(m == 5) {
				System.out.println("뮤직 프로그램 종료");
				break;
			}
			else if(m == 1) {
				gm.musicList();
			}
			else if(m == 2) {
				Scanner sc = new Scanner(System.in);
				System.out.print("곡 번호 입력 : ");
				int no = sc.nextInt();
				gm.musicDetail(no);
			}
			else if(m == 3) {
				Scanner sc = new Scanner(System.in);
				System.out.print("검색어(곡명) 입력 : ");
				String fd = sc.next();
				gm.findTitle(fd);
			}
			else if(m == 4) {
				Scanner sc = new Scanner(System.in);
				System.out.print("검색어(가수) 입력 : ");
				String fd = sc.next();
				gm.findSinger(fd);
			}
		}

	}

}
