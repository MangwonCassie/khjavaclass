package com.kh.chap02_tcp.client.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ClientRun {

	public static void main(String[] args) {
		//클라이언트 연결 순서
		//1.서버의 IP주소와 port번호를 매개변수로 하여 클라이언트용 소켓 객체 생성(해당 서버로 연결을 요청하겠다)
		//2.I/O 스트림 생성
		//3.보조스트림으로 성능개선
		//4.읽고쓰기
		//5.통신 종료 - 자원반납
		
		Scanner sc = new Scanner(System.in);
		
		PrintWriter pw = null;
		BufferedReader br = null;
		
		//서버에 접속하려면 서버의 ip주소와 서버가 설정한 포트번호를 알아야한다.
		String serverIp = "192.168.50.30";
		int port = 3000;
		
		Socket socket = null;
		
		try {
			socket = new Socket(serverIp,port);
			
			System.out.println("서버와의 연결 성공");
			
			//스트림 생성해주기
			//입력 스트림
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//출력 스트림
			pw = new PrintWriter(socket.getOutputStream());
			//반복적으로 메세지 주고받기
			while(true) {
				Date d = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("[a HH:mm:ss]");
				String date = sdf.format(d);

				System.out.println("서버에 보낼 내용 : ");
				String sendMessage = sc.nextLine();
				
				pw.println(date+sendMessage); //출력
				pw.flush();//버퍼비우기
				
				
				String message = br.readLine();
				System.out.println("서버로부터 전달받은 메세지 : "+message);
				
			}
 		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				pw.close();
				br.close();
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		sc.close();
		
		
	}

}
