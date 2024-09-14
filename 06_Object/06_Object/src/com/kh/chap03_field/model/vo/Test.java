package com.kh.chap03_field.model.vo;

public class Test {

	public static void main(String[] args) {
		
		//같은 패키지 내에서 접근해보기 
		FieldTest2 f2 = new FieldTest2();
		
		//public 어디서든 접근가능
		System.out.println(f2.pub);
		//protected 같은 패키지 내,다른패키지일시 상속관계시
		System.out.println(f2.pro);
		//default 같은 패키지 내
		System.out.println(f2.def);
		//private 해당 클래스 내부에서만 접근가능.
//		System.out.println(f2.priv);
		
		
	}
}
