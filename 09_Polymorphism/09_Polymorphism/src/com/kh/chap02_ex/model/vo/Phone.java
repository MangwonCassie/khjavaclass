package com.kh.chap02_ex.model.vo;

public abstract class Phone {
	
	private String name;
	private int price;
	
	public abstract void call();
	
	public abstract void sms();
	
	public abstract void camera();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
