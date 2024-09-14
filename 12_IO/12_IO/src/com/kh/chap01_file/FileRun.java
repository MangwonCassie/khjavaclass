package com.kh.chap01_file;

import java.io.File;

public class FileRun {
	/*
	 * 프로그램 상의 데이터를 외부매체(모니터,스피커,파일)등으로 출력하거나 
	 * 입력장치 (키보드,마우스,마이크,파일) 등으로 입력받는 과정
	 * -IO (Input/Output) 입출력
	 * 
	 * IO를 진행하려면 프로그램과 연결 통로를 만들어야 한다.
	 * 이때 연결 통로가 Stream 스트림 이다.
	 * 
	 * 스트림의 특징 
	 * -단방향 : 입력이면 입력, 출력이면 출력 , 각 스트림이 따로 존재한다.
	 * 		때문에 동시에 입출력하고자 한다면 입력스트림,출력스트림 모두 생성하여야한다.
	 * -FIFO : 먼저 전달한 값이 먼저 나오게 되는 형태 (선입선출 First In First Out)
	 * -시간지연 문제가 발생할수도 있다.
	 * 
	 * 스트림의 구분 
	 * -통로의 사이즈 
	 *  바이트 스트림 : 1byte 짜리가 이동할 수 있는 좁은 통로
	 *  			-입력 - XXXInputStream 
	 *  			-출력 - XXXOutputStream
	 *  
	 *  문자 스트림  : 2byte 짜리가 이동할 수 있는 넓은 통로
	 *  			-입력 - XXXReader
	 *  			-출력 - XXXWriter
	 *  
	 *  -외부 매체와의 직접적인 연결 여부
	 *  기반 스트림 : 외부매체와 직접적으로 연결되는 통로
	 * 	보조 스트림 : 기반 스트림만으로는 부족한 성능을 보완해주는 보조 스트림
	 * 			-단독 사용이 불가능(기반스트림을 보완하는 형태)
	 * 			-속도 향상,자료형에 맞춰서 변환,객체 단위 입출력 도움용도 등등...
	 * 
	 * */
	
	
	

	public static void main(String[] args) {
		//간단하게 file 만드는 작업을 해보자.
		//File 클래스를 이용 / java.io 패키지에 존재
		
		try {
		//파일 클래스로 객체 생성하기
		File f1 = new File("test.txt");//test.txt라는 매개변수를 가진 파일 객체 생성
		//1.별도로 경로 지정을 하지 않고 파일명만 제시한다면 현재 프로젝트(폴더) 내에 생성이된다.
		//createNewFile()-파일 생성 메소드
//		f1.createNewFile();
		
		//2.경로 지정해서 파일을 생성하고 싶다면? 
		//실제 존재하는 경로를 지정해야 한다.
		File f2 = new File("C:\\kh\\khGood.txt");
//		f2.createNewFile();
		
		//3.폴더를 생성해서 그 안에 파일을 넣어보자.
		File myfolder = new File("c:\\kh");//경로
//		myfolder.mkdir();//해당 경로 폴더생성
//		f2.createNewFile();
		
		//4.폴더 생성도 경로를 지정하지 않으면 해당 프로젝트 폴더 내에 생성된다.
		File mf = new File("iu");
		mf.mkdir(); //mkdir(); 폴더 생성 메소드 
		
		//File 에서 제공하는 메소드들
		System.out.println("파일인지? : "+f1.isFile());//파일이면 true아니면 false
		System.out.println("파일인가요? : "+mf.isFile());
		
		System.out.println("파일 이름 : "+f2.getName());//파일명만 추출
		System.out.println("상위 폴더 : "+f2.getParent());//상위폴더명만 추출
		System.out.println("파일 용량 : "+f1.length());//파일 크기 추출
		System.out.println("절대경로 : "+f2.getAbsolutePath());//풀 경로 추출
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
