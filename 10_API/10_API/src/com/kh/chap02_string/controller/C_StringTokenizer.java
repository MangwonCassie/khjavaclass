package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizer {
		
	//문자열을 문자열 배열로 분리 시키는 방법
	//1.구분자를 제시하여 해당 문자열을 분리시키는 방법.
	//2.분리된 각각의 문자열들을 토큰으로 취급하는 방법. 
	
	String str = "Java,Oracle,JDBC,HTML,Css,Server,Spring";
	
	public void method1() {
		//문자열.split(String 구분자) : 반환형 String[]
		String[] arr =str.split(",");
		
		/*
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		*/
		//향상된 for문 : 초기식,조건식,증감식이 필요없다.
		//foreach문
		//[표현법]for(값을받아줄 변수타입 변수명 : 배열또는컬렉션){
		//}
		for(String s : arr) {//배열의 크기만큼 순차적으로 반복 실행된다, 처음부터 끝까지 
			//반복이 실행될때마다 접근한 대상은 변수에 담긴다
			System.out.println(s);
		}
		//정수배열 5칸짜리 만들어서 숫자 원하는거 넣고  향상된 for문으로 출력해보기 
		int[] arr2 = {1,2,3,4,5};
		for(int a : arr2) {
			System.out.println(a);
			a=10;
		}
		//값을 수정할 수 없음 : 출력(조회)용
		for(int a : arr2) {
			System.out.println(a);
		}
	}
	
	//방법2
	public void method2() {
		//각각 문자열을 토큰처리하기
		//java.util.StringTokenizer 클래스를 이용한다.
		//[표현법]StringTokenizer stn 
//					= new StringTokenizer(분리시키고자하는 문자열, 구분자);
		
		//객체 생성
		StringTokenizer stn = new StringTokenizer(str,",");
		
		System.out.println("stn : "+ stn);
		System.out.println(str);
		//countTokens() : 분리된 토큰의 개수를 세어주는 메소드
		System.out.println("분리된 문자열의 개수 : "+stn.countTokens());
		
		//분리된 토큰을 확인하는 방법
		/*
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		*/
		
		//조건식에서 countTokens() 메소드를 실행할때마다 다시 개수를 세어주니 중간지점에서 만나게 된다.
//		for(int i=0; i<stn.countTokens();i++) {
//			System.out.println(stn.nextToken());
//		}
		
//		while(stn.countTokens()>0) {
//			System.out.println(stn.nextToken());
//		}
		
		while(stn.hasMoreTokens()) {
			//stn.hasMoreTokens() : stn에 토큰이 더 남아있으면 true 없으면 false
			System.out.println("개수 : "+stn.countTokens());
			System.out.println("더있나요? : "+ stn.hasMoreTokens());
			System.out.println(stn.nextToken());
			System.out.println();
		}
	}
}
