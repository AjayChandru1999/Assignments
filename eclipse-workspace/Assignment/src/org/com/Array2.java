package org.com;

import java.util.Arrays;

public class Array2 {

	private static final int i = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array[] = {"Ajay" , "Vs" , "Chandru"};
		System.out.println("This is given array" + Arrays.toString(array));
		
		for(int i=0; i<(array.length/2); i++);
		{
			String s= array[(array.length-1)-i];
			array [(array.length-1)-i] =array [i];
			array[i] =s;
			
			
		}
		System.out.println("This is sort string" + Arrays.toString(array));
			

	}

}
