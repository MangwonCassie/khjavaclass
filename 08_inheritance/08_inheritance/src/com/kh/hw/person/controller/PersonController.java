package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	public int[] personCount() {
		int[] count = new int[2];
		
		//학생 객체 수 
		for(int i=0; i<s.length;i++) {
			if(s[i]!=null) { //s배열의 i번째 인덱스가 비어있지 않다면
				count[0]++;//만들어놓은 정수배열 0번인덱스에 +1을해서 카운트
			}
		}
		//사원 객체 수 
		for(int i=0; i<e.length;i++) {
			if(e[i]!=null) { //e배열의 i번째 인덱스가 비어있지 않다면
				count[1]++; //만들어놓은 정수배열 1번인덱스에 +1을해서 카운트
			}
		}
		return count;
	}
	
	public void insertStudent(String name,int age,double height,double weight,int grade,String major) {
		for(int i=0;i<s.length;i++) {
			if(s[i]==null) {
				s[i] = new Student(name,age,height,weight,grade,major);
				return; //추가했으니 반복 벗어나기(돌아가기)
			}
		}
	}
	public Student[] printStudent() {
		
		return s;
	}
	public void insertEmployee(String name,int age,double height,double weight,int salary,String dept) {
		for(int i=0;i<e.length;i++) {
			if(e[i]==null) {
				e[i] = new Employee(name,age,height,weight,salary,dept);
				return; //추가했으니 반복 벗어나기(돌아가기)
			}
		}
	}
	
	public Employee[] printEmployee() {

		return e;
	}

	public Student[] getS() {
		return s;
	}

	public void setS(Student[] s) {
		this.s = s;
	}

	public Employee[] getE() {
		return e;
	}

	public void setE(Employee[] e) {
		this.e = e;
	}
	
	//최대 등록 가능한 사원수 반환 메소드 
	public int emCount() {
		return e.length;
	}
	//최대 등록 가능한 학생 수 반환 메소드
	public int stCount() {
		return s.length;
	}
	
	
}
