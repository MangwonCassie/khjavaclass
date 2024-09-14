package com.kh.ex01.controller;

import java.util.ArrayList;

import com.kh.ex01.model.vo.Book;

public class BookManager {
	private ArrayList<Book> bookList = new ArrayList<>();
	
	public BookManager() {
		bookList.add(new Book("원피스",4,"오다"));
		bookList.add(new Book("쿨피스",3,"오다"));
		bookList.add(new Book("투피스",2,"오다"));
		bookList.add(new Book("스키를 잘타는법",1,"김보드"));
	}
	public int  insertBook(Book book) {
		int lastNo =0;
		
		//마지막 도서 번호 뽑기
		try {
			lastNo=bookList.get(bookList.size()-1).getBookNo()+1; 
		}catch(Exception e) {
			lastNo=1;
		}
		//해당 도서번호 넘겨받은 도서에 추가하기
		book.setBookNo(lastNo);
		//도서번호가 추가된 도서를 도서목록에 추가하기 
		bookList.add(book);
		
		return lastNo;//만약 추가가 되었다면 번호가 0이 아닐테니 확인용도로 
	}
	public int deleteBook(int bookNo) {
		
		int result=0;//성공 실패 여부 담을 변수
		
		for(int i=0;i<bookList.size();i++) {
			//인덱스 i번째 있는 도서의 도서번호가 넘겨받은 도서번호와 일치하다면?
			if(bookList.get(i).getBookNo()==bookNo) {
				//해당 인덱스에 있는 도서 삭제
				bookList.remove(i);
				result++;
				break;//삭제되었으면 더이상 반복해줄 필요 없음.
			}
		}
		
		return result;
	}
	public ArrayList<Book> searchBook(String title){
		ArrayList<Book> searchList = new ArrayList<Book>();
		for(int i=0;i<bookList.size();i++) {
			//인덱스 i번째 위치한 도서의 제목에 전달받은 제목이 포함되어있는지
			if(bookList.get(i).getTitle().contains(title)) {
				//해당 도서가 있다면 검색목록에 추가하기
				searchList.add(bookList.get(i));
			}
		}
		return searchList;//추가한 목록 반환하기
	}
	public ArrayList<Book> selectList(){
		//도서 목록 리스트 주소값 반환
		return bookList;
	}
	
	
	
	
	
	
	
}
