package com.kh.chap01_poly.run;

import com.kh.chap01_poly.model.vo.Galaxy;
import com.kh.chap01_poly.model.vo.Iphone;
import com.kh.chap01_poly.model.vo.Phone;

public class Run {

	public static void main(String[] args) {
		
		Phone p = new Phone();
		System.out.println("Phone의 기능");
		p.call();
		p.camera();
		p.sms();
		
		System.out.println("===Iphone의 기능===");
		Iphone ip = new Iphone();
		ip.call();
		ip.camera();
		ip.sms();
		
		System.out.println("===갤럭시의 기능====");
		Galaxy g = new Galaxy();
		g.call();
		g.camera();
		g.sms();
		
		//Phone이라는 부모클래스의 범위로 자식 객체들을 다뤄보자 
		Phone p2 = new Iphone();
		
		Phone p3 = new Galaxy();
		
		System.out.println("===부모클래스 타입으로 아이폰 만들기 ===");
		p2.call();
		p2.camera();
		p2.sms();
		
		System.out.println("===부모클래스 타입으로 갤럭시 만들기 ===");
		p3.call();
		p3.camera();
		p3.sms();
		
	}

}
