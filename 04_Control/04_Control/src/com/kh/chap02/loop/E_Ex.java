package com.kh.chap02.loop;

import java.util.Scanner;

public class E_Ex {
	public void ex01() {
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다.
//		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
//		ex.
//		1이상의 숫자를 입력하세요 : 4
//		1이상의 숫자를 입력하세요 : 0
//		1 2 3 4
//		1 이상의 숫자를 입력해주세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("1이상의 숫자를 입력하세요 :");
		int num = sc.nextInt();
		
		if(num<1) {//1미만을 입력시 
			System.out.println("1 이상의 숫자를 입력해주세요");
		}else {//1이상 
			
			//입력받은 num 까지 반복하는 반복문 
			for(int i=1;i<=num;i++) {
				System.out.print(i+"\t");
			}
		}
		
		sc.close();
	}
	
	public void ex02() {
//		위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
//		“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		Scanner sc = new Scanner(System.in);
		
		//사용자에게 다시 프로그램을 실행시켜줘야 하기 때문에 이 부분부터 무한 반복(잘못입력했을시)
		System.out.println("1이상의 숫자를 입력하세요 :");
		while(true) { //무한 반복 영역
			int num = sc.nextInt();
			if(num<1) {//1미만을 입력시  다시 입력할수있게 반복을 시켜야한다
				System.out.println("1 이상의 숫자를 입력해주세요");
			}else {//1이상으로 잘 입력했을때는 프로그램을 종료
				
				//입력받은 num 까지 반복하는 반복문 
				for(int i=1;i<=num;i++) {//for문 시작
					System.out.print(i+"\t");
				}//for문 끝
				
				//제대로 처리가 되었으니 프로그램을 종료
				break; //break가 포함된 가장 가까운 반복문을 벗어난다
			}
		}//무한 반복영역 끝 
		sc.close(); //모든 작업이 끝난 후에 자원 반납
	}
	
	public void ex03() {
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다.
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1이상의 수를 입력해주세요 : ");
		int num = sc.nextInt();
		
		if(num>0) { //입력한 수는 1보다 크거나 같아야한다는 조건 
			
			//입력받은 수부터 1까지 순차적으로 감소하는 반복문 
			for(int i=num;i>0;i--) {
				System.out.print(i+"\t");
			}
			
		}else {
			System.out.println("잘못 입력하셨네요. 1이상의 수를 입력하셔야합니다.");
		}
		
		sc.close();
		
	}
	
	public void ex04() {
		//위와 동일하나 잘못입력시 무한반복 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1이상의 수를 입력해주세요 : ");
		while(true) {//무한반복 영역
			int num = sc.nextInt();
			
			if(num>0) { //입력한 수는 1보다 크거나 같아야한다는 조건 
				
				//입력받은 수부터 1까지 순차적으로 감소하는 반복문 
				for(int i=num;i>0;i--) {
					System.out.print(i+"\t");
				}
				//제대로 작업을 수행했다면 무한반복을 벗어나야한다.
				break;
			}else {
				System.out.println("잘못 입력하셨네요. 1이상의 수를 입력하셔야합니다.");
			}
		}//무한 반복 끝
		
		sc.close();
	}
	
	public void ex05() {
//		1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
//		ex.
//		정수를 하나 입력하세요 : 8
//		1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
		

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		String str = ""; //마지막으로 출력될 문자열을 더해 넣을 변수
		
		//출력문으로 해보기 
		for(int i=1; i<=num; i++) {
			sum += i; 
			if(i==num) { //만약에 반복횟수가 마지막이라면 +기호가 나오면 안되기때문에 조건처리 
				System.out.print(i);
			}else {
				System.out.print(i+"+");
			}
		}
		System.out.println("="+sum);
	
		//변수로 작업
		int sum2 = 0; 
		for(int i=1; i<=num; i++) {
			sum2 += i; 
			if(i==num) { //만약에 반복횟수가 마지막이라면 +기호가 나오면 안되기때문에 조건처리 
				str+=i+"="+sum2; //문자열에 다른 자료형을 더하면 문자열 처리 
			}else {
				str += i+"+";
			}
		}
		System.out.println(str);

		sc.close();
		
		
		
	}
	
	public void ex06() {
//		사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
//		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 1 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("정수 2 입력 : ");
		int num2 = sc.nextInt();
		
		if(num1>0&&num2>0) { //입력받은 수가 1이상인 경우
			
			if(num1>num2) { //처음 입력한 수가 두번째 입력한 수보다 크다면 
				//더 작은 수를 기준으로 잡고 큰수까지 범위를 잡아 1씩 증가시키는 반복문
				for(int i=num2; i<=num1; i++) {
					System.out.print(i+" ");
				}
			}else {//처음 입력한 수가 두번째 입력한 수보다 작다면 
				for(int i=num1; i<=num2; i++) {
					System.out.print(i+" ");
				}
			}
		}else {//1미만의 숫자가 입력된 경우
			System.out.println("1 이상의 수를 입력해주세요.");
		}
		
		sc.close();
		
	}
	
