package com.kh.chap01_ex.model.vo;

public class Tablet extends Product{
	
	private boolean pen;

	public Tablet() {
		super();
	}

	public Tablet(String brand, String name, int price,boolean pen) {
		super(brand, name, price);
		this.pen=pen;
	}

	public boolean isPen() {
		return pen;
	}

	public void setPen(boolean pen) {
		this.pen = pen;
	}

	@Override
	public String toString() {
		return "Tablet ["+super.toString()+",pen=" + pen + "]";
	}

	public String booting() {
		return "태블릿 부팅 띵";
	}
}
