package com.kh.chap05_method.run;

import com.kh.chap05_method.controller.MethodTest1;
import com.kh.chap05_method.controller.MethodTest2;

public class MethodRun {

	public static void main(String[] args) {
		/*
		MethodTest1 mt1 = new MethodTest1();
		mt1.method1();
		mt1.method2(5,5);
		String str = mt1.method3(); //문자열을 돌려받음
		System.out.println(str);
		
		String str2 = mt1.method4(5, "나는 바보가 아니다!!");
		System.out.println(str2);
		*/
		
		MethodTest2 mt2 = new MethodTest2();
		
		mt2.test();
		
	}

}
