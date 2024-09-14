package com.kh.music.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.kh.music.model.compare.SortMusic;
import com.kh.music.model.vo.Music;

public class SortTest {

	public static void main(String[] args) {
		//컬렉션 정렬 방법에 대해 알아보자.
		//Collections.sort() 메소드를 활용해보자
		ArrayList<Integer> iList = new ArrayList<>();
		ArrayList<String> sList = new ArrayList<>();
		
		iList.add(15);
		iList.add(1);
		iList.add(66);
		iList.add(123);
		iList.add(32);
		
		sList.add("바람기억");
		sList.add("눈의 꽃");
		sList.add("잘부탁드립니다");
		sList.add("하루");
		sList.add("소주한잔");
		
		System.out.println(iList);
		System.out.println(sList);
		
		Collections.sort(iList);
		Collections.sort(sList);
		
		System.out.println("정렬 후 : "+iList);
		System.out.println("정렬 후 : "+sList);
		
		//내림차순 정렬
		//Collections.sort(List,Collections.reverseOrder())
		Collections.sort(sList,Collections.reverseOrder());
		
		//Collections.shuffle() : 랜덤으로 순서 섞어주기
		Collections.shuffle(sList);
		System.out.println("랜덤으로 순서 변경 : "+sList);
		
		Music m = new Music("하루","빅뱅");
		Music m1 = new Music("하루루","박효신");
		Music m2 = new Music("하루","김범수");
		Music m3 = new Music("하루","이승기");
		
		ArrayList<Music> ml = new ArrayList<>();
		
		ml.add(m);
		ml.add(m1);
		ml.add(m2);
		ml.add(m3);
		
		System.out.println(ml);
		
		//객체같은 경우에는 어떠한 기준으로 정렬을 해야하는지 알수 없기때문에 오류가 발생한다.
		Collections.sort(ml);
		//Collections.sort()메소드의 경우 내부적으로 compareTo() 메소드가 실행이되어 
		//정렬 기준을 설정한다
		
		System.out.println(ml);
		//compareTo 메소드를 오버라딩하면 기본 정렬기준이 정해지는것
		//만약 그때그때 정렬 기준을 다르게 하고 싶다면? 
		//Comparator를 구현하여 compare()메소드에 기준을 잡아준다.
		//익명객체(익명클래스) 생성과 동시에 정의하여 사용
		Collections.sort(ml,new Comparator<Music>(){
			@Override
			public int compare(Music o1, Music o2) {
				
				//제목 정렬 만약 제목이 같으면? 
				if(o1.getTitle().equals(o2.getTitle())) {
					//가수명으로 정렬
					return o1.getSinger().compareTo(o2.getSinger());
				}
				return o1.getTitle().compareTo(o2.getTitle());
				//내장되어있는게 돌아가는거임!, 오버라이드 된게 돌아가는게아니라
			}});
		
		System.out.println("Comparator 구현한 정렬 : "+ml);
		
		
		
		
		
		
		
	}

}
