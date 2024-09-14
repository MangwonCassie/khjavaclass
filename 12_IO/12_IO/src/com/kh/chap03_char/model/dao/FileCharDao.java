package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	
	//프로그램 --> 외부매체 (파일)
	//출력
	public void fileSave() {
		//FileWriter : 파일로 데이터를 2byte 단위로 출력하는 스트림
		
		FileWriter fw  = null;
		
		try {
			//1.객체 생성 - 연결 통로만들기 
			fw = new FileWriter("b_char.txt");
			//2.파일에 작성(출력)하기 
			fw.write("드디어 문자열을 넣을수가 있구나..");
			
			fw.write(55);
			
			char[] arr = {'a','p','p','l','e'};
			
			fw.write(arr);
			
			fw.flush();//버퍼에 남은 데이터 한번에 보내버리기
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//프로그램 <---파일
	//입력 
	public void fileRead() {
		
		//FileReader: 파일로부터 2byte 단위로 입력받는 스트림
		
		FileReader fr = null;
		
		try {
			//통로연결
			fr = new FileReader("b_char.txt");//존재하는 파일을 제시
			
			//읽어오기
			
			int value=0;
			while((value=fr.read())!= -1) {
				System.out.println((char)value);
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	
}
