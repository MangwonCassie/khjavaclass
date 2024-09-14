package com.kh.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	
	/*
	 * do-while문
	 * 별도의 조건검사 없이 무조건 최초 1회는 실행하는 구문.
	 * 조건이 맞지 않아도 1번은 실행된다.
	 * [표현법]
	 * 초기식 --생략가능
	 * do{
	 * 	실행할 코드 
	 * 	증감식 --생략가능
	 * }while(조건식); 
	 * 
	 * while문과 do-while문의 차이점 
	 * while문은 조건식이 거짓일 경우 실행되지 않지만 do-while문은 조건식이 거짓이여도 최초1번은 실행된다.
	 * 
	 * */
	
	public void method1() {
		
		//조건이 거짓이여도 한번은 실행된다.
		int num = 1;
		do {
			System.out.println("실행이 되나요?");
		}while(num==0); //false
	}
	
	public void method2() {
		// 1 2 3 4 5 
		int i = 1;
		
		do {
			System.out.print(i++ +" ");
		}while(i<=5);
			
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		int num=-5;
		do {
			System.out.println("정수를 입력해주세요(1이상) : ");
			num = sc.nextInt();
			System.out.println("입력하신 수는 "+num);
		}while(num>0);
		
		//위에 do-while문이 만약 while으로 작성되었다면??
		//애초에 조건식이 거짓이라 실행될 수 없다.
		int num2 = -5;
		while(num2>0) {
			System.out.println("정수를 입력해주세요(1이상) : ");
			num2 = sc.nextInt();
			System.out.println("입력하신 수는 "+num2);
		}
		
		sc.close();
		
	}
	

}
