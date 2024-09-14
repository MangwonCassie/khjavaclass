package com.kh.variable;

import java.util.Scanner;

//사용자가 키보드로 입력한 값을 변수에 기록하고 활용해보자.
public class B_KeyboardInput {
	
	public void inputTest() {
		/*
		 * 키보드로 사용자로부터 값을 입력받으려면? 
		 * 자바에서 제공하고 있는 java.util.Scanner 라고하는 클래스를 활용하면 된다.
		 * Scaaner 안에 있는 기능들을 이용하기.
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		
		//사용자의 인적사항을 입력받아 출력해보자.
		//이름,나이,키,주소
		
		//입력받고자 하는 내용을 질문으로 유도하기.
		System.out.println("당신의 이름을 입력하세요.");
		//문자열을 입력받는 기능(메소드) next(); / nextLine(); 
		//입력받은 데이터를 담아놓을 변수 생성
		String name = sc.nextLine(); //또는 sc.nextLine(); 
		//sc.next와 sc.nextLine()의 차이점 : nextLine()은 엔터를 기준으로 입력받는다.
		//sc.next는 공백 또는 엔터를 기준으로 입력받아진다. 
		System.out.println("이름은 : "+name);
		//만약 입력받는 값(문자열)을 공백까지 포함하고자 한다면 nextLine을 사용해야한다.
		
		System.out.println("당신의 나이를 입력하세요.");
		int age = sc.nextInt(); // 정수자료형을 입력받는 메소드 
		System.out.println("당신의 나이는 "+age+"살 이군요");
		
		System.out.println("당신의 키를 입력해주세요.");
		double height = sc.nextDouble();
		System.out.println("당신의 키는 : "+height+"이군요");
		System.out.println("당신의 주소를 입력해주세요.");
		
		//nextLine을 제외한 나머지 입력메소드는 엔터기호를 입력받을 수 없어서 
		//전달 공간에 엔터기호가 그대로 남아 있게 된다.
		//남아있는 채로 nextLine()을 만나게되면 엔터를 입력받아 바로 수행을 끝내게된다.
		//해결방법 - nextLine() 사용하기 전에 엔터기호를 지워주는 작업 수행하기.
		sc.nextLine(); //버퍼라는 공간안에 남아있는 엔터기호를 입력받고 수행 끝내는 명령.
		String address = sc.nextLine(); //엔터라는 기호 \r
		System.out.println("당신의 주소는 : "+address+"이군요");
		
		System.out.println("당신의 성별을 입력하세요(M/F) : ");
//		char gender = sc.next();
		//next()메소드는 String 자료형을 반환하기때문에 char형에 담으려면 문자 추출을 해야한다.
		//문자열.charAt(인덱스번호); - 문자열에 인덱스로부터 문자추출
		char gender = sc.next().charAt(0);
		//char gender = sc.next().charAt(99); -입력한 인덱스 범위를 벗어나 오류가 발생한다.
		System.out.println("입력한 성별 : "+gender);
		
	}
	
	//ex01 메소드를 생성하여 사용자에게 오늘 먹은 점심 메뉴와 가격을 입력받고
	//메뉴이름 과 가격을 출력해보세요 (출력형식 자유) 
	public void ex01() {
		//스캐너 생성 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("오늘 먹은 점심 메뉴가 무엇인가요?");
		
		String menu = sc.nextLine();
		
		System.out.println(menu+"의 가격은 얼마입니까?");
		int price = sc.nextInt();
		
		System.out.println(price+"원인 "+menu+"는 저도 먹어보고 싶네요.");
		
		sc.close(); // 사용한 자원 반납 -통로를 열어서 작업했으면 통로를 닫아서 자원낭비를 막는다.
				
	}
	

}
