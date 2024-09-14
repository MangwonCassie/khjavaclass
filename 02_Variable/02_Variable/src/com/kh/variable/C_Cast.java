package com.kh.variable;

public class C_Cast {
	
	/*
	 * 형변환 : 값의 종류 즉, 자료형을 바꾸는 개념
	 * 
	 * 컴퓨터에서 값을 처리하는 규칙
	 * 1. = (대입연산자)를 기준으로 양쪽이 같은 자료형이여야 한다.
	 * 자료형이 다를경우 오른쪽 대입할 자료형을 변경시켜야한다.
	 * 2. 같은 자료형끼리만 연산이 가능하다.
	 * -다른 자료형끼리 연산을 하고자 한다면 둘중 하나는 형변환을 통해 동일한 자료형으로 변환해야한다.
	 * 3. 연산의 결과물도 같은 자료형이여야 한다.
	 * 
	 * [표현법](바꿀자료형)값
	 * 형변환연산자,cast 연산자
	 * 
	 * 형변환의 종류
	 * 1.자동형변환 : 자동으로 형변환된다. 직접 형변환 해줄 필요 없다.
	 * 			 작은 크기의 자료형 -> 큰 크기의 자료형
	 * 2.강제형변환 : 자동으로 형변환이 진행되지 않는 경우.
	 * 			  직접 형변환을 해야한다->형변환 연산자를 통해
	 * 			 큰 크기의 자료형 -> 작은 크기의 자료형
	 * 			 때문에 값의 손상이 있을 수 있다.
	 * 
	 * */

	//자동형변환 : 작은바이트 -> 큰바이트
	public void autoCasting() {
		//1. int(4byte) -> double(8byte)
		int i1 = 20;
		double d1 = /*(double)*/i1; //형변환 연산자가 생략되어있다.
	
		System.out.println("i1 : "+i1);
		System.out.println("d1 : "+d1);
		
		int i2 = 13;
		double d2 = 15.5;
		double result = /*(double)*/i2 + d2; //계산식을 변수처리-계산식 결과값이 변수상자에 담기게 된다.
		
		System.out.println("i2 + d2 : "+result);
		
		//2. int(4byte) -> long(8byte)
		int i3 = 1000;
		long l3 = i3;
		
		//L을 붙이지 않아도 문제가 발생하지 않는다 - 자동형변환이 되기 때문에.
		System.out.println("l3 : "+l3);
		
		//특이케이스 1)
		//보통은 작은크기에서 큰 크기로 변환하는 과정이 자동형변환이 되는데.
		//float는 4byte long은 8byte임에도 변환이 된다.
		//float의 표현수 범위가 long보다 더 넓기 때문에 가능하다.
		
		long l4 = 12000000;
		float f4 = l4;
		
		System.out.println("f4 : "+f4);
		
		//특이케이스 2)
		//char(2byte) <-> int(4byte) : 문자랑 int는 양방향 형변환이 가능하다.
		//참고 : 아스키코드표
		char ch = 65;
		System.out.println("ch : "+ch);
		ch = 66;
		System.out.println("ch : "+ch);
		
		int num = 'C';
		System.out.println("num : "+num);
		
		System.out.println('밥');
		System.out.println((int)'밥');
		
		//특이케이스 3) byte와 short 간의 연산
		byte b1 =1;
		byte b2 =2;
		
//		byte resultB = b1+b2; 수의 연산이 되면서 int자료형으로 변환된다.
		byte resultB = (byte)(b1+b2); //강제형변환으로 대입 가능 - 결과값을 byte형으로 변환
	
		System.out.println("resultB : "+resultB);
	}
	
	//강제형변환  - 큰자료형 -> 작은 자료형으로.
	public void forceCasting() {
		//강제형변환 또는 명시적 형변환이라고 부른다.
		//(바꿀자료형)값
		//1.float [double(8byte) -> float(4byte)]
		float f1 = 4.0f; //float 강제형변환
		
		double d2 = 8.0;
		float f3 = (float)d2; //강제형변환
		
		//2.double(8byte) -> int(4byte)
		double d4 = 13.6;
		int i4 = (int)d4;
		System.out.println("i4 : "+i4); // 13
		//0.6의 값이 손상되었다 값의 손실.
		
		//int자료형과 double 자료형 계산
		int iNum = 10;
		double dNum = 5.5;
		System.out.println("iNum X dNum :"+(int)(iNum*dNum));
		//int와 double의 연산시 결과값은 더 큰 자료형인 double 자료형을 따르게 된다.
		//이때 int 자료형으로 바꾸고 싶다면 (int)강제 형변환을 해주면 소수점을 없앨수있다.
	}
	
	
	
}
