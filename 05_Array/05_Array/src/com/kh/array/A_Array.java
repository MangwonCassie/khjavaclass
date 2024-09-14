package com.kh.array;

import java.util.Scanner;

public class A_Array {

	//변수 : 하나의 공간에 하나의 값만 담을 수 있다.
	//배열 : 하나의 공간에 여러개의 값을 담을 수 있다.
//		   단, "같은 자료형일때만" 
	//배열의 각각 인덱스자리에 실제 값이 담기는 형태 / 만약 참조형 배열이면 실제값이 아닌 주소값이 담긴다 
	//변수를 이어붙여 하나의 이름으로 다루는 방식
	
	public void method1() {
		//배열을 왜 사용해야하는지.
		//변수만 이용한다면 값이 많아질때마다 변수를 새롭게 생성해야한다.
		//만약 int 자료형의 값이 많아진다면?
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		
		//저렇게 만들어놓은 변수들을 출력하고자한다? 
//		System.out.println(num1);
//		System.out.println(num2);
//		System.out.println(num3);
//		System.out.println(num4);
		
//		순차적인 규칙이 있어 반복문을 활용해 보려했지만 어림없다.(변수의 이름을 변수화 할수없음)
//		for(int i=1;i<5;i++) {
//			System.out.println(numi);
//		}
		
		//만약 더해야한다면?
		//반복문 복합대입연산자 사용 불가능...
		//직접 더해야한다..
		int sum = num1+num2+num3+num4;
		
		//위와같이 불편한 상황들이 생기기 때문에 배열이라는 자료형으로 묶어서 다뤄보자.
		//단!!!!! 같은 자료형일때만 묶일 수 있다.
		
		//1.배열의 선언
		//[표현법] - 두가지 방식
		//1) 자료형[] 배열명;
		//2) 자료형 배열명[];
		//보편적으로는 1번 방식을 사용한다.
		
		int a; //int자료형 변수 선언
		int[] arr; //int[]자료형 배열 선언 (int형 배열)
		int arr2[]; //배열 선언 2번째 방식 
		
		//2.배열의 할당
		//해당 배열에 몇개의 값이 들어갈지 배열의 크기를 지정하는 과정
		//지정한 크기만큼의 공간이 생성된다
		
		//[표현법]
		//int[] arr = new int[5];
		arr = new int[5]; //arr이라고하는 배열변수에 int자료형 배열 5칸짜리를 만들어서 주소값을 넣어준다.
		
//		System.out.println("arr에 담겨있는 데이터 : "+arr);
		//실제 값이 담겨있는 곳을 참조하려면 배열의 인덱스를 참조해야한다.
//		System.out.println("arr의 0번째 인덱스에 담긴 값 : "+arr[0]);
//		System.out.println("arr의 1번째 인덱스에 담긴 값 : "+arr[1]);
//		System.out.println("arr의 2번째 인덱스에 담긴 값 : "+arr[2]);
//		System.out.println("arr의 3번째 인덱스에 담긴 값 : "+arr[3]);
//		System.out.println("arr의 4번째 인덱스에 담긴 값 : "+arr[4]);
//		System.out.println("arr의 5번째 인덱스에 담긴 값 : "+arr[5]);
		
		//배열의 선언 및 할당 한번에 하기
		int[] arr3 = new int[3];
		
		//각 배열 인덱스에 값 대입해보기
		//arr3 배열에 인덱스에  5 10 15 각각 넣어보고 출력해보세요
		arr3[0] = 5;
		arr3[1] = 10;
		arr3[2] = 15;
		
		System.out.println("arr3 : "+arr3);
		System.out.println("arr3[0] : "+arr3[0]);
		System.out.println("arr3[1] : "+arr3[1]);
		System.out.println("arr3[2] : "+arr3[2]);
		
		//배열의 큰 장점 : 반복문을 이용할 수 있다.
		
		int[] arr4 = new int[5]; //5칸짜리 int형 배열을 생성하겠다.
//		int total = 5;
//		//arr4 배열에 각 인덱스에 5씩 증가된 값을 넣어보자.
//		for(int i=0; i<5; i++) {
//			arr4[i] = total;
//			total+=5;
//		}
		/*
		//반복문을 이용하지 않고 각 인덱스에 1~5까지를 넣는다면??
		arr4[0] = 1;
		arr4[1] = 2;
		arr4[2] = 3;
		arr4[3] = 4;
		arr4[4] = 5;
		
		//반복문을 이용하지 않고 각 인덱스의 값을 출력한다면 ???
		System.out.println(arr4[0]);
		System.out.println(arr4[1]);
		System.out.println(arr4[2]);
		System.out.println(arr4[3]);
		System.out.println(arr4[4]);
		*/
		
		//반복문을 이용하여 arr4 배열에 각 인덱스에 값 넣어보기
		for(int i=1;i<=5;i++) {//5번 반복하는 반복문 
			arr4[i-1] = i;  // i-1인덱스에 i값을 대입하겠다.
		}
		
		//arr4 배열에 담긴 값 출력해보기 
		for(int i=0; i<arr4.length; i++) {
			System.out.println("arr4 배열의 "+i+"번째 인덱스 : "+ arr4[i]); 
		}
	}
	
