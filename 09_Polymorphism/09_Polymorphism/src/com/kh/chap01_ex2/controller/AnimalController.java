package com.kh.chap01_ex2.controller;

import com.kh.chap01_ex2.model.vo.Animal;
import com.kh.chap01_ex2.model.vo.Cat;
import com.kh.chap01_ex2.model.vo.Dog;
import com.kh.chap01_ex2.model.vo.Tiger;

public class AnimalController {
	
	//동물의 울음소리를 내는 메소드
	//다형성 적용 전 
	//고양이한테 울어! 라고 한 경우
//	public void doCry(Cat cat) {
//		cat.crying();
//	}
//	//강아지에게 짖어! 라고 한 경우
//	public void doCry(Dog dog) {
//		dog.crying();
//	}
//	//호랑이한테 어흥해! 라고 한 경우
//	public void doCry(Tiger tiger) {
//		tiger.crying();
//	}
	
	
	//다형성을 적용한 후 메소드 
	public void doCry(Animal animal) {
		animal.crying();
	}
	
	
	
	
	
	
	
}
