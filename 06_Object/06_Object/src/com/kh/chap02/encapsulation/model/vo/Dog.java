package com.kh.chap02.encapsulation.model.vo;

public class Dog {
	
	//필드부 
	//접근제한자 자료형 필드명;
	private String name;
	private int age;
	private char gender;
	private double weight;
	
	//생성자부
	
	//메소드부
	/*
	 * 기능을 구현하는 부분
	 * 
	 * [표현법]
	 * 접근제한자 반환형 메소드이름(매개변수){
	 * 		수행하고자 하는 코드 
	 * }
	 * 
	 * -접근제한자 : 호출할 수 있는 접근 범위 설정
	 * -반환형 : 메소드의 결과값이 어떠한 자료형인지를 지정하는 부분,이때 void로 작성하면 반환할 값이 없다는 뜻.
	 * -매개변수 : 메소드를 호출할때 전달하는 값 - 이때 메소드에서는 전달받은 값을 담아놓을 변수를 준비한다. -매개변수
	 * 			매개변수는 메소드가 실행되는 시점에 생성되었다가 메소드호출이 끝이나면 사라지는 변수 (생략 가능)
	 * 
	 * */
	//데이터를 기록 및 수정하는 기능의 메소드 : setter 메소드
	/*
	 * 규칙
	 * 1. setter 메소드는 접근이 가능하여야 하기 때문에 public 접근제한자를 사용한다.
	 * 2. 메소드명은 set+필드명으로 작성하되, 낙타봉 표기법을 지켜서 작성해준다.
	 * 	 ex)setName , setAge, setGender
	 * 3.모든 필드에 대해서 전부 작성하여야한다.  
	 * 
	 * */
	//name 필드에 대한 setter 메소드
	//이름 값을 대입 및 수정 할 수 있는 역할의 메소드
	//메소드 호출시 넘기는 데이터를 전달받을 변수를 마련한다-매개변수
	//이때 변수명은 해당 메소드에서 대입할 필드명과 동일하게 작성한다.
	//this : 현재 이 객체자신을 가르키는 키워드 
	public void setName(String name) {
		this.name=name;
		//"객체 필드"에 넘겨받은 데이터를 넣어라.
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
		System.out.println(name+"의 정보 : ");
		System.out.println("나이는 : "+age+"살");
		System.out.println("성별은 : "+gender+"아");
		System.out.println("몸무게는 : "+weight+"kg");
	}
	
	//Dog 객체의 정보를 문자열로 반환하는 메소드 만들기 
	public String info() {
		return "이름 : "+name+" 나이 : "+age+"살 성별 : "+gender+"아"+" 몸무게 : "+weight+"kg";
	}
	
	

}