	public void method2() {
		//정수 자료형 배열 3칸짜리 만들어서 각 인덱스에 원하는 정수값 넣고 출력해보기
		//문자 자료형 배열 3칸짜리 위와같이.
		//실수 자료형 배열 3칸짜리 위와같이.
		
		long[] lArr = new long[3];
		
		lArr[0] = 100;
		lArr[1] = 200;
		lArr[2] = 500;
		
		System.out.println("lArr의 0번 인덱스  : "+lArr[0]);
		System.out.println("lArr의 0번 인덱스  : "+lArr[1]);
		System.out.println("lArr의 0번 인덱스  : "+lArr[2]);
		
		char[] cArr = new char[3];
		cArr[0] = '가';
		cArr[1] = '나';
		cArr[2] = '다';
		
		System.out.println("cArr의 0번인덱스 : "+cArr[0]);
		System.out.println("cArr의 1번인덱스 : "+cArr[1]);
		System.out.println("cArr의 2번인덱스 : "+cArr[2]);
		
		double[] dArr = new double[3];
		
		//값 대입 반복문
		for(int i=0; i<dArr.length; i++) {
			dArr[i] = i;
		}
		//값 출력 반복문 
		for(int i=0; i<dArr.length; i++) {
			System.out.println(dArr[i]);
		}
		//대입과 출력 같이하기 
		for(int i=0; i<dArr.length; i++) {
			dArr[i] = i;
			System.out.println("대입과 출력 같이하기 : "+dArr[i]);
		}
	}
	
	public void method3() {
		//문자열 배열 
		//String[] 
		String[] names = new String[3];
		
		//각 인덱스에 이름 넣기
		names[0] = "최우식";
		names[1] = "김다미";
		names[2] = "송혜교";
		
		//출력은 반복문을 이용하여 출력하자 
		for(int i=0; i<names.length; i++) {//배열의 길이만큼 0부터 반복
			System.out.println(i+"번 인덱스에 담긴 이름은 ? : "+names[i]);
		}
		
		//문자열 배열 5칸짜리 생성 후 각 인덱스에 사용자가 입력한 이름을 넣어보세요. (반복문으로)
		//넣은 데이터는 반복문을 활용하여 출력도 해보세요 
		Scanner sc = new Scanner(System.in);
		
		//문자열 배열 5칸짜리 생성 
		String[] idol = new String[5];
		
		//값 입력 반복문 
		for(int i=0; i<idol.length; i++) {
			System.out.println("가수 이름을 입력하세요 : ");
			idol[i] = sc.nextLine();
		}
		
		//값 출력 반복문 
		for(int i=0; i<idol.length; i++) {
			System.out.println(idol[i]);
		}
		
		sc.close();
		
	}
	
