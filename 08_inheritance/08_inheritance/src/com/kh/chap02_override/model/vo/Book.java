package com.kh.chap02_override.model.vo;

public class Book /*extends Object*/{
	//모든 클래스의 최상위 클래스는 Object이고 해당 Object를 상속받고 있는 구조이다. 생략가능
	
	private String title;
	private int price;
	
	public Book() {
		super();
	}
	
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}



	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	//toString 메소드를 오버라이딩 해보자.
	
	//Object 클래스가 가지고 있는 메소드 toString() : 해당 참조변수에 담긴 주소값을 반환한다.
	//toString() 을 재정의 해서 사용하는 경우 : 보통은 해당 객체 필드값을 문자열로 합쳐 반환하는 메소드의 역할로 재정의한다.
	//자동완성도 가능.
//	@Override
//	public String toString() {
//		return "";
//	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
	/*
	 * 오버라이딩
	 * -상속받고 있는 부모클래스의 메소드를 자식 클래스에서 재정의 하는것
	 * -부모클래스가 제공하는 기능을 일부 고쳐서 사용하겠다는 의미
	 * -자식클래스의 오버라이딩 된 메소드가 부모클래스 메소드보다 우선권을 가진다.
	 * 
	 * 오버라이딩의 성립 조건
	 * 1.부모메소드의 메소드명과 동일
	 * 2.매개변수의 자료형,개수,순서가 동일(매개변수명과는 무관하다)
	 * 3.반환형이 동일
	 * 4.부모메소드의 접근제한자보다 같거나 공유범위가 더 넓어야한다.
	 *
	 * @Override :  어노테이션
	 * -생략가능
	 *  명시를 하지 않아도 부모 메소드에 같은 형태의 메소드가 있다면 오버라이딩 된 것으로 판단된다.
	 * -어노테이션을 붙이는 이유는 잘못 기술했을 경우 오류를 알려주기 때문에 실수를 줄일 수 있다.
	 * -혹시라도 부모메소드가 후에 수정되었을 경우에도 오류로서 알려준다.
	 * -해당 메소드가 오버라이딩된 메소드라는것을 알리는 의미도 있음.
	 * -의미를 가진 주석이라고 생각하면 된다. 
	 * 
	 * 때문에 생략이 가능하지만 생략하지 않는것을 권장한다.
	 * */
	
	
	
	
	
}
