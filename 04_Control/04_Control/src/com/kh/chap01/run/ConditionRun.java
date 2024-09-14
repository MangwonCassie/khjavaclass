package com.kh.chap01.run;

import com.kh.chap01.condition.A_if;
import com.kh.chap01.condition.B_ifElse;
import com.kh.chap01.condition.C_Switch;
import com.kh.chap01.condition.D_Ex;

public class ConditionRun {
	public static void main(String[] args) {
		/*
		 * 프로그램의 실행순서는 기본적으로 위에서 아래로 순차적으로 실행됨
		 * 이 순차적인 흐름을 바꾸고자 할 경우 "제어문"을 통해 제어 가능하다.
		 * 
		 * 제어문의 종류
		 * 1.조건문 : 선택적으로 실행하는 구문 ->if문,if-else문,if-else if문,switch문
		 * 2.반복문 : 반복적으로 실행하는 구문 ->for문,while문,do-while문
		 * 3.분기문 : 그 외의 흐름을 제어하는 구문 -> break문, continue문
		 * 
		 * 조건문
		 * "조건식"을 통해 참이냐 거짓이냐를 판단하여 해당 조건이 참일 경우
		 * 그에 해당하는 구문(영역)을 실행한다.
		 * -조건식의 결과는 true/false 논리값이 나올 수 있도록 작성하여야 한다.
		 * ex)비교연산,논리연산,논리부정연산
		 * -주로 비교연산,논리연산이 사용된다.
		 * 
		 * 조건문의 분류 
		 * 1.if문 계열
		 *  -단독 if문 
		 *  -if else문
		 *  -if else-if문
		 * 2.switch문
		 * 
		 * */
		
		A_if a = new A_if();
//		a.method1();
//		a.method2();
//		a.method3();
		
		B_ifElse b = new B_ifElse();
//		b.method1();
//		b.method2();
//		b.method3();
//		b.method4();
		
		C_Switch c = new C_Switch();
//		c.method1();
//		c.method2();
//		c.method2_1();
//		c.method3();
//		c.method4();
//		c.method5();
		
//		System.out.println("메소드 끝");
		
		D_Ex d = new D_Ex();
		
//		d.ex01();
//		d.ex02();
//		d.ex03();
//		d.ex04();
//		d.ex05();
//		d.ex06();
//		d.ex07();
//		d.ex08();
		d.ex09();
		
		
		
		
	}

}
