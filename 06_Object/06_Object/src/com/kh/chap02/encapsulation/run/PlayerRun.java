package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Player;

public class PlayerRun {

	public static void main(String[] args) {
		Player kim = new Player();
		kim.setName("김연아");
		kim.setGame("피겨스케이팅");
		kim.setGold(3);
		kim.setSilver(1);
		kim.setBronze(0);
		
		Player lee = new Player();
		lee.setName("이상화");
		lee.setGame("스피드스케이팅");
		lee.setGold(2);
		lee.setSilver(3);
		lee.setBronze(3);
		
		Player yun = new Player();
		yun.setName("윤성빈");
		yun.setGame("스켈레톤");
		yun.setGold(1);
		yun.setSilver(0);
		yun.setBronze(1);
		
		System.out.println("====출력문메소드 활용====");
		kim.information();
		lee.information();
		yun.information();
		
		System.out.println("====문자열 반환 메소드 활용=====");
		System.out.println(kim.info());
		System.out.println(lee.info());
		System.out.println(yun.info());
		
		
		
		
		
		
	}

}
