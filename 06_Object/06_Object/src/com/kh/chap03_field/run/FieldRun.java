package com.kh.chap03_field.run;

import com.kh.chap03_field.model.vo.FieldTest1;
import com.kh.chap03_field.model.vo.FieldTest2;
import com.kh.chap03_field.model.vo.FieldTest3;

public class FieldRun {

	public static void main(String[] args) {
		
		//FieldTest1
		FieldTest1 f1 = new FieldTest1();
		//객체 생성시 - global(전역변수)가 메모리에 할당됨
		
		f1.test1(10);//test호출시 num과 local 지역변수 할당
		//test1 메소드 종료시 num과 local 지역변수가 소멸
		
		f1 = null;// global멤버변수(전역변수) 소멸 
		//참조변수에 null을 넣는 행위 : 더이상 아무것도 참조하지 않겠다. 
		//참조하고있던 객체는 참조되지 않기때문에 가비지컬렉터가 소멸시킨다.(필요없음 판단)
		
		//======FieldTest2=======
		//다른패키지에서 접근해보기 
//		FieldTest2 f2 = new FieldTest2();
		
		//public 어디서든 접근가능
//		System.out.println(f2.pub);
		//protected 같은 패키지 내,다른패키지일시 상속관계시
//		System.out.println(f2.pro);
		//default 같은 패키지 내
//		System.out.println(f2.def);
		//private 해당 클래스 내부에서만 접근가능.
//		System.out.println(f2.priv);

		//========FieldTest3==========
		
		//객체를 생성하지 않아도 static메모리 영역에 할당된 클래스 변수는 사용가능하다.
		//단 클래스 이름은 작성을 해주어야 어느 클래스에 있는 변수인지 알수있다.
		System.out.println(FieldTest3.sta);
		FieldTest3.test1(); //메소드도 마찬가지로 사용할 수 있다. 
		
		//상수필드 출력해보고 값 변경할수있는지 확인해보기 
		System.out.println(FieldTest3.NUM);
		System.out.println(FieldTest3.STR);
		
//		FieldTest3.NUM = 15;
//		FieldTest3.STR = "변할수있음";
		
		//Math클래스도 random() 메소드라던지 PI라던지 다 static 예약어가 되어있어
		//객체 생성 없이 사용 가능했던것.
		
		System.out.println(Math.PI);
		
		
	}

}
