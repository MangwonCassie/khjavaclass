package com.kh.chap02_ex.model.vo;

public class Iphone extends Phone{

	@Override
	public void call() {
		System.out.println("아이폰의 전화걸기");
	}

	@Override
	public void sms() {
		System.out.println("아이폰의 부드럽게 보내기");
	}

	@Override
	public void camera() {
		System.out.println("아이폰 인물사진");
	}

}
