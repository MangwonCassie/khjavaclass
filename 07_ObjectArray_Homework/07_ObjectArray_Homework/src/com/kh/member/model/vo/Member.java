package com.kh.member.model.vo;

public class Member {
	private String id;//	- id : String
	private String name;//	- name : String
	private String password;//	- password : String
	private String email;//	- email : String
	private char gender;//	- gender : char
	private int age;//	- age : int
	
//	+ Member()
//	+ Member(id:String, name:String, password:String,
//	email:String, gender:char age:int)
//	+ setter() / getter()
	public Member() {
		
	}

	public Member(String id, String name, String password, String email, char gender, int age) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

//	+ inform() : String
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", gender="
				+ gender + ", age=" + age + "]";
	}
	
	
}
