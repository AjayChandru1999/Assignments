package calculator;

public class Icalculator implements Calculator {
	public static void main(String[] args) {
		Icalculator Ic = new Icalculator();
		
		Ic.add(1, 2);
		Ic.subtract(1, 2);
		Ic.multiply(1, 2);
	}
	
	

	@Override
	public int add(int a, int b) {
		System.out.println("Calculator - add " +  ( a + b ));
		return a+b;
		
	}

	@Override
	public int subtract(int a, int b) {
		System.out.println("Calculator - subtract " +( a - b));
		return a-b;
		
	}

	@Override
	public int multiply(int a, int b) {
		System.out.println("Calculator - multiply " +( a * b));
		return a*b;
		
	}

}
