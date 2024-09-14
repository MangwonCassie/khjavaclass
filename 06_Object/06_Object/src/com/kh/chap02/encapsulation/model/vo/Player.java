package com.kh.chap02.encapsulation.model.vo;


public class Player {

	// 필드부
	private String name; // 이름필드
	private String game; // 종목필드
	private int gold; // 금메달 필드
	private int silver;// 은메달 필드
	private int bronze;// 동메달 필드

	// 생성자부

	// 메소드부
	// 이름필드 setter 메소드
	public void setName(String name) {
		this.name = name;
	}

	// 이름필드 getter 메소드
	public String getName() {
		return name;
	}

	// 종목필드 setter 메소드
	public void setGame(String game) {
		this.game = game;
	}

	// 종목필드 getter 메소드
	public String getGame() {
		return game;
	}

	// 금메달 setter 메소드
	public void setGold(int gold) {
		this.gold = gold;
	}

	// 금메달 getter 메소드
	public int getGold() {
		return gold;
	}

	// 은메달 setter 메소드
	public void setSilver(int silver) {
		this.silver = silver;
	}

	// 은메달 getter 메소드
	public int getSilver() {
		return silver;
	}

	// 동메달 setter 메소드
	public void setBronze(int bronze) {
		this.bronze = bronze;
	}

	// 동메달 getter 메소드
	public int getBronze() {
		return bronze;
	}
	
	//정보 출력 메소드
	public void information() {
		System.out.println("이름\t종목\t금메달\t은메달\t동메달");
		System.out.printf("%s\t%s\t%d\t%d\t%d\n",name,game,gold,silver,bronze);
	}
	//정보 문자열 반환 메소드 
	public String info() {
		return "이름 : "+name+",종목 : "+game+","
				 + "금메달 : "+gold+",은메달 : "+silver+",동메달 : "+bronze;
	}
	

}
