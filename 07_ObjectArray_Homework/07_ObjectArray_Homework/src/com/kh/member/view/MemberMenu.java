package com.kh.member.view;

import java.util.Scanner;

import com.kh.member.controller.MemberController;
import com.kh.member.model.vo.Member;

public class MemberMenu {
	
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	

	//기본생성자
	public MemberMenu() {
		
	}
//	+ mainMenu() : void
	public void mainMenu() {
		while(true) {//메뉴반복
			
			//자주사용하는 메소드 반환값 변수처리 
			int count = mc.existMemberNum();
			System.out.println("최대 등록 가능한 회원 수는 "+MemberController.SIZE+"명입니다.");
			System.out.println("현재 등록된 회원수는 "+count+"명입니다.");
			
			if(count==10) { //10명일때
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
			}else {//10명이 아닐때 
				System.out.println("1. 새 회원 등록 ");
			}
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.println("메뉴 번호 : ");
			
			int select = sc.nextInt();
			sc.nextLine(); //버퍼에 남은 엔터 제거 
			
			//만약 사용자가 등록수가 가득 찼음에도 불구하고 
			//1번메뉴(등록)를 입력했을때 처리되지 않게 작업
			if(count==10&&select==1) {
				System.out.println("등록 수가 가득 찼기 때문에 더이상 등록할 수 없습니다. 다시 입력하세요");
				continue;
			}
			
			switch(select) {
				case 1: insertMember(); break;
				case 2:	searchMember(); break;
				case 3:	updateMember(); break;
				case 4:	deleteMember(); break;
				case 5:	printAll(); break;
				case 9:	System.out.println("프로그램을 종료합니다."); return;
				default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		
		}
	}
//	+ insertMember() : void
	public void insertMember() {
//		아이디 : aaaaa
//		이름 : 박신우
//		비밀번호 : aa
//		이메일 : aaa@aaa.aaa
//		성별(M/F) : k
//		성별을 다시 입력하세요.
//		성별(M/F) : F
//		나이 : 33
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		//mc.checkId(id)값이 true면(중복) 반복문 진입 
		while(mc.checkId(id)) {
			System.out.println("중복된 아이디 입니다. 다시입력해주세요.");
			id = sc.nextLine();
		}
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("비밀번호 : ");
		String pwd = sc.nextLine();
		System.out.println("이메일 : ");
		String email = sc.nextLine();
		System.out.println("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		//m,M,f,F가 아닌경우 다시 입력받기
		while(!(gender=='m'||gender=='M'
				||gender=='f'||gender=='F')) {//gender에 들어온 값이 잘못됐을 경우 다시 입력하게끔
			System.out.println("성별을 다시 입력하세요 !");
			gender = sc.nextLine().charAt(0);
		}
		System.out.println("나이 : ");
		int age = sc.nextInt();
		sc.nextLine(); //나이 입력 후 남아있는 엔터 지우기 
		mc.insertMember(id,name,pwd,email,gender,age);
	}
//	+ searchMember() : void
	public void searchMember() {
		System.out.println("1.아이디로 검색하기");
		System.out.println("2.이름으로 검색하기");
		System.out.println("3.이메일로 검색하기");
		System.out.println("9.메인으로 돌아가기");
		System.out.println("메뉴 번호 : ");
		int select = sc.nextInt();
		sc.nextLine();
		
		switch(select) {
		case 1: searchId(); break;
		case 2: searchName(); break;
		case 3: searchEmail(); break;
		case 9: System.out.println("메인으로 돌아갑니다."); return;
		default : System.out.println("잘못입력하셨습니다."); return;
		}
	}
//	+ searchId() : void
	public void searchId() {
		System.out.println("아이디 검색 : ");
		String id = sc.nextLine();
		
		String result = mc.searchId(id);//회원정보 또는 null
		
		if(result == null) { //반환결과가 없다(조회된 회원이 없음)
			System.out.println("검색 결과가 없습니다.");
		}else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(result);
		}
	}
//	+ searchName() : void
	public void searchName() {
		System.out.println("이름 검색 : ");
		String name = sc.nextLine();
		
		Member[] sameName = mc.searchName(name);//회원정보 또는 null
		
		if(sameName[0] == null) { //반환결과가 없다(조회된 회원이 없음)
			System.out.println("검색 결과가 없습니다.");
		}else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			
			for(int i=0; i<sameName.length;i++) {
				if(sameName[i]!=null) {
					System.out.println(sameName[i].toString());
				}
			}
		}
		
	}
//	+ searchEmail() : void
	public void searchEmail() {
		System.out.println("이메일 검색 : ");
		String email = sc.nextLine();
		
		Member[] sameEmail = mc.searchEmail(email);//회원정보 또는 null
		
		if(sameEmail[0] == null) { //반환결과가 없다(조회된 회원이 없음)
			System.out.println("검색 결과가 없습니다.");
		}else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			
			for(int i=0; i<sameEmail.length;i++) {
				if(sameEmail[i]!=null) {
					System.out.println(sameEmail[i].toString());
				}
			}
		}
	}
