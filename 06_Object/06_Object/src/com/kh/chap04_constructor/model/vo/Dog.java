package com.kh.chap04_constructor.model.vo;

public class Dog {
	
	//필드부
	private String name;
	private int age;
	private char gender;
	private double weight;

	
	//생성자부 
	/*
	 * 생성자 : 메소드 이름이 클래스 이름과 동일하고 리턴 자료형이 없는 메소드(반환형이 없는 메소드)
	 * 		 객체가 생성될때 (new구문을 사용할때) 호출이 되는 메소드
	 * 
	 * [표현법]
	 * public 클래스명(매개변수(생략가능)){
	 * 		해당 생성자에서 초기화 시키고자 하는 필드 또는
	 * 		실행하고자 하는 코드 
	 * }
	 * 
	 * [메소드 표현법]
	 * 접근제한자 반환형 메소드명(매개변수(생략가능)){
	 * 	코드 
	 * }
	 * 
	 * 생성자를 작성하는 목적
	 * 1.매개변수가 없는 생성자 -> 기본생성자
	 * 2.매개변수가 있는 생성자
	 * -두개의 차이 : 필드에 전달한 값을 초기화 할 수 있는가 없는가의 차이 
	 * 
	 * 생성자 작성시 주의사항
	 * 1. 생성자의 이름은 반드시 클래스명과 동일해야한다 (대소문자 구분)
	 * 2. 반환형이 존재하지 않는다.(메소드와 혼동하지 않기)
	 * 3. 생성자가 여러개 생성이 가능하지만 매개변수가 중복되면 안된다(메소드 오버로딩 규칙) 
	 * 4. 매개변수 생성자를 명시적으로 작성하게 되면 JVM이 기본으로 생성해주던 기본생성자가 없어진다(직접 작성해야함)
	 * 	  -때문에 기본생성자는 필수적으로 작성할것.
	 * */
	
	
	public Dog() {
		//기본생성자 (매개변수가 없는 생성자)
		/*
		 * 단지 객체를 생성할 목적으로 사용한다. 메모리 공간을 확보하기위함.
		 * 기본생성자를 생략하는경우 오류가 나지 않는다 why? JVM이 기본생성자를 작성해주기 때문.
		 * 단, 매개변수 생성자를 작성한다면 JVM이 기본생성자를 작성해주지 않기 때문에 기본생성자를 명시적으로 작성해주어야한다.
		 * 즉 1개이상의 생성자가 있다면 JVM은 생성자를 만들어 주지 않음.
		 * */
		/*
		this.name=null;
		this.age=0;
		this.gender=' ';
		this.weight=0.0;
		*/
		System.out.println("생성자 잘 실행되나요..?");
	}
	
	//매개변수 생성자 
	public Dog(String name,int age,char gender,double weight) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.weight=weight;
	}
	
	
	
	
	
	
	public void setName(String name) {
		this.name=name;
		//객체 필드에 넘겨받은 데이터를 넣어라.
		//객체 name필드에  넘겨받은 name 데이터를 대입해라
	}
	
	public void setAge(int age) {
		this.age =age;
	}
	
	public void setGender(char gender) {
		this.gender=gender;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//getter 메소드로 현재 객체 필드에 초기화 되어있는 값 얻어오기
	/*
	[표현법]
	접근제한자 반환형 get+필드명(){
	 return 필드명;
	 }
	*/
	//이름 조회용 getter 메소드
	public String getName() {
		return name; //객체 필드에 담긴 name값을 돌려준다(호출한곳으로) 
	}
	//나이 조회용 getter 메소드
	public int getAge() {
		return age; //객체 나이필드에 담긴 값을 돌려준다(호출한 곳으로)
	}
	//성별 조회용 getter 메소드
	public char getGender() {
		return gender;
	}
	//몸무게 조회용 getter 메소드
	public double getWeight() {
		return weight;
	}
	
	//Dog 객체의 정보를 출력하는 메소드 만들기 
	public void information() {
		System.out.println(name+"의 정보  ");
		System.out.println("나이는 : "+age+"살");
		System.out.println("성별은 : "+gender+"아");
		System.out.println("몸무게는 : "+weight+"kg");
	}
	
	//Dog 객체의 정보를 문자열로 반환하는 메소드 만들기 
	public String info() {
		return "이름 : "+name+" 나이 : "+age+"살 성별 : "+gender+"아"+" 몸무게 : "+weight+"kg";
	}
	
}
