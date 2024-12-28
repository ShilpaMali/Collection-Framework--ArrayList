package com.velocity;

import java.util.ArrayList;
import java.util.Iterator;

//iterator with generics

public class ArrayList5 {
	public static void main (String[]args) {
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(20);
		System.out.println(al);
		
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(10);
		al2.add(30);
		al.addAll(al2);
		System.out.println(al);
		
		//Using iterator
		
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
