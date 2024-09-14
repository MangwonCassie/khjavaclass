package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	
	/*
	 * for문 
	 * 괄호 안의 반복을 지정하는 부분이 있고, 초기식,조건식,증감식 세가지로 이루어진다.
	 * 각각 세미콜론으로 구분되며 증감식에는 세미콜론을 붙이지 않는다.
	 * [표현법]
	 * for(초기식; 조건식; 증감식){ 
	 * 		반복시키고자 하는 내용
	 * }
	 * 
	 * -초기식 : 반복문이 시작될때 "초기에 단 한번만 실행"될 구문
	 * 		  즉, 반복문에서 사용할 변수를 선언하고 초기화 하는 구문이다. ex) int i=0;
	 * -조건식 : "반복문이 실행될 조건"을 작성하는 구문 
	 * 		  조건식이 true일 경우 반복문 실행 false일 경우 반복문을 멈추고 빠져나온다
	 * 		 보통 초기식에서 선언된 변수를 가지고 조건식을 작성한다. ex) i<10;
	 * -증감식 : 반복문을 제어하는 변수 값을 증감 시키는 구문 
	 * 			보통 초기식에서 선언된 변수를 가지고 증감식을 작성한다.
	 * 			이때 증감연산자가 주로 사용된다. ex) i++
	 * 
	 * for문을 만나는 순간 
	 * 초기식 ->조건식(조건검사)->true일 경우 실행->증감식
	 * 	   ->조건식(조건검사)->true일 경우 실행->증감식
	 * 	   ->....
	 * 	   ->조건식(조건검사->false일 경우 코드를 실행하지 않고 반복문을 벗어난다.
	 * 조건식이 true일 경우에만 코드를 실행한다.
	 * 
	 * */
	
	public void method1() { 
		//"안녕하세요" 메세지를 출력하고싶은데 5번 하고싶다.
		/*
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		*/
		
		//적은 횟수일 경우에는 단순한 복사 붙여넣기로 작업할 수 있지만
		//횟수가 늘어나면 늘어날 수록 해당 처리가 힘들어진다.
		
//		for(초기식;조건식;증감식) {}
//		for(int i=0;i<10;i++) {
//			System.out.println("안녕하세요"+i);
//		}
		
		//증감식에서 감소하는 예 초기식 10에서 -1씩 0보다 클때까지.
//		for(int i=10; i>0; i--) {
//			System.out.println("백숙먹쨔했쨔나"+i);
//		}
		
		//증감식에서 +2씩 증가하는 예
		//1~10까지 범위를 잡고 +2씩 증가하게 작성 
//		for(int i=1; i<=10; i=i+2) {
//			System.out.println("안녕"+i);
//		}
		
		//초기식,조건식,증감식이 없어도 문법오류가 나지 않는다.
		//다만 이경우에는 true로 인식이 되어 무한반복에 빠진다.
		//식을 적지 않아도 ;을 이용하여 구분은 해야한다.(형식맞추기)
//		for(;;) {
//			System.out.println("무한반복");
//		}
//		for(int i=0;i<10;) {
//			
//		}
		
	}
	
	public void method2() {//메소드2 시작
		//가장 기본적인 형태 0을 기준으로 10전까지 +1씩 증가하는 반복문 
//		for(int i=0;i<10;i++) {
//			System.out.println("i값은 : "+i);
//		}
		Scanner sc = new Scanner(System.in);
		System.out.println("아무말이나 해보세요");
		String str = sc.nextLine();
		//반복문을 이용하여 문자열 자리수 하나하나 추출해보기.
//		for(int i=0;i<7;i++) { //0 1 2 3 4 5 6
//			System.out.println((i+"번 인덱스 문자 : "+str.charAt(i)));
//		}
		//반복횟수를 정하는데 문자열의 길이만큼 정해주기(length() 메소드를 이용하여)
		for(int i=0;i<str.length();i++) { //0 1 2 3 4 5 6
			System.out.println((i+"번 인덱스 문자 : "+str.charAt(i)));
		}
		System.out.println("str의 길이는 : "+str.length());
		
		sc.close();
	}//메소드2 끝
	
	public void method3() {
		//1에서부터 10까지 수의 합을 구해보자.(누적 합)
		//수를 입력받아서 1부터 입력받은 수까지의 합을 구해서 출력해보세요.
		//더한 결과값을 담아놓을 변수를 하나 준비하시고 해당 변수에 매 반복시에 수를 더해넣고 마지막에 출력해보기.
		//1+2+3+4+5+6+7+8+9+10  - 총 10개 
		//반복문을 사용할때 증감되는 규칙을 정할수 있다고 했음(증감식을 이용하여) 
		//범위를 설정하고 해당 범위를 벗어날수있는 증감식을 규칙처럼 사용할수 있다.
		//1~10
		
		int sum=0;//누적합을 넣어놓을 변수 
		
		/*
		//기준점 1에서부터 10까지 1씩 증가하는 반복문 (반복횟수 10번)
		for(int i=1;i<=10;i++) {
			//System.out.println("i : "+i);
//			sum = sum + i;
			sum += i; //위의 계산식을 간략하게 사용 (복합대입연산자)
		}
		System.out.println("누적합은 : "+sum);
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("누적합을 구하고 싶은 수를 입력해주세요 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num;i++) {
			sum+=i;
		}
		
		System.out.println("누적합 : "+sum);
		sc.close();
	}
	
	public void method4() {
		//정수를 입력받아 1부터 입력받은 수까지 반복시켜 그중에서 짝수만 더하여 누적합을 구하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		int sum = 0; //누적합 담을 변수
		
		for(int i=1;i<=num;i++) {
//			System.out.println("i의 값은 "+i);
			if(i%2==0) { //i값이 2로 나누었을때 나머지가 0이면 짝수
				System.out.println("짝수인 i의 값은 : "+i);
				sum+=i; //짝수인 값을 더해넣기
			}
		}
		System.out.println("누적합 : "+sum);
		
		sc.close();
	}
	
	public void method5() {
		//구구단을 만들어보자
		//사용자에게 원하는 구구단 단수를 입력받고 해당 단을 출력해보자.
		// ex) 원하는 단수를 입력해주세요 : 2  
		// 출력예시 : 2 X 1 = 2 
		//		  2 X 2 = 4 
		// .,.... 2 X 9 = 18
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하는 단 수를 입력해주세요. : ");
		int dan = sc.nextInt();
		
		for(int i=0; i<9; i++) { //9번 반복시키기 0 1 2 3 4 5 6 7 8
			System.out.println(dan+" X "+(i+1)+" = "+(dan*(i+1)));
		}
		System.out.println("===================");
		for(int i=1; i<10; i++) {
			System.out.println(dan+" X "+i+" = "+dan*i);
		}
		sc.close();
		
	}
	
	//중첩반복문
	public void method6() {
		//하루의 두끼씩 총 10일간 다이어트를 진행한다.
		
		//10일동안 총 10번 반복하는 반복문 
		for(int j=0; j<10;j++) {
			System.out.println("오늘은 다이어트 "+(j+1)+"일차");
			//하루 두끼먹는 반복문
			for(int i=0;i<2;i++) {
				System.out.println("밥 "+(i+1)+"번 먹음");
			}
		}
	}
	
	public void method7() {
		//두끼먹는 다이어트에 실패하고 헬스장에 가서 OT를 받는다
		//맨몸 스쿼트 20개씩 5세트를 진행하려한다. 
		//세트를 시작할때 현재 세트를 외치고 시작한다. 
		
		//세트 반복문
		for(int i=0;i<5;i++) { //5번반복하는 반복문
			System.out.println("현재 세트는 "+(i+1)+"번째 세트입니다!!!!!");
			//스쿼트를 20번 반복할 반복문 작성
			for(int j=0;j<20;j++) {
				System.out.println((j+1)+"개!!!");
			}
			if(i==4) {//전체를 감싸는 반복문이 마지막일때 
				System.out.println((i+1)+"세트끝!!!!!!!!!!!");
			}
		}
	}
	
	public void method8() {
		//입력받은 단수의 구구단부터 9단까지 출력하기 
		//단수표현  ===========n단============
		// n X 1 = n 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단수를 입력해주세요 : ");
		
		int dan = sc.nextInt();
		
		for(int j=dan; j<10; j++) { //입력받은 단부터 9단까지 반복하는 반복문
			System.out.println("==========="+j+"단============");
			//하나의 단을 표현하는 반복문 
//			for(int i=0; i<9;i++) { //9번을 반복하는 반복문 
//				
//				System.out.println(j+" X "+(i+1)+"="+(j*(i+1)));
//				
//			}
			
			for(int i=1; i<10;i++) { //9번을 반복하는 반복문 
				System.out.println(j+" X "+i+"="+(j*i));
			}
			
		}
		
		sc.close();
		
		
	}
	
	public void ex() {
			//기준 :1 범위는 어디까지? 10까지 
		int sum = 0; //변하기 전의 수와 변한 수를 더해 넣을 변수를 준비한다.
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt(); //사용자가 입력한 값 
		for(int i=1;i<=num;i++) {
			//sum 변수상자에 이 반복실행 시점에 있는 수를 더해 넣어야한다.
			// 기준이 : 1 -> sum == 1 / 기준이 2로 증가 -> sum = 2 
			sum = sum + i; //누적합 변수 상자에 현시점 i의 값을 더해서 넣는다 
		}
		System.out.println("누적합 : "+sum);
		
		//1부터 10까지 수를 출력해보세요  10번
		for(int i=0; i<10; i++) { //반복 10번 
			System.out.println(i+1);
		}
		
	}
	
	
	
	
	
	
}
