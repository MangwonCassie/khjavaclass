package com.kh.operator;

public class E_Comp {
	/*
	 * 비교 연산자 (관계연산자)
	 * 두개의 값을 가지고 비교, 이항연산자
	 * 비교 연산을 한 결과 -> 참일경우 true / 거짓일 경우 false
	 * 특정 조건을 제시할 수있는 조건문에서 쓰인다
	 * 
	 * 종류
	 * 1.크고 작음을 비교
	 * a < b : a가 b보다 작습니까?
	 * a > b : a가 b보다 큽니까?
	 * a <= b : a가 b보다 작거나 같습니까?
	 * a >= b : a가 b보다 크거나 같습니까?
	 * 
	 * 2.일치함을 비교 - 동등비교
	 * a == b : a와 b가 같습니까?
	 * a != b : a와 b가 같지 않습니까?
	 * 
	 * 피연산자는 숫자, 결과값은 논리값
	 * 
	 * */
	
	public void method1() {
		int a = 10;
		int b = 20;
		//비교연산보다 산술연산이 더 우선순위가 높기 때문에 괄호로 우선순위를 지정해줘야한다.
		System.out.println("a > b : "+(a>b)); //false
		
		System.out.println("a<=10 : "+(a<=10)); //true
		
		//동등비교 
		boolean result = (a == b);
		
		System.out.println("result : "+result);
		
		boolean result2 = (a!=b); //대입연산자의 우선순위가 더 낮아 괄호를 하지 않아도 되지만 가독성을 위해 괄호.
		System.out.println("result2 : "+result2); //true
		
		//산술연산 + 비교연산  : a - b가 0보다 작습니까? 
		System.out.println("a-b<0 : "+(a-b<0)); //10-20<0 true
		
		//어떠한 값을 2로 나누었을때 나머지값이 1인 경우 : 홀수 / 0인경우 : 짝수
		//짝수 홀수 판별
		System.out.println("a가 짝수입니까? : "+(a%2==0));
		b=13;
		System.out.println("b가 짝수입니까? : "+(b%2==0));
		
		
		
		
		
		
	}
	
	
	

}
