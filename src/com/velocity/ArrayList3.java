package com.velocity;

import java.util.ArrayList;

public class ArrayList3 {
	public static void main(String[]args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al);
		al.addAll(al);
		System.out.println(al);
	}

}
