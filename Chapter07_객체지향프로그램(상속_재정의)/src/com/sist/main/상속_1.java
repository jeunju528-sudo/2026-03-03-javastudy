package com.sist.main;

import javax.swing.JFrame;

public class 상속_1 /*extends JFrame*/ {
//	public 상속_1() {
//		setSize(800,600);
//		setVisible(true);
//	}
	
	JFrame f = new JFrame();
	public 상속_1() {
		f.setSize(800,600);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 상속_1();	 // 생성자만 호출
	}

}
