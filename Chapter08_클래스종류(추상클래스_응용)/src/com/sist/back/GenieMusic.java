package com.sist.back;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.sist.vo.*;

public class GenieMusic extends CommonsMusic {
	@Override
	public void init() {
		// TODO Auto-generated method stub
		try {
			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements title = doc.select("table.list-wrap a.title");
			Elements signer = doc.select("table.list-wrap a.artist");
			Elements album = doc.select("table.list-wrap a.albumtitle");
			Elements poster = doc.select("table.list-wrap a.cover img");
			Elements etc = doc.select("table.list-wrap span.rank");
			
			for(int i=0; i<title.size(); i++) {
				Music m = new Music();
				m.setMno(i+1);
				m.setTitle(title.get(i).text());
				m.setSinger(signer.get(i).text());
				m.setAlbum(album.get(i).text());
				m.setPoster(poster.get(i).attr("src"));
				String str = etc.get(i).text();
				String state = "";
				String id = "";
				if(str.equals("유지")) {
					state = "유지";
					id = "0";
				}
				else {
					state = str.replaceAll("[^가-힣]", "");
					id = str.replaceAll("[^0-9]", "");
				}
				m.setState(state);
				m.setIdcrement(Integer.parseInt(id));
				
				musics[i] = m;
			}
			
		} catch (Exception ex) {
			// TODO: handle exception
		}
	}
}
