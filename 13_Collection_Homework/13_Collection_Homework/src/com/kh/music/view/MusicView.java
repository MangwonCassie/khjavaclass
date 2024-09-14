package com.kh.music.view;

import java.util.List;
import java.util.Scanner;

import com.kh.music.controller.MusicController;
import com.kh.music.model.vo.Music;

public class MusicView {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("음악 프로그램");
			System.out.println("1.마지막 위치에 곡 추가");
			System.out.println("2.첫 위치에 곡 추가");
			System.out.println("3.전체 곡 목록 출력");
			System.out.println("4.특정 곡 검색");
			System.out.println("5.특정 곡 삭제");
			System.out.println("6.특정 곡 정보 수정");
			System.out.println("7.곡명 오름차순 정렬");
			System.out.println("8.가수명 내림차순 정렬");
			System.out.println("9.종료");
			System.out.println("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1: addList(); break;
			case 2: addAtZero(); break;
			case 3: printAll(); break;
			case 4: searchMusic(); break;
			case 5: removeMusic(); break;
			case 6: setMusic(); break;
			case 7: ascTitle(); break;
			case 8: descSinger(); break;
			case 9: System.out.println("프로그램 종료");return;
			default : System.out.println("잘못 입력하셨습니다. 다시입력해주세요");
			}
			
		}
	}

	public void addList() {
		System.out.println("***마지막 위치에 곡 추가***");
		System.out.println("곡 명 : ");
		String title = sc.nextLine();
		System.out.println("가수 명 : ");
		String singer = sc.nextLine();
		//처리결과 변수 돌려받기
		int result = mc.addList(new Music(title,singer));
		
		if(result>0) {//추가가 성공하여 result가 0보다 크다면 
			System.out.println("추가 성공");
		}else {
			System.out.println("추가 실패");
		}
	}
	public void addAtZero() {
		System.out.println("***처음 위치에 곡 추가***");
		System.out.println("곡 명 : ");
		String title = sc.nextLine();
		System.out.println("가수 명 : ");
		String singer = sc.nextLine();
		//처리결과 변수 돌려받기
		int result = mc.addAtZero(new Music(title,singer));
		
		if(result==1) {//추가가 성공하여 result가 1이라면 
			System.out.println("추가 성공");
		}else if(result==2){
			System.out.println("중복인 노래가 있어서 추가하지 않았습니다.");
		}else {
			System.out.println("추가 실패");
		}
		
	}
	public void printAll() {
		System.out.println("***전체 목록***");
		List<Music> list = mc.printAll();
		
		for(Music m : list) {
			System.out.println(m);
		}
		
	}
	public void searchMusic() {
		System.out.println("***특정 곡 검색***");
		System.out.println("제목 입력 :");
		String title = sc.nextLine();
		Music m = mc.searchMusic(title);
		
		if(m==null) {//검색되지 않아 객체정보가 담기지 않은경우 null
			System.out.println("검색한 곡이 없습니다.");
		}else {//검색결과가 있어 null이 아닌경우 
			System.out.println("검색한 곡은 "+m+"입니다");
		}
		
		
	}
	public void removeMusic() {
		System.out.println("***특정 곡 삭제***");
		System.out.println("제목 입력 :");
		String title = sc.nextLine();
		Music m = mc.removeMusic(title);
		
		if(m==null) {//검색되지 않아 객체정보가 담기지 않은경우 null
			System.out.println("삭제할 곡이 없습니다.");
		}else {//검색결과가 있어 null이 아닌경우 
			System.out.println(m+"를 삭제했읍니다");
		}
		
	}
	public void setMusic() {
		System.out.println("***특정 곡 수정***");
		System.out.println("제목 입력 :");
		String title = sc.nextLine();
		//해당 곡이 있는지 확인해오기 
		Music m = mc.searchMusic(title);
		
		if(m==null) {//검색되지 않아 객체정보가 담기지 않은경우 null
			System.out.println("수정할 곡이 없습니다.");
		}else {//검색결과가 있어 null이 아닌경우 
			System.out.println("새로 추가할 제목을 입력해주세요 : ");
			String newTitle = sc.nextLine();
			System.out.println("새로 추가할 가수명을 입력해주세요 : ");
			String newSinger = sc.nextLine();
			
			Music m2 = mc.setMusic(title, new Music(newTitle,newSinger));
			
			if(m2==null) {
				System.out.println(title+"은 없는 곡입니다.");
			}else {
				System.out.println(m2+"는 "+newTitle+" "+newSinger+"로 변경되었습니다.");
			}
		}
	}

	public void ascTitle() {
		System.out.println("***곡 명 오름차순***");
		int result = mc.ascTitle();
		
		if(result>0) {
			System.out.println("곡 명 오름차순 정렬 성공");
		}else {
			System.out.println("곡 명 오름차순 정렬 실패");
		}
		
	}
	public void descSinger() {
		System.out.println("***가수명 내림차순***");
		int result = mc.descSinger();
		
		if(result>0) {
			System.out.println("가수명 내림차순 정렬 성공");
		}else {
			System.out.println("가수명 내림차순 정렬 실패");
		}
	}
	
	
	

}
