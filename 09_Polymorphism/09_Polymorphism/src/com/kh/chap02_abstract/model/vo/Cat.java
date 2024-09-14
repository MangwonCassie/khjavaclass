package com.kh.chap02_abstract.model.vo;

public class Cat extends Animal{
	@Override
	public void crying() {
		System.out.println("냐아아아옹!");
	}
	
	@Override
	public void drinking() {
		System.out.println("챱챱");
	}

	@Override
	public void eat() {
		System.out.println("고양이 욤뇸뇸");
	}
	
	
}
