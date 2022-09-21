package org;

import java.util.HashMap;

public class Hashmap2 {

	public static void main(String[] args) {
		
		 HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		  hash_map.put(1, "Apple");
		  hash_map.put(2, "Orange");
		  hash_map.put(3, "Grapes");
		  hash_map.put(4, "Banana");
		  hash_map.put(5, "strawberry");
		  System.out.println("Size of the hash map: "+hash_map.size());
	}
}
