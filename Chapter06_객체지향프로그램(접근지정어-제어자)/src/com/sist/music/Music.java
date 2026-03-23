package com.sist.music;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

// 데이터를 모아서 관리 => 데이터형 클래스 > 캡슐화
// MusicVO / MusicDTO / MusicEntity
// 데이터를 보호 / 데이터를 한번에 모아서 전송
@Data
public class Music {
	private int no;
	/* 특정 변수에만 만들고싶으면 변수위에 작성해주면 됨
	@Getter
	@Setter
	*/
	private String title;
	private String singer;
	private String album;
	private String state;
	private int idcrement;
	private String poster;
	
	
}
