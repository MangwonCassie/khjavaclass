package com.kh.chap02_override.run;

import com.kh.chap02_override.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		
		Book b = new Book("용과 함께",15000);
		
		System.out.println(b.toString());
		//print문에선 toString()이 내부적으로 실행되니
		//재정의를 했다면 그냥 참조변수만 사용해도 재정의된 toString의 기능을 수행한다.
		System.out.println(b/*.toString()*/);
		
	}

}
