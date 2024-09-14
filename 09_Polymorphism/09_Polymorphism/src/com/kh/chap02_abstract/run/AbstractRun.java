package com.kh.chap02_abstract.run;

import com.kh.chap02_abstract.model.vo.Animal;
import com.kh.chap02_abstract.model.vo.Cat;
import com.kh.chap02_abstract.model.vo.Dog;
import com.kh.chap02_abstract.model.vo.Monkey;
import com.kh.chap02_abstract.model.vo.Monkey3;

public class AbstractRun {
	public static void main(String[] args) {
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		//미완성 클래스는 객체를 생성할 수 없지만 참조 변수로는 활용할 수 있다.
		Monkey m = new Monkey3();
		
		dog.crying();
		cat.crying();
		dog.drinking();
		cat.drinking();
		m.normal();
	}
}
