package com.kh.chap01_ex.model.vo;

public class Desktop extends Product{
	//상수필드에 대해서는 getter/setter 메소드가 필요없다.
	public static final String CPU = "intel";
	private String graphic;
	
	public Desktop() {
		super();
	}

	public Desktop(String brand, String name, int price,String graghic) {
		super(brand, name, price);
		this.graphic=graghic;
	}

	public void setGraphic(String graphic) {
		this.graphic = graphic;
	}

	public String getGraphic() {
		return graphic;
	}

	@Override
	public String toString() {
		return "Desktop ["+super.toString()+",graphic=" + graphic + "]";
	}

	public String booting() {
		return "컴퓨터 부팅 띵";
	}
	
	
}
