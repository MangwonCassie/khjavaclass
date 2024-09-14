package com.kh.chap04_constructor.model.vo;



public class Singer {
	//좋아하는 가수의 이름과 대표곡(추천곡),데뷔일  세 필드를 선언하고 getter/setter
	//기본생성자,매개변수 생성자 
	//출력메소드 또는 전체 문자열 반환메소드를 작성하여 출력해보세요.
	
	//필드부 
	private String name;
	private String song;
	private String enrollDate;
	
	//생성자부
	/*
	 * this() : 내부 생성자 호출 구문
	 * 주의사항 - 가장 위에 작성해야한다.
	 * 만약 매개변수 생성자가 있다면 
	 * 더 작은 범위에 생성자에서 this()로 호출하여 필요한 값은 전달값으로 
	 * 초기화하고 나머지 값은 기본값으로 초기화 해준다.
	 * 
	 * */
	
	
	//기본생성자
	public Singer() {
		System.out.println(this);
	}
	//매개변수 생성자 - 이름만 초기화
	
	public Singer(String name) {
		this(name,null,null);//this() 생성자 구문이 생성자코드에서 가장 위에있어야한다.
//		this.name=name;
	}
	//이름과 노래
	public Singer(String name,String song) {
		this(name,song,null); //매개변수 3개짜리 생성자를 내부호출 
//		this.name=name;
//		this.song=song;
	}
	//이름과 노래와 데뷔일까지
	public Singer(String name,String song,String enrollDate) {
		this.name=name;
		this.song=song;
		this.enrollDate=enrollDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public String getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}

	@Override
	public String toString() {
		return "Singer [name=" + name + ", song=" + song + ", enrollDate=" + enrollDate + "]";
	}
	
	/*
	public Singer(String name) {
		this.name=name;
	}
	//이름과 노래
	public Singer(String name,String song) {
		this(name);
		this.song=song;
	}
	//이름과 노래와 데뷔일까지
	public Singer(String name,String song,String enrollDate) {
		this(name,song);
		this.enrollDate=enrollDate;
	}
	*/
	//메소드부
	
	
	
	
	
	
	
}
