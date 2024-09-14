package com.kh.chap02_abstract.model.vo;

public class Tiger extends Animal{
	
	@Override
	public void drinking() {
		System.out.println("어흐응챱챱");
	}
	
	@Override
	public void crying() {
		System.out.println("타! 이거");
	}

	@Override
	public void eat() {
		System.out.println("와구와구");
	}
	
	
	
}
