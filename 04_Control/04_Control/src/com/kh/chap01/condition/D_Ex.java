package com.kh.chap01.condition;
import java.util.Scanner;
//조건문 실습문제
public class D_Ex {
	
	public void ex01() {
//	아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
//	종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.
//	ex.
//	1. 입력
//	2. 수정
//	3. 조회
//	4. 삭제
//	7. 종료
//	메뉴 번호를 입력하세요 : 3
//	조회 메뉴입니다.
		Scanner sc = new Scanner(System.in);
		System.out.println("1.입력");
		System.out.println("2.수정");
		System.out.println("3.조회");
		System.out.println("4.삭제");
		System.out.println("7.종료");
		System.out.println("메뉴 번호를 입력하세요 : ");
		
		//한줄 작성 (개행문자(\n)를 이용하여)
		//System.out.println("1.입력\n2.수정\n3.조회\n4.삭제\n7.종료\n메뉴 번호를 입력하세요 : ");
		
		int num = sc.nextInt(); //사용자에게 입력받은 번호 넣어놓을 변수
		
		String menu =""; //메뉴내용 넣어놓을 변수준비
		
		switch(num) { //대상자
		case 1 : menu="입력"; /*System.out.println("입력메뉴입니다.");*/
		break;
		case 2 : menu="수정";
		break;
		case 3 : menu="조회";
		break;
		case 4 : menu="삭제";
		break;
		case 7 : System.out.println("프로그램이 종료됩니다.");
//		return;
		break;
		}
		//7번 case에 종료메세지가 있다면 아래와 같이 7번이 아닌경우에만 메뉴를 출력
		if(num!=7) {
			System.out.println(menu+" 메뉴입니다.");
		}
		
		//또는 7번 메뉴에 출력메세지를 따로 두지 않고 아래에서 처리하기 
//		if(num==7) { //종료 번호를 누르면
//			System.out.println("프로그램이 종료됩니다.");
//		}else {
//			System.out.println(menu+" 메뉴입니다.");
//		}
		
		sc.close();
	}
	
	public void ex02() {
//		키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
//		짝수가 아니면 “홀수다“를 출력하세요.
//		양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
//		ex.
//		숫자를 한 개 입력하세요 : -8
//		양수만 입력해주세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		String result=""; //결과 문자열 담을 변수 
		
		if(num>0) { //양수인 경우
			if(num%2==0) { //입력받은 수를 2로 나눈 나머지값이 0이라면? 짝수
				result="짝수다";
				System.out.println("짝수다");
			}else { //입력받은 수를 2로 나눈 나머지값이 0이 아니라면 홀수
				result="홀수다";
				System.out.println("홀수다");
			}
			
		}else { //양수가 아닌경우 
			result="양수만 입력해주세요.";
			System.out.println("양수만 입력해주세요.");
		}
		
		System.out.println(result);
		
		sc.close();
	}
	
	public void ex03() {
//		국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
//		합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
//		(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
//		합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
//		불합격인 경우에는 “불합격입니다.”를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 : ");
		int kor = sc.nextInt();
		System.out.println("영어 : ");
		int eng = sc.nextInt();
		System.out.println("수학 : ");
		int math = sc.nextInt();
		
		int total = kor+eng+math; //3과목 점수의 합계
		// int 자료형끼리 계산하면 소수점표현이 안되고 값의 손상이 있으니 계산시 한쪽을 double로 변경
		double avg = (double)total/3.0;
		
		//각 시험 점수가 40점 이상이면서 평균이 60점 이상인 경우 - 합격
		if(kor>=40&&eng>=40&&math>=40&&avg>=60) {
			System.out.printf("국어 : %d\n영어 : %d\n수학 : %d\n합계 : %d\n평균 : %.1f\n%s"
							,kor,eng,math,total,avg,"축하합니다. 합격입니다");
		}else {//불합격
			System.out.println("불합격 입니다.");
		}
		
		sc.close();
		
	}
	
