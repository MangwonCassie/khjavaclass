package com.kh.chap03_interface.model.vo;

//extends : 상속을 위한 키워드 
//- 클래스가 클래스를 상속받을때,인터페이스가 인터페이스를 상속받을때 

//implements : 구현을 위한 키워드(인터페이스를 구현한다) 
//-클래스가 인터페이스를 구현할때
//implements는 다중 구현이 가능하다
//왜? 어차피 어디서 받던 미완성이라 구현하는 클래스에서 재정의해서 쓸것이기 때문에.
//혼동의 여지가 없다.
//상속과 구현은 같이 할 수 있다.(상속은 단일 상속만 가능)
public class DramaActor extends Job implements Actor,Person {
	
	@Override
	public void cry() {
		System.out.println("오열하기");
	}
	
	@Override
	public void action() {
		System.out.println("안아프게 때리기");
	}
	
	@Override
	public void love() {
		System.out.println("사랑에 빠진 눈빛 연기하기");
	}

	@Override
	public void justice() {
		System.out.println("정의구현");
	}

	@Override
	public void eat() {
		System.out.println("밥묵자");
	}

	@Override
	public void run() {
		System.out.println("필사의 달리기");
	}
}
