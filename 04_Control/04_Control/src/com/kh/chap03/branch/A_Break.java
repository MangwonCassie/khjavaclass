package com.kh.chap03.branch;
import java.util.Random;
import java.util.Scanner;

public class A_Break {
	
	/*
	 * break; : break문을 만나는 순간 "가장 가까운 반복문"을 벗어난다.
	 * 	  		해당 break;문을 포함한 가장 가까운 반복문 한겹만 벗어난다.
	 * 
	 * 주의할점 : switch문 안에 있는 break와는 다른 역할.
	 * 		   switch문 안에 있는 break는 해당 switch문을 벗어나는 용도로 사용된다.(반복문에 영향 X)
	 * 
	 * */
	public void method1() {
		//매번 반복적으로 새롭게 발생되는 랜덤값을 뽑아보자
		//1~100까지 범위에 있는 수를 랜덤으로 뽑고 그 랜덤값이 만약 홀수라면 반복문을 벗어나보자.
		
//		int num = (int)(Math.random()*100/*개수*/)+1/*시작값*/;
		
//		System.out.println("랜덤값  :"+num);
//		System.out.println(Math.random());
		
		//무한반복 구문 : for(;;) {}
		//무한반복 구문 : while(true){}
		for(;;) {
			int random = (int)(Math.random()*100)+1; //1~100
			if(random%2==1) {//랜덤값이 홀수라면
				System.out.println("홀수가 나왔네요 "+random);
				break;//반복문을 벗어나라 
			}else {
				System.out.println("랜덤값 : "+random);
			}
		}
	}
	public void method2() {
		//매번 사용자에게 문자열을 입력받고 
		//해당 문자열의 길이를 출력해봅시다.
		//단, 사용자가 "exit"를 입력하면 반복문을 벗어나야 한다.
//		Random r = new Random();
//		for(int i=0; i<100;i++) {
//			System.out.println(r.nextInt(100/*개*/)+1/*부터*/);
//		}
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("문자열 입력 : ");
			String str = sc.nextLine();
			
			if(str.equals("exit")) {
				break; //반복문 벗어나기
				//while문이 무한 반복되어 벗어날 수 없다면 그 아래있는 구문은
				//Unreachable code가 되어 에러발생(실행될수없음) 
			}
			System.out.println(str+"의 길이 : "+str.length());
			
		}
		System.out.println("프로그램을 종료합니다.");
		
		sc.close();
	}
	
	public void method3(){
		//매번 사용자에게 숫자를 입력받고
		//해당 숫자가 음수라면 프로그램을 종료합니다 라는 메세지와 함께 종료해보세요.
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {//무한반복 
			System.out.println("숫자를 입력해주세요 : ");
			int num = sc.nextInt();
			
			if(num<0) {//입력받은 수가 음수라면 -- 무한반복을 벗어날 조건 
				System.out.println("음수를 입력했습니다. 프로그램을 종료합니다.");
				break;
			}
			System.out.println("입력한 수 : "+num);
		}
		sc.close();
		}
}
