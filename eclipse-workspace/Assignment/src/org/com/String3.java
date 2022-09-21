package org.com;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "w3resource.com";
		
		System.out.println("This is a given string" + str);
		
		int unicode=str.codePointAt(1);
		int unicode1=str.codePointAt(9);
		
		System.out.println("character (unicode point)" + unicode);
		System.out.println("character (unicode point)" + unicode1);
				

	}

}
