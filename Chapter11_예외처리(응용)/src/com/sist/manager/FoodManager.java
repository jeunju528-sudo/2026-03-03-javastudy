package com.sist.manager;

import java.io.FileReader;

import com.sist.commons.Manager;
import com.sist.vo.FoodVO;

public class FoodManager implements Manager {
	public static FoodVO[] foods = new FoodVO[435];
	// 초기화 블럭은 throws를 사용할 수 없다.
	static {
		try {
			StringBuffer sb = new StringBuffer();
			int i = 0;
			FileReader in = new FileReader("c:\\javadev\\food.txt");
			while((i=in.read())!=-1) { // -1 : EOF(end of file) 파일의 끝까지 읽자
				sb.append((char)i);
			}
			in.close();
			String[] datas = sb.toString().split("\n");
			i = 0;
			
			for(String data : datas) {
				String[] s = data.split("\\|");
				FoodVO vo = new FoodVO();
				vo.setMno(Integer.parseInt(s[0]));
				vo.setName(s[1]);
				vo.setType(s[2]);
				vo.setPhone(s[3]);
				vo.setAddress(s[4]);
				vo.setScore(Double.parseDouble(s[5]));
				vo.setParking(s[6]);
				vo.setPoster(s[7]);
				vo.setTime(s[8]);
				vo.setContent(s[9]);
				vo.setTheme(s[10]);
				vo.setPrice(s[11]);
				foods[i] = vo;
				i++;
				
			}
			//System.out.println(sb.toString());
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Override
	public FoodVO[] foodList(int page) {
		// TODO Auto-generated method stub
		int j=0;	// 배열이 10개니까 10까지만 돌리겠다는 것
		int pageCnt = (page*10)-10;	//페이지의 시작점, 한 페이지당 10개씩 보여줌
		int row = 10;
		int total = foodTotal();
		if(total == page) {	//마지막 페이지인 경우 10개 미만의 수로 row수 정해줌
			row = foods.length%10;
		}
		FoodVO[] food = new FoodVO[row]; // 한 페이지당 10개씩 (마지막 페이지 제외)
		for(int i=pageCnt; i<pageCnt+row; i++) {	// i는 출력 시작위치
			food[j] = foods[i];
			j++;
		}
		return food;
	}
	@Override
	public FoodVO foodDetail(int no) {
		// TODO Auto-generated method stub
		
		return foods[no-1];
	}
	@Override
	public FoodVO[] foodSearch(String type, String fd) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public FoodVO[] foodFilter(String type) {
		// TODO Auto-generated method stub
		int row = 0;
		for(FoodVO vo : foods) {
			if(vo.getType().contains(type)) {
				row++;
			}
		}
		FoodVO[] food = new FoodVO[row];
		int i=0;
		for(FoodVO vo : foods) {
			if(vo.getType().contains(type)) {
				food[i] = vo;
				i++;
			}
		}
		return food;
	}
	@Override
	public int foodTotal() {	// 페이지 총 수
		// TODO Auto-generated method stub
		
		return foods.length/10+1;
	}
}
