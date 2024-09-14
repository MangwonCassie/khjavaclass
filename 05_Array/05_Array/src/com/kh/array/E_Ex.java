package com.kh.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class E_Ex {
	
	public void ex01() {
//		길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//		순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		
		
		int[] arr = new int[10];
		
		//값 대입 반복문 
		for(int i=0; i<arr.length;i++) {
			arr[i]= (i+1);
		}
		
		//값 출력 반복문
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	
	}
	
	public void ex02() {
//		길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//		역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		
		int[] arr = new int[10];
		
		//값 대입과 출력 한번에 
		for(int i=0; i<arr.length; i++) {
			arr[i] = (10-i);
			System.out.print(arr[i]+" ");
		}
	}
	
	public void ex03() {
//		사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열의 크기를 입력해주세요 : ");
		int num =sc.nextInt();
		
		//입력받은 수만큼 배열의 크기를 지정 
		int[] arr = new int[num];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=(i+1); //배열 각 인덱스에 i+1 값 넣기 1~순차적
			System.out.print(arr[i]+" "); //넣은 값 출력하기 
		}
		
		sc.close();
	}
	
	public void ex04() {
//		길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
//		배열 인덱스를 활용해서 귤을 출력하세요.
		Scanner sc = new Scanner(System.in);
		//사용자가 입력한 과일의 인덱스를 알아내자.
		String[] fruits = {"사과","귤","포도","복숭아","참외"};
		
		System.out.println("순번을 알고싶은 과일을 입력하세요(사과,귤,포도,복숭아,참외): ");
//		System.out.println(fruits[1]);
		String input = sc.nextLine(); //입력받기
		
		for(int i=0; i<fruits.length;i++) {
			//입력받은 과일이 있는지 확인하기
			if(input.equals(fruits[i])) {
				System.out.println(fruits[i]+"과일의 인덱스 위치는 : "+i);
			}
		}
		sc.close();
	}
	
	public void ex05() {
//		문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//		개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
//		ex.
//		문자열 : application
//		문자 : i
//		i 개수 : 2
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 : ");
		String str = sc.nextLine();
		
		System.out.println("문자 : ");
		char c = sc.nextLine().charAt(0);
		int count=0;//몇개가 들어갔는지 수를 세어넣을 변수 
		
		//문자열에 있는 문자하나하나 문자배열에 옮겨담기 
		char[] cArr = new char[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			cArr[i] = str.charAt(i); //만들어놓은 문자배열 i번째 인덱스에 문자열 i번째 인덱스 문자 뽑아넣기 
		}
		
		//문자배열에 있는 문자를 입력받은 문자와 비교하여 몇개가 들어가있는지 판별하기
		for(int i=0; i<cArr.length; i++) {
			if(c==cArr[i]) {
				count++;
			}
		}
		
		System.out.println(c+"문자의 개수 : "+count);
		System.out.println(cArr);
		sc.close();
	}
	
	public void ex06() {
//		“월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
//		입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
//		범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
//		ex.
//		0 ~ 6 사이 숫자 입력 : 4
//		0 ~ 6 사이 숫자 입력 : 7
//		금요일
//		잘못 입력하셨습니다.
		
Scanner sc = new Scanner(System.in);
		
		String[] sArr = {"월","화","수","목","금","토","일"};
		
		System.out.println("0~6사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		//0~6까지 수 조건걸기
		if(0<=num&&num<7) {
			System.out.println(sArr[num]);
			
			for(int i=0; i<sArr.length;i++) {
				if(num==i) {
					System.out.println(sArr[i]+"요일");
				}
			}
			
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		sc.close();
	}
	
	
	public void ex07() {
//		사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
//		배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
//		그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
//		ex.
//		정수 : 5
//		배열 0번째 인덱스에 넣을 값 : 4
//		배열 1번째 인덱스에 넣을 값 : -4
//		배열 2번째 인덱스에 넣을 값 : 3
//		배열 3번째 인덱스에 넣을 값 : -3
//		배열 4번째 인덱스에 넣을 값 : 2
//		4 -4 3 -3 2
//		총 합 : 2
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 : ");
		int[] arr = new int[sc.nextInt()];
		
		int sum = 0;
		for(int i=0; i<arr.length;i++) {
			System.out.println("배열"+i+"번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt(); //각 인덱스에 스캐너로 값 입력받아 넣기 
			sum+=arr[i]; //합계변수에 해당 인덱스값 더해 넣어주기 
		}
		
		//출력용 반복문
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("총 합계 : "+sum);
		
		sc.close();
	}
	
	public void ex08() {
//		3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
//		중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
//		단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
//		다시 정수를 받도록 하세요.
//		ex.
//		정수 : 4
//		다시 입력하세요.
//		정수 : -6
//		다시 입력하세요.
//		정수 : 5
//		1, 2, 3, 2, 1
		
		Scanner sc = new Scanner(System.in);
	
		int num = 0;

		String result =""; //결과값 담아놓을 변수 
		int rs =0; //숫자 계산후 넣어질 변수
		
		while(true) {
			System.out.println("정수 : ");
			num = sc.nextInt(); 
			
			if(num<3 || num%2==0) {//입력한 정수가 홀수가 아니거나 3 미만일 경우 
				System.out.println("다시 입력해주세요.");
			}else { //제대로 입력했을때 
				break;
			}
		}
		
		int[] arr = new int[num];
		
		//5 
		for(int i=0; i<num;i++) { //num횟수만큼 반복 
			
			//i값이 num/2보다 작거나 같을때까진 결과값에 +1씩 증가시키기 
			if(i<=num/2) { // 0 1 2 
				rs++; //+1씩증가 
				result += rs+","; //숫자 자료형 문자열로 만들기 
				arr[i] = rs;
			}else {//3 4 그 이후부터는 -1씩 감소시키기 
				rs--;
				arr[i]=rs;
				if(i!=(num-1)) {
				 //i가 마지막이 아닐때 (마지막이면 콤마를 찍으면 안되기때문에 )
					result += rs+",";
				}else {//마지막이면 콤마 없이 더하기 
					result += rs+"";
				}
			}
		}
		System.out.println(result);
		
		System.out.println(Arrays.toString(arr));
		
		sc.close();
		
	}

	
	
	public void ex09() {
//		사용자가 입력한 값이 배열에 있는지 검색하여
//		있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
//		단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		
		Scanner sc = new Scanner(System.in);
		
		String[] chikens = {"뿌링클","맛초킹","허니콤보","굽네순살오리지널","황금올리브"};
		
		System.out.println("치킨 메뉴를 입력하세요 : ");
		String input = sc.nextLine();
		/*
		for(int i=0; i<chikens.length; i++) {
			if(input.equals(chikens[i])) {//만약 입력한 메뉴가 있다면
				System.out.println(chikens[i]+" 치킨 배달 가능!");
				break;
			}else {
				System.out.println(chikens[i]+" 치킨은 없는 메뉴입니다..ㅜ");
			}
		}
		*/
		int count = 0; //숫자로 판별하기 
		boolean flag = false; //논리값으로 판별하기
		for(int i=0; i<chikens.length; i++) {
			if(input.equals(chikens[i])) {
				count++; //숫자 증가시켜서 판별용으로 사용
				flag=true; //true으로 변경하여 판별용으로 사용
				break;//찾았으면 뒤는 볼필요도 없으니까 break로 반복문 벗어나기 
			}
		}
		System.out.println("===========숫자(count) 이용출력=============");
		if(count>0) { //메뉴가 있다면 count가 ++ 되었을테니까 조건에 부합한다 즉,치킨메뉴 배달 가능이란 소리
			System.out.println(input+" 치킨 배달 가능!!");
		}else {//불가능..
			System.out.println(input+" 치킨은 없는 메뉴입니다...");
		}
		System.out.println("============논리값 이용 출력===============");
		if(flag) {//치킨메뉴가 있어서 true값이 되었다면 바로 조건을 만족한다 if(true)가 됨
			System.out.println(input+" 치킨 배달 가능!!");
		}else {
			System.out.println(input+" 치킨은 없는 메뉴입니다...");
		}
		sc.close();
		
		
	}
	
	public void ex10() {
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
		
		int[] arr = new int[10];
		Random r = new Random();
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(10)+1;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public void ex11(){
//		사용자에게 주민등록번호를 입력 받고 해당 문자열의 각 문자들을 char[] 에 옮겨 담은 원본 배열 만들
//		어 둔 후, 원본 배열은 그대로 유지한 채로 복사본 배열을 만들 때 성별 자리 이후부터는 ‘*’을 담은 후
//		하단의 결과처럼 출력해보세요.
//		주민등록번호(-포함) : 123456-1234567
//		123456-1******
		
		Scanner sc = new Scanner(System.in);
		//1.문자열을 char[] 로 변환하기 
		//2.char[]로 바꾼 배열을 원본배열로 두고 복사본 배열을 만든다.
		//3.이때 복사본배열은 성별자리 이후부터 *을 담아야한다.
		System.out.println("주민등록번호(-포함) : ");
		String personId = sc.nextLine();
		
		char[] cArr = new char[personId.length()]; //원본 배열 
		
		//문자열에 인덱스에 있는 문자를 문자 배열에 넣어주는 작업 
		for(int i=0; i<personId.length(); i++) {
			cArr[i] = personId.charAt(i); //cArr에 입력받은 문자열이 각각인덱스로 들어간다
		}
		
		//복사본 배열 
		char[] copy = new char[cArr.length];
		
		//000101-3333322
		//복사본 배열에 원본배열에 있는 값들 넣기 (깊은 복사)
		for(int i=0; i<cArr.length; i++) {
			if(i>7) { //성별을 판별할수있는 자리수인 7번인덱스 이후부터는 *표처리
				copy[i]='*';
			}else {
				copy[i]=cArr[i]; 
			}
		}
		
		System.out.println("========원본배열=========");
		System.out.println(cArr);
		System.out.println("=======복사본 배열========");
		System.out.println(copy);
		
		
		sc.close();
		
	}
	
	public void ex12() {
		//5x5 빙고판 만들기
		//1~25 임의의 수를 넣어 작성하자
		//1~25까지의 수를 순서대로 넣어놓고 섞어주는 작업으로 빙고판 만들기
		
		int[] data = new int[25];//1~25
		
		Random r = new Random();
		
		//순서대로 넣어놓고 섞어보기 
		int num = 1;
	
		for(int i=0; i<data.length; i++) {
			data[i] = num++;
		}
		System.out.println(Arrays.toString(data));
		//셔플코드
		for(int i=0; i<data.length; i++) {
			int ranNum = r.nextInt(data.length); // 0~24
			
			if(i==ranNum) { //순서가 랜덤으로 뽑힌 수와 같다면 
				i--;// i++를 무효시켜서 다시뽑기 (자리 다시뽑기) 
			}else {//반복을 실행하고있는 i번째 위치에 있는 값과 ranNum으로 뽑은 위치에 있는 값을 서로 교환하겠다.
				int tmp = data[i]; //1 잠시 보관 -덮어쓰면 없어지니까.
				data[i] = data[ranNum];//랜덤으로 뽑은 수를 i번째 자리에 넣기
				data[ranNum] = tmp; // 잠시 보관했던 i번째 자리에 있던 수를 ranNum 자리에 넣기 
			}
		}
		
		System.out.println(Arrays.toString(data));
		
	}

	public void ex12_1() {
		//1~25번째 자리에 랜덤수를 뽑아 넣기 
		//처음부터 랜덤데이터를 넣어버리기 
		
		int[] data = new int[25];
		
		Random r = new Random();
		
		//각 인덱스에 랜덤값 뽑아넣기. - 1~25까지 중의 임의의 수를 뽑아 넣어보기 
		for(int i=0; i<data.length; i++) {
			data[i] = r.nextInt(25)+1; //임의의수 뽑기 
			
			//만약 랜덤수가 기존에 인덱스에 들어있다면 무효화 처리 (다시뽑기) 
			for(int j=0; j<i; j++) { //현재 자리 전까지만 중복이 있는지 확인하기 
				if(data[i]==data[j]) { //현재 뽑힌값이 앞에서 뽑혔던 값들중 같은게 있냐?
					//있으면 안되기때문에 다시뽑아라!!
					i--; //다시뽑기위해서 반복문 되돌리기
					break;//중복을 발견했으니 벗어나기 
				}
			}
			
		}
		
		//5x5로 출력
		int count = 0;
		for(int i=0;i<data.length;i++) {
			
			System.out.printf("%-5d", data[i]);
			count++;
			if(count%5==0) {
				System.out.println();
			}
		}
		
		
		
		
	}
	public void ex12_2() {
		//2차원배열로 만들어 임의의 위치에 직접 순서대로 넣기 1~25
		
		int[][] data = new int[5][5];
		
		Random r = new Random();
		
		//1부터 순차적으로 넣어주는데 자리를 임의로 뽑아보기 
		for(int i=1;i<=25; i++) {
		//반복문에 사용한 i값을 넣어주는 값으로 활용해보기 1~25이니까 (i+1)
			int x = r.nextInt(5)+0; //0부터 5개 0 1 2 3 4 
			int y = r.nextInt(5)+0; //0부터 5개 0 1 2 3 4 
			
			if(data[x][y]==0) { //아직 수가 배정되지 않음. (배정가능)
				data[x][y]=i;
			}else {
				i--;//이미 있는 자리를 뽑았으니 다시 반복시키기 
			}
		}
		
		for(int i=0;i<data.length; i++) {
			for(int j=0;j<data[i].length; j++) {
				System.out.print(data[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	
	public void ex12_3() {
		// 1~25번째 자리에 랜덤수를 뽑아 넣기
		// 처음부터 랜덤데이터를 넣어버리기

		int[] data = new int[25];

		Random r = new Random();

		// 각 인덱스에 랜덤값 뽑아넣기. - 1~25까지 중의 임의의 수를 뽑아 넣어보기
		for (int i = 0; i < data.length; i++) {
			data[i] = r.nextInt(25) + 1; // 임의의수 뽑기

			// 만약 랜덤수가 기존에 인덱스에 들어있다면 무효화 처리 (다시뽑기)
			for (int j = 0; j < i; j++) { // 현재 자리 전까지만 중복이 있는지 확인하기
				if (data[i] == data[j]) { // 현재 뽑힌값이 앞에서 뽑혔던 값들중 같은게 있냐?
					// 있으면 안되기때문에 다시뽑아라!!
					i--; // 다시뽑기위해서 반복문 되돌리기
					break;// 중복을 발견했으니 벗어나기
				}
			}
		}
		//1차원 배열인 data를 2차원 배열에 넣기 
		
		int size = 5;
		//int[] data = new int[25];
		/*[18,  6,  14, 16,  3
		,  13, 17, 10, 22,   1
		 , 11,  4,  12, 25, 15
		 , 19,  8,  24, 21,  2
		 ,  7, 20,  5,  23,  9]
		*
		*/
		
		int[][] bingo = new int[size][size];
		int x=0;
		int y=0;
		
		for(int i=0;i<data.length;i++) {
			bingo[x][y] = data[i]; //2차원배열 0,0위치에 1차원배열 0번째 있는 숫자를 넣어준다 
			y++; //y값 1증가시켜서 0,1
			if(y==size) {
				y=0; //y값을 다시 0으로
				x++; //x값을 1증가 
			}
		}
		
		for(int i=0; i<bingo.length;i++) {
			for(int j=0; j<bingo[i].length; j++) {
				System.out.printf("%5d",bingo[i][j]);
			}
			System.out.println();
		}
		
	}
	
	
	
	
}