	public void method4() {
		//사용자에게 배열의 크기를 입력받고 
		//각 인덱스에 본인이 좋아하는 영화제목을 넣어보세요
		//모든 인덱스에 영화제목을 넣고 반복문을 이용하여 출력도 해보세요 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine(); //버퍼에 남아있는 엔터 없애기
		//만약 사이즈를 바로 입력 하겠다면.
//		String[] movies = new String[sc.nextInt()];
		//변수활용
		String[] movies = new String[size];
		
		//배열 인덱스에 값 대입 반복문
		for(int i=0; i<movies.length; i++) {
			System.out.println("좋아하는 영화 제목을 입력하세요 :");
			movies[i] = sc.nextLine(); 
		}
		
		//배열 인덱스에 값 출력 반복문
		for(int i=0; i<movies.length; i++) {
			System.out.println(movies[i]);
		}
		
		sc.close();
	}
	
	
	public void method5() {
		//내가 어제 하루 먹은 메뉴 3끼를 입력하고싶다 
		//변수로 한다면?
		//이건 내가 먹은 어제 메뉴 
		String mo = "모닝빵";
		String lu = "김밥";
		String di = "삼겹살";
		
		//만약 어제 먹은것들을 출력해줘 
		
		System.out.println("아침 : "+mo);
		System.out.println("점심 : "+lu);
		System.out.println("저녁 : "+di);
		
		//만약 다른 사람들의 메뉴도 저장하고 출력하고자 한다면?
		String mo2 = "김밥";
		String lu2 = "짜장면";
		String di2 = "치킨"; 
		
		//어제먹은 메뉴 나의 메뉴를 묶어서 다루자 
		String[] sArr = new String[3]; //각 메뉴 1개씩 넣을 수 있는 변수를 3개 만들고 하나로 묶기
		//각 인덱스를 이용하여 공간에 접근한다.
		//첫번째방 : 0번인덱스 
		sArr[0] ="김아무개";
		sArr[1] ="최모씨";
		sArr[2] ="박혁거세";
		
		
		System.out.println("접근 하는 방법 : "+sArr[0]); //0호에 사시는 김아무개씨
		System.out.println("접근 하는 방법 : "+sArr[1]); //1호에 사시는 최모씨
		System.out.println("접근 하는 방법 : "+sArr[2]); //2호에 사시는 박혁거세씨
		
		for(int i=0;i<sArr.length;i++) {
			System.out.println("똑똑.. 계신가요? : "+sArr[i]+"씨");
		}
		
	}
	
	public void method6() {
		//총 10칸짜리 문자열 배열을 생성하여 이름을 인덱스에 채워넣고
		//짝수 호(짝수 인덱스-0포함)에 사는 사람만 출력해 보세요.
		//이때 배열의 크기도 입력받고
		//사는 사람의 이름도 입력받아 넣어보세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열 크기 입력 : ");
		String[] names = new String[sc.nextInt()];
		sc.nextLine(); //버퍼 엔터 비우기
		
		//값 대입용 반복문 
		for(int i=0;i<names.length; i++) {
			System.out.println(i+"번째 호에 사는 사람의 이름을 입력해주세요 : ");
			names[i] = sc.nextLine();
		}
		//값 출력용 반복문
		for(int i=0; i<names.length; i++) {
			if(i%2==0) {
				System.out.println(names[i]);
			}
		}
		sc.close();
	}
	
	public void method7() {
		//배열의 선언 및 초기화를 한번에 작성해보기.
		//좋아하는 과일 5개를 배열에 선언과 초기화를 같이 해보자.
		
		String[] sArr = {"수박","딸기","체리","메론","망고"};
		
		//초기화한 데이터가 해당 인덱스에 잘 들어있는지 반복문을 통해 확인하기 
		
		for(int i=0;i<sArr.length; i++) {
			System.out.println(i+"번째 : "+sArr[i]);
		}
		
		//위에서 만들어놓은 과일 배열에 있는 과일중 사용자가 입력한 과일이 있다면 있어요 없다면 없어요를 출력하세요.
		Scanner sc = new Scanner(System.in);
//		String banana ="바나나";
		System.out.println("과일을 입력해보세요 : ");
		String input = sc.nextLine();
		//조건에 맞는 값이 있는지 없는지 판별할 변수 
		boolean flag = false;
		int count = 0; 
		String result="없어요";
		
		for(int i=0;i<sArr.length;i++) { //배열의 크기만큼 반복 
			
			if(sArr[i].equals(input)) {//지금 인덱스에 있는 값과 사용자가 입력한 값이 일치하는가? 
				flag = true;
				count++;
				result="있어요";
				break;
			}
		}
		System.out.println(result);
		//boolean 타입으로 확인하기 
		if(flag) {
			System.out.println("있어요");
		}else {
			System.out.println("없어요");
		}
		//count로 +1 해서 확인하기 
		if(count>0) {
			System.out.println("있어요");
		}else {
			System.out.println("없어요");
		}
		
		sc.close();
	}
	
