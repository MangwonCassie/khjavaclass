package com.kh.operator;

public class C_Compound {

	/*
	 * 복합대입연산자 : 다른 산술 연산자랑 대입연산자가 결합한것. 이항연산자
	 * -자기 자신과 해당 산술연산 후에 그 결과를 다시 자신에게 대입하는 연산자.
	 * 
	 * +=
	 * -=
	 * *=
	 *\/=
	 * %=
	 * 
	 * 예시)a+=3; - a=a+3 : 기존에 a라는 값에 +3을 한 뒤에 다시 a에 대입해라.
	 * */
	public void method1() {
		int num = 12;
		
		System.out.println("현재 num : "+num);
		
		//복합대입 연산자를 이용하여 num을 3 증가시켜보기
		num = num + 3; //기존 대입방식
		System.out.println("num : "+num);
		num += 3; //복합대입연산자
		System.out.printf("num : %d\n", num);
		
		//num을 3 감소시키기
		//num = num-3;
		num -= 3; 
		System.out.printf("num : %d\n", num);
		//num을 3배 증가시키기
		//num = num*3;
		num *= 3; 
		System.out.printf("num : %d\n",num);
		//num을 2배 감소시키기
		//num = num/2;
		num /= 2;
		System.out.printf("num: %d\n", num);
		//num을 2로 나눈 나머지를 num에 대입하기
		//num = num%2;
		num %= 2;
		System.out.printf("num : %d\n", num);
		
	}
	
}
