package com.kh.chap03_map.part02_properties.run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03_map.part02_properties.model.vo.Snack;

public class PropertiesRun {

	public static void main(String[] args) {
		//Properties : Map계열 -> key + value 세트로 저장된다.
		//여기서 Map과 다른 특이점은 모두 String자료형으로 다룬다.
		//[표현법]Properties<String,String> prop = new Properties<>();
		
		Properties prop = new Properties();
		
		prop.put("오징어땅콩", new Snack("매운맛",500));
		prop.put("눈을감자", new Snack("짠맛",600));
		prop.put("바나나킥", new Snack("바나나맛",900));
		
		System.out.println(prop);
		
		/*
		 * Map 계열이기 때문에 키+벨류로 이루어져있고
		 * "굳이 String이 아니여도" put메소드를 통해 잘 저장된다.
		 * 
		 * 하지만 보통 properties는 파일 입출력을 위해 사용하기때문에 
		 * String,String 자료형으로 제네릭을 설정하여 사용한다.
		 * 
		 * properties는 put대신 setProperty() 메소드를 사용한다.
		 * */
		Properties prop2 = new Properties();
		prop2.setProperty("List", "ArrayList");
		prop2.setProperty("Set", "HashSet");
		prop2.setProperty("Map", "HashMap");
		
		System.out.println(prop2);
		prop2.setProperty("List", "LinkedList");
		//setProperty()메소드를 이용해도 Map의 특성인 키값 중복은 되지 않기때문에 값이 덮어씌워진다
		System.out.println(prop2);
		
		Properties inputProp = new Properties();
		
		//파일 출력을 위한 메소드 store(OutputStream os,String comments)  
		try {
			//출력
			prop2.store(new FileOutputStream("test.properties"), "Properties Test");
			
			System.out.println("읽기 전 : "+inputProp);
			
			//입력 load(inputStream) : 파일을 읽어오는 메소드
			inputProp.load(new FileInputStream("test.properties"));
			
			System.out.println("읽어온 : "+inputProp);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
