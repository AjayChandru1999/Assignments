package org.com;

public class ChildClass extends ParentClass {
	
	
     public void employeNumber() {
    	 System.out.println("EmployeNumber is 9952388435");
	}
     
     public void employeId() {
    	 System.out.println("EmployeId is 12345");
	}
    	 
	public static void main(String[] args) {
		
		ChildClass cc = new ChildClass();
		cc.employeName();
		cc.employeNative();
		cc.employeNumber();
		cc.employeId();
	}
	

}
