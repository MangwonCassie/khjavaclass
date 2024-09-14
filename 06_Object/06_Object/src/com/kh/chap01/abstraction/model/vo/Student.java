package com.kh.chap01.abstraction.model.vo;

/*
 * 클래스의 구조
 * 
 * public class 클래스명{
 *  -필드부
 *  
 *  -생성자부
 *  
 *  -메소드부
 *  
 * }
 * 
 * 
 * */

//학생들을 추상화하여 만든 클래스 
public class Student {
	//[필드부]
	//접근제한자 자료형 필드명;
	
	//-접근제한자 : 이 필드에 접근할수있는 범위를 제한할 수 있다.
	// public > protected > default > private
	// 모든곳 	  > 상속과 같은패키지 > 같은패키지 > 내클래스만
	// 클래스 내에서 필드를 선언할땐 반드시 접근제한자를 작성해야한다.
	//접근제한자를 작성하지 않으면 default가 들어가는데 default 접근범위가 같은 패키지 내에 이다.
//	/*default*/String name; //이름을 담아놓을 변수(필드)
	public String name;
	public int age; //나이를 담아놓을 변수(필드)
	public char gender; //성별을 담아놓을 변수(필드)

	
	public void setName(String name) {
		//넘겨받은 데이터를 객체 필드에 초기화하겠다
		// this : 만들어진 현재 객체를 가르키는 키워드
		this.name=name;
	}
	
	
	
	
	//[생성자부]
	
	
	
	//[메소드부]
	
	
}





