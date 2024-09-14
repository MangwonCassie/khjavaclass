package com.kh.chap01_beforeVSafter.after.model.vo;

//상속 표현법
//접근제한자 class 클래스명 extends 부모클래스명
public class Tv extends Product{
	private int inch;
	
	public Tv(String brand,String pCode,String pName,int price,int inch) {
		//부모클래스의 매개변수 생성자를 이용한 필드 초기화 
		super(brand,pCode,pName,price);
		/*부모클래스 setter메소드 이용
		super.setBrand(brand);
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrice(price);
		*/
		this.inch = inch;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}
	
	//부모클래스에 있는 기능을 재정의(overriding)하게되면 자식기능이 우선권을 갖는다.
	//Override라는 어노테이션이 없어도 사용 가능하지만 있을때 메소드명이 잘못된다면 알려준다.
	@Override //기능을 가진 주석개념 (annotation) 어노테이션 
	public String inform() {//내가(자식이)부모기능을 재정의 하겠다.
		return super.inform()+",인치 : "+inch;
	}

}
