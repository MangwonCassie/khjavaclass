package com.kh.chap01_ex.run;

import com.kh.chap01_ex.controller.Poly_pc;
import com.kh.chap01_ex.model.vo.Desktop;
import com.kh.chap01_ex.model.vo.NoteBook;
import com.kh.chap01_ex.model.vo.Tablet;class ProductRun2 {

	public static void main(String[] args) {
		//다형성 적용하여 다뤄보기 
		Poly_pc pc = new Poly_pc();
		
		pc.insert(new Desktop("노브랜드","가성비최고 컴퓨터",990000,"amd4070"), 0);
		pc.insert(new NoteBook("삼성","갤럭시북",1350000,3), 1);
		pc.insert(new Tablet("애플","아이패드 프로5",1800000,true), 2);
		
		System.out.println(pc.select(0));
		System.out.println(pc.select(1));
		System.out.println(pc.select(2));
		
		System.out.println(pc.booting(new Desktop()));
		System.out.println(pc.booting(new NoteBook()));
		System.out.println(pc.booting(new Tablet()));
		
		
		
		
	}

}
