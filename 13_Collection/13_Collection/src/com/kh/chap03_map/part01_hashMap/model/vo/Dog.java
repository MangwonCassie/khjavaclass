package com.kh.chap03_map.part01_hashMap.model.vo;

public class Dog {
	//필드 두개 작성하여 MapRun2에서 HashMap 선언 후 String,Dog 제네릭으로 데이터 3개 넣고
	//출력해보기.
	//순차적으로 접근하여 키와 벨류의 형태로 출력해보세요.(2가지 방법 다 해보기)
	private String name;
	private String kind;
	public Dog() {
		super();
	}
	public Dog(String name, String kind) {
		super();
		this.name = name;
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", kind=" + kind + "]";
	}
	
}
