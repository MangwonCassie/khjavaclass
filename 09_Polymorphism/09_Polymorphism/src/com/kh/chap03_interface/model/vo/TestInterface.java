package com.kh.chap03_interface.model.vo;

/*
 * 인터페이스
 * [표현법]
 * 접근제한자 interface 인터페이스명{
 * 	상수필드;
 * 	추상메소드;
 * }
 * 
 * -상수 필드와 추상 메소드만으로 이루어진 추상 클래스의 변형체
 * -인터페이스에서 메소드는 무조건 추상메소드이다.
 * -인터페이스에서 필드는 무조건 상수필드이다.
 * -필수로 구현해야하는 메소드가 있을때 인터페이스에 규칙처럼 틀을 만들어 두고 상속을 시킨다-오버라이딩
 * -인터페이스는 다중 구현을 허용한다.
 * -메소드가 겹치더라도 최종 구현단계에서 실제 구현클래스의 구현부가 실행될것이기 때문에. 
 * -추상클래스보다 좀 더 강한 규칙,강제성을 갖는다.
 * 
 * 추상클래스와 인터페이스
 * 1.공통점 
 * -객체 생성은 안되나 참조 변수로서 사용이 가능하다. (다형성 적용 가능)
 * -상속(구현)하는 클래스에 추상메소드를 오버라이딩 하도록 강제한다.
 * 
 * 2.차이점
 * -추상클래스 : 클래스 내에 필드,메소드 생성이 가능하고 추상메소드가 포함되어있거나 abstract 키워드에 의해 정의된다.
 * -인터페이스 : 모든 필드는 상수필드,모든 메소드는 추상메소드로 정의해야한다.
 * -추상클래스는 추상클래스를 상속받아 기능을 이용하고 클래스를 확장해서 사용.
 * -인터페이스는 클래스의 기능 구현을 강제하기 위한 의도가 강하다.
 * 
 * **extends와 implements 
 * -클래스간의 상속 관계 : 자식클래스명 extends 부모클래스명
 * -클래스와 인터페이스의 구현 관계 : 클래스명 implements 구현인터페이스명,구현인터페이스명2,....
 * -인터페이스간의 상속 관계 : 자식인터페이스명 extends 부모인터페이스명,부모인터페이스명2,....
 * 
 * */

//인터페이스는 인터페이스를 상속받을 수 있다.
public interface TestInterface extends Actor,Test{
	
	//상수필드
	public static final int NUM = 10;
	
//	private String name; - 일반 필드는 가질 수 없다. 상수 필드만 가능 
//	때문에 public static final 키워드를 생략 할 수 있다. 당연하게도 상수필드일테니까.
	String NAME="이름";
	
	//추상메소드
	public abstract void test();
	//당연하게도 추상메소드일테니까 public abstract 키워드 생략가능
	void test2();
	
	//인터페이스의 모든 필드는 암묵적으로 public static final이며 상수필드이다.
	//모든 메소드는 암묵적으로 public abstract이며 추상 메소드이다.
	
}
