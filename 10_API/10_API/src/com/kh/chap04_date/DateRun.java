package com.kh.chap04_date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateRun {

	public static void main(String[] args) {
		
		/*
		 * Date 클래스
		 * 날짜와 시간에 대한 정보를 담을 수 있는 클래스
		 * java.util 패키지 안에 존재 
		 * ->자바 초창기에 개발된 클래스라서 완성도가 낮다.
		 * -그래서 이후 버전업되면서 deprecated된 메소드들이 있다(권장하지않음-지원하지않음)
		 * 
		 * 기본생성자를 이용해서 Date 객체를 생성하면 현재 날짜와 시간을 알려준다.
		 * */
		Date today = new Date();
		
		System.out.println("기본생성자 : "+today);
		
		//원하는 날짜를 출력하고자한다면.
		Date date1 = new Date(2023,7,7,18,20,00);
		System.out.println("매개변수 생성자 : "+date1);
		//year + 1900이 되어있다. 때문에 -1900 해줘야한다.
		//month + 1 이 되어있다. 때문에 month-1을 해야한다.
		
		date1 = new Date(2023-1900,7-1,7,18,20,00);
		System.out.println(date1);
		
		//SimpleDateFormat 클래스를 이용하여 원하는 형식으로 뽑아보기
		
		SimpleDateFormat sdf 
			= new SimpleDateFormat("우리의 수료일은 yyyy년 MM월 dd일 HH시 mm분 ss초 입니다.");
		
		System.out.println(sdf.format(date1));
		
		System.out.println("========Calendar==========");
		
		//Calendar 클래스 java.util 패키지 
//		Calendar c = new Calendar(); 객체 생성이 아닌 메소드로 객체를 불러온다
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		//정보 설정 : .set(무엇을,얼마로)
		c.set(2023,6,7);
		
		//정보확인 : .get()
		int year = c.get(Calendar.YEAR);
		System.out.println("년도 : "+ year);
		
		int month = c.get(Calendar.MONTH)+1; //0~11로 되어있기때문에 +1을 해줘야한다.
		System.out.println("월 : "+month);
		
		int date = c.get(Calendar.DATE);
		System.out.println("날짜 : "+date);
		
//		int hour = c.get(Calendar.HOUR); //12시간
		int hour = c.get(Calendar.HOUR_OF_DAY); //24시간
		System.out.println("시간 : "+hour);
		
		int min = c.get(Calendar.MINUTE);
		System.out.println(min);
		
		int sec = c.get(Calendar.SECOND);
		System.out.println(sec);
		
		//요일
		int week = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(week); //일요일 : 0 ~ 
		
		System.out.println(c.toString());
		
		
		
		
		
		
		
		
		
		
	}

}
