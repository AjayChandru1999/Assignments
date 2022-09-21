package org;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {
 
	public static void main(String[] args) {
		
		 HashSet<String> h_set = new HashSet<String>();
		  
		          h_set.add("Apple");
		          h_set.add("Orange");
		          h_set.add("Grapes");
		          h_set.add("Banana");
		          h_set.add("WaterMelon");
		          h_set.add("Strawberry");

		 Iterator<String> p = h_set.iterator();
		
		   while (p.hasNext()) {
		   System.out.println(p.next());
	}
}
}