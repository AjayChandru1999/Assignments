package org;

public class Exception {
	
	public static void main(String[] args) {
		
		int a,b,c,d;
		
		a=20;
		b=0;
		
		try {
			c=a/b;
			System.out.println(c);
			
		}catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("Eception Handled");
			
		}
		d=b/a;
		System.out.println(d);
	}

}
