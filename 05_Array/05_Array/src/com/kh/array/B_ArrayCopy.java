package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {
	//배열의 복사
	//1)얕은 복사 - 주소값 복사 
	//2)깊은 복사 - 실제 데이터 복사 
	
	/*
	 * 1.System.arraycopy() 메소드 
	 * 몇번 인덱스부터 몇개를 어느 위치에 복사할것인지 지정 가능하다.(주의사항 - 인덱스 범위를 벗어나지 않도록 주의)
	 * 
	 * 2.Arrays.copyOf() 메소드 
	 * 원본배열의 0번인덱스부터 시작하여 복사가 진행되고 내가 제시한 개수 만큼 복사된다.
	 * 만약 내가 제시한 개수가 원본배열의 크기보다 크다면 나머지 공간은 0으로 초기화된채로 생성된다. (크기지정)
	 * 
	 * 3.원본배열.clone(); 메소드 
	 * 원본배열과 동일하게 복사한다.(크기,인덱스지정 하지 않음) 
	 * 
	 * */
	
	
	
	//얕은복사
	public void method1() {
		
		//원본 배열
		int[] origin = {1,2,3,4,5}; 
		
		System.out.println("=========원본 배열 출력=========");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i]+" ");
		}
		System.out.println(); //줄바꿈용 
		//복사본 배열
		int[] copy = origin;
		
		System.out.println("========복사본 배열 출력=========");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
		System.out.println(); //줄바꿈용
		
		//복사본으로 백업자료 만들어놨으니 원본배열 값 변경해보기 
		
		origin[2] = 100; //원본배열 2번인덱스에 값 100 넣기
		
		System.out.println("원본 배열 수정 후 ");
		
		
		System.out.println("=========원본 배열 출력=========");
		for(int i=0;i<origin.length; i++) {
			System.out.print(origin[i]+ " ");
		}
		System.out.println();
		
		System.out.println("========복사본 배열 출력=========");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
		System.out.println(); //줄바꿈용
		
		//원본 배열만 수정을 했음에도 복사본 배열이 수정되었다.
		//원본 배열과 복사본 배열이 같은 공간을 참조하고 있기 때문에 변경이 일어나면
		//동일한 공간에 변경이 생기는것
		//서로 같은 주소값을 가지고 있는지 확인
		System.out.println(origin); //[I@6d06d69c
		System.out.println(copy); //[I@6d06d69c
		
		//얕은 복사 -> 배열의 주소값만 복사되어 결국 같은 배열을 참조하는 형태.
		
	}
	
	//깊은 복사 : for문 이용 
	public void method2() {
		
		int[] origin = {1,2,3,4,5};
		
		//새로운 배열을 생성하여 기존배열에 담겨있는 값을 대입해준다.
		int[] copy = new int[origin.length]; //기존 배열 크기만큼 할당받기 
		
		System.out.println("기존 배열 주소값 : "+origin);
		System.out.println("복사 배열 주소값 : "+copy);
		
		copy[0] = origin[0]; //원본배열0번인덱스에 있는 값을 복사배열 0번인덱스에 넣기.
		copy[1] = origin[1];
		copy[2] = origin[2];
		copy[3] = origin[3];
		copy[4] = origin[4];
		
		//for문으로 해보기
		for(int i=0;i<origin.length;i++) {
			copy[i] = origin[i];
		}
		
		System.out.println("========원본 배열 출력========");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i]+" "); 
		}
		System.out.println();//줄바꿈용

		System.out.println("========복사본 배열 출력========");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+" "); 
		}
		System.out.println();//줄바꿈용
		
		//정말로 복사가 잘 되었는지 확인 
		//원본배열의 2번 인덱스값 변경해보기 
		origin[2] = 500;
		
		System.out.println("======원본배열 변경 후========");
		
		System.out.println("========원본 배열 출력========");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i]+" "); 
		}
		System.out.println();//줄바꿈용

		System.out.println("========복사본 배열 출력========");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+" "); 
		}
		System.out.println();//줄바꿈용
		
		System.out.println(origin);//[I@6d06d69c
		System.out.println(copy); //[I@7852e922
		
	}
	
	//깊은복사2 : arraycopy() 메소드 이용
	public void method3() {
		//새로운 배열을 생성한 후 System 클래스에 있는 arraycopy()메소드를 호출
		//몇번 인덱스로 부터 몇개를 어느 인덱스위치에 넣을것인지 지정가능하다.
		
		int[] origin = {1,2,3,4,5};
		
		//{0,0,0,....}
		int[] copy = new int[10]; //10칸짜리로
		//[표현법]System.arraycopy(원본배열이름,원본배열에서 복사시작할 인덱스,
//								  복사본배열이름,복사본배열에서 복사될 시작인덱스,복사할 개수);
//		System.arraycopy(src, srcPos, dest, destPos, length);
//		System.arraycopy(origin, 0, copy, 0, 5); //0번인덱스부터
		
		//원본배열의 2번인덱스부터 3개 복사하여 복사본배열의 5번인덱스부터 넣기
		//System.arraycopy(origin, 2, copy, 5, 3);
		//원본배열의 0번인덱스부터 5개를 복사하여 복사본 배열의 3번인덱스부터 넣기
		System.arraycopy(origin, 0, copy, 3, 5);
		
		//원본배열
		System.out.println("원본배열 출력");
		for(int i=0;i<origin.length; i++) {
			System.out.print(origin[i]+" ");
		}
		System.out.println();
		
		//복사본 배열
		System.out.println("복사본 배열 출력");
		for(int i=0;i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
		System.out.println();
		
		System.out.println("원본 배열 주소값 : "+origin);
		System.out.println("복사본 배열 주소값 : "+copy);
		
	}
	
	//깊은복사3 Arrays.copyOf() 메소드 사용 
	public void method4() {
		//Arrays 클래스에서 제공하는 copyOf() 메소드
		
		int[] origin = {1,2,3,4,5};
		
		//[표현법]복사본 배열 = Arrays.copyOf(원본배열이름,복사할 개수);
		//복사할 개수가 곧 복사배열의 크기가 된다. 만약 복사할 원본배열보다 큰 수를 입력한다면 그만큼의 공간이 생성된다.
		int[] copy = Arrays.copyOf(origin, 10); 
		
		System.out.println("복사배열 출력 ");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
		System.out.println();
		
		System.out.println("원본 배열 주소값 : "+origin);
		System.out.println("복사본 배열 주소값 : "+copy);
		
	}
	//깊은 복사 4번 clone(); 메소드 이용
	public void method5() {
		
		//[표현법]복사본배열 이름 = 원본배열이름.clone();
	
		int[] origin = {1,2,3,4,5};
		
		//원본배열.clone(); - 시작인덱스,개수 지정하지 않음 -> 원본이랑 똑같이 만들기 
		int[] copy = origin.clone(); 
		
		System.out.println("복사배열 출력 ");
//		for(int i=0; i<copy.length; i++) {
//			System.out.print(copy[i]+" ");
//		}
		//Arrays.toString(문자열로만들 배열);
		//앞과 뒤에 [ ] 배열표시와 각 인덱스값들 사이에 ,를찍어서 문자열로 반환해준다.
		System.out.println(Arrays.toString(copy));
		System.out.println();
		
		System.out.println("원본 배열 주소값 : "+origin);
		System.out.println("복사본 배열 주소값 : "+copy);
		
	}

}
