package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class MapRun {

	public static void main(String[] args) {
		//HashMap
		//[표현법] HashMap<자료형,자료형> 객체명 = new HashMap<>();
		
		HashMap<String,String> hm = new HashMap<>();
		
		hm.put("김이름","000101-3333222");
		hm.put("박사람","990505-4444222");
		hm.put("김이름","981020-3322333"); //김이름과 키값 동일
		hm.put("최철수","990505-4444222"); //박사람과 벨류값 동일
		
		System.out.println(hm);//키값은 중복 불가능,벨류값은 중복 가능,순서 유지하지 않음
		
		HashMap<String,Snack> snacks = new HashMap<>();
		
		//put메소드를 통해 데이터를 넣어보자 
		snacks.put("포스틱", new Snack("짠맛",500));
		snacks.put("양파링", new Snack("양파짠맛",700));
		snacks.put("눈을감자", new Snack("짠감자맛",400));
		snacks.put("눈을감자", new Snack("매운맛",1200));
		
		System.out.println(snacks);//기존의 key값에 다시 대입하면 value값이 덮어쓰여진다.
		//여기서 key는 식별자의 역할을 가진다.key로 value를 찾는 형태
		
		//get(Object key) : Object value =>제네릭 설정을 해주었다면 매개변수는 String 반환형은 Snack이 된다
		//해당 키값에 대한 value값을 반환해주는 메소드
		System.out.println(snacks.get("포스틱"));
		
		//size() : 담겨있는 개수
		System.out.println(snacks.size());
		
		//replace(K key,V value) : 해당 키값을 찾아서 value값을 바꿔주는 메소드
		snacks.replace("눈을감자", new Snack("콘소메맛",100));
		//만약 존재하지 않는 키값을 입력한다면? - 추가되지않는다
		snacks.replace("눈을뜨자", new Snack("아주매운맛",1000));
	
		System.out.println(snacks);
		
		//remove(Object key) : 해당 키값을 찾아서 키+벨류 세트로 지워주는 메소드
		snacks.remove("양파링");
		System.out.println(snacks);
		
		//해시맵에 있는 데이터에 모두 순차적으로 접근하고자 한다면?
		
		//Map계열을 Set계열로 바꿔서 - Iterator를 사용
		
		//1.keySet() 이용하기
		//-HashMap에서 제공하는 메소드로 Set에 key값만 담아준다.
		//반환형은 Set
		//1단계) map에 있는 key들만 set으로 변경시키기 
		Set<String> keySet = snacks.keySet();
		
		//2단계) 1단계에서 만들어진 set을 iterator로 만들기
		Iterator<String> it = keySet.iterator();
		
		//3단계) 만들어진 Iterator 순차적으로 접근하기
		while(it.hasNext()) { //keySet에는 Map에 있던 키들만 모아놨기때문에 해당 키로 get메소드를 사용하면 value를 얻을 수 있다.
			String key = it.next();//키값 
			Snack s = snacks.get(key);//순차적으로 접근하여 얻은 키값으로 value값 조회하기
			
			System.out.println("key : "+key +" value : "+s);
		}
		
		
		System.out.println("=====================");
		//2.entrySet() 메소드 이용하는 방법
		
		//1)Map에 있는 Key + Value세트를 Entry라고 하는 형식으로 Set에 담아주기
		//Entry<> 라고하는 제네릭타입을 이용하는 방법
		Set<Entry<String,Snack>> entrySet = snacks.entrySet();
		/*
		//2)향상된 for문으로 
		for(Entry e : entrySet) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		*/
		
		//Iterator로 변환하기
		Iterator<Entry<String,Snack>> it2 = entrySet.iterator();
		
		//반복문
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		/* Map의 특성상 순차적으로 접근할 직접적인 방법이 없기때문에 
		 * -Map계열을 Set계열로 변경하여 접근한다.
		 * -keySet()과 entrySet()을 이용하면 된다.
		 * 
		 * 
		 * */
		
		
		
	}

}
