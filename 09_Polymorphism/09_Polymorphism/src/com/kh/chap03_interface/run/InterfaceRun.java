package com.kh.chap03_interface.run;

import com.kh.chap03_interface.model.vo.DramaActor;
import com.kh.chap03_interface.model.vo.Job;

public class InterfaceRun {

	public static void main(String[] args) {
		DramaActor da = new DramaActor();
		//상속을 받았으니 다형성 가능
		Job j = new DramaActor();
		da.action();
		da.cry();
		da.eat();
		da.justice();
		da.getJobName();
		da.love();
	}

}
