package com.kh.chap01_list.part02_mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.part02_mvc.controller.MusicController;
import com.kh.chap01_list.part02_mvc.model.vo.Music;

//mvc패턴에서 v == view 사용자가 보게될 화면 
public class MusicMenu {
	
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	//메인화면
	public void mainMenu() {
		while(true) {
			
			System.out.println("유튜브 뮤직에 오신것을 환영합니다.");
			System.out.println("1.새로운 곡 추가"); //add메소드
			System.out.println("2.곡 전체 조회"); //반복문 or toString메소드 활용
			System.out.println("3.특정 곡 검색"); //반복문 + get메소드
			System.out.println("4.특정 곡 삭제"); //반복문 + remove메소드
			System.out.println("5.특정 곡 수정"); //반복문 + set메소드
			System.out.println("0.프로그램 종료");
			
			System.out.println("메뉴번호 입력:");
			int select = sc.nextInt();
			sc.nextLine();
			
			switch(select) {
			case 1: insertMusic(); break;
			case 2: selectAll(); break;
			case 3: searchMusic(); break;
			case 4: removeMusic(); break;
			case 5: updateMusic(); break;
			case 0: System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("번호를 잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	//새로운 곡 추가메소드 
	public void insertMusic() {
		System.out.println("===곡 추가===");
		System.out.println("제목 입력 : ");
		String title = sc.nextLine();
		System.out.println("가수 입력 : ");
		String artist = sc.nextLine();
		
		//사용자에게 입력받은 곡 정보를 컨트롤러에 전달하기
		int count = mc.insertMusic(title,artist);
		
		if(count>0) { //성공했으면 count가 0보다 클테니 성공여부
			System.out.println("성공적으로 곡 추가가 되었습니다.");
		}else {
			System.out.println("곡 추가가 실패하였습니다.");
		}
		
	}
	
	//노래 전체 조회 메소드
	public void selectAll() {
		System.out.println("===곡 전체 조회===");
		ArrayList<Music> list = mc.selectAll();//컨트롤러에 있는 리스트 주소값 받아오기
		//출력방법 1번 전체목록 묶어서 출력
//		System.out.println(list);
		
		//출력방법 2번 일반for문으로 index접근하여 출력
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		//향상된 for문으로 순차적으로 접근하여 출력
		for(Music m : list) {
			System.out.println(m);
		}
	}
	
	//특정 노래 조회메소드
	public void searchMusic() {
		System.out.println("===특정 노래 조회===");
		System.out.println("검색하실 키워드를 입력하세요 : ");
		String keyword = sc.nextLine();
		ArrayList<Music> searched = mc.searchMusic(keyword);
		
		if(searched.isEmpty()) {//비어있는지 확인 
			System.out.println("검색된 결과가 없습니다.");
		}else {
			System.out.println(keyword+"로 검색한 결과입니다.");
			for(Music m : searched) {
				System.out.println(m);
			}
		}
		
	}
	
	//특정 노래 삭제 메소드
	public void removeMusic() {
		System.out.println("===노래 삭제===");
		selectAll();//목록 보여주기 
		System.out.println("목록에서 삭제하실 노래 제목을 입력해주세요.");
		String title = sc.nextLine();
		int count = mc.removeMusic(title);
		
		if(count>0) {//한곡이상 삭제된 경우
			System.out.println(count+"곡이 삭제되었읍니다.");
		}else {
			System.out.println(title+"곡은 목록에 존재하지 않습니다.");
		}
	}
	
	//특정 노래 수정 메소드
	public void updateMusic() {
		System.out.println("===곡 수정===");
		System.out.println("수정하실 노래 제목을 입력해주세요 : ");
		String title = sc.nextLine();
		System.out.println("수정하실 내용(곡명) : ");
		String newTitle = sc.nextLine();
		System.out.println("수정하실 가수 : ");
		String newArtist = sc.nextLine();
		
		int count = mc.updateMusic(title,newTitle,newArtist);
		
		if(count>0) {
			System.out.println("성공적으로 수정되었습니다.");
			selectAll();
		}else {
			System.out.println("수정할 곡을 찾지 못했습니다.");
		}
	}
}