	public void method8() {
		//배열의 크기는 변경할 수 없다.
		//그래서 내가 만약 배열의 크기를 바꾸고 싶다면 새로운 배열을 만들어
		//기존 배열변수에 주소값을 넣어주는 형태로 갈아끼운다.
		
		//숫자 3개를 넣을 배열을 만들었다
		int[] arr = new int[3]; //int자료형 배열 3칸짜리 생성
		
		//만들고보니 숫자를 5개까지 넣어야하는 작업 발생..
		arr[0] = 1;
		arr[1] = 10;
		arr[2] = 50;
//		arr[3] = 100; 인덱스의 범위를 벗어나서 오류발생!! 
		
		
		System.out.println("기존 3칸짜리 배열 : "+arr); // [I@6d06d69c - 기존 arr의 3칸짜리 배열 주소값 
		
		//새로운 배열 5칸짜리를 만들어서 주소값을 arr배열변수에 대입.
		arr = new int[5];
		
		System.out.println("새로운 5칸짜리 배열 : "+arr); //[I@7852e922 - 새로운 배열의 주소값 
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+"번째 인덱스 : "+arr[i]);
		}
		
		int[] arr2 = arr; //[I@7852e922
		
		//arr : [I@7852e922
		//arr2 : [I@7852e922
		System.out.println("arr2의 주소값 : "+ arr2);
		System.out.println("arr의 주소값 :  "+arr);
		
		//서로 같은 객체를 바라보고 있어서(참조하고있어서) 같은 주소값을 반환한다.
		
	}
	
	public void method9() {
		
		/*
		배열의 큰 단점 : 크기를 변경할 수 없다.
		그렇기 때문에 새로운 배열을 생성하여 할당받아야 한다.
		이때 기존의 배열변수를 활용하고자 한다면 재할당을 받아주면 된다.
		ex)int[] arr = new int[3];   -> arr = new int[5]; 
		
		배열은 항상 고유한 주소값이 부여된다. 기존에 생성된 배열과 겹치지 않음(중복X)
		그래서 새로운 배열의 크기를 할당받고자 한다면 새 주소를 받아 할당받는것.
		이렇게 새롭게 할당받은 주소를 갖게된 배열변수로 변경된 크기의 배열을 다루게 된다.
		기존에 다뤄졌던 배열은 더이상 참조당하는곳이 없기때문에 
		GC(garbage Collector)가 처리해준다.(자동 메모리 관리) 
		
		만약 기존 배열변수가 참조하고 있는 배열의 연결을 끊고 싶다면? 
		아무것도 참조하고 있지 않다라는 의미의 값  : null 을 대입해준다.
		*/
		
		int[] arr = new int[3];
		
		System.out.println("기존 배열 arr의 주소값  : "+arr);
		
		//만약 더크거나 더 작거나한 배열이 필요하다면 
		//새롭게 선언 및 할당을 받아 사용 또는 기존 배열변수를 활용하고자 한다면?
		//원하는 크기의 배열을 재 할당받으면 된다.
		
		//기존 배열 변수에 5칸짜리 배열로 재할당
		arr = new int[5];
		
		//이제 더이상 배열을 참조하고 싶지 않다면? (배열의 연결을 끊고 싶다)
		
		arr = null; //null : 아무것도 참조하고있지 않다는 값
		
		System.out.println(arr); 
		
		//모든 참조 자료형에는 아무것도 참조하고 있지 않다는 뜻의 null값을 가질 수 있다.
		//왜? 아무것도 참조하고 있지 않을 수 있으니.
		String str = null;
		
		System.out.println(str);
		
//		int a = null; - 기본자료형에는 대입할 수 없다.
		
		int[] a2=null; //만약 선언하여 변수를 사용하고자 한다면 참조자료형은 기본값 null로 초기화
		//참조자료형의 기본값 : null
		
		
		System.out.println(a2);
		
	}
	
	
	public void ex01() {
	
		String str = "안녕이사람아";
		
		//문자열의 길이만큼 문자 배열 생성
		char[] cArr = new char[str.length()];
		int[] arr = new int[5];
//		for(int i=0; i<str.length();i++) {
//			cArr[i] =str.charAt(i);
//		}
		
		for(int i=0; i<cArr.length; i++) {
			
			//만약 2번인덱스 전까지는 그대로 대입 
			//2번인덱스부터는 *로 대입 
			if(i>=2) {
				cArr[i] = '*';
			}else {
				cArr[i] =str.charAt(i);
			}
			System.out.print(cArr[i]);
		}

		
		System.out.println();
		
	}

	
}

