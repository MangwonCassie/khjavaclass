package com.kh.chap02_abstract.model.vo;

//미완성 클래스를 상속받은 클래스
//미완성 클래스에 있는 미완성 메소드를 구현하지 않는 방법 : 
//상속받은 클래스도 미완성 클래스로 만들면 된다.
//하지만 결국 객체를 생성하려면 누군가는 구현을 해야한다.
public abstract class Monkey2 extends Monkey{
	
	//미완성 메소드 추가해보기
	public abstract void mk2Test();
	
}
