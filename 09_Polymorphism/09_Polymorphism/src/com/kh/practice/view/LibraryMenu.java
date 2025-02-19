package com.kh.practice.view;

import java.util.Scanner;

import com.kh.practice.controller.LibraryController;
import com.kh.practice.model.vo.Book;
import com.kh.practice.model.vo.Member;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("성별 : ");
		char gender = sc.nextLine().charAt(0);
		
		//입력받은 데이터 Member 객체로 가공하기 
		Member m = new Member(name,age,gender);
		lc.insertMember(m);
		
		while(true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1.마이페이지");
			System.out.println("2.도서 전체 조회");
			System.out.println("3.도서 검색");
			System.out.println("4.도서 대여하기");
			System.out.println("9.프로그램 종료하기");
			System.out.println("메뉴 번호 : ");
			
			int select = sc.nextInt();
			sc.nextLine();
//			Member mem = lc.myInfo();
			switch(select) {
			case 1: System.out.println(lc.myInfo()); break;
			case 2: selectAll(); break;
			case 3:	searchBook(); break;
			case 4: rentBook(); break;
			case 9: System.out.println("프로그램을 종료합니다."); return;
				default : System.out.println("잘못입력하셨습니다.");
			}
		}
	}
	
	public void selectAll() {
		Book[] bList = lc.selectAll();
		
		for(int i=0;i<bList.length;i++) {
			System.out.println(i+"번도서 : "+bList[i]);
		}
		
	}
	
	public void searchBook() {
		System.out.println("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		Book[] searchList = lc.searchBook(keyword);
		
		for(int i=0; i<searchList.length; i++) {
			if(searchList[i]!=null) {
				System.out.println(searchList[i]);
			}else {
				break;
			}
		}
	}
	public void rentBook() {
		selectAll();
		System.out.println("\r대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		sc.nextLine();
		int result = lc.rentBook(index);
		
		if(result==0) {
			System.out.println("성공적으로 대여되었습니다.");
		}else if(result==1) {
			System.out.println("나이 제한으로 대여 불가능 합니다.");
		}else {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니"
								+ "마이페이지에서 확인하세요.");
		}
//		switch(result) {
//		case 1:System.out.println("나이 제한으로 대여 불가능 합니다."); break;
//		case 2:System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니"
//				+ "마이페이지에서 확인하세요."); break;
//		case 0:System.out.println("성공적으로 대여되었습니다.");break;
//		}
		
		
		
	}
	

}
