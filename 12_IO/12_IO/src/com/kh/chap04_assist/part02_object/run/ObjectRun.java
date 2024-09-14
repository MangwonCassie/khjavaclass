package com.kh.chap04_assist.part02_object.run;

import java.util.Scanner;

import com.kh.chap04_assist.part02_object.model.dao.ObjectDao;

public class ObjectRun {

	public static void main(String[] args) {
		ObjectDao od = new ObjectDao();
//		od.fileSave();
//		od.fileRead();
		Scanner sc = new Scanner(System.in);
		System.out.println("파일 명을 입력하세요 ");
		String filePath = sc.nextLine();
		
		od.fileSave(filePath);
		od.fileRead(filePath);
		
		sc.close();
		
		
	}

}
