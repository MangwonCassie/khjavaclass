package com.kh.chap01_ex.controller;

import com.kh.chap01_ex.model.vo.Desktop;
import com.kh.chap01_ex.model.vo.NoteBook;
import com.kh.chap01_ex.model.vo.Product;
import com.kh.chap01_ex.model.vo.Tablet;

public class Poly_pc {
	//필드부
	Product[] pArr = new Product[3];
	
	
	//메소드
	//Product p = new Desktop();
	//Product p2 = new NoteBook();
	//Product p3 = new Tablet();
	
	public void insert(Product p,int num) {
		this.pArr[num] = p;
	}
	
	public Product select(int num) {
		
		return pArr[num];
	}
	
	//booting 메소드 매개변수 다형성 적용 전 
	public String booting(Desktop d) {
		return d.booting();
	}
	public String booting(NoteBook note) {
		return note.booting();
	}
	public String booting(Tablet tab) {
		return tab.booting();
	}
	
	//booting메소드 매개변수에 다형성 적용 후 
	//객체마다 실행되는 구문 다르게 작성해보기
	public String booting(Product p) {
		return p.booting();
	}

}
