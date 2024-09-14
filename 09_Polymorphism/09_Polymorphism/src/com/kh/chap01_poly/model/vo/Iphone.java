package com.kh.chap01_poly.model.vo;

public class Iphone extends Phone{
	
	public void siri() {
		System.out.println("시리야 불 좀꺼줘");
	}
	
	//부모클래스에 있는 camera 기능을 재정의 해보자
	@Override
	public void camera() {
		System.out.println("아이폰만의 감성샷");
	}
	
}