	public void ex04() {
//		ex 1.
//		1~12 사이의 정수 입력 : 8
//		8월은 여름입니다.
//		ex 2.
//		1~12 사이의 정수 입력 : 99
//		99월은 잘못 입력된 달입니다.
//		if(month == 1 || month == 2 || month == 12) {
//			season = "겨울";
//			} else if(month >= 3 && month <= 5) {
//			season = "봄";
//			} else if(month >= 6 && month <= 8) {
//			season = "여름";
//			} else if(month >= 9 && month <= 11) {
//			season = "가을";
//			} else {
//			season = "해당하는 계절이 없습니다.";
//			}
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~12 사이의 정수 입력 : ");
		
		int month = sc.nextInt();
		String season = ""; //계절정보를 담아놓을 변수 
		//if(month>0&&month<13){switch~~~~}else{System.out.println("잘못입력");}
		switch(month) {
		case 1 : 
		case 2 : 
		case 12 : season="겨울"; //1 또는 2 또는 12 모두 겨울이기 때문에 중간에 break를 하지않고 마지막만 처리
		break;
		case 3 :
		case 4 :
		case 5 : season="봄";
		break;
		case 6 :
		case 7 :
		case 8 : season="여름";
		break;
		case 9 :
		case 10 : 
		case 11 : season="가을";
		break;
		
		default : System.out.println(month+"월은 잘못 입력된 달입니다.");
		}
		
		if(!season.equals("")) {//season에 담긴 문자열이 빈문자열이 아니라면 
			System.out.println(month+"월은 "+season+"입니다");
		}
		sc.close();
	}
	
	public void ex05() {
//		아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
//		로그인 성공 시 “로그인 성공”,
//		아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
//		비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		String userId = "user01";//저장된 아이디
		String userPwd = "pass01";//저장된 비밀번호 
		
		System.out.println("아이디를 입력하세요 : ");
		String inputId = sc.nextLine();
		System.out.println("비밀번호를 입력하세요 : ");
		String inputPwd = sc.nextLine();
		
		//문자열 비교는 문자열.equals() 메소드를 이용한다.
		//저장된 아이디와 저장된 비밀번호와 입력된 아이디,비밀번호가 일치한 경우 - 로그인 성공 
		if(userId.equals(inputId)&&userPwd.equals(inputPwd)) {
			System.out.println(userId+"님 환영합니다.");
		}else {//그렇지 않은 경우 - 로그인 실패 
			//아이디가 틀렸는지 비밀번호가 틀렸는지 판별   //로그인은 실패했는데
			if(userId.equals(inputId)) {//저장된 아이디와 입력 아이디가 일치한경우 
				System.out.println("비밀번호가 틀렸습니다.");
			}else {//저장된 아이디와 입력 아이디가 일치하지 않는 경우 
				System.out.println("아이디가 틀렸습니다.");
			}
			
		}
		sc.close();
	}
	
	public void ex06() {
//		사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
//		단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
//		회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
//		비회원은 게시글 조회만 가능합니다.
//		권한을 확인하고자 하는 회원 등급 : 관리자
//		회원관리, 게시글 관리 게시글 작성, 댓글 작성 게시글 조회
		Scanner sc = new Scanner(System.in);
		
		System.out.println("권한을 확인하고자 하는 회원 등급 : ");
		String lank = sc.nextLine();
		String func = ""; //등급에 따라 할수있는 기능을 담아놓을 변수
		
//		switch(lank) {
//		case "관리자" : func = "회원관리, 게시글관리, 게시글 작성, 게시글 조회, 댓글 작성";
//		break;
//		case "회원" : func = "게시글작성, 게시글 조회, 댓글 작성";
//		break;
//		case "비회원" : func = "게시글 조회";
//		break;
//		default : func="잘못입력하셨습니다.";
//		}
		
		switch(lank) { //복합대입 연산자를 이용하여 더 높은 권한부터 내려오기 
		case "관리자" : func = "회원관리,게시글관리,";
		case "회원" :  func += "게시글작성, 댓글 작성,";
		case "비회원" : func += "게시글 조회";
		break;
		default : func="잘못입력하셨습니다.";
		}
		System.out.println(func);
		
		sc.close();
	}
	
