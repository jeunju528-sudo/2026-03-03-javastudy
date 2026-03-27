package com.sist.back;

import com.sist.vo.Music;

public abstract class CommonsMusic {
	public static Music[] musics = new Music[50];
	public void init() {}
	public Music[] musicAllData() {
		return musics;
	}
}
