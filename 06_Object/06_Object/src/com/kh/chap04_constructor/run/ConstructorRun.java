package com.kh.chap04_constructor.run;

import com.kh.chap04_constructor.model.vo.Dog;

public class ConstructorRun {
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.information();
		System.out.println("돌아왔나요?");
		d.setAge(20);
		
		Dog bbobbi = new Dog("김뽀삐",3,'여',5.5);
		
		bbobbi.information();
		
	}
}