	public void ex07() {
//		키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
//		저체중/정상체중/과체중/비만을 출력하세요.
//		BMI = 몸무게 / (키(m) * 키(m))
//		BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
//		BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
//		BMI가 30이상일 경우 고도 비만
//		ex.
//		키(m)를 입력해 주세요 : 1.65
//		몸무게(kg)를 입력해 주세요 : 58.4
//		BMI 지수 : 21.45087235996327
//		정상체중
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키(m)를 입력해주세요 : ");
		double height = sc.nextDouble();
		System.out.println("몸무게(kg)를 입력해주세요: ");
		double weight = sc.nextDouble();
		
		double bmi = weight/(height*height);
		
		String result="";
//		BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
//		BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
//		BMI가 30이상일 경우 고도 비만

		if(18>bmi) {
			result ="저체중";
		}else if(23>bmi) {
			result ="정상체중";
		}else if(bmi<25) {
			result ="과체중";
		}else if(bmi<30) {
			result ="비만";
		}else {
			result ="고도비만";
		}
//		bmi = (int)(bmi*100)/100.0; //소수점 계산해서 자르기 
		System.out.println("bmi 지수는 "+bmi);
		System.out.println(result);
		
		sc.close();
	}
	
	public void ex08() {
//		키보드로 두 개의 정수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
//		(단, 두 개의 정수 모두 양수일 때만 작동하며 없는 연산 기호를 입력 했을 시
//		“잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력)
//		ex.
//		피연산자1 입력 : 15
//		피연산자2 입력 : 4
//		연산자를 입력(+,-,*,/,%) : /
//		15 / 4 = 3.750000
		Scanner sc = new Scanner(System.in);
		
		System.out.println("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		String o =""; //만약 조건문안에서 변수를 생성하면 해당 조건문을 벗어나선 사용할수 없기 때문에 밖에서 선언해놓기.
		if(num1>0&&num2>0) { //입력받은 두 수가 양수일때만 동작 
			System.out.println("연산자를 입력(+,-,*,/,%) : ");
			sc.nextLine(); //엔터비우기 
			o = sc.nextLine();
			double result = 0;//결과의 소수점 표현을 위해 double자료형으로 생성
			
			switch(o) {
			case "+" : result = num1+num2; break; //결과값 담을 변수 result에 계산결과 넣기
			case "-" : result = num1-num2; break;
			case "*" : result = num1*num2; break;
			case "/" : result = (double)num1/num2; break;
			case "%" : result = (double)num1%num2; break;
			default : System.out.println("잘못된 연산기호를 입력했습니다. 프로그램을 종료합니다.");
			return;//메소드를 호출한 곳으로 돌아가기
			}
		System.out.println(num1+o+num2+" = "+result);
		}else { //양수가 아닌경우 
			System.out.println("양수만 입력할수있습니다.");
		}
//		System.out.println(num1+o+num2+"="+reuslt);
		
		sc.close();
	}
	
	public void ex09() {
//		중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
//		평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
//		이 때, 출석 비율은 출석 회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
//		70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("중간 고사 점수 : ");
		int middleScore = sc.nextInt();
		System.out.println("기말 고사 점수 : ");
		int finalScore = sc.nextInt();
		System.out.println("과제 점수 : ");
		int sub = sc.nextInt();
		System.out.println("출석 회수 : ");
		int ent = sc.nextInt();
		
		double total = ent + (middleScore*0.2) + (finalScore*0.3) + (sub*0.3);
		
		System.out.println("=============결과============");
		//출석기준 20-(20*0.3) : 기준 미달이면 fail 출석일수
		if(20-(20*0.3)<ent) { //출석일을 만족 한 경우 시험 점수 판별 
			System.out.println("중간 고사 점수(20) : "+(middleScore*0.2));
			System.out.println("기말 고사 점수(30) : "+(finalScore*0.3));
			System.out.println("과제점수(30) : "+(sub*0.3));
			System.out.println("출석 점수(20) : "+ent);
			System.out.println("총점 :"+total);
			if(total>69) {
				System.out.println("pass");
			}else {
				System.out.println("Fail 점수미달");
			}
			
		}else { //출석일수를 만족하지 못한 경우 
			System.out.println("Fail 출석일 수 부족 ["+ent+"/20]");
		}
		sc.close();
	}
}
