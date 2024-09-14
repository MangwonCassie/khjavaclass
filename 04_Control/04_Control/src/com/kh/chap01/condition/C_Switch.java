package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch {

	/*
	 * switch문 [표현식] switch(아래에 기술할 값들과 동등비교를 할 대상){ case 값1 : 실행할 코드; - 대상자==값1 이
	 * true일 경우 실행할 코드 break; - switch 영역을 벗어난다. case 값2 : 실행할 코드; - 대상자==값2 가 true일
	 * 경우 실행할 코드 break; - switch 영역을 벗어난다. ... case 값n : 실행할 코드; - 대상자==값n 이 true일
	 * 경우 실행할 코드 break; - switch 영역을 벗어난다.
	 * 
	 * default : 실행할 코드; - if-else문에서 else와 같은 역할을 수행한다. 위에 case들을 모두 만족하지 않으면 실행할
	 * 코드를 작성한다. break를 적지 않는다(마지막에 실행되고 switch문을 벗어나기 때문) 또한 생략 가능하다. }
	 * 
	 * -switch문과 if문의 차이점 -if(조건식) -> 조건식에 범위 설정이 가능하다. -switch(대상자) ->범위설정 불가 식이
	 * 있더라도 값이 정해지는 식이여야한다.(동등비교)
	 * 
	 */

	public void method1() {
		// 홀수 짝수 판별 (양수인지 음수인지는 판별하지 않는다고 가정)
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 : ");
		int num = sc.nextInt();

		int result = num % 2;// 0:짝수 / 1:홀수

		switch (result) { // 계산된 결과값을 대상자로 지정
		case 0:
			System.out.println("짝수입니다.");
			break; // switch문을 벗어나라
		case 1:
			System.out.println("홀수입니다.");
			break;
		case 99:
			System.out.println("후후");
		}
		sc.close();

	}

	public void method2() {
		// 주민번호를 입력받아 성별을 판별해보세요. switch문으로
		Scanner sc = new Scanner(System.in);

		System.out.println("주민번호 입력해주세요 (-포함) : ");
		String pNum = sc.nextLine();
		char genNum = pNum.charAt(7);
		// int genNum = pNum.charAt(7);

		switch (genNum) { // 추출한 문자를 대상자로 지정하여 케이스 검색
		// 대상자와 case가 일치해야만 찾을 수 있음.
		case '1':
			System.out.println("남자입니다");
			break;
		case '2':
			System.out.println("여자입니다");
			break;
		case '3':
			System.out.println("남자입니다");
			break;
		case '4':
			System.out.println("여자입니다");
			break;
		default:
			System.out.println("잘못입력하신거 같은데요?");
		}

		sc.close();
	}

	// method2 간략하게 바꿔보기
	public void method2_1() {
		// 주민번호를 입력받아 성별을 판별해보세요. switch문으로
		Scanner sc = new Scanner(System.in);

		System.out.println("주민번호 입력해주세요 (-포함) : ");
		String pNum = sc.nextLine();
		char genNum = pNum.charAt(7);
		String result = ""; // 아래에서 변수를 사용하기 위해 빈문자열로 초기화

		switch (genNum) { // 추출한 문자를 대상자로 지정하여 케이스 검색
		// 대상자와 case가 일치해야만 찾을 수 있음.
		case '1':
		case '3':
			result = "남자입니다.";
			break;

		case '2':
		case '4':
			result = "여자입니다.";
			break;

		default:
			result = "잘못입력하셨읍니다.";
		}

		System.out.println(result);

		sc.close();
	}
	
	public void method3() {
		//문자열을 대상자로 지정하여 원하는 조건처리 해보기.
		//사용자에게 저녁메뉴를 입력받아
		//저녁메뉴의 가격을 출력해보자.
		//피자 : 20000원 , 치킨 : 15000원, 국밥 : 9000원
		// OO 메뉴는 OOO원입니다. 출력 
		
		//저녁메뉴 입력 받기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("메뉴를 입력해주세요 : ");
		String menu = sc.nextLine();
		int price = 0; //0이 int의 기본값 - 가격정보를 담을 변수설정
		
		switch(menu) {
		case "피자": price=20000;
		break;
		case "치킨": price=15000;
		break;
		case "국밥": price=9000;
		break;
//		default: System.out.println(menu+"는 없는 메뉴입니다.");
//		return; //나를 호출한 메소드로 돌아가는 키워드
		}
		if(price>0) {//가격이 변동있으면 - 즉 메뉴의 가격이 있다면 
			System.out.println(menu+"의 가격은 "+price+"원입니다.");
		}else {
			System.out.println(menu+"는 없는 메뉴입니다.");
		}
		
		sc.close();

	}
	
	public void method4() {
		//문자열 비교 메소드는 equals 메소드 이다.
		System.out.println("안녕하세요"=="안녕하세요"); //true - 같은 주소값을 비교했음
		
		String str = new String("안녕하세요"); //안녕하세요 - 객체생성
		
		String str2 = "안녕하세요";//안녕하세요
		
		String str3 = "안녕하세요";//저장소 공유 
		
		String str4 = new String("안녕하세요");//개인공간
		
		System.out.println("str : "+str);
		System.out.println("str2 : "+str2);
		System.out.println("str3 : "+str3);
		
		System.out.println(str==str2);
		
		//equals 메소드는 주소값이 아닌 문자열 데이터 자체를 비교한다.
		System.out.println("equals : "+ str.equals(str2));
		
	}
	
	public void method5() {
		//문자열 비교 equals() 메소드로 사용자에게 입력받은 아이디와 비밀번호를 확인해보자.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디를 입력해주세요 : ");
		String inputId = sc.nextLine(); //사용자에게 아이디 입력받기
		
		System.out.println("비밀번호를 입력해주세요 : ");
		String inputPwd = sc.nextLine(); //사용자에게 비밀번호 입력받기
		
		//이미 회원가입이 되었다는 가정을 하여 아이디와 비밀번호를 정해두자.
		String userId = "user01";
		String userPwd = "pass01";
		
		//사용자에게 입력받은 아이디와 비밀번호가 등록되어있는 아이디와 비밀번호와 일치한지 판별하기.
//		if(userId==inputId && userPwd==inputPwd) {
//			System.out.println("로그인 성공");
//		}else {
//			System.out.println("로그인 실패");
//		}
//		=======================================================
		//사용자에게 입력받은 아이디와 비밀번호가 등록되어있는 아이디와 비밀번호와 일치한지 판별하기.
		if(userId.equals(inputId) && userPwd.equals(inputPwd)) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
		/*
		 * 참조자료형은 동일비교가 불가능하다(== , !=).
		 * 참조자료형의 경우 (==,!=)비교를 할시 주소값을 비교하기 때문에 실제로 담겨있는 값을 비교할 수 없다.
		 * 그때문에 참조자료형 비교를 하려고 한다면 equals() 메소드를 이용해야한다.
		 * 
		 * -핵심 : 문자열 비교는 equals() 메소드를 이용한다. 
		 * [표현법]
		 * 문자열.equals(비교할문자열) - 결과값은 boolean타입으로 true/false 
		 * 
		 * */
		
		sc.close();
		
	}
	
	
}
