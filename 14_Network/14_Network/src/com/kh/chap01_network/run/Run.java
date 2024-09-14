package com.kh.chap01_network.run;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Run {

	public static void main(String[] args) {
		/*
		 * 네트워크 
		 * 여러개의 컴퓨터가 그물처럼 연결되어 있는것.
		 * 여러개의 통신기기와 같은 컴퓨터들을 연결하여 데이터를 손쉽게 주고 받을 수 있다.
		 * 
		 * 네트워크의 목적
		 * 여러개의 통신기기와 같은 컴퓨터들을 연결해서 데이터를 손쉽게 주고받기 위함.
		 * 
		 * java.net 패키지의 클래스들을 통해 지원한다.
		 * 
		 * 서버와 클라이언트
		 * -서버 : 서비스를 제공하는 컴퓨터 또는 프로그램
		 * -클라이언트 : 서비스를 제공받는 서비스를 이용하는 사용자 또는 프로그램 또는 컴퓨터
		 * 
		 * -서버의 역할 : 서비스를 제공할 뿐만 아니라 클라이언트의 연결 요청을 수락하고 응답한다. 
		 * 네트워크의 주소 체계
		 * -IP주소 : Internet Protocol
		 * 네트워크 상에서 컴퓨터를 식별하는 번호
		 * 네트워크 상에서 통신기기들이 서로 인식하고 통신하기 위해 사용하는 고유한 주소 - 중복되면 충돌발생
		 * -port번호 : 같은 컴퓨터 내에서 각각의 프로그램을 식별하고 있는 고유 번호 - 중복되면 충돌
		 * -MAC 주소 : 컴퓨터간 데이터를 전송하기 위해 있는 컴퓨터의 물리적 주소 - 절대 변하지 않는 기계의 고유번호
		 * 
		 * -ip주소와 port 번호 : 클라이언트가 서버에 요청을 하려면 IP주소와 Port번호를 알아야한다.
		 * -소켓 : 프로세스 간 통신에 사용되는 양쪽 끝 단  
		 * 
		 * TCP : 데이터 전송 속도가 느리지만 정확하고 안정적으로 전달할수있는 전달 방식 체계(연결지향적)
		 * UDP : 데이터 전송 속도가 빠르지만 신뢰성이 없는 데이터를 전송하는 전달 방식 체계(비연결지향적)
		 * *프로토콜 : 컴퓨터간의 정보를 주고받을때 통신방법에 대한 약속(접속,전달방법,데이터 형태,검증방법 등등)
		 * 
		 * */
		
		try {
			//내 PC의 정보를 반환하는 메소드
			InetAddress localhost = InetAddress.getLocalHost();
			System.out.println(localhost);
			System.out.println(localhost.getHostName());
			System.out.println(localhost.getHostAddress());
			
			//도메인주소로 서버의 정보를 알아보자
			InetAddress naver = InetAddress.getByName("www.naver.com");
			System.out.println(naver);
			
			InetAddress google = InetAddress.getByName("www.google.com");
			System.out.println(google);
		
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
