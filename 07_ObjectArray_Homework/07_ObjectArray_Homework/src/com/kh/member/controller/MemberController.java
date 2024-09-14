package com.kh.member.controller;

import com.kh.member.model.vo.Member;

public class MemberController {
	private Member[] m = new Member[SIZE];
	public static final int SIZE = 10;
	
	
	//데이터 넣어놓고 시작하기
	public MemberController() {
		m[0] = new Member("user01","김유저","pass01","user01@naver.com",'m',20);
		m[1] = new Member("user02","김유저","pass02","user02@naver.com",'m',25);
		m[2] = new Member("user03","박회원","pass03","user02@naver.com",'m',26);
		m[3] = new Member("asd123","최치수","sssdd","cisoo@naver.com",'f',30);
	}
	
	
	//현재 존재하는 멤버 수 반환
	public int existMemberNum() {
		//Member 객체 배열에 인덱스가 비어있지 않다면? 사람이 등록되어있다고 볼수있다.
		//각 인덱스가 null이 아니라면 사람의 정보가 있다고 보니 count를 올려서 
		//해당 등록정보의 개수를 세어보자.
		int count=0; //등록된 정보 개수 넣어놓을 변수 
		
		//객체배열 인덱스에 순차적으로 접근하여 비어있지 않은지 확인작업 
		for(int i=0;i<m.length;i++) {
			if(m[i]!=null) { //i번째 인덱스가 비어있지 않다면? 
				count++;
			}
		}
		return count;//등록된 회원명수 반환 
	}
	
	//아이디 중복확인 하는 메소드 
	public boolean checkId(String inputId) {
	//객체 배열에 있는 회원의 정보중 아이디가 지금 넘겨받은 사용자 입력 아이디랑 일치하는지
	//판별해서 일치하면 중복 일치하지 않으면 사용가능 
		
		//m[0].getId().eqauls(inputId)
		//m[1].getId().eqauls(inputId)
		//m[2].getId().eqauls(inputId)
		
		//반복문을 활용하여 위의 작업 해주기
		//객체배열의 length만큼 반복한다면 등록되지 않은  인덱스에도 접근하기때문에
		//nullPointerException이 발생한다. 때문에 등록된 회원수 까지만 반복
		for(int i=0; i<existMemberNum();i++) {
			//만약 같은 아이디가 이미 존재한다면.
			if(m[i].getId().equals(inputId)) {
				return true;
			}
		}
		return false;
	}
	
	//Member객체를 객체 배열에 저장하는 메소드 
	public void insertMember(String id,String name,
			String pwd,String email,char gender,int age) {
		// 4  0 1 2 3 4
//		m[existMemberNum()] = new Member();
		//객체 배열 m에다가 넘겨받은 정보들을 담고있는 Member객체를 넣자.
		//m[0] 
		for(int i=0; i<m.length;i++) {
			if(m[i]==null) {//인덱스 i번째가 비어있으면 
				//넘겨받은 데이터로 객체를 생성하여 넣어라.
				m[i] = new Member(id,name,pwd,email,gender,age);
				break;//넣었으니 break로 남은 반복 벗어나기 
			}
		}
	}
	
	//id로 회원 조회하는 메소드
	public String searchId(String id) {
		//객체 배열에 담긴 객체중 전달받은 아이디와 동일한 아이디가 있는지 확인 
		
		//만약 중간에 데이터가 지워져있는 상황일수도 있다면 
		for(int i=0;i<m.length; i++) {
			//&&논리연산의 경우 앞에 경우가 false면 뒤에는 확인하지 않는다 때문에
			//앞에 null과 비교하는 작업을 먼저 해줘야함.(아닐시 nullPointerException)
			//i번째가 비어있지 않고 입력받은 아이디와 같은 아이디가 있다면 
			if(m[i]!=null && m[i].getId().equals(id)) {
				//해당하는 아이디를 가진 회원의 정보를 반환(inform())
//				return m[i].inform();
				return m[i].toString();
			}
		}
		//조회된 정보 없으면 null반환 
		return null;
	}
	
	//이름으로 회원을 조회하는 메소드
	public Member[] searchName(String name) {
		//임시저장소(같은 이름을 가진 멤버들 담아놓을 멤버객체배열)
		Member[] sameName = new Member[existMemberNum()]; //10
		int count=0;
		for(int i=0;i<m.length;i++) {
			if(m[i]!=null && m[i].getName().equals(name)) {
				//임시저장소의 첫번째 위치부터 넣어주기 위한 count
				sameName[count++] = m[i];
			}
		} //0 1 : 사람등록  2 ~ 9 : null
		return sameName; //임시저장소객체배열 반환
	}
	
	
	
