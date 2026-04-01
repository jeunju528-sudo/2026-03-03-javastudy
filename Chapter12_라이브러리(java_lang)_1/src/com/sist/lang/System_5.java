package com.sist.lang;

public class System_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String osName = System.getProperty("os.name");
		System.out.println(osName);
		String userName = System.getProperty("user.name");
		System.out.println(userName);
		String userHome = System.getProperty("user.home");
		System.out.println(userHome);
		String javaHome = System.getProperty("java.version");
		System.out.println(javaHome);
	}

}
