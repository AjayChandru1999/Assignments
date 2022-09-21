package org;

import java.util.HashMap;

public class HashMap3 {
	public static void main(String[] args) {
		
		HashMap <Integer,String> hash_map1 = new HashMap <Integer,String> ();
		  HashMap <Integer,String> hash_map2 = new HashMap <Integer,String> ();
		
		  hash_map1.put(1, "Apple");
		  hash_map1.put(2, "Orange");
		  hash_map1.put(3, "grapes");
		  System.out.println("\nValues in first map: " + hash_map1);
		  hash_map2.put(4, "banana");
		  hash_map2.put(5, "strawberry");
		  hash_map2.put(6, "waterMelon");
		  System.out.println("\nValues in second map: " + hash_map2);

		
		  hash_map2.putAll(hash_map1);
		  System.out.println("\nNow values in second map: " + hash_map2);
	}

}
