package com.kh.chap01_poly.model.vo;

public class Galaxy extends Phone{
	
	public void samsungPay() {
		System.out.println("삼성페이 결제");
	}
	
	@Override
	public void camera() {
		System.out.println("20배 광학줌샷");
	}
}
