package com.kh.chap03_wrapper;

import java.util.ArrayList;

public class WrapperRun {

	public static void main(String[] args) {
		/* Wrapper클래스
		 * 기본자료형을 객체로 포장해주는 클래스
		 * 
		 * 기본자료형			Wrapper클래스
		 * boolean			Boolean
		 * char				Character
		 * byte				Byte
		 * short			Short
		 * int				Integer
		 * long				Long
		 * float			Float
		 * double			Double
		 * */
		
		int num1 = 10;
		int num2 = 15;
		
		//기본자료형에서 Wrapper클래스 자료형으로 변환하는것을 Boxing
		Integer i1 = num1;
		Integer i2 = num2;
		
		System.out.println(i1.equals(i2));
		//a.compareTo(b) : a가 b보다 크면 1 b가 크면 -1 같으면 0을 반환한다.
		System.out.println(i1.compareTo(i2));
		
		
		//클래스자료형 ->기본자료형 (Unboxing)
		int num3 = i2;
		System.out.println(num3);
		
		//기본자료형 <->String(문자열)
		String str = "10"; //int자료형으로 변환해보기
		String str2 = "15.5"; //double 자료형으로 변환해보기
		
		System.out.println(str+str2);//1015.5 문자열 덧셈처리
		
		//1.String형을 기본자료형으로 변환한다.(파싱)
		//[표현법] 해당Wrapper클래스 이름.parseXXX(변환할문자열);
		int i = Integer.parseInt(str); // "10" -> 10
		double d = Double.parseDouble(str2); // "15.5" -> 15.5
		
		System.out.println(i+d); //25.5 
		
		//2.기본자료형을 String형으로 변환하기
		//[표현법] String.valueOf(변환할기본자료형값): 반환형 String
		
		String s1 = String.valueOf(i);
		String s2 = String.valueOf(d);
		
		System.out.println(s1+s2); //1015.5 문자열 덧셈처리
		
	}	

}
