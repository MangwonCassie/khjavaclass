package com.kh.exception.run;

import java.io.IOException;

import com.kh.exception.controller.A_UncheckedException;
import com.kh.exception.controller.B_checkedException;

public class ExceptionRun {

	public static void main(String[] args) throws Exception {
		/*
		 * 에러(오류)의 종류
		 * -시스템 에러 : 컴퓨터의 오작동으로 발생하는 에러 (소스코드로 해결 불가)
		 * -컴파일 에러 : 프로그램 실행 전 소스코드 상의 문법적인 문제로 발생하는 에러 (소스코드수정으로 해결)
		 * -런타임 에러 : 프로그램 실행 중에 나는 에러 - 소스코드상의 문법적인 문제가 없는데도 발생한다.
		 * 			-사용자의 잘못 또는 개발자의 경우의 수 처리 실수로 인해 발생
		 * -논리 에러 : 소스코드상의 문제도 없고 실행했을때도 문제가 없지만 원한 결과와는 다른 결과가 발생한것.
		 * 
		 * 예외 : 시스템 에러를 제외한 나머지 컴파일,런타임,논리 에러와 같은 비교적 덜 심각한 에러들
		 * 		특히 런타임 에러를 주로 예외처리한다.
		 * 
		 * 예외처리 : 예외들이 발생했을 경우에 대비해서 처리하는 방법을 정의해 두는것.
		 * 
		 * 예외처리하는 이유 ? : 예외발생 시 프로그램이 비정상적으로 종료되는것을 막기 위함.
		 * 
		 * 예외처리 방법
		 * 1. try catch 구문 사용
		 * 2. throws 로 떠넘기기 
		 * 
		 * 
		 * 
		 * */
		
		
		A_UncheckedException a = new A_UncheckedException();
//		a.method1();
//		a.method2();
		a.method3();
//		a.method4();
//		a.method5();
		
		B_checkedException b = new B_checkedException();
		
		//메인에서도 jvm에게 예외를 전가(위임)시킬 수 있지만 책임지진 않는다. 처리를 해야함.
		//한번에 예외를 처리하기 위해 위임시키는것. 
//		b.method1();
		
	}

}
