package com.kh.variable;

public class A_Variable {
	
	//변수의 필요성
	//시급과 근무시간과 근무일수를 계산하여 월급을 알려주는 메소드(기능)
	public void calPay() {
		//변수를 사용하기 전과 후로 나누어서 계산을 해보자.
		System.out.println("시급 : 9620원"); //시급
		System.out.println("근무시간 : 8시간"); //근무 시간
		System.out.println("근무일수 : 8일"); //근무일 수
		
		//월급 = 시급 X 근무 시간 X 근무일 수
		//박보검 : OOOOO원 형식으로 출력하고자 한다.
		//문자열은 " " 쌍따음표로 표현하고 곱셈은 * 로 표현 덧셈은 +로 표현한다.
		System.out.print("박보검 : ");
		System.out.print(9620 * 8 * 8);
		System.out.println("원");
		
		//문자열과 숫자 계산을 한줄로 표현하기.
		//문자열은 덧셈 연산으로 문자를 이어준다.
		System.out.println("조정석 : "+9620 * 8 * 8+"원");
		//문자열과 다른 자료형을 더해주고싶다면(이어붙이고 싶다면) 덧셈 연산을 이용하면 된다.
		//단, 문자열과 더해지는 모든 자료형은 문자열 자료형으로 변환된다.
		
		//만약 위 상황에서 팁으로 10000원을 받았다고 가정하여 계산해보자.
//		System.out.println("송혜교 : "+9620 * 8 * 8 + 10000 +"원");
		//위 상황에서 연산자 우선순위가 적용되어 곱셈연산은 되었지만 숫자 덧셈 연산은 되지 않았다.
		//문자열 처리가 되어버림, 이를 방지하기 위해 연산자 우선순위를 적용시켜야한다. ()로 우선순위 지정
		System.out.println("서강준 : "+(9620 * 8 * 8 +10000)+"원");
		
		System.out.println("=======변수 사용 후=======");
		//각 시급과 근무일 수,근무 시간을 변수에 담아서 활용해보자.
//		자바에서 ' = ' 기호는 같다가 아니라 오른쪽항을 왼쪽에 대입해라 라는 뜻.
		int pay = 10000; //시급  
		int time = 8; //근무 시간
		int day = 8; // 근무일 수
		int result = pay*time*day;
		
//		System.out.println("시급 : 9620원"); //시급
//		System.out.println("근무시간 : 8시간"); //근무 시간
//		System.out.println("근무일수 : 8일"); //근무일 수
		
//		System.out.println("시급 : pay"); //변수도 문자열안에 포함이되면 문자열처리가 되어버린다.
		System.out.println("시급 : " + pay);
		System.out.println("근무 시간 : " + time);
		System.out.println("근무일 수 : " + day);
		
		pay = 10000;
		//3명의 월급을 계산해보시오. 홍길동 : OOOOO원 형식으로 출력하시오.
		
		System.out.println("박보검 : "+(pay*time*day)+"원");
		System.out.println("송혜교 : "+(pay*time*day+10000)+"원");
		System.out.println("서강준 : "+(pay*time*day)+"원");
		
		System.out.println("박보검 : "+result+"원");
		
		/*
		 * 변수를 사용하는 이유.
		 * 1. 변수는 값에 의미를 부여하기 위해 사용 - 가독성 증가
		 * 2. 한번 값을 기록하고 필요시에 계속 사용할 수 있음 - 재사용성 증가
		 * 3. 가독성과 재사용성이 증가하기 때문에 유지보수가 용이하다.
		 * */
	} //calPay() 메소드의 영역 끝 
	
