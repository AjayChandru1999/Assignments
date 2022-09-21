package org;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberFrmt {

	public static void main(String[] args) {
		int a[] = {1,2,3,4};
		String s = "Ajay" ;
		try {
			int n = Integer.parseInt(s);
			
			
		}catch (NumberFormatException e){
	}
		String s1 = "Chandru" ;
		System.out.println("Employee Name : " + s1);
		
		   try { 
			System.out.println(a[5]);
			
		
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("2 Exceptions Handled");
			
		}
		   try {
			   Scanner scan = new Scanner (System.in);
			   System.out.println("Enter your Id no : ");
			   int i = scan.nextInt();
			   
		   }catch (InputMismatchException e) {
			   System.out.println("ID Number should be numeric");
			   
			   
		   }
		   
		}

}
