package com.kh.run;

import com.kh.variable.A_Variable; //import 불러오기 (외부 패키지에 있을때)
import com.kh.variable.B_KeyboardInput;
import com.kh.variable.C_Cast;

public class Run {//실행클래스
	public static void main(String[] args) {
		//calPay();
		A_Variable a = new A_Variable(); //A_Variable 객체 생성
		//a.calPay(); //A_Variable을 a라고 칭하기로 했으니 a.calPay()로 메소드 호출
//		a.declareVariable();
//		a.constant();
		
		B_KeyboardInput b = new B_KeyboardInput();//B_KeyboardInput 객체생성
		
		//b.inputTest(); //B_KeyboardInput 클래스에 있는 inputTest()메소드 호출
		
		//b.ex01();
		
		//C_Cast객체 생성
		C_Cast c = new C_Cast();
//		c.autoCasting();
		c.forceCasting();
		
	}

}
