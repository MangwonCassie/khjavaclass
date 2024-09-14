package com.kh.chap03_map.part02_properties.run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;
import java.util.Scanner;

public class PropertiesRun2 {
	
	//xml파일로 입출력해보기
	public static void main(String[] args) throws InvalidPropertiesFormatException, FileNotFoundException, IOException {
		Scanner sc= new Scanner(System.in);
		
		//.xml
		//다양한 프로그래밍 언어간에 호환성이 좋다.
		Properties prop = new Properties();
//		prop.loadFromXML(new FileInputStream("test.xml"));
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		
		System.out.println(prop);
		
		//키값으로 벨류값 뽑기 : getProperty(키값);
		System.out.println(prop.getProperty("List"));
	
		//읽어올 properties 준비 
		Properties inputProp=new Properties();
		//XML로 저장하기
		try {
			//xml파일로 출력하는 메소드 storeToXML(outputStream,comments);
			prop.storeToXML(new FileOutputStream("test.xml"), "XML TEST");
			System.out.println("읽기전 : "+inputProp);
			//xml파일 읽는 메소드
			inputProp.loadFromXML(new FileInputStream("test.xml"));
			System.out.println("읽은 후 : "+inputProp);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
		
}
