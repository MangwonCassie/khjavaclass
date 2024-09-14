package com.kh.chap02_abstract.model.vo;

public abstract class Animal {
	
	//부모클래스에 있는 기능이 형식만 필요하고 내부 코드는 실행되지 않을때 또는
	//실행되지 않아도 될때 마치 규칙의 용도로 메소드를 사용한다면?
	//메소드의 구현부가 있을 필요가 없어진다(몸통) 
	//이때 사용하는 형식이 미완성 메소드 (추상메소드) 이다.
	//형식만 갖춰놓은 채로 규칙의 용도로 사용한다.
	//상속받은 자식클래스에서 미완성 메소드를 완성시켜준다.
	
//	public void crying() {
//		System.out.println("동물의 울음소리");
//	}
	public abstract void crying(); //몸체 없는 미완성 메소드
	
//	public void drinking() {
//		System.out.println("동물의 물먹기");
//	}
	public abstract void drinking();
	
	public void run() {
		System.out.println("달리기");
	}
	
	public abstract void eat();
	
}
