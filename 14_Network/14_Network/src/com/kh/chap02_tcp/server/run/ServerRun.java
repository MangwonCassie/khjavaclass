package com.kh.chap02_tcp.server.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerRun {

	public static void main(String[] args) {
		//서버 연결 순서
		//1.서버의 소켓 생성
		//2.클라이언트의 접속 요청 대기
		//3.요청이 오면 수락
		//4.클라이언트의 정보를 저장
		//5.해당 정보로 OutputStream객체 생성
		//6.해당 정보롤 InputStream객체 생성
		//7.연결된 스트림을 통해 읽고 쓰는 작업을 해보기
		//8.연결종료
		
		Scanner sc = new Scanner(System.in);
		
		//보조스트림 선언
		PrintWriter pw = null;
		BufferedReader br = null;
		
		//1. 포트번호 지정(서버) - 0~65000 지정가능 이미 사용하고있는 port번호들은 사용할수없음 0~1000정도는 사용중
		int port = 3000;
		
		//클라이언트의 요청을 받아줄 소켓
		ServerSocket server = null;
		Socket socket = null;
		
		try {
			//2. 소켓 객체 생성
			server =  new ServerSocket(port);//포트번호 지정하여 서버소켓 생성
			
			//3. 클라이언트로부터 연결 요청이 올때까지 대기하기.
			System.out.println("3천년째 기다리는중.....");
			
			//4.연결 요청이 들어오면 수락과 동시에 해당 클라이언트와 통신할 수 있는 소켓객체 생성
			socket = server.accept();//socket에 클라이언트와 통신할수있는 소켓 객체가 생성이 됨
			System.out.println(socket.getInetAddress().getHostName()+"가 연결 요청함.");
			
			//5.연결 스트림 열기 (소켓을 이용하여)
			//입력용 스트림(보조스트림(기반스트림(소켓스트림)))
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//출력용 스트림
			pw = new PrintWriter(socket.getOutputStream());
			//printWriter : 데이터 출력시 print(),println() 메소드 사용 가능 
			
			while(true) {//반복해보기
				//6.연결을 했으니 메세지를 주고받아 보자.
				String message = br.readLine(); //입력
				System.out.println("클라이언트로부터 전달받은 메세지 : "+message);
				
				System.out.println("클라이언트에게 보낼 내용 : ");
				String sendMessage = sc.nextLine();
				//스캐너로 클라이언트에게 보낼 내용 작성후 스트림으로 보내버리기 
				pw.println(sendMessage); //출력
				
				pw.flush();//버퍼비우기 (혹시 남아있는 데이터 다 보내버리기)
			
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//자원반납
				//생성의 역순으로 반납하기 
				pw.close();
				br.close();
				socket.close();
				server.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		sc.close();
	}

}
