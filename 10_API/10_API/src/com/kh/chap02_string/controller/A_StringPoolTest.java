package com.kh.chap02_string.controller;

public class A_StringPoolTest {
	//String 클래스 : 불변클래스 (변하지 않는 클래스)
	//수정을 하는 순간 기존의 값이 담겨있던 공간에서 수정되지 않고 
	//새로운 객체가 생성된후 주소값을 바꿔준다.
	
	//1. 생성자를 통한 문자열 담기
	public void method1() {
		String str = new String("안녕하세요");
		String str2 = new String("안녕하세요");
		
		//String 클래스의 toString() 메소드는 담겨있는 문자열을 반환하게끔 재정의 되어있다.
		System.out.println(str/*.toString()*/);
		System.out.println(str2);
		
		//eqauls() 메소드
		System.out.println(str.equals(str2));
		//Object의 equals()메소드는 주소값 비교 메소드이지만 String 클래스에서
		//문자열 비교로 재정의 하였기때문에 비교용도로 사용 가능하다.
		
		//hashCode() 메소드
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		//hashCode()는 주소값 기반으로 해쉬화한 숫자를 돌려주는데 
		//String 클래스에서는 문자열을 기반으로 해쉬화하여 돌려준다.
		
		//주소값을 기반으로 처리된 값을 알고 싶다면
		//System.identityHashCode(참조변수명);
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str2));
		
		System.out.println(str==str2);//주소값 비교하기
	}
	
	//2.문자열을 리터럴로 생성(값대입)
	public void method2() {
		String str = "안녕";
		String str2 = "안녕";
		
		//toString() 메소드
		System.out.println(str);
		System.out.println(str2);
		
		//equals() 메소드
		System.out.println(str.equals(str2)); 
		
		//hashCode() 메소드
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		
		//System.identityHashCode() 메소드
		System.out.println(System.identityHashCode(str));//1829164700
		System.out.println(System.identityHashCode(str2));
		
		//주소값 비교
		System.out.println(str==str2);//true
		
		//값 대입 연산자로 문자열을 작성하면(리터럴) 기존의 문자열이 있는지 없는지 String Pool(상수풀)에서
		//확인 후에 있다면 해당 문자열의 주소값을 반환하고, 없다면 생성한다.
		str+="하세요";
		System.out.println(System.identityHashCode(str));//2018699554
		//불변클래스이기 때문에 기존 주소값위치에서 수정되는 것이 아니라 새로운 객체를 참조하게 된다.
	}
	
	public void method3() {
		//불변클래스인 문자열을 여러번 더해보면 어떻게 될까?
		
		String str="안녕";
		//시간측정하기
		//1970년 1월1일부터 지금까지 얼마나 시간이 흘렀는지 알려주는 메소드 0.001초 단위 
		long start = System.currentTimeMillis(); //-지금시점 시간 담기 
		for(int i=0;i<200000;i++) {
			str+="안녕";
			System.out.println(System.identityHashCode(str));
		}
		long finish = System.currentTimeMillis(); //-작업 끝난 시점 시간 담기 
		
		System.out.println("시작 시간 : "+start);
		System.out.println("끝난 시간 : "+finish);
		System.out.println("걸린 시간 : "+(finish-start));
		//만번 : 85 / 5만번 : 2175 /10만번 : 5153 /  20만번 : 18545
	}
	
	
	public void method4() {
		//문자열의 단점 
		//불변클래스이기 때문에 합성이 느려진다(새 메모리 영역을 매번 할당받아야 하기 때문에.)
		//그래서 문자열의 합성은 가변 클래스를 이용한다.
		//StringBuilder / StringBuffer
		//차이점
		//StringBuffer는 동기화가 되어서 안전하지만 처리속도가 상대적으로 느리다.
		//StringBuilder는 동기화가 되지 않아서 상대적으로 빠르지만 안전하지 않다(처리도중 문제발생 가능)
		
//		StringBuffer sb = new StringBuffer();
		StringBuilder sb = new StringBuilder();
		
		//버퍼와 빌더 모두 합성 메소드 : append() 메소드 사용
		String str = "안녕";
		long start = System.currentTimeMillis(); 
		for(int i=0; i<200000; i++) {
			sb.append(str);
			System.out.println(System.identityHashCode(sb));//주소값 확인
		}
		long finish = System.currentTimeMillis();
		
		System.out.println("걸린 시간 : "+(finish-start));
		//버퍼 : 만번 : 30 / 5만번 : 201 / 10만번 : 304 / 20만번 : 646
		//빌더 : 만번 : 30 / 5만번 : 164 / 10만번 : 321 / 20만번 : 606 
	}
	
	
	
	
	
}
