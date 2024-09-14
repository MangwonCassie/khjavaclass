package com.kh.chap02_set.model.vo;

public class Student {
	private String name;
	private String phone;
	private int age;
	
	public Student() {
		super();
	}
	
	public Student(String name, String phone, int age) {
		super();
		this.name = name;
		this.phone = phone;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", phone=" + phone + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}
	
	//equals와 hashCode메소드는 Object클래스의 메소드
	//오버라이딩해서 사용할것
	//각 필드들이 전부 일치하는지 확인하는 작업을 통해 해당객체들이 같은 값을 가진 객체인지 확인하기 
	//문자열.equals("비교문자열");
	/*
	@Override
	public boolean equals(Object obj) {
		
		//모든 내용물 비교
		//현재 객체 this 와 넘겨받은 객체 obj를 비교해보자.
		if(this == obj) {//주소값 비교해서 같다면? 같은객체 더이상 비교할 필요 x
			return true; //같아!!
		}
		if(obj == null) { //만약 넘겨받은 obj가 null이라면? 
			return false; //지금 이 객체와 null을 비교할 필요가 없다 같지 않다!!!
		}
		if(getClass()!=obj.getClass()) {//클래스 타입을 비교하여 확인하기
			return false; //클래스 타입이 다르다면 당연히 객체가 다르니까 같지않다!!
		}
		
		//위에서 당연히 맞는경우와 당연히 아닌경우를 제하고 내려왔을때
		//각 내용물들을 비교해서 같은지 아닌지 판별하기.
		Student other = (Student)obj; //넘겨받은 Object형 형변환해서 비교하기
		
		//null인경우 비교하기
		if(this.name==null) { //현재 객체의 name 필드가 null일 경우
			if(other.name != null) { //other의 name필드가 null이 아니라면 ? 
				return false; //null과 null이 아닌것을 비교하니 당연히 false (같지않음)
			}
		}else if(!this.name.equals(other.name)) {//이 객체의 name필드와 other객체의 name필드가 같지 않으면
			return false; //같지않음
		}
		//서로의 name필드가 null이 아니고 같을때 또는 서로의 name가 null로 같을때
		//name필드에 대해서는 같다라는 판단을 하고 내려옴 
		//다음 필드인 phone 필드 비교하기
		//null인경우 비교하기
		if(this.phone==null) { //현재 객체의 phone 필드가 null일 경우
			if(other.phone != null) { //other의 phone필드가 null이 아니라면 ? 
				return false; //null과 null이 아닌것을 비교하니 당연히 false (같지않음)
			}
		}else if(!this.phone.equals(other.phone)) {//이 객체의 phone필드와 other객체의 phone필드가 같지 않으면
			return false; //같지않음
		}
		//name도 같고 phone 같을때 
		//age비교 
		if(this.age!=other.age) {
			return false;
		}
		
		return true;//위에 있는 아닌 상황을 모두 지나 내려오면 같다라는 판단
	}
	
	//해쉬코드
	@Override
	public int hashCode() {
		//모든 필드값을 하나의 문자열로 만들어서 그것을 해시코드화 한 뒤 반환하기
		return (name+phone+age).hashCode();
	}
	*/
	
	
	
	
	
}
