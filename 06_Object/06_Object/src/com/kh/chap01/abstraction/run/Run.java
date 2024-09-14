package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		
		/*
		 * 1.객체지향언어 : "객체"를 "지향"하는 언어로 "객체중심"으로 돌아간다.
		 * 
		 * 2.객체 : 사전적 의미로는 현실세계에 존재하는 독립적인 대상(목적,의미) 모든것들을 의미한다.(무형,유형,사물,개념,..)
		 * 
		 * 3.객체지향 프로그래밍 : 현실세계에 존재하는 독립적인 대상간의 상호작용을 프로그래밍 코드로 구현하는 과정
		 * 
		 * 4.구현하고자 하는 프로그램 상의 객체(변수)를 만들기 위해 클래스 라고하는 틀을 이용한다.
		 * -클래스란? 각 객체들의 속성(정보,행위)들을 담아낸 그릇 또는 틀과 같은 존재.
		 * 	클래스는 추상화와 캡슐화 과정을 통해 만들어진다.
		 * 
		 * 5.추상화 과정
		 * 	1) 내가 구현하고자 하는 프로그램에서 필요한 객체들을 생각해보고 
		 *		ex)학생관리 프로그램 -> "학생"객체 : 홍길동, 박보검, 송혜교 ..등등
		 * 	2) 그 객체들이 가지고 있는 공통적인 속성, 기능들을 모두 생각해보자 .
		 *   	ex)나이,이름,키,성적,발사이즈,몸무게,취미,특기,주소 등등.....
		 *  3) 추출한 속성들 중에 내가 구현할 프로그램의 "실질적인 목적"에 맞춰서 불필요한 속성,기능들을 제거하는 과정.
		 *  
		 *  4)최종적으로 내가 필요한 기능 및 속성들을 담아놓을 변수 및 타입 및 기능(메소드)를 생각해야한다.
		 *  	ex)String name; int age; int grade, double height 등등..
		 * 
		 * */
		
		//변수만으로 위와같이 프로그래밍을 해야한다면?
		//학생 한명의 정보를 등록해보자. (이름,나이,학년,키)
		/*
		String hong = "홍길동";
		int age = 20;
		int grade = 2;
		double height = 189.5;
		
		//두번째 학생의 정보를 등록해보자.
		String park = "박보검";
		int age2 = 15;
		int grade2 = 3;
		double height2 = 180.1;
		//...
		
		변수로 한다면 생성해야하는 변수가 너무 많아지기 때문에 유지보수가 너무 어렵다(힘들다..)
		*
	
		
		//위의 프로그래밍이 변수만 사용을했더니 너무 불편하여 배열로 다루려고한다.
		//배열은 한가지의 자료형을 여러개 묶어서 다룰 수 있다.
		String[] names = new String[3]; //학생 3명의 이름을 담을 수 있는 배열
		int[] ages = new int[3]; //학생 3명의 나이를 담을 수 있는 배열
		int[] grades = new int[3]; //학생 3명의 학년을 담을 수 있는 배열
		double[] heights = new double[3]; //학생 3명의 키를 담을 수 있는 배열 
		
		names[0]="홍길동";
		names[1]=null; //널..
		names[2]="송혜교";
		
		ages[0]=20; //길동이 나이
		ages[1]=0; //23
		ages[2]=30; //혜교 나이 
		
		int[] number = {22,10,44};
		//가독성이 안좋다. 사람이 전학왔을때? 배열의 크기를 늘려야하기때문에 새로운 배열을 생성하여 복사한뒤 넣어줘야한다.
		//사람이 전학갔다면...? 빈곳을 기록하거나 또는 뒤에 데이터들을 앞으로 당겨야하는 작업이 필요하다.
		//매번...
		
		//이렇게 변수와 배열로 다룬다면 자료형의 한계가 명확하기 때문에 
		//한번에 여러 자료형을 다루기 위한 개념이 "구조체" 개념이다.
		//자바에서는 "구조체" + 기능(메소드) 를 합쳐서 하나의 클래스 타입으로 다루게 된다.
		
	*/
		//객체로 프로그래밍을 하고자 한다면?
		//클래스를 먼저 정의하여야한다.
		//정의된 클래스로 객체를 생성하여 사용한다.
		//홍길동 이라고하는 학생의 정보를 담을 객체를 생성해보자!
		
		//heap영역에 메모리가 할당
		Student hong = new Student();
		//Student 클래스로 생성한 객체 hong안에 있는 필드변수에 직접 접근하여 값 대입하기.
		//이때 접근은 참조연산자인  . 을 이용한다 
		hong.name = "홍길동";
		hong.age = 20;
		hong.gender = '남';
		
		System.out.println("hong 객체의 이름필드 : "+hong.name);
		System.out.println("hong 객체의 나이필드 : "+hong.age);
		System.out.println("hong 객체의 성별필드 : "+hong.gender);
		
		//Student 클래스를 이용하여 
		//박보검객체와 송혜교 객체를 만들어서 각 필드 이름 나이 성별을 출력해보세요
		
		Student park = new Student();
		park.name="박보검";
		park.age=19;
		park.gender='남';
		
		System.out.println("park 객체의 이름필드 : "+park.name);
		System.out.println("park 객체의 나이필드 : "+park.age);
		System.out.println("park 객체의 성별필드 : "+park.gender);
		
		Student song = new Student();
		song.name="송혜교";
		song.age=23;
		song.gender='여';
		
		System.out.println("song 객체의 이름필드 : "+song.name);
		System.out.println("song 객체의 나이필드 : "+song.age);
		System.out.println("song 객체의 성별필드 : "+song.gender);
		
	
		//직접적으로 접근해서 값을 조회하면 
		//보안에 문제가 생길 여지가 있다.
		//그래서 객체지향 설계 원칙 중 하나가 정보 은닉이고
		//이 정보은닉 기술 중 하나가 캡슐화 
		
		
		System.out.println("song 객체의 나이필드 : "+song.age);
		
		
	}
}
