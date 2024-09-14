package com.kh.operator;

public class B_InDecrease {
	/*
	 * 증감연산자 : 단항 연산자로서 한번에 1씩 증가 하거나 1씩 감소하는 연산을 한다.
	 * -먼저 증감을 할것인지 나중에 증감을 할것인지 연산자의 위치에 따라 달라진다.
	 * [표현법]
	 * ++ : 값을 1씩 증가시키는 연산자
	 * -- : 값을 1씩 감소시키는 연산자
	 * 
	 * 연산자의 위치
	 * 전위연산 : ++값, --값 (먼저 1을 증감처리한 후 그 값을 처리한다)
	 * 후위연산 : 값++, 값-- (값을 먼저 처리한 후에 증감을 수행한다)
	 * */
	
	//후위연산
	public void method1() {
		
		int num = 10;
		System.out.println("num : "+num);
		num++; // num 값에 +1을 하겠다.
		System.out.println("num++ : "+num);
		
		num--; // num 값에 -1을 하겠다.
		System.out.println("num-- : "+num); // 10 
		
		System.out.println("num : "+ num++); // 10 선처리 후 증감이기 때문에 10이 출력
		System.out.println("num : "+num); // 11 - 처리가된 이후 증감까지 되었기때문에 11 출력
	}
	
	//후위연산 
	public void method2() {
		int a = 10;
		int b = a++; // b에 a값인 10이 먼저 대입된 이후에 a가 증감된다.
		
		System.out.println("a : "+a); //11 
		System.out.println("b : "+b); //10
		
		int c = 20;
		int d = c--;
		
		System.out.println("c : "+c); //19
		System.out.println("d : "+d); //20
	}
	
	//전위연산
	public void method3() {
		int a = 10;
		int b = ++a; // a에 대한 증감이 먼저 이루어 진 후에 b에 대입된다.
		
		System.out.println("a : "+a); //11
		System.out.println("b : "+b); //11
		
		System.out.println("a : "+ --a); //10
		
		//전위
		/*
		 * int c = 10;
		 * int d = ++c;
		 */
		int c = 10; 
		++c;
		int d = c;
		
		//후위
//		int e = 10;
//		int f = e++;
		
		int e = 10;
		int f = e;
		e++;
		
		System.out.println("c : "+c);//11
		System.out.println("d : "+d);//11
		System.out.println("e : "+e);//11
		System.out.println("f : "+f);//10
		
	}
	
	public void method4() {
		//후위연산자 
//		int num1 = 20;
//		int result1 = num1++ * 3;
		
		int num1 = 20;
		int result1 = num1 * 3;
		num1++;
		
		
		//결과 ? num1 : 21  / result1 : 60
		
		System.out.println("num1 : "+num1);
		System.out.println("result1 : "+result1);
		
		//전위연산자
//		int num2 = 20;
//		int result2 = ++num2 * 3;
		
		int num2 = 20;
		++num2;
		int result2 = num2 * 3;
		
		//결과 ?  num2 : 21 / result2 : 63
		System.out.println("num2 : "+num2);
		System.out.println("result2 : "+result2);
		
		
	}
	
	
	
	

}
