package com.kh.chap01_beforeVSafter.before.run;

import com.kh.chap01_beforeVSafter.before.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.before.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.before.model.vo.Tv;

public class BeforeRun {

	public static void main(String[] args) {
		//Desktop 객체 생성
		//brand,pCode,pName,price,allInOne
		Desktop d = new Desktop("삼성","dt-01","가성비데탑짱",990000,true);
		
		//Tv 객체 (+inch)
		Tv t = new Tv("LG","tv-01","짱얇은티비",1350000,50);
		
		//SmartPhone 객체 (+ma)
		SmartPhone s = new SmartPhone("애플","ip-22","iPhone15",1450000,"SKT");
		
		//세 객체의 정보 출력
		System.out.println(d.toString());
		System.out.println(t.toString());
		System.out.println(s.toString());
		
	}

}
