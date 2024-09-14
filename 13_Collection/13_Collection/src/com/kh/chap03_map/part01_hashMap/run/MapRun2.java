package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Dog;

public class MapRun2 {

	public static void main(String[] args) {
		
		HashMap<String,Dog> hm = new HashMap<>();
		hm.put("뽀삐", new Dog("뽀삐","믹스"));
		hm.put("예삐", new Dog("예삐","말티즈"));
		
		System.out.println(hm);
		
		//1.keySet
		
		Set<String> keyset = hm.keySet();
		for(String s : keyset) {
			System.out.println("키 : "+s);
			System.out.println("벨류 : "+hm.get(s));
		}
		//2.Entry
		Set<Entry<String,Dog>> entrySet = hm.entrySet();
		System.out.println("entry 이용하기 ");
		for(Entry<String,Dog> e : entrySet) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		
	}

}
