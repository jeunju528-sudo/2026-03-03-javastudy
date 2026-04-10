package com.sist.collection;

import java.io.*;
import java.util.*;

class Data {
    // 1. 변수 선언은 클래스 바로 아래에 두는 게 맞습니다!
    Map<String, String> fData = new HashMap<String, String>();

    // 🛠️ 핵심 해결책: 로직을 담을 '생성자' 방을 만들어줍니다.
    public Data() { 
        try {
            FileReader fr = new FileReader("C:\\javadev\\string.txt");
            String data = "";
            int i = 0;
            
            while ((i = fr.read()) != -1) {
                data += (char) i;
            }
            fr.close();
            
            System.out.println(data);
            String[] datas = data.split("\n");
            
            for (String s : datas) {
                // 한 줄(s)을 콜론(:)을 기준으로 쪼갭니다.
                StringTokenizer st = new StringTokenizer(s, ":");
                
                // 🛠️ 수정 2, 3: fData -> map으로 수정하고, put에 key와 value 2개를 넣습니다!
                // (안전장치: 쪼갠 토큰이 2개 이상일 때만 넣도록 if문을 걸어주면 에러를 방지할 수 있습니다)
                if (st.countTokens() >= 2) {
                    String key = st.nextToken();
                    String value = st.nextToken();
                    fData.put(key, value);
                }
            }
        } catch (Exception e) {
            // 에러가 났을 때 아무것도 안 적어두면 원인을 찾기 힘드니, 아래 코드를 꼭 넣어두는 습관을 들이세요!
            e.printStackTrace(); 
        }
    } // Data() 생성자 닫기
} // Data 클래스 닫기 (🛠️ 수정 4: 잉여 중괄호 제거)

public class Collection_11 {
    public static void main(String[] args) {
        // new Data()를 하는 순간, 위에서 만든 Data() 생성자 안의 코드가 쫙~ 실행됩니다!
        Data data = new Data(); 
        
        Scanner sc = new Scanner(System.in);
        System.out.print("과일명 입력 : ");
        String f = sc.next();
        if(data.fData.containsKey(f)) {
        	String en = data.fData.get(f);
        	System.out.println(f+"에 대한 영어는 "+en);
        }else {
        	System.out.println("영어사전에 존재하지 않습니다.");
        }
        
    }
}