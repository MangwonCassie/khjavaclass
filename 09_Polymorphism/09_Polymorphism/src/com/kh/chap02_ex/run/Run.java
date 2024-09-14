package com.kh.chap02_ex.run;

import com.kh.chap02_ex.model.vo.Galaxy;
import com.kh.chap02_ex.model.vo.Iphone;
import com.kh.chap02_ex.model.vo.Phone;

public class Run {
	public static void main(String[] args) {
		
		/*
		 * 핸드폰 추상클래스를 만들고 
		 * 핸드폰이라면 있어야하는 규칙같은 기능 3가지 추상메소드로 만들고
		 * 핸드폰 클래스 2개(다른종류) 작성하여 핸드폰 추상클래스 상속받아
		 * 오버라이딩하고 출력까지 해보세요
		 * 
		 * */
		
		Phone gx = new Galaxy();
		Phone ip = new Iphone();
		Iphone ip2 = new Iphone();
		
		ip2.call();
		
		gx.call();
		gx.sms();
		gx.camera();
		
		ip.call();
		ip.sms();
		ip.camera();
		
	}

}
