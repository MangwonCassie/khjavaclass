package com.kh.chap02.encapsulation.model.vo;

public class GameCharacter {

	private String nick;
	private String job;
	private int level;
	private int price;
	
	public void setNick(String nick) {
		this.nick=nick;
	}
	public String getNick() {
		return nick;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	public String getJob() {
		return job;
	}
	//레벨을 초기화하는 메소드인 setLevel 메소드에 조건을 걸어
	//잘못 된 레벨이 들어오면 변경하지 않게 작성해보기. 0보다 커야함.
	public void setLevel(int level) {
		if(level>0) {//만약 넘어온 데이터가 0보다 크다면?
			this.level = level;//필드에 대입해라 
		}else {
			System.out.println("0보다 큰수를 입력하셔야합니다.");
		}
	}
	public int getLevel() {
		return level;
	}
	
	public void setPrice(int price) {
		if(price>0) {
			this.price=price;
		}else {
			System.out.println("소지금은 0원보다 커야합니다.");
		}
	}
	
	public int getPrice() {
		return price;
	}
	
	public void print() {
		System.out.printf("%s,%s,%d,%d\n",nick,job,level,price);
	}
	
	public String info() {
		return nick+","+job+","+level+","+price;
	}
	
	

}
