package org.com;

public class GrandChildClass extends ChildClass {
 
	public void employeRole() {
		System.out.println("Employe role is Software Engineer");
	}
	
	public void employeStatus() {
		System.out.println("EmployeStatus is working");
	}
	
	
	public static void main(String[] args) {
		GrandChildClass gc = new GrandChildClass();
		System.out.println("*******************");
		System.out.println("This is single Inheritance");
		gc.employeName();
		gc.employeNative();
		gc.employeNumber();
		gc.employeId();
		System.out.println("*******************");
		System.out.println("This is Multilevel Inheritance");
		gc.employeName();
		gc.employeNative();
		gc.employeNumber();
		gc.employeId();
		gc.employeRole();
		gc.employeStatus();
		

	}

}
