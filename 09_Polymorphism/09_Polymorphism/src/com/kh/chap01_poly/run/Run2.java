package com.kh.chap01_poly.run;

import com.kh.chap01_poly.model.vo.Galaxy;
import com.kh.chap01_poly.model.vo.Iphone;
import com.kh.chap01_poly.model.vo.Phone;

public class Run2 {

	public static void main(String[] args) {
		/*
		 * 다형성 
		 * 상속을 이용한 기술로 부모클래스로부터 상속받은 자식 클래스 타입의 객체를
		 * 부모클래스 타입으로 (형변환)하여 다루는 기술
		 * 추후 객체 배열에 적용시켜서 하나의 부모타입으로 객체배열을 생성하여
		 * 자식 객체들을 담아서 활용해볼것.
		 * */
		
		// = 를 기준으로 양쪽 항의 타입이 같아야한다는 규칙.
		//때문에 자료형을 맞춰주는 작업을 해야한다 
		//이때 부모 타입으로 자식타입이  자동형변환이 되는것을 (업캐스팅)이라한다.-생략가능
		//반대는 다운캐스팅(명시적 형변환을 진행해야함)-생략불가
		/*
		Phone iphone13 = new Iphone();//업캐스팅
		Phone galaxy20 = new Galaxy();
		
		iphone13.call();
		iphone13.camera();
		iphone13.sms();
		((Iphone)iphone13).siri();//다운캐스팅
		
		galaxy20.call();
		galaxy20.camera();
		galaxy20.sms();
		((Galaxy)galaxy20).samsungPay();
		*/
		//오버라이딩 개념이 적용된 메소드를 호출하면
		//부모클래스에 있는 원본 메소드가 아니라 
		//상속받은 자식 클래스에 있는 오버라이딩한 메소드가 호출된다.
		//때문에 오버라이딩 되어있는 메소드를 사용할땐 강제형변환을 하지 않아도 된다.
		//이처럼 런타임 시점에 변경되는것을 동적 바인딩이라고 한다. 
		//컴파일 시점에 등록되어있는것은 정적 바인딩.
		
		//부모클래스 타입의 객체 배열을 생성하여 자식 객체들을 넣어보자.
		Phone[] arr = new Phone[4];
		
		arr[0] = new Iphone();
		arr[1] = new Galaxy();
		arr[2] = new Iphone();
		arr[3] = new Galaxy();
		
		for(int i=0; i<arr.length; i++) {
//			((Iphone)arr[i]).siri();
			//Iphone이 아닌 객체를 형변환하려고 하면 오류발생(ClassCastException)
			//때문에 해당 클래스의 타입인지 확인하는 작업을 거쳐야한다.
			//이때 사용할 수 있는 연산자가 
			//클래스 instanceof 클래스  : 앞뒤 클래스타입이 같으면 true/아니면 false
			if(arr[i] instanceof Iphone) { //i번째 객체 타입이 Iphone이냐?
				((Iphone)arr[i]).siri();
			}else {//Iphone 타입이 아니라면
				((Galaxy)arr[i]).samsungPay();
			}
			
			System.out.println("================");
			Phone p = new Phone();
			Iphone p2 = new Iphone();
			System.out.println("Phone-Iphone : "+(p instanceof Iphone));
			System.out.println("Phone-Galaxy : "+(p instanceof Galaxy));
			System.out.println("Phone-Phone : "+(p instanceof Phone));
			System.out.println("Iphone-galaxy : "+(arr[0] instanceof Galaxy));
			System.out.println("Iphone-Phone : "+(arr[0] instanceof Phone));
		}
	}

}
