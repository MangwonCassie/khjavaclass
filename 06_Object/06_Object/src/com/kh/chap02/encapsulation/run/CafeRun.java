package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.CafeMenu;

public class CafeRun {

	public static void main(String[] args) {
		CafeMenu ame = new CafeMenu();
		ame.setName("아메리카노");
		ame.setKind("음료");
		ame.setPrice(1800);
		ame.setEvent(true);
		
		CafeMenu fra = new CafeMenu();
		fra.setName("프라푸치노");
		fra.setKind("음료");
		fra.setPrice(3500);
		
		CafeMenu pa = new CafeMenu();
		pa.setName("파니니");
		pa.setKind("식사");
		pa.setPrice(2800);
		pa.setEvent(true);
		
		CafeMenu cro = new CafeMenu();
		cro.setName("크로크무슈");
		cro.setKind("식사");
		cro.setPrice(3300);
		
		System.out.println("이름\t종류\t가격\t행사여부");
		ame.print();
		fra.print();
		pa.print();
		cro.print();
		System.out.println();
		System.out.println("문자열 활용");
		System.out.println(ame.info());
		System.out.println(fra.info());
		System.out.println(pa.info());
		System.out.println(cro.info());
		
	}

}
