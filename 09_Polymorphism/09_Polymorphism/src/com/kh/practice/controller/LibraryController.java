package com.kh.practice.controller;

import com.kh.practice.model.vo.AniBook;
import com.kh.practice.model.vo.Book;
import com.kh.practice.model.vo.CookBook;
import com.kh.practice.model.vo.Member;

public class LibraryController {
	private Member mem = null;
	private Book[] bList = new Book[5];
	
	
	{//초기화 블럭
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}
	
	public void insertMember(Member mem) {
		this.mem = mem;
	}
	
	public Member myInfo() {
		
		return mem;
	}
	
	public Book[] selectAll() {
		
		return bList;
	}
	
	public Book[] searchBook(String keyword) {
		Book[] searchBook = new Book[bList.length];
		
		int count=0;//인덱스용
		for(int i=0;i<bList.length;i++) {
			//문자열.contains(비교문자열) : 비교문자열이 문자열에 포함되어 있는지 알려주는 메소드
			if(bList[i].getTitle().contains(keyword)) {
				searchBook[count++] = bList[i];
			}
		}
		return searchBook;
	}
	
	public int rentBook(int index) {
		int result=0;
		//index에 해당하는 책이 만화책이고 회원 나이가 만화책 제한 나이보다 적을 경우 
		//result 1로 초기화
		Book b = bList[index];
		if(b instanceof AniBook &&
				((AniBook)b).getAccessAge()>mem.getAge()) {
			result = 1;
		}else if(b instanceof CookBook &&
				((CookBook)b).isCoupon()) {
			//현재 쿠폰 개수 + 1을 해야한다.
			mem.setCouponCount(mem.getCouponCount()+1);
			result = 2;
		}
		return result;
	}
}
