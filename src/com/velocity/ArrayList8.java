package com.velocity;

import java.util.ArrayList;

public class ArrayList8 {
	public static void main(String[]args) {
		ArrayList al=new ArrayList();
		al.add("pune"); 
		  al.add("mumbai"); 
		  al.add("bangalore"); 
		  al.add(20);
		  System.out.println(al.get(2));
		  System.out.println(al); 
		  System.out.println(al.remove("pune")); 
		  System.out.println(al);
		  System.out.println(al.contains("pune")); 
	}

}
