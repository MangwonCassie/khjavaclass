package com.kh.chap01_list.part02_mvc.run;

import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

public class MusicRun {

	public static void main(String[] args) {
			
//		new MusicMenu().mainMenu();
		Music m = new Music();
		ArrayList list = new ArrayList();
		System.out.println(m.getClass());
		System.out.println(list.getClass());
		
	}

}
