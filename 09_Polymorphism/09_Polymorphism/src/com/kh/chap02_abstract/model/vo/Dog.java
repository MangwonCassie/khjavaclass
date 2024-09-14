package com.kh.chap02_abstract.model.vo;

public class Dog extends Animal{
	
	@Override
	public void crying() {
		System.out.println("왈왈 으르ㅜ르르르왈!");
	}
	@Override
	public void drinking() {
		System.out.println("춉춉");
	}
	@Override
	public void eat() {
		System.out.println("강아지 챠챠");
	}
}
