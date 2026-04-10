package com.sist.apply;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Sawon{
	private int mno;
	private String name;
	public Sawon(int mno, String name) {
		this.mno = mno;
		this.name = name;
	}
}
public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Sawon> list = new ArrayList();
		list.add(new Sawon(1,"aaa"));
		list.add(new Sawon(2,"bbb"));
		list.add(new Sawon(3,"ccc"));
		//list.add(4);
		
		for(Sawon s : list) {
			System.out.println(s.getMno() + " " + s.getName());
		}
		
	}

}
