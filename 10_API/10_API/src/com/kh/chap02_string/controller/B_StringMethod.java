package com.kh.chap02_string.controller;

import java.util.Arrays;

public class B_StringMethod {
	
	//문자열과 관련된 유용한 메소드 알아보기
	public void method1() {
		String str = "안녕하세요";
		
		//1.문자열.charAt(int index) : 반환형 char
		//문자열의 index번째 위치에 있는 문자를 추출하는 메소드
		char ch = str.charAt(3);
		System.out.println("ch : "+ch);
		
		//2.문자열.concat(String str) : 반환현 String
		//문자열과 문자열을 합치는 메소드 
		String str2 = str.concat(" 반갑습니다");
		System.out.println(str2);
		
		//3.문자열.length() : 반환형 int
		System.out.println("str의 길이 : "+str.length());
		
		//4.문자열.substring(int beginIndex) : 반환형 String
		//-beginIndex에서부터 문자열의 끝까지 반환해주는 메소드 
		//4-2 문자열.substring(int beginIndex,int endIndex) : 반환형 String
		//-beginIndex에서부터 endIndex-1까지 반환해주는 리턴 
		System.out.println(str2.substring(3));
		System.out.println(str2);
		System.out.println(str2.substring(2,5));
		
		//5. 문자열.replace(char old,char new) : 반환형 String
		//-문자열에서 old문자를 new 문자로 변환한 문자열을 리턴 
		String str3 = str2.replace('안', '밖');
		System.out.println(str3);
		
		//6. 문자열.trim() : 반환형 String
		//-문자열의 앞뒤 공백을 제거한 문자열을 리턴
		String str4 = "         공              백                        ";
		System.out.println(str4);
		System.out.println("trim():"+str4.trim());
		
		//6-2 문자열 사이에 있는 공백을 없애는 방법
		String str5 = str4.replace(" ","");//" ",""
		System.out.println(str5);
		
		//7.문자열.toUpperCase() : 반환형 String
		//-문자열을 모두 대문자로 반환한다
		//  문자열.toLowerCase() : 반환형 String
		//-문자열을 모두 소문자로 반환한다. 
		String str6 = "www.GooGle.Com";
		System.out.println("toUpper : "+str6.toUpperCase());
		System.out.println("toLower : "+str6.toLowerCase());
		
		//8.문자열.toCharArray() : 반환형 char[]
		//-문자열의 각 문자들을 문자배열에 담아서 반환
		char[] cArr = str6.toCharArray();
		System.out.println("cArr : "+cArr);
		System.out.println("cArr : "+Arrays.toString(cArr));
		
		//9. String.valueOf(char[] arr) : 반환형 String
		String str7 = String.valueOf(cArr);
		System.out.println("str7 : "+str7);
		
		//10. 문자열.indexof(String str) : 반환형 int 
		//-문자열의 앞에서부터 해당 문자열을 찾는다
		System.out.println(str7.indexOf("G"));
		//subString과 같이 사용
		String str8 = str7.substring(str7.indexOf("G"));
		System.out.println(str8);
		//-문자열의 뒤에서부터 해당 문자열 찾기 
		String str9 = str7.substring(str7.lastIndexOf("G"));
		System.out.println(str7);
		System.out.println("문자열 뒤에서부터 G 찾기 : "+str7.lastIndexOf("G"));
		System.out.println(str9);
	}
}