	public void ex07() {
//		위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
//		“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("정수 1 입력 : ");
			int num1 = sc.nextInt();
			System.out.println("정수 2 입력 : ");
			int num2 = sc.nextInt();
			// 4 8 
			if(num1>0&&num2>0) { //입력받은 수가 1이상인 경우
				//더 작은 수를 기준으로 잡고 큰수까지 범위를 잡아 1씩 증가시키는 반복문
				if(num1!=num2) {//두 수가 같지 않을때 
					for(int i=num2; i<=num1; i++) {
						System.out.print(i+" ");
					}
				}
				for(int i=num1; i<=num2; i++) {
					System.out.print(i+" ");
				}
				break;
			}else {//1미만의 숫자가 입력된 경우
				System.out.println("1 이상의 수를 입력해주세요.");
			}
		}//무한 반복 끝
		
		
		sc.close();
	}
	
	//실습문제 11번
	public void ex08() {
//		사용자로부터 시작 숫자와 공차를 입력 받아
//		일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
//		단, 출력되는 숫자는 총 10개입니다.
//		시작 숫자 : 4
//		공차 : 3
//		4 7 10 13 16 19 22 25 28 31
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시작 숫자 : ");
		int start = sc.nextInt();
		System.out.println("공차 : ");
		int gap = sc.nextInt();
		String start2 = start+" "; //문자열로 처리하기 위한 변수 
		//10번 반복할 반복문을 생성
//		for(int i=0; i<10;i++) {
//			System.out.print(start+" "); //시작숫자 출력
//			start+=gap;//시작숫자 + 공차
//		}
		for(int i=0;i<9;i++) {
			start+=gap;//시작숫자 + 공차 
			start2+=start+" "; //문자열로 처리 
		}
		
		System.out.println(start2);
		
		sc.close();
	}
	
	public void ex09() {
//		정수 두 개와 연산자를 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요.
//		단, 해당 프로그램은 연산자 입력에 “exit”라는 값이 들어올 때까지 무한 반복하며
//		exit가 들어오면 “프로그램을 종료합니다.”를 출력하고 종료합니다.
//		또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면
//		“0으로 나눌 수 없습니다. 다시 입력해주세요.”를 출력하며,
//		없는 연산자가 들어올 시 “없는 연산자입니다. 다시 입력해주세요.”라고 출력하고
//		두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.
//		연산자(+, -, *, /, %) : +
//		정수1 : 10
//		정수2 : 4
//		10 + 4 = 14
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {//무한반복 시작
			System.out.println("연산자(+, -, *, /, %) :");
			String o = sc.nextLine();
			//만약 연산자에서 "exit"라는 문자열이 들어온다면 무한반복을 벗어난다.(프로그램 종료)
			if(o.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break; //무한반복 벗어나기
			}
			System.out.println("정수1 : ");
			int num1 = sc.nextInt();
			System.out.println("정수2 : ");
			int num2 = sc.nextInt();
			sc.nextLine(); // 엔터 없애기 (반복실행시 남아있던 엔터가 맨위에있는 연산자 입력란에서 인식되기때문에)
			
			String result=""; //결과값 출력할 변수 
			
			switch(o) {//전달받은 연산자기호에 따라 계산 작업 해주기 
			case "+": result = num1+o+num2+"="+(num1+num2);
				break;
			case "-": result = num1+o+num2+"="+(num1-num2);
				break;
			case "*": result = num1+o+num2+"="+(num1*num2);
				break;
			case "/": if(num2!=0) {//num2가 0이 아닐때 (int)313/100.0
						result = num1+o+num2+"="+
								(int)(((double)num1/num2)*100)/100.0;
					 }else {
						result="0으로 나눌 수 없습니다. 다시 입력해주세요.";
						}
				break;
			case "%": if(num2==0) {//num2가 0일때 
						result="0으로 나눌 수 없습니다. 다시 입력해주세요.";
					 }else {
						result = num1+o+num2+"="+((double)num1%num2);
					 }
				break;
			default : result="없는 연산자입니다 다시 입력해주세요.";
			}
			
			System.out.println(result);
			
		}//무한 반복영역 끝
		
		
		sc.close();
		
	}
	
	public void ex10() {
//		다음과 같은 실행 예제를 구현하세요.
//		ex.
//		정수 입력 : 4
//		*
//		**
//		***
//		****
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("*");
//		System.out.println("**");
//		System.out.println("***");
//		System.out.println("****");
		
		//한줄 별찍기
		
//		for(int i=0; i<1; i++) { //1번 반복하는 반복문
//			System.out.print("*");
//		}
//		System.out.println();
//		for(int i=0; i<2; i++) { //2번 반복하는 반복문
//			System.out.print("*");
//		}
//		System.out.println();
//		for(int i=0; i<3; i++) { //3번 반복하는 반복문
//			System.out.print("*");
//		}
//		System.out.println();
//		for(int i=0; i<4; i++) { //4번 반복하는 반복문
//			System.out.print("*");
//		}
		
		System.out.println("별찍기 행수를 입력해주세요 : ");
		int star =sc.nextInt();
		
		//한줄 별찍기를 star번 반복하는 반복문 만들기  
		for(int j=0; j<star; j++) {
			
			//별찍는 횟수 == 한줄씩 지날때마다 +1
			for(int i=0; i<(j+1); i++) { //한줄별찍는 반복문 
				System.out.print("*");
			}
			System.out.println(); //한줄 다찍고 줄바꿈
		}
		
		sc.close();
	}
	
	public void ex11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("별의 행수 : ");
		int star = sc.nextInt();
		
//		System.out.println("****");
//		System.out.println("***");
//		System.out.println("**");
//		System.out.println("*");
		
		//star번 반복시키는 반복문 (행의 수)
		for(int i=0; i<star;i++) {
			for(int j=1; j<=star-i;j++) {//행반복이 진행될때마다 별의 갯수를 줄여준다 (행반복 변수를 이용하여)
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
		
	}
	
	
	
	
	}
