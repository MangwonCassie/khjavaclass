package com.kh.chap02.loop;

//import java.util.Random;
//import java.util.Scanner;
import java.util.*;  // java.util 패키지 안에 있는 모든 클래스를 사용하겠다.

public class F_Ex {
	public void upDown() {
//		업다운 게임
//		컴퓨터가 1부터 1000사이의 무작위 숫자를 하나 생성한 뒤 사용자가 이것을 맞추는 게임입니다.
//		사용자가 입력한 값이 정답보다 작으면 컴퓨터는 "up!"이라고 출력합니다
//		사용자가 입력한 값이 정답보다 크면 컴퓨터는 "down!"이라고 출력합니다
//		사용자가 입력한 값이 정답이라면 컴퓨터는 "정답!" 출력 후 프로그램을 종료
//		프로그램이 종료되기전(정답을 맞춘 뒤) 총 입력 횟수를 출력
//
//		(사용자는 컴퓨터가 생성한 숫자를 확인할 수 없습니다)
		
		//ctrl+shift + o 또는 마우스 올려서 import 클릭 또는 해당 생성클래스에 있는 메소드 사용하기

		
		Random r = new Random(); //랜덤 클래스
		Scanner sc = new Scanner(System.in);
		
		int ranNum = r.nextInt(1000)+1; //1부터1000개
		int count = 0; //입력 횟수를 담아놓을 변수 
		String result ="";
		boolean is = false; //성공 판별용 변수 활용
		
		while(true) { //해당 조건이 맞을때까지 반복을 돌릴것이니 무한 반복사용
			System.out.println("정답을 입력하세요 (1~1000) : ");
			int userInput = sc.nextInt();
			
			count++; // count = count+1; //입력한 횟수 올리기 
			
			if(userInput<ranNum) {//사용자가 입력한 값이 정답보다 작으면
				//System.out.println("Up !");
				result ="Up !";
			}else if(userInput>ranNum) {
				//System.out.println("Down !");
				result ="Down !";
			}else {
				//System.out.println("정답 !");
				result ="정답 !";
				is = true;//성공 판별용 변수 활용
			}
			System.out.println(result);
			if(is) { //성공 판별용 변수 활용
				break;
			}
		}
		
		System.out.println("총 "+count+"번 만에 맞추셨네요.");
		
	}

	public void older() {
//		고대 그리스에 아주 현명한 노인이 있었습니다.
//		왕이 그 노인에게 "원하는 걸 선물해줄테니 말해봐라" 라고 했습니다.
//		노인이 말하길 "저는 별로 바라는게 없습니다. 첫날 1원만 주시고 둘째날부터 전날의 두배만 주시면 됩니다"
//		40일동안 이 노인이 받게되는 돈의 액수와 총 얼마 받는지 계산하여 출력
		
		//int 자료형으로 표현할수있는 수의 범위를 벗어나기 때문에 long 자료형으로 사용해야한다.
		long money=1; //돈 담을 변수 
		long total=0; //총 40일동안 받게 될 합계 담아놓을 변수
		
		for(int i=1; i<=40; i++) {
			System.out.println(i+"일차 : "+money);
			total += money; // 합계변수에 현재 돈 더해넣기
			money *=2; // money = money*2;
		}
		
		
		System.out.println("총 받게 될 금액은 : "+total);
		
	
	
	}
	
	public void ex01() {
		//주사위 5번 던진 결과를 화면에 출력하세요
		Random r = new Random();
		
		for(int i=0;i<5;i++) {
			int ranNum =r.nextInt(6)+1;
			System.out.println((i+1)+"번째 주사위 수 : "+ranNum);
		}
		
	}
	
	public void ex02() {
		//1부터 1000까지 합계를 구하여 출력하세요
		
		int sum = 0; //합계를 담을 변수
		for(int i=1; i<=1000;i++) {
			sum+=i;
		}
		System.out.println("총 합계 : "+sum);
	}
	
