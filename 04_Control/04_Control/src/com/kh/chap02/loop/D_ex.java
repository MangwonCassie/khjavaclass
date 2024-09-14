package com.kh.chap02.loop;

public class D_ex {
	
	public void method1() {
	
	/*	
	
		//내가 하려고하는 동작을 몇번 반복시킬것인지
		//5번 인사를 하고싶다
		
//		System.out.println("안녕");
//		System.out.println("안녕");
//		System.out.println("안녕");
//		System.out.println("안녕");
//		System.out.println("안녕");
		
		//100번을 인사해야한다고 가정한다면?
		//내가 하고자하는 구문을 반복문으로 감싸 횟수를 지정하고 수행하게 한다.
		//10번 
		
//		나는 이거를
//		System.out.println("안녕?");
//		열번 반복할래 
//		for(초기식; 조건식; 증감식) {
//			수행될 문장;
//			}
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(i + “ 출력");
//			}
		//10번 반복을 하고싶다 기준점을 잡고 최대치를 잡고 기준점에서 최대치까지 어떠한 방식으로 도달시킬것인지
		//기준점을 1로 잡고 최대치를 10까지로 1씩증가하는 방식으로 1 2 3 4 5 6 7 8 9 10 
		for(int i = 1; i <=10; i=i+1) {
			System.out.println("안녕~~"+i);
		}
		
		//위와 똑같이 10번 반복하는 반복문을 만들고자 하는데 내맘대로 규칙을 정할래
		//나는 100을 기준으로 잡고 100씩증가해서 총 10번 반복시킬래 
		int num = 1;
		for(int i =100;i<=1000; i=i+100) { //100 200 300 400 500 600 700 800 900 1000
			System.out.println("안녕~~"+num++);
		}
		
		//위와 똑같이 10번 반복하는 반복문을 만들고자 하는데 내맘대로 규칙2
		//나는 2를 기준으로 잡고 총 10번 반복하고 싶은데 증가하는것은 *2로 할래
		int count = 0;
		for(int i=2; i<100000;i=i*2) {
			System.out.println(i);
			count++;
			if(count==10) {
				break;
			}
		}
		
		int a0=10;
		int a1=20;
		int a2=30;
		int a3=40;
		
		for(int i=0;i<4;i++) {
			System.out.println(i);
		}
		*/
		int[] arr = new int[10];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 5;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	
	
}
