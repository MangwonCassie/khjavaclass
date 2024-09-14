package com.kh.chap04_constructor.run;

import com.kh.chap04_constructor.model.vo.Singer;

public class SingerRun {

	public static void main(String[] args) {
		
//		Singer s = new Singer("이승기");
		Singer s2 = new Singer("아이유");
		Singer s3 = new Singer("아이유","너랑나","2000-01-01");
		Singer s4 = new Singer("뉴진스","하입보이요","2022-10-10");
		
		
		System.out.println(s3.toString());
		System.out.println(s4.toString());
		
	}

}
