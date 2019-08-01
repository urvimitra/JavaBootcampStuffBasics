package com.shell.demo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<>();
		list.add("abc");
		list.add("xyz");
		for(String f:list)
			System.out.println(f);
		
		System.out.println(list);

	}

}
