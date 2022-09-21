package org;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacter {

	public static void findDuplicateCharacter(String str) {
		
		Map<Character, Integer> map  = new HashMap<Character, Integer>();
		
		char[] cha = str.toCharArray();
		
		for (char ch : cha) {
		
	    if (map.containsKey(ch)) {
	    	
	    	 map.put(ch, map.get(ch) + 1);
        }
        else {
        	map.put(ch, 1);
        		
        }
	    }
		  
        for (Map.Entry<Character, Integer> entry :
             map.entrySet()) {
        	if (entry.getValue() > 1) {
                System.out.println("Duplicate Character is " + entry.getKey() + " repeated " + entry.getValue() + " times ");
                                  
                                  
        }
    
        }
	}
	public static void main(String[] arg) {
		DuplicateCharacter dc = new DuplicateCharacter();
		String s = "automationtesting" ;
	    dc.findDuplicateCharacter(s);
		
	}
	

}
