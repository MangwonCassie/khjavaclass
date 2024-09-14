package com.kh.chap04_assist.part02_object.model.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Dog;
import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectDao {
	
	//프로그램 -->파일
	//출력
	public void fileSave() {
		Phone p = new Phone("아이폰","애플",1500000);
		//ObjectOutputStream : 객체 단위를 파일에 출력하고자 할때 필요한 스트림
		//FileOutputStream을 기반스트림으로 보조스트림을 생성
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_object.txt"))){
			
//			oos.write();
			oos.writeObject(p); //객체는 writeObject 메소드를 사용
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//프로그램 <--파일
	//입력
	public void fileRead() {
		//1.기반스트림 생성
		//2.보조스트림 생성
		//3.읽어오기
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_object.txt"))){
			
			Phone p = (Phone)ois.readObject();
			
			System.out.println(p);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	//파일 입력받기 
	public void fileSave(String filePath) {
		Dog d = new Dog("뽀삐","믹스견",5.5);
		//ObjectOutputStream : 객체 단위를 파일에 출력하고자 할때 필요한 스트림
		//FileOutputStream을 기반스트림으로 보조스트림을 생성
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))){
			
			oos.writeObject(d); //객체는 writeObject 메소드를 사용
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void fileRead(String filePath) {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))){
			
			Dog d = (Dog)ois.readObject();
			
			System.out.println(d);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
}
