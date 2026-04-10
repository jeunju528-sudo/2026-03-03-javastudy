package com.sist.inner;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

// 데이터형
class Movie {
	private String name;
	private String director;
	private String genre;
	private String grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
class DataCollection {
	private static List<Movie> mList = new ArrayList<Movie>();
	static { //초기화 
		try {
			Document doc = Jsoup.connect("https://www.kobis.or.kr/kobis/business/main/searchMainDailyBoxOffice.do").get();
//			System.out.println(doc.toString());
			String data = doc.toString();
			data = data.substring(data.indexOf("["),data.lastIndexOf("]")+1);
//			System.out.println(data);
			JSONParser jp = new JSONParser();
			JSONArray arr = (JSONArray)jp.parse(data);
			for(int i=0; i<arr.size();i++) {
				// {} json object 가져옴
				JSONObject obj = (JSONObject)arr.get(i);
				Movie m = new Movie();
				m.setName((String)obj.get("movieNm"));
				m.setDirector((String)obj.get("director"));
				m.setGenre((String)obj.get("genre"));
				m.setGrade((String)obj.get("watchGradeNm"));
				mList.add(m);
			}
//			System.out.println(arr.toJSONString());
			
			
			/*
			 * searchMainDailyBoxOffice.do
			 * searchMainRealTicket.do
			 * searchMainDailySeatTicket.do
			 * [] : list
			 * {} : 객체
			 * {"startDate":"2026년 04월 08일(수)","endDate":"2026년 04월 08일(수)","totcnt":99,"watchGradeNm":"15세이상관람가",
			 * "movieCd":"20254121","showDt":"20260408","fileSaveLoct":"/common/mast/movie/2026/02/",
			 * "orgnFileNm":"[????]1st_po_02.jpg","sysFileNm":"0cead0eb683341f5810aecbaa2d0dded.jpg",
			 * "movieNm":"살목지","movieNmEn":"Salmokji : Whispering Water","openDt":"20260408","totSeatCntRatio":" 29.0",
			 * "totSeatAmtRatio":" 17.6","totSeatCnt":511267,"rank":1,"repNationCd":"한국","movieType":"장편","moviePrdtStat":"개봉",
			 * "genre":"공포(호러),스릴러","thumbUrl":"/common/mast/movie/2026/02/thumb/thn_0cead0eb683341f5810aecbaa2d0dded.jpg",
			 * "showTm":"95","showTs":"14","prdtYear":"2025","indieYn":null,"artmovieYn":null,"multmovieYn":null,"director":"이상민",
			 * "prNm":"더램프(주)","dtNm":"(주)쇼박스","rankInten":36,"rankOldAndNew":"OLD","rownum":1}
			 * */
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	class DataManager { // 이렇게 쓰면 두 클래스 동시에 작동 가능
		public void movieList() {
			mList.stream().forEach(m->System.out.println(m.getName()+", "+m.getDirector()+", "+m.getGenre()+", "+m.getGrade()));
		}
	}
	public void movieList() {
		DataManager dm = new DataManager();
		dm.movieList();
	}
}
public class 내부클래스_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataCollection dc = new DataCollection();
		dc.movieList();
	}

}
