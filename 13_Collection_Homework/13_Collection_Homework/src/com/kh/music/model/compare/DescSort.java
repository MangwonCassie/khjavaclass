package com.kh.music.model.compare;

import java.util.Comparator;

import com.kh.music.model.vo.Music;

//가수명 내림차순 클래스 
public class DescSort implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		//가수명 오름차순
//		return o1.getSinger().compareTo(o2.getSinger());
		//가수명 내림차순
		return o2.getSinger().compareTo(o1.getSinger());
		//아 이거는 그냥...원래 String compareTo 쓰는건가?
	}
	
	
}
