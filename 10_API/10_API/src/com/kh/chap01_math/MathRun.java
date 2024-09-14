package com.kh.chap01_math;

public class MathRun {

	public static void main(String[] args) {
		//Math 클래스 (수학 관련 기능)
		
		//Math 클래스의 특징 - 모든 메소드가 다 static 으로 되어있어 객체 생성없이 사용 가능하다.
		
		//Math클래스의 필드
		//파이(원주율) - Math클래스 내에 상수필드로 정의되어있다.
		System.out.println("원주율 : "+Math.PI);
		
		//메소드 
		//메소드명(매개변수타입):반환형
		//1.올림 -> Math.ceil(double) : 반환형 double
		double num1 = 1.234;
		System.out.println("올림 : "+Math.ceil(num1));//2.0
		
		//2.반올림 ->Math.round(double) : 반환형 long
		System.out.println("반올림 : "+Math.round(num1));//1
		
		//3.버림 ->Math.floor(double) : 반환형 double
		System.out.println("버림 : "+Math.floor(num1)); //1.0
		
		//4.절대값 ->Math.abs(double/int/long/float) : 반환형 : double/int/long/float 그대로 
		int num2 = -55;
		System.out.println("절대값 : "+Math.abs(num2)); //55
		
		//5.최소값 ->Math.min(int,int) : 반환형 int 
		System.out.println("최소값 : "+Math.min(16, 6));//6
		
		//6.최대값 ->Math.max(int,int) : 반환형 int
		System.out.println("최대값 : "+Math.max(123,22)); //123
		
		//7.제곱근(루트) ->Math.sqrt(double) : 반환형 double
		System.out.println("제곱근 : "+Math.sqrt(4));// 2.0
		
		//8.제곱 -> Math.pow(double,double) : 반환형 double
		System.out.println("5의 3제곱 : "+Math.pow(5, 3));//125.0
		
		
		
		
	}

}
