package com.kh.third;

public class Run {
	public static void main(String[] args) {
		//만들어져있는 메소드들을 호출하여 실행
		/*
		dog();
		cat();
		call();
		Run클래스에는 dog(),cat(),call() 메소드가 없기 때문에 호출할 수 없음.
		호출하고자한다면 해당 기능이 구현되어있는 클래스파일을 메모리영역에 올려서 사용해야한다.
		그것을 객체 생성이라고 한다.
		메소드들이 있는 클래스 파일의 객체를 생성해야한다.
		지금 이 경우에서는 MethodTest 클래스의 객체를 생성해야함.
		*/
		//객체 생성
		//타입 변수명 = new 클래스명();
		MethodTest mt = new MethodTest(); 
		//객체 생성 작업으로 해당 클래스에 있는 기능을 사용할 준비를 마친것.
		mt.dog();
		mt.cat();
		mt.call();
		
	}

}
