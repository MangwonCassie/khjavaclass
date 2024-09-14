package com.kh.chap04_assist.part01_buffered.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {
	
	//BufferedReader / BufferedWriter
	//-버퍼 공간을 제공해서 한번에 모아뒀다가 한꺼번에 입출력진행
	//-속도 향상 목적의 보조 스트림(BufferedXXXX)
	//[표현법]
	//보조스트림클래스명 객체명 = new 보조스트림클래스명(기반스트림객체);
	//주의 ) 보조스트림은 단독으로 생성될수없다.(기반스트림을 포함해야함)
	
	
	//프로그램 -> 파일
	//출력
	public void fileSave() {
		
		FileWriter fw = null;
		BufferedWriter bfw = null;
		//기반스트림이 Input/Output 이면 보조스트림도 Input/Output
		//기반스트림이 Writer/Reader 면 보조스트림도 Writer/Reader 
		
		try {
			//1.기반 스트림 생성 (연결통로)
			fw = new FileWriter("c_buffered.txt");
			
			//2.보조 스트림 생성
			bfw = new BufferedWriter(fw);
			
			//3.파일에 출력
			bfw.write("오늘은 금요일");
			bfw.newLine();//줄바꿈 메소드
			bfw.write("내일은 주말 야호");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {//자원 반납시에는 생성의 역순으로 반납한다.
			try {
				bfw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//프로그램 <--파일
	//입력
	public void fileRead() {
		//FileReader 기반으로 BufferedReader 사용
		FileReader fr = null;
		BufferedReader br = null;
		
		//기반스트림부터 생성 
		try{
			fr = new FileReader("c_bufferd.txt");
			br = new BufferedReader(fr);
		
			br = new BufferedReader(new FileReader("c_buffered.txt"));
		
			System.out.println(br.read());
			
			int value = 0;
			while((value=br.read())!=-1) {
				System.out.println(value);
			}
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void fileReadTryResource() {
		/* try ~ with ~resource 구문
		 * jdk 7버전 이상부터 가능 
		 * [표현법]
		 * try(스트림객체생성;스트림..){
		 * 	예외가 발생할만한 구문	
		 * }catch(예외클래스이름 e){
		 * 	예외발생시 처리할 구문 
		 * }
		 * 
		 * 스트림 객체를 try() 구문에 넣어주면 스트림 객체 생성 후 
		 * 해당 구문이 완료되면 자원반납을 자동으로 해준다.
		 * 여러 객체를 넣을 경우 ;(세미콜론)으로 객체를 구분지어준다
		 * 
		 * */
		
		//기반스트림부터 생성
//		try(FileReader fr = new FileReader("c_bufferd.txt"); BufferedReader br = new BufferedReader(fr)){
		
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffered.txt"))){
		
			
			int value = 0;
			while((value=br.read())!=-1) {
				System.out.println((char)value);
			}
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
