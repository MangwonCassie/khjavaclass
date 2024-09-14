package com.kh.operator;
import java.util.Scanner;

public class F_Logical {
	/*
	 * 논리 연산자 : 이항연산자, 두개의 논리값을 연산하는 연산자.
	 * 
	 * [표현법] 논리값 논리연산자 논리값 -> 결과값도 논리값
	 * 
	 * 종류 
	 * 1. AND 연산자 : 논리값 && 논리값  [왼쪽,오른쪽 둘다 true여야 결과값도 true]
	 * 2. OR 연산자 : 논리값 || 논리값 [왼쪽,오른쪽 둘 중 하나라도 true면 결과값이 true]
	 *  | : shift + \(역슬래쉬)
	 * 
	 * */
	
	//AND
	public void method1() {
		//사용자가 입력한 정수값이 양수이면서 짝수인지 확인하기 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		boolean result = (num>0) && (num%2==0);
		
		System.out.println(num+"값은 양수이면서 짝수입니까? :"+result);
		
	}
	
	public void method2() {
		//입력한 정수값이 1이상 100이하인지 확인  - 비교연산은 한번에 하나씩만 가능하다.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		//1<=num<=100 - 수학처럼 묶어서 표기할 수 없음.
		boolean result = (1<=num)&&(num<=100);
		
		System.out.println("입력한 "+num+"값은 1이상 100 이하인가요? : "+result);
		
		sc.close();
	}
	
	//OR
	public void method3() {
		//사용자가 입력한 값이 M 또는 m 인지 확인하기.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 성별은 무엇입니까? (m/f)");
		
//		문자열 변수 String은 주소값을 담고 있기 때문에 주소값이 비교되어 제대로된 결과를 얻을 수 없다.
//		String gen = sc.nextLine();
//		boolean result = (gen=="m")||(gen=="M");
		
		char gender = sc.nextLine().charAt(0); //첫번째문자 추출
		//문자의 경우에도 int로 자동형변환이 되기 때문에 동등비교연산이 가능하다.
		boolean result = (gender=='M')||(gender=='m');
		
		System.out.println("당신의 성별은 남자입니까? :"+result);
		
		sc.close();
	}
	
	//사용자에게 나이를 입력받고 성인(20살이상)인지, 성별 (남/여)를 입력받고  남자인지 여자인지 확인해보세요.
	//출력 예시 ( 당신은 성인이며 남자입니까? true ) (당신은 성인 또는 여자입니까? false) 
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 나이를 입력하세요 . ");
		int age = sc.nextInt();
		
		System.out.println("당신의 성별을 입력하세요. (남/여)");
		sc.nextLine(); //버퍼에 남아있는 엔터 지우기
		char gender = sc.nextLine().charAt(0);
		
		boolean result = (age>=20) && (gender=='남');
		System.out.println("당신은 성인이며 남자입니까? "+result);
		boolean result2 = (age>=20) || (gender=='여');
		System.out.println("당신은 성인 또는 여자입니까? "+result2);
		
		sc.close();
	}
	
}
