package com.kh.chap02_set.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

import com.kh.chap02_set.model.vo.Student;

public class SetRun {

	public static void main(String[] args) {
		//HashSet
		//값만 저장,index개념은 없다. , 중복불가
		//[표현법]HashSet 객체명 = new HashSet();
		
		//문자열 제네릭설정
		HashSet<String> set = new HashSet<>();
		//값 추가
		set.add("안녕");
		set.add("하세요");
		set.add("반갑");
		set.add("습니다");
		set.add("안녕");
		
		System.out.println(set);//저장순서 유지되지 않고, 중복 불가능
		
		//list는 순서유지O 중복O
		ArrayList<String> list = new ArrayList<>();
		list.add("안녕");
		list.add("안녕");
		list.add("안녕");
		System.out.println(list);
		
		set.add(null);
		set.add(null);
		list.add(null);
		list.add(null);
		
		System.out.println("set : "+set);//null도 중복 불가
		System.out.println("list : "+list);//null도 중복 가능
		
		//set의 크기 -size()
		System.out.println("크기 : "+set.size());
		//값 삭제 - remove()-index개념이 없기때문에 삭제할 값을 입력
		boolean isTrue = set.remove("습니다");
		System.out.println(isTrue+" "+set);
		
		//clear();
		set.clear();//데이터 전체 삭제 메소드
		System.out.println(set.isEmpty());
		
		
		//Student 객체를 만들어 중복확인해보기
		HashSet<Student> hs = new HashSet<>();
		hs.add(new Student("김이름","010-2222-3333",15));
		hs.add(new Student("김이름","010-2222-3333",15));
		hs.add(new Student("박아름","010-5555-1212",16));
		hs.add(new Student("최일름","010-1111-5523",19));
		
		for(Student s : hs) {
			System.out.println(s);
		}
		//저장순서 유지X,중복제거 X 
		//why? - 동일 객체로 판단되지 않아서(주소값이 다르니까)
		//실질적으로 객체에 담긴 값을 비교해서 동일 객체라고 판단 시키고싶다.
		//HashSet은 값이 추가될때마다 equals메소드와 hashCode를 비교하여 둘다 결과가 true면 
		//동일 객체라고 판단한다. 
		//equals() : 현재 객체의 주소값을 비교하여 결과 반환 (Object꺼)
		//hashCode() : 현재 객체의 주소값을 10진수로 변환해서 보여주는 형태
		
		//객체 내부 값으로 같은지 아닌지를 판단하기위해 equals와 hashCode를 오버라이딩해야한다.(내용물 토대로 작업할 수 있도록, 항상 new연산자 쓰니까 항상 주소값이 다르잖아)
		//Student 클래스
		//equals() : 각 필드의 값이 모두 일치하면 true 
		//hashCode() : 세 필드값을 하나로 합치고 해쉬화하여 반환 
		
		Student s1 = new Student("테스트","010-1111-2222",10);
		Student s2 = new Student("테스트","010-1111-2222",10);
		
		//이미 hashCode를 재정의 했기때문에 실질적인 주소값을 토대로 비교하는 메소드를 사용해서 주소값 비교를 한다
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(s1.equals(s2));
		
		//HashSet에 들어있는 모든 값을 출력하는 방법 
		System.out.println("=======================");
		
		//1.반복문 - 인덱스 개념이 없기때문에 기본적으로 인덱스 활용한 for문은 사용할 수 없다.
		//향상된 for문을 이용
		for(Student s : hs) {//제네릭으로 클래스타입을 설정하면 해당 클래스로 받아서 확인할 수 있다.
			System.out.println(s);
		}
		
		System.out.println("=======================");
		//2.HashSet의 내용물을 ArrayList에 담아서 인덱스를 활용하여 출력
		
		//1단계 : ArrayList 생성 
//		ArrayList list2 = new ArrayList();
		//2단계 : addAll 메소드 ->통째로 추가
//		list2.addAll(hs);
		
		//1단계+2단계)리스트 생성시에 매개변수로 전달하여 생성하기 
		ArrayList<Student> list2 = new ArrayList<>(hs); //생성과 동시에 값 초기화
		//3단계 : 인덱스로 접근하여 출력하기 
		for(int i=0;i<list2.size();i++) {
			System.out.println(list2.get(i));
		}
		
		System.out.println("혼자해본 것====================");

		//3.Iterator(반복자) -> HashSet클래스에서 제공
		Iterator<Student> it = hs.iterator();
		System.out.println(it);//주소값만 나옴
		//값을 접근하려면 메소드를 이용해야한다. next()
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next()); //더이상 접근할 대상 없으면 NoSuchElementException 오류발생
		
		//StringTokenizer와 흡사하다
		while(it.hasNext()) {//반복자에 남아있는 대상이 있는지? 있으면 true/없으면 false
			System.out.println(it.next());
		}
		
		
		System.out.println("========================");
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		
		lhs.add("이번엔");
		lhs.add("순서가");
		lhs.add("지켜질까요");
		lhs.add("이번엔");
		lhs.add("순서가");
		
		System.out.println(lhs);//중복은 불가능하지만 순서는 지켜지는 set
		
		//3가지 방법으로 출력해보세요
		//1.반복문
		for(String s : lhs) {
			System.out.println(s);
		}
		//2.ArrayList에 담아넣기 
		ArrayList<String> lhsList = new ArrayList<>(lhs);
		for(int i=0; i<lhsList.size(); i++) {
			System.out.println(lhsList.get(i));
		}
		//3.iterator 활용하기
		Iterator<String> it2 = lhs.iterator();
		
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}

	}

}