	public void ex03() {
//		30일동안 다이어트를 위해서 푸시업을 할 계획입니다.
//		첫날에는 너무 힘드니까 10개만 하고 다음날부터는 전날보다 3개씩 더 할 계획입니다.
//		(1) 일자별로 하게되는 푸시업 개수를 구해서 출력
//		(2) 30일동안 하게되는 푸시업 개수를 구해서 출력
		
		int day = 1; //일자를 담아놓을 변수 
		
		int pushUp = 10; //푸쉬업 개수 담을 변수 첫날 10
		
		int sum = 0; //합계 변수
		
		while(day<=30) { //30일까지
			
			System.out.println(day+"일차 : "+pushUp+"개");
			
			sum+=pushUp; //오늘한 푸쉬업 개수 합계변수에 더해넣기
			
			pushUp+=3; //오늘한 푸쉬업 개수에 +3을하여 내일 할 개수 만들기
			
			day++; //하루씩 증가시키기 (반복문 벗어날 증감식)
		}
		//반복문 벗어나기 마지막에 day가 +1 더 되었으니 출력할땐 -1 해주기 
		System.out.println((day-1)+"일동안 총 " +sum+"개를 하였습니다" );
		
	}
	
	public void ex04() {
//	이벤트에서 경품에 당첨될 확률이 2% 입니다.
//	(1) 30번 추첨했을 때 경품에 당첨된 횟수를 구하여 출력
//	(2) 사용자에게 원하는 추첨 횟수를 입력하도록 한 뒤 당첨된 횟수를 구하여 출력
		
		Random r = new Random(); //랜덤추첨할 클래스 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇번 추첨하시겠습니까? ");
		int num = sc.nextInt(); //사용자한테 입력받은 추첨횟수 담을 변수 
		int count =0; //당첨된 횟수 담아놓을 변수 
		sc.close(); 
		
//		for(int i=1; i<=30;i++) {
//			System.out.println(i+"번째 추첨이네요");
//			//100중에 2까지 당첨범위로 잡기 
//			int ran = r.nextInt(100)+1; //추첨하기 (1~100)
//			if(ran<=2) {//위에서 추출한 랜덤수가 1~2 인지 확인하여 추첨하기
//				//당첨 
//				count++;//count = count+1;
//			}
//		}
		
//		//사용자가 입력한 숫자만큼 반복문 돌리기
		for(int i=1; i<=num; i++) {
			int ran = r.nextInt(100)+1; //추첨하기 (1~100)
			System.out.println(i+"번째 추첨입니다. "+ran);
			if(ran<=2) {//위에서 추출한 랜덤수가 1~2 인지 확인하여 추첨하기
				//당첨 
				count++;//count = count+1;
			}
		}
		
		System.out.println("총 당첨된 횟수는 : "+count+"번 입니다.");
		
	}
	
	public void ex05() {
//		1부터 99 사이에 존재하는 5가 들어간 숫자의 개수를 세어서 출력
		
		int count =0; //개수를 세어 담아놓을 변수
		
		for(int i=1;i<=99;i++) {
			//if(5가 일의 자리인경우 또는 5가 10의 자리인경우)
			//순차적으로 증가하여 우리가 판단해야하는 수는 변수 i에 담기게 되고
			//만약 일의 자리가 5이면 조건만족 또는 십의 자리가 5이면 조건만족을 하게된다 
			//조건을 만족하면 count를 +1씩 증가시켜 개수를 세어준다.
			//이때 일의 자리를 알수있는 방법은 변수 i를 10으로 나누어 나머지가 몇인지를 알아내면 된다.
			//십의 자리를 알수있는 방법은 변수 i를 10으로 나누어 몫이 몇인지 알아내면 된다.
			if(i/10==5 || i%10==5) { 
				count++;
			}
		}
		
		System.out.println("숫자 5가 들어간 수는 총 : "+count+"개 입니다.");
		
	}
	
	public void ex06() {
//		어떤 게임에서 시작지점부터 종료지점까지 10칸이 있다고 가정합니다.
//		주사위를 던져서 종료지점에 가려면 주사위를 몇 번 던져야 하는지 구하여 출력

		Random r = new Random();
		
		int total = 0; //주사위의 합을 담을 변수
		int count = 0; //주사위 몇번 던졌는지 담을 변수 
		
		while(true) { //몇번이나 던져야할지 모르기때문에 무한반복 후 조건에 따라 벗어나기
			int num = r.nextInt(6)+1; //1~6 주사위 랜덤수 발생시키기 
			System.out.println("현재 뽑힌 주사위 수 : "+num);
			count++; //한번 던졌으니 카운트 1올리기 
			total += num; //합계에 지금 던진 주사위 값 더해넣기
			//더해넣어진 total 즉 총합계가 한계범위인 종료지점 10 이상이라면 반복문 벗어나기.
			if(total>=10) {
				break;
			}
		}
		System.out.println("주사위는 총 "+count+"번 던져졌습니다.");
		
	}
	
	
	
	
	
	
	
	
	
	
}
