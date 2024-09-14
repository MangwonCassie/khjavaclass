package com.kh.chap04_assist.part02_object.model.vo;

import java.io.Serializable;

//Serializable : 직렬화를 하겠다고 선언 (따로 구현할 메소드 없음)
public class Phone implements Serializable{
	private String name;
	private String brand;
	private int price;
	
	public Phone() {
		super();
	}
	public Phone(String name, String brand, int price) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Phone [name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	
	
}
