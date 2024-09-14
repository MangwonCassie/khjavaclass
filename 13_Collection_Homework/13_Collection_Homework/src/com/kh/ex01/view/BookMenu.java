package com.kh.ex01.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.ex01.controller.BookManager;
import com.kh.ex01.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookManager bm = new BookManager();
	
	
	public BookMenu() {
		
	}
	
	public void mainMenu() {
		while(true) {
			System.out.println("도서 관리 프로그램");
			System.out.println("1.새 도서 추가");
			System.out.println("2.도서 삭제");
			System.out.println("3.도서 검색 출력");
			System.out.println("4.전체 출력");
			System.out.println("0.끝내기");
			System.out.println("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1: insertBook(); break;
			case 2: deleteBook(); break;
			case 3: searchBook(); break;
			case 4: selectList(); break;
			case 0: System.out.println("프로그램 종료");return;
			default : System.out.println("잘못 입력하셨습니다. 다시입력해주세요");
			}
			
		}
		
	}
	//도서 추가
	public void insertBook() {
		System.out.println("===도서 추가===");
		System.out.println("도서 제목 : ");
		String title = sc.nextLine();
		System.out.println("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타): ");
		int category = sc.nextInt();
		sc.nextLine();
		System.out.println("도서 저자 : ");
		String author = sc.nextLine();
		
		Book book = new Book(title,category,author);
		int count = bm.insertBook(book);
//		한줄표현
//		bm.insertBook(new Book(title,category,author));
		if(count>0) {
			System.out.println("성공적으로 도서가 추가되었습니다.");
		}else {
			System.out.println("도서 추가 실패");
		}
	}
	//도서 삭제
	public void deleteBook() {
		System.out.println("도서 번호 :");
		int bookNo = sc.nextInt();
		sc.nextLine();
		
		int result = bm.deleteBook(bookNo);
		
		if(result==1) {
			System.out.println("성공적으로 삭제");
		}else {
			System.out.println("삭제할 도서가 존재하지 않습니다.");
		}
		
	}
	//도서 검색
	public void searchBook() {
		System.out.println("도서 제목 : ");
		String title = sc.nextLine();
		ArrayList<Book> searchList = bm.searchBook(title);
		
		if(searchList.isEmpty()) {
			System.out.println("검색 결과가 존재하지 않습니다.");
		}else {
			for(Book b : searchList) {
				System.out.println(b);
			}
		}
		
		
	}
	//전체조회
	public void selectList() {
		System.out.println("===전체조회===");
		ArrayList<Book> bookList = bm.selectList();
		
		if(bookList.isEmpty()) {//비어있는 경우
			System.out.println("도서 목록이 비어있습니다.");
		}else {//도서가 한권이라도 있는 경우
			for(Book b : bookList) {
				System.out.println(b);
			}
		}
	}
			

}
