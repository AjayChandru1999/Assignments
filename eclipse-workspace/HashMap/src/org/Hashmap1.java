package org;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmap1 {
	
	public static void main(String[] args) {
	
		 HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		  hash_map.put(1, "Apple");
		  hash_map.put(2, "Orange");
		  hash_map.put(3, "Grape");
		  hash_map.put(4, "Banana");
		  hash_map.put(5, "strawberry");
		  
		  for(Entry<Integer, String> x:hash_map.entrySet()){  
		   System.out.println(x.getKey()+" "+x.getValue()); 
	}

}
}
