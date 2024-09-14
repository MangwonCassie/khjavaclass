package com.kh.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.music.model.compare.DescSort;
import com.kh.music.model.compare.SortMusic;
import com.kh.music.model.vo.Music;

public class MusicController {
	
	private List<Music> list = new ArrayList<>();
	
	{
		list.add(new Music("바람기억","나얼"));
		list.add(new Music("눈의 꽃","박효신"));
		list.add(new Music("야생화","박효신"));
		list.add(new Music("하루","김범수"));
	}

	public int addList(Music music) {
		int result=0;
		//추가메소드 반환타입이 boolean : 추가성공시 true 실패시 false반환 
		boolean flag = list.add(music);
		
		//성공 실패 여부 확인 후 정수값 리턴하기 
		if(flag) {
			result++;
		}
		
		return result;
	}

	public int addAtZero(Music music) {
		int result=0;
		int count=0;
		//넘어온 music 객체가 null이 아니라면 추가해라
//		if(music!=null) {
//			list.add(0,music);
//			result++;
//		}
		//중복일경우 추가되지 않게 해보기
		for(int i=0;i<list.size();i++) {
			//리스트에 담긴 객체중에 넘겨받은 객체의 정보와 일치하는 객체가 있다면
			if(list.get(i).equals(music)) {
				//카운트 증가하여 판별하기
				count++;
			}
		}
		if(count>0) {//일치하는게 있다면 
			result=2; //2라는 정수를 넣어 view에서 판별하기
		}else {//일치하는게 없다면(즉,중복이 아니라면 추가하기)
			list.add(0, music);
			result=1;
		}
		return result;
	}

	public List<Music> printAll() {
		
		return list;
	}

	public Music searchMusic(String title) {
		//null로 먼저 초기화
		Music m = null;
		
		for(int i=0;i<list.size();i++) {
			//만약 제목이 일치하는 music객체가 있다면 music객체를 m에 담아주기 
			if(list.get(i).getTitle().equals(title)) {
				m = list.get(i);
				break;//찾았으니 반복 끝내기
			}
		}
		
		return m;
	}

	public Music removeMusic(String title) {
		//변수 초기화 해두기 
		Music m = null;
		
		for(int i=0;i<list.size();i++) {
			//만약 제목이 일치하는 music객체가 있다면 music객체를 삭제한 후 담아주기
			if(list.get(i).getTitle().equals(title)) {
				m = list.remove(i);//삭제와 동시에 삭제 객체 반환받기
				break;//찾았으니 반복 끝내기
			}
		}
		
		return m;
	}

	public Music setMusic(String title,Music music) {
		
//		Music m = searchMusic(title);//검색해보기 
		Music m = null;
//		if(m!=null) {
			for(int i=0;i<list.size();i++) {
				//검색해온 노래의 제목과 넘겨받은 제목이 일치하면 
				if(title.equals(list.get(i).getTitle())) {
					//해당 인덱스에 있는 music객체를 넘겨받은 music객체로 수정.
					m = list.set(i, music);
					break;
				}
			}
//		}
		return m;
	}

	//view로 그냥 넘기는 역할
	public int ascTitle() {
		
		int result=0;
		try {
			Collections.sort(list,new SortMusic());
			result++;
		}catch(Exception e) {
			result=0;
		}
		
		return result;
	}

	public int descSinger() {
		int result=0;
		
		try {
			Collections.sort(list, new DescSort());
			result++;
		}catch(Exception e) {
			result=0;
		}
		return result;
	}
}
