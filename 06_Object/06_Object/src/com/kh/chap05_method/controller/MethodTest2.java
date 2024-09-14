package com.kh.chap05_method.controller;

public class MethodTest2 {

	/*
	 * 메소드 오버로딩
	 * -한 클래스 안에 같은 이름의 메소드들을 만드는(정의하는) 방법
	 * -매개변수의 자료형 또는 개수를 다르게 작성하여 구분짓는다.
	 * -단, 매개변수명,접근제한자,반환형은 메소드 오버로딩에 영향을 주지 않는다.
	 * */
	
	//메소드 이름을 test로 작성
	
	public void test() {
		//메소드 오버로딩이 잘되어 있는 예)
		System.out.println("안녕하세요");
		System.out.println(10);
		System.out.println(true);
	}
	
	public void test(int num) {
		
	}
	
	public void test(String name) {
		
	}
	public void test(String name,int age) {
		
	}
	
	public void test(int age,String name) {
		
	}
	public void test(String str,double price) {
		
	}
	public void test(String str,int age,int price) {
		
	}
//	public String test(String str) { //반환형은 영향을 끼치지 않는다 - 오버로딩에.
		
//	}
	
//	public int test(int a) {
//		return 0;
//	}
	
//	protected int test(int a) { //접근제한자도 오버로딩에 영향을 끼치지 않는다.
	
//		return 0;
//	}
	
	
	
}
