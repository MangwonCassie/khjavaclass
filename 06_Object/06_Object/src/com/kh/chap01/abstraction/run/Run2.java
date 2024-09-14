package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.model.vo.Student;

public class Run2 {
	public static void main(String[] args) {
		
		Student s = new Student();
		
		Student a = new Student();
		
		Student b = new Student();
		
		
		System.out.println("s : "+s.name);
		System.out.println("a : "+a.name);
		System.out.println("b : "+b.name);
		
//		s.name="박보검"; private으로 막음
		s.setName("박보검");
		a.setName("송혜교");
		b.setName("박명수");
		
		System.out.println(s.name);
		System.out.println(a.name);
		System.out.println(b.name);
		
		
		
	}

}
