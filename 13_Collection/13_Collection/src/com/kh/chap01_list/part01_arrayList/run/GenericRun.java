package com.kh.chap01_list.part01_arrayList.run;

import java.util.ArrayList;

import com.kh.chap01_list.part01_arrayList.model.vo.Music;

public class GenericRun {

	public static void main(String[] args) {
		/*
		 * 제네릭(Generic) <E>
		 * 컬렉션 안에서 다룰 타입들을 미리 지정해주는 역할 -> 명시적으로 <String>,<Integer>,,...
		 * 객체의 형변환을 사용할 필요가 없어진다.
		 * -내가 사용하고자 하는 타입으로 지정하는것.
		 * 
		 * 별도의 제네릭타입을 지정하지 않으면 Object 타입으로 된다.
		 * 
		 * 제네릭을 사용하는 이유
		 * 1.저장할 타입의 제한을 두기 위함.
		 * 2.형변환 또는 자료형 비교를 없애기위함.
		 * 
		 *[표현법]
		 * ArrayList<E> list = new ArrayList<>(); 
		 * 
		 * 제네릭 타입에는 참조자료형만 올 수 있다. 기본자료형을 사용하려면 Wrapper 클래스를 활용해야한다.
		 * */
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("문자열");
		list.add("확인");
//		list.add(10); - 지정한 자료형이 아니면 불가능하다.
		System.out.println(list);
		
		//양쪽에 제네릭 타입을 넣어주는게 기본 
		//하지만 왼쪽에 선언부에서 타입추론이 일어나기때문에 오른쪽은 생략가능하다.
//		ArrayList<Music> ml = new ArrayList<Music>();
		ArrayList<Music> ml = new ArrayList<>();
		ml.add(new Music("하입보이","뉴진스"));
		ml.add(new Music("가나다라","제이팍"));
		
		//만약 0번인덱스의 가수를 알고싶다면?
//		((Music)(ml.get(0))).getSinger(); - 제네릭 지정 전 
		String singer = ml.get(0).getSinger(); //제네릭 지정 후 
//		Music m = ml.get(0);
		
		//향상된 for문
		//제네릭 지정 전 
		for(Object o : list) {
			
		}
		
		//제네릭 지정 후 
		for(Music m : ml) {
			System.out.println(m);
		}
		
		
		
	}

}
