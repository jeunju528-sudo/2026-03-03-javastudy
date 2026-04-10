package com.sist.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.util.*;
public class URL_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String num = "1234";
			boolean chk = num.contains("3");
			System.out.println(chk);
			
			
			Scanner sc = new Scanner(System.in);
			System.out.print("검색어 입력 : ");
			String fd = sc.next();
			System.out.println(URLEncoder.encode(fd, "UTF-8"));
			String u = "https://www.10000recipe.com/recipe/list.html?q="+URLEncoder.encode(fd, "UTF-8");
//			URL url = new URL("https://www.10000recipe.com/index.html");
			URI uri = new URI(u);
			URL url = uri.toURL();
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			if(conn!= null) { // site에 연결되었을때
				BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				while(true) {
					String line = in.readLine();
					if(line==null) {
						break;
					}
					System.out.println(line);
				}
				
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
