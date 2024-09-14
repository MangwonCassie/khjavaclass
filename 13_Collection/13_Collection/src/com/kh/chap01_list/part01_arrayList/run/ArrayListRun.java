package com.kh.chap01_list.part01_arrayList.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_arrayList.model.vo.Music;

public class ArrayListRun {

	public static void main(String[] args) {
		
		/*
		 * 컬렉션 (Collection)
		 * 자료구조가 내장되어있는 클래스
		 * 자바에서 제공하는 "자료구조"를 담당하는 프레임워크이다.
		 * -자료구조 : 데이터들을 효율적으로 다룰때 필요한 개념
		 * -프레임 워크 : 효율적인 기능들이 이미 정의되어있는 툴(도구)
		 * 
		 * 데이터들이 새롭게 추가되거나 삭제되거나 수정이 되는 기능들이 이미 정의되어 있는 도구라고 볼수있다.
		 * 다량의 데이터들을 관리하고자할때 배열을 사용할 수 있지만 배열의 단점들이 있기때문에 불편하여
		 * 그 단점들을 보완한것이 컬렉션
		 * 
		 * 배열과 컬렉션의 차이점
		 * -배열의 단점
		 * 1.한 타입의 데이터들만 저장 가능하다.
		 * 2.배열을 쓰고자 할때 먼저 크기를 지정해야하며 크기 변경을 할 수 없다.
		 * -때문에 새로운 값을 추가하거나 삭제하여 크기가 변경이 된다면 기존 내용을 복사하는 코드를 작성하여 새 배열을 할당해야한다.
		 * 
		 * 컬렉션의 장점 
		 * 1. 기본적으로 여러 타입의 데이터들을 저장할 수 있다. 같은 타입도 묶어서 저장할 수 있다(제네릭타입)
		 * 2. 크기에 제약이 없음
		 * -크기 지정을 하지 않아도 되고 크기를 벗어난 입력을 하여도 자동으로 크기변경을 해준다.
		 * 3.중간에 값을 추가하거나 삭제하는 경우 값을 앞으로 또는 뒤로 밀어주는 코드가 내장되어있다.
		 * 
		 * 방대한 데이터들을 단지 담아두고 조회만 할 목적이라면 배열을 사용하는것이 좋지만
		 * 만약 추가 삭제 수정이 빈번히 일어나는 경우라면 컬렉션을 사용하는것이 더 효율적이다.
		 * 
		 * 컬렉션의 종류 (3가지 계열)
		 * List : 담고자 하는 값(value)만 저장하고 값 저장시 순서를 유지한다(index개념이 있음) /중복 가능
		 * 		ex)ArrayList,Vector,LinkedList등등 
		 * Set : 담고자 하는 값(value)만 저장 가능하고 저장시 순서를 유지 하지 않는다.(index개념 없음) / 중복 불가
		 * 		ex)HashSet,LinkedHashSet,TreeSet 등등..
		 * Map : 키(key) + 값(value)의 형태로 이루어져있고 값 저장시 순서를 유지하지 않는다.(index개념 없음)
		 * 			중복키는 불가능 중복값은 가능하다 .
		 * 		ex)HashMap,HashTable,TreeMap,Properties 등등... 
		 * */

		//ArrayList
		//[표현법]
		//ArrayList 객체이름  = new ArrayList(); - 크기 지정 안하는 생성자(기본크기10)
		//ArrayList 객체이름 = new ArrayList(크기); - 크기 지정 생성자(크기를 벗어나는 입력이 생기면 크기가 늘어난다)
		
		ArrayList list = new ArrayList(7);
		System.out.println(list.size());//아무런 값도 넣지 않았기 때문에 비어있음
		//데이터 넣어보기
		//데이터 추가 메소드 add()
		list.add(10);
		list.add("안녕하세요");
		list.add(5.5);
		list.add(true);
		list.add('문');
		list.add(new Music("비","폴킴"));
		list.add(new Music("omg","뉴진스"));
		list.add(10);//크기보다 더 많이 넣어보기 (중복가능)
		//크기지정한 크기보다 더 많이 데이터를 넣어도 자동으로 크기를 증가시켜서 오류가 발생하지 않는다.
		
		
		System.out.println(list);
		System.out.println(list.size());//크기 : 5 
		
		System.out.println("================");
		//순차적으로 순서를 유지하며 등록이 되어있고 인덱스도 활용 가능하다.
		System.out.println(list.get(3));//true 3번인덱스에 있는 값이 나옴
		System.out.println(list.get(5));
		
		//인덱스를 활용하여 해당 위치에 값을 끼워넣기 
		//add메소드의 오버로딩된 형태
		//add(int index,E e): index에 전달된 요소를 넣어주는 메소드
		list.add(4,new Music("봄비","bmk"));
		
		System.out.println(list);//원하는 index위치에 값을 끼워넣을 수 있음 
		
		//값을 추가해봤으니 수정도 해보자.
		//set(int index,E e) : 리스트에 index위치를 e로 변경하는 작업
		list.set(4, new Music("사랑비","김태우"));
		System.out.println(list);
		
		//값을 추가해보고 수정해봤으니 삭제를 해봅시다.
		//remove(int index) : 리스트에 index위치를 삭제하는 작업메소드
		list.remove(4); //4번인덱스 값 삭제
		System.out.println(list);
//		list.remove(10); 인덱스 범위를 벗어나면 배열과 마찬가지로 오류가 발생한다.
		
		//리스트의 크기 
		//size() : 리스트의 크기를  반환해주는 메소드,담겨있는 데이터의 개수를 반환한다.
		System.out.println("리스트의 크기 : "+list.size());
		System.out.println("리스트의 마지막 인덱스  : "+(list.size()-1));
		
		//리스트에서 데이터를 조회해올때 형변환을 통해 해당 데이터로 변환하기.
		//get(int index) : 반환형
		int a = (Integer)list.get(0); //기본자료형(wrapper클래스로 형변환)
		String b = (String)list.get(1);//문자열로 변환
		double c = (double)list.get(2);//실수형으로 변환(기본자료형 형변환)
		Music m = (Music)list.get(5);//클래스 타입으로 형변환 
		
		System.out.println(a+b+c+m);
		System.out.println(m.getSinger()); 
		System.out.println(((Music)(list.get(5))).getSinger());
		
		//인덱스 개념이 있으니 반복문을 활용해보자.
		for(int i=0;i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//만약 순차적으로 처음부터 끝까지 접근하려한다면
		//향상된 for문을 사용 (foreach문) 
		
		//모든자료형을 받아줄수있는 Object로 뽑아보기.
		for(Object o : list) {
			System.out.println(o);
		}
		
		//리스트의 부분추출
		//subList(int index1,int index2) : 반환형 List
		//index1 인덱스부터 index2-1 인덱스까지 값을 추출해서 리스트로 반환해주는 메소드
		
		System.out.println("list에 담았습니다");
		List sub = list.subList(2, 5);//index2-1까지 반환하는 메소드
		System.out.println(list);
		System.out.println(sub);
		
		//리스트 더하기
		//addAll(Collection c) : 해당 리스트에 다른 컬렉션에 있는 데이터를 통째로 추가하는 메소드
		
		list.addAll(sub);
		
		System.out.println(list);
		
		
		//전부 지우는 메소드 
		//clear() 
		list.clear();
		System.out.println(list);
		
		//비어있는지 확인하는 메소드
		//isEmpty();
		System.out.println(list.isEmpty());
		list.add(10);
		System.out.println(list.isEmpty());
		
		
	}

}