//	+ updateMember() : void
	public void updateMember() {
		
		System.out.println("1.비밀번호 수정하기");
		System.out.println("2.이름 수정하기");
		System.out.println("3.이메일 수정하기");
		System.out.println("9.메인으로 돌아가기");
		System.out.println("메뉴 번호 : ");
		int select = sc.nextInt();
		sc.nextLine();
		
		switch(select) {
		case 1: updatePassword(); break;
		case 2: updateName(); break;
		case 3: updateEmail(); break;
		case 9: System.out.println("메인으로 돌아갑니다."); return;
		default : System.out.println("잘못입력하셨습니다."); return;
		}
		
	}
//	+ updatePassword() : void
	public void updatePassword() {
		System.out.println("비밀번호 변경하실 아이디를 입력하세요 : ");
		String id = sc.nextLine();
		System.out.println("수정하실 비밀번호를 입력하세요 : ");
		String updatePwd = sc.nextLine();
		
		boolean isTrue = mc.updatePwd(id, updatePwd);
		
		if(isTrue) { //성공 
			System.out.println("수정이 성공적으로 되었습니다.");
		}else { //실패 (조회된거 없을때)
			System.out.println(id+"는 존재하지 않는 아이디입니다.");
		}
		
		
	}
//	+ updateName() : void
	public void updateName() {
		System.out.println("이름 변경하실 아이디를 입력하세요 : ");
		String id = sc.nextLine();
		System.out.println("수정하실 이름을 입력하세요 : ");
		String newName = sc.nextLine();
		
		boolean isTrue = mc.updateName(id, newName);
		
		if(isTrue) { //성공 
			System.out.println("수정이 성공적으로 되었습니다.");
		}else { //실패 (조회된거 없을때)
			System.out.println(id+"는 존재하지 않는 아이디입니다.");
		}
	}
//	+ updateEmail() : void
	public void updateEmail() {
		System.out.println("이메일 변경하실 아이디를 입력하세요 : ");
		String id = sc.nextLine();
		System.out.println("수정하실 이메일을 입력하세요 : ");
		String newEmail = sc.nextLine();
		
		boolean isTrue = mc.updateEmail(id, newEmail);
		
		if(isTrue) { //성공 
			System.out.println("수정이 성공적으로 되었습니다.");
		}else { //실패 (조회된거 없을때)
			System.out.println(id+"는 존재하지 않는 아이디입니다.");
		}
	}
//	+ deleteMember() : void
	public void deleteMember() {
		System.out.println("1.특정회원 삭제하기");
		System.out.println("2.모든회원 삭제하기");
		System.out.println("9.메인으로 돌아가기");
		System.out.println("메뉴 번호 : ");
		int select = sc.nextInt();
		sc.nextLine();
		
		switch(select) {
		case 1: deleteOne(); break;
		case 2: deleteAll(); break;
		case 9: System.out.println("메인으로 돌아갑니다."); return;
		default : System.out.println("잘못입력하셨습니다."); return;
		}
	}
	
//	+ deleteOne() : void
	public void deleteOne() {
		System.out.println("삭제할 회원의 id를 입력하세요 : ");
		String id = sc.nextLine();
		System.out.println("정말로 "+id+"회원을 삭제하시겠습니까?(y/Y): ");
		char confirm = sc.nextLine().charAt(0);
		
		if(confirm=='y'||confirm=='Y') {//정말 삭제하겠다.
			
			boolean isTrue = mc.delete(id);//삭제여부 
			
			if(isTrue) {
				System.out.println(id+"회원을 성공적으로 삭제하였습니다.");
			}else {
				System.out.println("입력하신 "+id+"은(는) 존재하지 않는 아이디입니다.");
			}
			
		}else {
			System.out.println("동의하지 않으셨기 때문에 작업을 중단합니다.");
		}
	}
//	+ deleteAll() : void
	public void deleteAll() {
		System.out.println("정말로 전체 삭제를 하시겠습니까? 동의하시면 (y/Y) : ");
		char confirm = sc.nextLine().charAt(0);
		if(confirm=='y' ||confirm=='Y') {
			mc.delete();
			System.out.println("성공적으로 삭제하였습니다.");
		}else {
			System.out.println("동의하지 않으셨기 때문에 작업을 중단합니다.");
		}
		
	}
//	+ printAll() : void
	public void printAll() {
		Member[] m = mc.printAll();
		int count = mc.existMemberNum();
		if(count==0) {
			System.out.println("저장된 회원이 없습니다.");
		}else {
			for(int i=0;i<count; i++) {
				System.out.println(m[i].toString());
			}
		}
	}
}
