package com.kh.chap03_interface.model.vo;

public class MovieActor implements Actor {
	
	@Override
	public void cry() {
		System.out.println("몰래 울기");
	}
	
	@Override
	public void action() {
		System.out.println("있는 힘껏 때리기");
	}
	
	@Override
	public void love() {
		System.out.println("사랑에 빠진척 연기하기");
	}
}
