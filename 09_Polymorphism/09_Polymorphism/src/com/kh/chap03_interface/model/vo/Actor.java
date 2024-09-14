package com.kh.chap03_interface.model.vo;

//추상 메소드를 포함한 클래스는 추상 클래스여야만 한다.
//public abstract class Actor {
//추상 메소드만 가지고 있다면 인터페이스로 만들어서 중복되는 구문을 생략하자.
public interface Actor{
	
	//어차피 자식클래스에서 재정의 될 메소드이기때문에 굳이 구현부를 만들어둘 필요가 없다.
	//단 해당 메소드는 있어야하기때문에 규칙의 용도로 추상 메소드화 시킨다.
	public abstract void cry();
	
	public abstract void action();
	
	public abstract void love();

}
