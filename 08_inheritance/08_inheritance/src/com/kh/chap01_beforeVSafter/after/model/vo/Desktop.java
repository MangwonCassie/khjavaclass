package com.kh.chap01_beforeVSafter.after.model.vo;

public class Desktop extends Product{
	private boolean allInOne;
	
	
	public Desktop(String brand,String pCode,String pName,int price,boolean allInOne) {
		super(brand,pCode,pName,price); //부모클래스에 있는 필드 초기화 구문(부모생성자사용)
		this.allInOne = allInOne; //나머지 나의 필드 초기화
	}
	
	
	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	@Override
	public String inform() {
		return super.inform()+",올인원 여부 : "+allInOne;
	}
	
}
