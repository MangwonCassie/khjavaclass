package com.kh.chap04_constructor.model.vo;

public class CafeMenu {
	private String name;
	private String kind;
	private int price;
	private boolean event;
	
	
	//생성자부 
	//기본생성자
	public CafeMenu() {
	}
	//매개변수 생성자 - 이름만 초기화하는 매개변수 생성자
	public CafeMenu(String name) {
		this(name,null,0,false);
		this.name=name;
	}
	//이름과 종류를 초기화 하는 매개변수 생성자
	public CafeMenu(String name,String kind) {
		this(name,kind,0,false);
		this.name=name;
		this.kind=kind;
	}
	//이름과 종류와 가격을 초기화하는 매개변수 생성자
	public CafeMenu(String name,String kind,int price) {
		this(name,kind,price,false);
		this.name=name;
		this.kind=kind;
		this.price=price;
	}
	//필드 모두를 초기화 하는 매개변수 생성자 
	public CafeMenu(String name,String kind,int price,boolean event) {
		this.name=name;
		this.kind=kind;
		this.price=price;
		this.event=event;
	}
	
	
	
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
