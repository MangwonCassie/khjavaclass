package com.kh.operator;

import java.util.Scanner;


public class G_Triple {
	
	/*
	 * 삼항 연산자 : 피연산자가 3개 -> 값 3개와 연산자 1개로 이루어짐.
	 * 조건식 형태로 쓰인다.
	 * 
	 * #조건식 : 결과값에 따라서 연산을 처리하는 방식 
	 * 		     결과값이 참일 경우 식1을 처리하고
	 * 		     결과값이 거짓일 경우 식2를 처리한다.
	 * [표현법]
	 * 조건식 ? 조건이 true일 경우 결과값 : 조건이 false일경우 결과값;
	 *  
	 * */
	
	public void method1() {
		//사용자가 입력한 값이 양수인지 아닌지 판별하고 그에 맞는 결과를 출력해보자.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		//출력메소드에 삼항연산자 넣어서 작성하기
		//System.out.println("입력받은 수는 "+((num>0)?"양수입니다.":"양수가 아닙니다"));
		
		//삼항연산자의 결과를 변수처리하기.
		String result = (num>0)?"양수입니다.":"양수가 아닙니다.";
		
		System.out.println("입력받은 "+num+"은 "+result);
		sc.close();
	}
	
	public void method2() {
		//짝수 홀수 판별 
		//사용자에게 입력받은 수가 짝수인지 홀수인지 판별 후에 짝수라면 짝수입니다. 홀수라면 홀수입니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요.");
		int num = sc.nextInt();
		
		String result = (num%2==0)?"짝수입니다":"홀수입니다";
		
		System.out.println("입력받은 수 "+num+"은 "+result);
		
		//중첩 삼항연산자 - 삼항연산자 안에 또다른 삼항연산자를 넣어 사용한다.
		
		result = (num==0)?"0입니다.":((num%2==0)?"짝수입니다":"홀수입니다");
		
		result = (num!=0)?((num%2==0)?"짝수입니다":"홀수입니다"):"0입니다";
		 
		//삼항연산자?(삼항연산자):"거짓일때"; 
		
		System.out.println("입력받은 수 "+num+"은 "+result);
		
	}
	
	public void method3() {
		//중첩삼항연산자를 이용하여.
		//입력받은 정수값이 양수인지 음수인지 0인지 판별하여. 양수입니다,음수입니다,0입니다를 출력해보세요 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요 ");
		int num = sc.nextInt();
		
		String result = (num>0)?"양수입니다.":(num==0)?"0입니다":"음수입니다";
		
		System.out.println("입력하신 "+num+"값은 "+result);
		
		sc.close();
		
	}
	
	
}
