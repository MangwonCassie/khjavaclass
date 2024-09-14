package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {
	/*
	 * While문
	 * 괄호 안에 조건이 true인 경우 해당 구문을 반복적으로 실행
	 * 조건식에 true를 작성하면 무한반복
	 * 
	 * [표현법]
	 * 초기식; --생략가능
	 * while(조건식){
	 * 	반복시키고자 하는 구문
	 *  증감식; --생략가능
	 * }
	 * 
	 * 조건식이 true이면 내부 코드를 실행 false라면 실행하지 않음
	 * 
	 * */
	
	public void method1() {
		
		//초기식 
		int i=0; 
		
		while(i<5) {
			System.out.println(i+"번째 반복");
			
			//무한반복을 벗어나기 위해 증감식넣기
			i++;
		}
		
		//무한반복
//		while(true) {
//			System.out.println("반복");
//		}
		
		//분기문을 이용하여 while문 벗어나기 
		int num = 5;
		while(num<10) {//num이 10미만인 동안 반복해라
			
			System.out.println("num : "+num);
			num++;
			if(num==7) {
				//반복문 벗어나기
				break; //분기문 가장 가까운 반복문을 벗어난다.
			}
		}
	}
	
	
	public void method2() {
		
		//사용자에게 정수를 입력받고 1부터 입력받은 수까지 모두 출력하고자 하는데
		//그 수중에 7이라는 숫자가 포함된다면 해당 반복문을 벗어난다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 (1이상) : ");
		int num = sc.nextInt();
		int start = 1;
		//1~num 
		
		while(start<=num) {
			
			System.out.println(start);
			start++;
			
			if(start==7) {
				break;
			}
			
		}
		sc.close();
	}
	
	public void method3() {
		//1부터 1씩 증가하는 수를 출력하는 반복문을 만들어
		//사용자가 입력한 값이 될때까지 출력해보시오 
		//1부터 100까지 수를 순서대로 출력하는데 사용자가 입력한 값을 건너뛰고 출력해보세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("건너뛸 수 지정 : ");
		int num = sc.nextInt();
		int start = 0;
		System.out.println("끝 수 지정 :");
		int finish =sc.nextInt();
		
//		while(start<num) {
//			System.out.println(start++);
//		}
		
		while(start<finish) {
			start++; 
			if(start==num) { //현재 수가 입력 수와 같다면
				continue; //분기문 
			}
			System.out.println("현재 수 : "+start);
			
		}
		sc.close();
	}
	
	
}
