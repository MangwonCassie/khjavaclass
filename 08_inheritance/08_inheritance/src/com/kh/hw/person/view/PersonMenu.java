package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	
	public void mainMenu() {
		
		while(true) {
		
		int[] count = pc.personCount();
		int studentCount = count[0];
		int emplyoeeCount = count[1];
		System.out.println("학생은 최대 "+pc.getS().length+"명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 학생은 "+studentCount+"명입니다.");
		System.out.println("사원은 최대 "+pc.getE().length+"명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 사원은 "+emplyoeeCount+"명입니다.");
		System.out.println();
		System.out.println("1.학생 메뉴");
		System.out.println("2.사원 메뉴");
		System.out.println("9.끝내기");
		System.out.println("메뉴 번호");
		
		int select = sc.nextInt();
		sc.nextLine();
		
		switch(select) {
			case 1: studentMenu(); break;
			case 2: employeeMenu(); break;
			case 9: System.out.println("종료합니다."); return;
			default : System.out.println("잘못 입력하셨습니다. 다시입력해주세요.");
		}
		
		}
		
	}
	
	public void studentMenu() {
		
		while(true) {
			System.out.println("1.학생 추가");
			System.out.println("2.학생 보기");
			System.out.println("9.메인으로");
			
			int studentCount = pc.personCount()[0];
			int maxCount = pc.stCount();
			if(studentCount==maxCount) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더이상 활성화 되지 않습니다.");
			}
			int select = sc.nextInt();
			sc.nextLine();
			
			switch(select) {
			case 1: if(studentCount==maxCount) {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					}else {
						insertStudent();
					}
			break;
			case 2: printStudent(); break;
			case 9: System.out.println("메인으로 돌아갑니다."); return;
			default : System.out.println("잘못 입력하셨습니다. 다시입력해주세요.");
			}
		}
		
	}
	
	public void employeeMenu() {
		while(true) {
			System.out.println("1.사원 추가");
			System.out.println("2.사원 보기");
			System.out.println("9.메인으로");
			
			int employeeCount = pc.personCount()[1];
			int maxCount = pc.getE().length; //사원 최대 등록가능 수 
			if(employeeCount==maxCount) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더이상 활성화 되지 않습니다.");
			}
			int select = sc.nextInt();
			sc.nextLine();
			
			switch(select) {
			case 1: if(employeeCount==maxCount) {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					}else {
						insertEmployee();
					}
			break;
			case 2: printEmployee(); break;
			case 9: System.out.println("메인으로 돌아갑니다."); return;
			default : System.out.println("잘못 입력하셨습니다. 다시입력해주세요.");
			}
		}
	}
	
	public void insertStudent() {
		
		while(true) {
			System.out.println("학생 이름 : ");
			String name = sc.nextLine();
			System.out.println("학생 나이 : ");
			int age = sc.nextInt();
			System.out.println("학생 키 : ");
			double height = sc.nextDouble();
			System.out.println("학생 몸무게 : ");
			double weight = sc.nextDouble();
			System.out.println("학생 학년 : ");
			int grade = sc.nextInt();
			sc.nextLine();
			System.out.println("학생 전공 : ");
			String major = sc.nextLine();
			
			pc.insertStudent(name, age, height, weight, grade, major);
			if(pc.personCount()[0]==3){
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
				return; 
			}else {
				System.out.println("그만하시려면 N/n을 이어하시려면 아무 키를 입력하세요.");
				String input = sc.nextLine();
				//n또는N을 눌렀을때 끝내기 
				if(input.toLowerCase().equals("n")) {
					return;
				}
			}
		}
	}
	
	public void printStudent() {
		Student[] s = pc.printStudent();
		
		for(int i=0; i<s.length;i++) {
			if(s[i]!=null) {
				//print문에서 참조변수를 넣어주면 Object클래스의 toString이 실행된다
				//이때 재정의한 toString이 있다면 해당 기능이 수행된다.
				//오버라이딩 특성 : 재정의한 메소드가 있다면 자식메소드가 우선권을 갖는다.
				System.out.println(s[i]/*toString()*/);
			}
		}
	}
	
	public void insertEmployee() {
		while(true) {
			System.out.println("사원 이름 : ");
			String name = sc.nextLine();
			System.out.println("사원 나이 : ");
			int age = sc.nextInt();
			System.out.println("사원 키 : ");
			double height = sc.nextDouble();
			System.out.println("사원 몸무게 : ");
			double weight = sc.nextDouble();
			System.out.println("사원 급여 : ");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.println("사원 부서 : ");
			String dept = sc.nextLine();
			
			pc.insertEmployee(name, age, height, weight, salary, dept);
			if(pc.personCount()[1]==pc.emCount()){
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
				return; 
			}else {
				System.out.println("그만하시려면 N/n을 이어하시려면 아무 키를 입력하세요.");
				String input = sc.nextLine();
				//n또는N을 눌렀을때 끝내기 
				if(input.toLowerCase().equals("n")) {
					return;
				}
			}
		}
	}
	
	public void printEmployee() {
		Employee[] e = pc.printEmployee();
		
		for(int i=0; i<e.length;i++) {
			if(e[i]!=null) {
				//print문에서 참조변수를 넣어주면 Object클래스의 toString이 실행된다
				//이때 재정의한 toString이 있다면 해당 기능이 수행된다.
				//오버라이딩 특성 : 재정의한 메소드가 있다면 자식메소드가 우선권을 갖는다.
				System.out.println(e[i]/*toString()*/);
			}
		}
	}
}
