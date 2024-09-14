package com.kh.chap02_abstract.model.vo;


//추상클래스를 상속받고 추상 클래스에 있는 추상 메소드를 구현하지 않는 방법
public abstract class Monkey {
	
	public void normal() {
		System.out.println("일반 메소드다");
	}
	
	public abstract void test();
	
	
	
}