	//변수의 선언
public void declareVariable() {
		
		/*
		 * 변수의 선언
		 * -값을 기록하기 위한 변수를 메모리 공간에 확보하겠다. 값을 담을 상자를 생성
		 * [표현법] 자료형 변수이름;
		 * 
		 * 자료형 : 변수의 크기 또는 모양 또는 종류를 나타내는 부분
		 * 변수이름 : 변수의 이름을 정하는 부분
		 * 
		 * 변수를 선언할 때 주의 사항
		 * 1.변수 이름은 항상 소문자로 시작하며 낙타봉표기법을 지킨다. ex)ageOfVampire
		 * 2.같은 영역 ({}) 안에서 동일한 변수명은 존재할 수 없다.(중복불가)
		 * 3.해당 영역에 선언된 변수는 그 해당 영역에서만 사용이 가능하다.(지역변수)
		 * */
//		 System.out.println(pay); 3번째 주의사항 예시(calPay 메소드에 있는 변수 사용불가)
		
		 /*
		  * 자료형에 대한 개념
		  * = : 좌항에 우항을 대입하다.
		  * 자료형 변수명 = 대입할 값;
		  * 
		  * */
		
		//1.논리형 자료형(boolean : true / false
		
		boolean isTrue; //1byte
		boolean isFalse;
		
		isTrue = true; //미리 할당받은 공간에 true라는 논리값을 대입.
		isFalse = 3+5 > 5; // 8은 5보다 큰가요? : true 조건식 대입
		
		System.out.println("isTrue : " + isTrue); //true
		System.out.println("isFalse : " + isFalse); //true
		
		//2.숫자 자료형
		//2-1 정수형 : 자료형 사이즈에 따라 저장할 수 있는 값의 범위가 다르다.
		byte bNum; // 1byte
		short sNum; // 2byte
		int iNum; // 4byte - 정수자료형 중 기본형
		long lNum; // 8byte
		
		bNum = 127;
		sNum = 2;
		iNum = 4;
		lNum = 8L; //long 자료형임을 표기하기위해 숫자 뒤에 l또는 L을 붙여준다(대문자 권장)
		
		System.out.println("bNum : "+bNum);
		System.out.println("sNum : "+sNum);
		System.out.println("iNum : "+iNum);
		System.out.println("lNum : "+lNum);
		
		//2-2 실수형 : 사이즈에 따라서 저장할 수 있는 소수점의 개수가 다르다.
		float fNum; //4byte - 소수점 7자리까지 표현
		double dNum; //8byte - 실수형의 기본형 소수점 15자리까지 표현 (상대적으로 정확한 값을 표현)
		
		fNum = 4.123456711f; //float자료형을 사용하려면 숫자뒤에 f 를 붙여준다.
		dNum = 8.1234567891011121314;
		
		System.out.println("fNum : "+fNum);
		System.out.println("dNum : "+dNum);
		
		//3.문자형
		char ch; //2byte
		
		ch = 'a'; //문자는 홑따음표 ' ' 
		System.out.println("ch : "+ch);
		ch = 90; //유니코드표를 토대로 정해진 규칙에 의하여 숫자에 해당하는 문자로 표기됨.
		System.out.println("90을 대입한 ch : "+ch);
		
		//4.문자열 : 참조자료형 -> 주소값을 담는다.
		String str;
		str = "abc";
		
		System.out.println("str : "+str);
		
		//printf 를 이용하여 형식 출력
		System.out.println("========printf로 표기========");
		//System.out.printf("출력하고자하는 문자열 (형식에 맞는 구멍 만들기)",구멍에 채워넣을 데이터값);
		System.out.printf("boolean자료형 isTrue : %b", isTrue);
		System.out.println(); //줄바꿈용 println
		System.out.printf("iNum : %d \n", iNum); // \n : 줄바꿈 문자
		System.out.printf("fNum : %f \n",fNum); //%.2f 소수점 자리수 표기법
		System.out.printf("char : %c \n", ch); //%c:문자출력      %C : 대문자 변환 출력
		System.out.printf("str : %s \n", str); //%s:문자열출력   %S : 대문자 변환 출력
		
	}


	//상수 : 변하지 않는 수 
	public void constant() {
		//[표현법] final 자료형 상수명;
		//변수 이용시
		int age = 20; //int자료형 변수에 20이라는 값을 대입
		System.out.println("나이  : "+age);
		age = 21;
		System.out.println("바뀐 나이 : "+age);
		
		//상수 이용시
		final int AGE = 20;
		System.out.println("상수 나이 : "+AGE);
		//AGE = 21; 상수로 등록된 값은 변경할 수 없다.
		//고정적인 값을 사용하고자 할때 final을 이용한다.
		
		System.out.println("원주율 : "+Math.PI);
		
		
	}
	

}

