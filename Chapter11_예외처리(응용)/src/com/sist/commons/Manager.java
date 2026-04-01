package com.sist.commons;

import com.sist.vo.FoodVO;

public interface Manager {
	//목록
	public FoodVO[] foodList(int page);
	public int foodTotal();
	//상세보기
	public FoodVO foodDetail(int no);
	//검색 > 주소, 음식종류, 맛집명
	public FoodVO[] foodSearch(String type, String fd);
	//필터링 > 한식, 중식, 양식, 일식, 분식
	public FoodVO[] foodFilter(String type);
}
