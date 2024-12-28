package com.velocity;

import java.util.ArrayList;

//Using For each loop

public class ArrayList6 {
	public static void main(String[]args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		
		//using for each loop
		
		for(Integer a:al) {
			System.out.println(a);
		}
		
	}

}
