package com.velocity;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList9 {
	
	public static void main(String[]args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("shubham"); 
		al.add("rahul"); 
		al.add("laxman"); 
		al.add("snehal"); 
		al.add("kshitija"); 
		Collections.sort(al); 
		System.out.println(al); 
	}

}
