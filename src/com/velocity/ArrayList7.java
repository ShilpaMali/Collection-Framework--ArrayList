package com.velocity;

import java.util.ArrayList;

// for each loop

public class ArrayList7 {
	public static void main(String[]args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Red");
		al.add("blue");
		al.add("green");
		
		//Print output using for each loop
		
		for(String a:al) {
			System.out.println(a);
		}
	}

}
