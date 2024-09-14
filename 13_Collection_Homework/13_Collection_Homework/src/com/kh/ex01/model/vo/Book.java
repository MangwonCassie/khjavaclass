package com.kh.ex01.model.vo;

public class Book {
	private int bookNo; //도서번호
	private String title;//도서 제목
	private int category;//장르 분류 번호
	private String author;//도서 저자
	
	
	public Book() {
		super();
	}
	public Book(String title, int category, String author) {
		super();
		this.title = title;
		this.category = category;
		this.author = author;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//카테고리 번호별 문자열 반환 메소드 
	public String categoryStr(int category) {
		//만약 전달받았을때
		String str=null;
//		switch(this.category) {
		switch(category) {
		case 1: str="인문";break;
		case 2: str="자연과학";break;
		case 3: str="의료";break;
		case 4: str="기타";break;
		}
		return str;
	}
	
	
	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", title=" + title + ", category=" + categoryStr(category) + ", author=" + author + "]";
	}
	
	
	
}
