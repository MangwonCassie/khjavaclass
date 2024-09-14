package com.kh.chap01_beforeVSafter.after.model.vo;

//부모 클래스 용도 필드,getter/setter/기본,매개변수생성자,toString
/*상속 
 * 매 클래스마다 중복된 필드,메소드들을 하나의 클래스(부모클래스)로 정의해서 
 * 해당 내용을 가져다 쓰는 개념 
 * */
//부모클래스 : 여러 클래스들의 공통점을 모아 하나로 정의한 클래스 
public class Product {
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	
	public Product() {
		super();
	}

	public Product(String brand, String pCode, String pName, int price) {
		super();
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	//정보 문자열 반환 메소드
	public String inform() {
		return "브랜드 : "+brand+",코드 : "+pCode+",제품명 : "+pName+",가격 : "+price;
	}
	
	
	
	@Override
	public String toString() {
		return "Product [brand=" + brand + ", pCode=" + pCode + ", pName=" + pName + ", price=" + price + "]";
	}
	
	
	
}
