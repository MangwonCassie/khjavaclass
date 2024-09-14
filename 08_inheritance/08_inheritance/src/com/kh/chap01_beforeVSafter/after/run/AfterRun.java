package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.after.model.vo.Tv;
import com.kh.chap01_beforeVSafter.after.model.vo.Desktop;

public class AfterRun {

	public static void main(String[] args) {
		
		Tv t = new Tv("LG","tv-11","초슬림티비",1500000,60);
		SmartPhone s = new SmartPhone("애플","pp-22","아이폰22",550000,"KT");
		Desktop d = new Desktop("애플","dt-55","맥북15인치",1350000,true);
		
		System.out.println(t.inform());
		System.out.println(s.inform());
		System.out.println(d.inform());
		
		/* 상속의 특징 
		 * 클래스간의 상속은 다중상속이 불가능(단일 상속만 가능하다)
		 * 모든 클래스는 Object클래스의 후손이다 (생략되어있음)
		 * 때문에 Object클래스에 있는 메소드를 호출해서 사용할 수 있고
		 * 재정의(Override)하여 사용 가능하다. 
		 * 
		 * 상속의 장점
		 * 공통적인 코드를 하나로 묶음으로서 새로운 클래스에 사용 및 유지보수가 용이하다.
		 * -보다 적은 양의 코드로 새 클래스를 작성할 수 있음.
		 * 
		 * */
		
		
		
	}

}
