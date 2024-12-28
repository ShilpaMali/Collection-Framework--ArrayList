package com.velocity;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList4 {
	public static void main(String[]args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		
		//using iterator
		
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
