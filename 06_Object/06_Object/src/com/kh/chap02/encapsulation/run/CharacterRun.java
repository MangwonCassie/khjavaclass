package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.GameCharacter;

public class CharacterRun {
	public static void main(String[] args) {
		GameCharacter bbo = new GameCharacter();
		bbo.setNick("뽀로로");
		bbo.setJob("전사");
		bbo.setLevel(-50);
		bbo.setPrice(-50000);
		
		System.out.println(bbo.info());
		bbo.print();

	}

}
