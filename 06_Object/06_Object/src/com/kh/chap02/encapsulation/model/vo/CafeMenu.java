package com.kh.chap02.encapsulation.model.vo;

public class CafeMenu {
	
	private String name;
	private String kind;
	private int price;
	private boolean event;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setKind(String kind) {
		this.kind=kind;
	}
	public String getKind() {
		return kind;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setEvent(boolean event) {
		this.event = event;
	}
	public boolean getEvent() {
		return event;
	}
	
	//출력문 메소드 
	public void print() {
		System.out.println(name+"\t"+kind+"\t"+price+"\t"+event);
	}
	
	//문자열 반환 메소드  (행사여부에 따라 문자 O/X 로 바꿔서 반환해보기)
	public String info() {
		char ox =' ';
		if(event) {//행사를 한다
			ox = 'O';
		}else {
			ox = 'X';
		}
		return name+"\t"+kind+"\t"+price+"\t"+ox;
	}
	
	
	
	

}
