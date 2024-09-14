package com.kh.chap01_ex.controller;

import com.kh.chap01_ex.model.vo.Desktop;
import com.kh.chap01_ex.model.vo.NoteBook;
import com.kh.chap01_ex.model.vo.Tablet;

//다형성을 적용하기 전 
public class ProductController1 {
	//필드부
	private Desktop desk;
	private NoteBook note;
	private Tablet tab;
	
	
	//메소드 
	//추가메소드
	public void insert(Desktop desk) {
		this.desk = desk;
	}
	public void insert(NoteBook note) {
		this.note = note;
	}
	public void insert(Tablet tab) {
		this.tab = tab;
	}
	
	//getter메소드 역할
	public Desktop selectDesktop() {
		return desk;
	}
	public NoteBook selectNoteBook() {
		return note;
	}
	public Tablet selectTablet() {
		return tab;
	}
	
	
	
	
	

}
