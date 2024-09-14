package com.kh.second;

//풀네임 : com.kh.second.MethodTest 
//주의사항) 패키지명은 항상 소문자로 작성할것. 
//클래스의 첫글자는 대문자이기때문에 혼동의 여지가 있으니 패키지는 항상 소문자로 작성한다.
public class MethodTest {
	
	//main메소드
	public static void main(String[] args) {
		methodA();
//		methodB();
	}
	
	//method A 
	public static void methodA() {
		methodB();
		//실행할 내용
		System.out.println("메소드 A 호출됨.");
		//method B 호출
	}
	
	//method B
	public static void methodB() {
		//method A를 호출
//		methodA(); //무한반복에 빠지기 때문에 메모리가 버티지 못하고 StactOverFlowError 발생 
		
		//실행할 내용
		System.out.println("메소드 B 호출됨.");
	}
	
	
}
