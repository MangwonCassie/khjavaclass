package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {
		
	}
	
	public String afterToken(String str) {
		//넘겨받은 문자열 str을 넣고 구분시킬 구분자 " " 공백문자열을 넣어 구분짓는다.
		StringTokenizer stn = new StringTokenizer(str," ");
		
		//결과문자열 더해 넣을 변수 
		String result = "";
		
		//토큰이 있는 동안 반복하는 반복문 
		while(stn.hasMoreTokens()) {
			//결과변수에 토큰들 하나씩 꺼내서 더해 넣기
			result+=stn.nextToken();
		}
		
		return result; //전부 더해넣은 결과문자열 반환하기
	}
	
	public String firstCap(String input) {
		
		//전달받은 문자열을 모두 대문자로 바꾼 후 첫번째 글자를 꺼내는 작업
		char firstC = input.toUpperCase().charAt(0);
						//첫글자 뒤부터 짤라내고 맨앞에 대문자 붙이기 
		String newStr = firstC+input.substring(1);
		
		return newStr;
	}
	
	public int findChar(String input,char one) {
		//몇개가 있는지 세어 넣을 변수 
		int count =0;
		
		//문자열의 길이만큼 반복 
		for(int i=0; i<input.length();i++) {
			//문자열의 각 인덱스에 있는 문자와 입력받은 문자와 비교연산
			if(input.charAt(i)==one) {
				//같다면 카운트 증가 
				count++;
			}
		}
		//개수 카운트 반환
		return count;
	}
	
}
