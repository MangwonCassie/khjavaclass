package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//DAO (Data Access Object) : 데이터가 보관되어있는 공간과 직접 접근하여 데이터를 입출력하는 메소드들을 모아놓은 클래스.
public class FileByteDao {
	// 바이트 스트림 실습

	// 프로그램 --> 외부매체(파일)
	// 출력 : 프로그램 내의 데이터를 파일로 내보내기(파일에 기록하기)
	public void fileSave() {
		// FileOutputStream : "파일" 로 데이터를 출력한다.1byte 단위로.
		FileOutputStream fos = null;// try 영역 벗어나서 선언하기
		try {
			// 1.FileOutputStream 객체 생성.
			// -매개변수에 작성한 파일명인 파일과 연결되는 통로를 만들겠다.
			// 해당 파일이 존재하지 않는다면 - 해당 파일을 생성하고 통로도 연결시킨다.
			// 해당 파일이 존재한다면 - 통로만 연결시킨다.(옵션으로 지정가능)

			// 매개변수 두번째에 true값을 넣어주면 해당 파일을 이어쓰기 할 수 있고.
			// 기본값(false)이라면 덮어쓰기 된다.
//			FileOutputStream fos = new FileOutputStream("a_byte.txt"/*,false*/);
			// true면 이어쓰기 가능
			fos = new FileOutputStream("a_byte.txt");
			// 2.연결 통로로 데이터 출력 : write() 메소드 호출
			// 1byte 범위로 넘겨진다 : -128~127 까지의 숫자가 출력 가능하다.
			// 이때 파일에 기록되는것은 해당 숫자의 고유 문자가 기록된다.
			// 음수는 불가능 0~127 까지의 숫자를 아스키 코드표를 참고하면 된다.
//			fos.write(97);//a
//			fos.write(98);//b
//			fos.write(99);//c
//			fos.write(100);//d

			byte[] arr = { 65, 66, 67, 68, 69, 70 }; // A,B,C

//			throw new Exception();//예외객체 생성 (의도적으로 예외발생시키기)
			fos.write(arr);
			fos.write(arr, 2, 2);// arr 배열로 부터 2번인덱스부터 2개
			fos.write('A');
			fos.write('B');
//			fos.write('금');
//			fos.write('요');
//			fos.write('일');
//			fos.write('조');
//			fos.write('아');
			// 한글은 2byte이기 때문에 1byte스트림으로는 깨져서 저장된다.
			// 이럴땐 문자 스트림을 사용하면 된다.

			// 3.스트림을 다 사용했으면 자원 반납을 해야한다.
			// 만약 중간에 예외가 발생하면 자원 반납 코드까지 닿지 못한다 때문에 자원이 낭비될수있음.
			// 때문에 꼭 실행되어야 하는 구문은 finally 라고하는 영역에 작성한다.
//			fos.close();
//			System.out.println("트라이 영역 종료");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {// 어떤 예외가 발생하던 반드시 실행되는 구문.
			// 자원반납 해주기
			// fos가 지역변수로 선언되어 try문안에 갇혀있기 때문에 벗어나게 작성해야한다.
			try {
				fos.close();// 자원반납

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("프로그램 진짜 종료");

	}

	// 프로그램<---외부매체(파일)
	// 입력 : 파일로부터 데이터를 가지고 오겠다.
	public void fileRead() {
		// FileInputStream : 파일로부터 데이터를 가져와서 입력하는데 1byte단위로 입력

		FileInputStream fis = null;

		try {
			// 1.FileInputStream 객체를 생성 : 스트림(통로) 연결하겠다.
			fis = new FileInputStream("a_byte.txt");//반드시 존재하는 파일 지정

			// 2.연결된 통로로 데이터 입력 받기.
			// read()메소드 사용
			// 1byte씩 읽어온다.
			/*
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			*/
			
			//파일의 끝을 만나면 -1을 반환한다(더이상 읽을 데이터가 없으면) 
			//조건식에서 호출된 read() 메소드가 문자를 읽기때문에
			//출력문에서 볼수 없다. 
//			while(fis.read() != -1) {
//				System.out.println((char)fis.read());
//			}
			int value=0;
			//조건식 안에 대입문을 사용하기도 가능
			while((value=fis.read()) != -1) {
				System.out.print((char)value);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
