package com.kh.music.model.compare;

import java.util.Comparator;

import com.kh.music.model.vo.Music;

//제목 오름차순 제목같으면 가수명 오름차순 정렬 클래스(실습문제 AscTitle클래스역할)
public class SortMusic implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		
		//제목 정렬 만약 제목이 같으면? 
		if(o1.getTitle().equals(o2.getTitle())) {
			//가수명으로 정렬
			return o1.getSinger().compareTo(o2.getSinger());
		}
		return o1.getTitle().compareTo(o2.getTitle());
	}
	
	

}
