package com.kh.chap03_field.model.vo;

//클래스변수(static)와 상수필드 (static final)에 대해 알아보자 
public class FieldTest3 {

	//필드
	//[표현법] 접근제한자 예약어(생략가능)자료형 필드명;
	
	public static String sta = "static 변수";
	public String test ="이건 테스트";
	
	//생성시점 : 프로그램이 시작됨과 동시에 static영역에 할당된다.
	//소멸시점 : 프로그램 종료시
	//-객체를 생성하지 않아도 클래스 변수에 접근 가능하다 why? 프로그램 시작과 동시에 static메모리에 할당 되었기 때문에.
	
	//static은 공유의 성격이 강하다. 
	//프로그램 동작과 동시에 메모리 영역에 할당시키고 그 데이터를 공유해서 사용하는 개념
	
	/*
	 * 상수필드
	 * [표현법]
	 * public static final 자료형 상수필드이름 =값;
	 * -한번 지정된 값을 변경할 수 없기 때문에 처음 선언할때 초기화를 해두어야한다.
	 * 예약어의 순서는 상관없음 public final static 으로 해도 된다.
	 * static : 공유의 개념
	 * final : 한번 지정된 값을 변경할 수 없다.(상수)
	 * 
	 * 값이 변경되어서는 안되는 고정적인값을 메모리영역에 올려두고 공유하면서 사용할 목적으로 다룬다.
	 * 
	 * 주의) 상수필드 이름도 상수와 마찬가지로 모두 대문자로 작성한다. 
	 * 
	 * */
	
	public static final int NUM =10;
	public final static String STR = "불변";
	
	
	
	
	
	
	//static 예약어를 이용한 메소드
	public static void test1() {
		System.out.println("이건 객체 생성 안해도 쓸수 있지요.");
	}
	
	
	
	
	
	
	
}
