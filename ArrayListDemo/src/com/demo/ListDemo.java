package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>();
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(5);
		list.add(40);
		list.add(2);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println("After sor>>"+list);
		list.forEach(e->System.out.println(e));
	}

}