	//이메일로 회원을 조회하는 메소드
	public Member[] searchEmail(String email) {
		//임시저장소(같은 이메일을 가진 멤버들 담아놓을 멤버객체배열)
		Member[] sameEmail = new Member[existMemberNum()]; 
		int count=0;
		for(int i=0;i<m.length;i++) {
			if(m[i]!=null && m[i].getEmail().equals(email)) {
				//임시저장소의 첫번째 위치부터 넣어주기 위한 count
				sameEmail[count++] = m[i];
			}
		}
		return sameEmail; //임시저장소객체배열 반환
	}
	
	//비밀번호 변경 메소드
	public boolean updatePwd(String id,String updatePwd) {
		//기존 등록된 회원의 아이디를 비교해서 일치하는게 있으면 비밀번호 변경
		for(int i=0;i<existMemberNum();i++) {
			if(m[i].getId().equals(id)){ //기존 등록 아이디와 입력아이디 일치하면
				m[i].setPassword(updatePwd); //setter메소드로 정보 갱신 
				return true; 
			}
		}
		return false; //일치하는게 없으면 false 반환
	}
	
	//이름 변경 메소드 
	public boolean updateName(String id,String newName) {
	//기존 등록된 회원의 아이디를 비교해서 일치하는게 있으면 비밀번호 변경
		for(int i=0;i<existMemberNum();i++) {
			if(m[i].getId().equals(id)){ //기존 등록 아이디와 입력아이디 일치하면
				m[i].setName(newName); //setter메소드로 정보 갱신 
				return true; 
			}
		}
		return false; //일치하는게 없으면 false 반환
	}
	
	//이메일 변경 메소드 
	public boolean updateEmail(String id,String newEmail) {
	//기존 등록된 회원의 아이디를 비교해서 일치하는게 있으면 비밀번호 변경
		for(int i=0;i<existMemberNum();i++) {
			if(m[i].getId().equals(id)){ //기존 등록 아이디와 입력아이디 일치하면
				m[i].setEmail(newEmail); //setter메소드로 정보 갱신 
				return true; 
			}
		}
		return false; //일치하는게 없으면 false 반환
	}
	
	//한회원 삭제 메소드
	public boolean delete(String id) {
		//0 2 3 null 회원들이 있는데 
		// 1번인덱스에 있는 회원정보를 삭제한다면? 
		//0 1 2 3 4 null null ... 
		//0 null 2 3 null 
		//0 2 3 null null....
		//중간에 null값이 있으면 null값 비교를 계속 해줘야한다.
		//효율적이지 않은 null값 비교를 하지 않기 위해 
		//만약 중간 인덱스가 비워진다면 뒤에 있는 객체들을 앞으로 옮겨서 빈공간이 없게 작업해준다.
		//등록되어있는 사람의 수를 existMemberNum()으로 구했다. 
		//만약 등록되어있는 사람의 수가 4명이면 - 이때 배열에는? 0번인덱스부터 1,2,3 해서 총 4명이 들어간것.
		//이때 마지막수는? existMemberNum() - 1 
		for(int i=0;i<existMemberNum(); i++) {
			//i번째 인덱스에 있는 Member객체의 id와 입력받아온 id가 일치한다면? 지워야된다.
			if(m[i].getId().equals(id)) {//일치
				//i값이 끝자리라면 null로 비워주기
				if(i==(existMemberNum() - 1)) { //끝자리라면 null로 비워주기 왜? 땡길게 없음 (지워야함)
					m[i] = null; //비워주기 - 마지막에 있는 경우
				}else { //끝자리 아니면? 현재 위치 뒤에있는 객체들을 한칸씩 앞으로 옮기면 된다.
					//덮어쓰기 하려구.
					//0 1 2 3 4 null null  
					//j : 1 j<5;
					for(int j=i;j<existMemberNum()-1; j++) {
						//내 뒷자리에 있는 객체를 내자리에 넣기
						m[j] = m[j+1]; 
					}
					//마지막에 있는 대상을 null 대입
					//끝자리까지 도달하면 끝자리를 null로 초기화 
					m[existMemberNum()-1] = null;
				}
				return true; //처리가 완료되었을때 true 반환
			}
		}
		return false;
	}
	
	//전체 회원 삭제 메소드
	public void delete() {
	//객체배열에 등록된 객체들 전부 null로 바꿔주면 된다.
//		for(int i=0; i<m.length;i++) {
//			m[i] = null;
//		}
		//앞으로 정렬하는 작업을 했다면.
		int count = existMemberNum(); //한번만 호출하고 해당 수만큼 반복시키기
		
		for(int i=0; i<count;i++) {
			m[i] = null; //각 인덱스에 참조하지 않겠다는 null값 넣기 
		}
	}
	
	//Member[] 반환 메소드
	public Member[] printAll() {
		return m;//객체배열의 주소값을 반환 
	}
	

}
