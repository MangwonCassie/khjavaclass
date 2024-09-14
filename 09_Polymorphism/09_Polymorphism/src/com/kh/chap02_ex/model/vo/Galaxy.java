package com.kh.chap02_ex.model.vo;

public class Galaxy extends Phone {

	@Override
	public void call() {
		System.out.println("갤럭시 전화 따르릉");
	}

	@Override
	public void sms() {
		System.out.println("갤럭시 이모지 문자");
	}

	@Override
	public void camera() {
		System.out.println("갤럭시의 20배 광학줌");
	}

}
