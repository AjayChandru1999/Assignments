package org;

import java.util.ArrayList;
import java.util.List;

public class ArrayList3 {

	public static void main(String[] args) {
		
		  List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Apple");
		  list_Strings.add("Orange");
		  list_Strings.add("Grapes");
		  list_Strings.add("Banana");
		  list_Strings.add("WaterMelon");
	
		  System.out.println(list_Strings);
		
		  list_Strings.add(0, "StrawBerry");
		  list_Strings.add(5, "Pineapple");
		 
		  System.out.println(list_Strings);
	}
}
