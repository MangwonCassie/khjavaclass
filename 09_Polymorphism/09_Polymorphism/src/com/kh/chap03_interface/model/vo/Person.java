package com.kh.chap03_interface.model.vo;

//사람이라면 있어야하는 기능 규칙
public interface Person {
	//인터페이스는 추상 메소드만 포함할 수 있다.
	/*public abstract*/void justice();
	void eat();
//	인터페이스에는 당연하게도 추상메소드만 올수있어서 메소드를 작성하면 추상메소드로 인식한다.
//	때문에 추상메소드를 표현하는 키워드 public abstract를 생략할 수 있다.
//	[표현법] 반환형 메소드명(매개변수); 
	void run();
//	public void ex() {
//		System.out.println("일반메소드");
//	}
}
