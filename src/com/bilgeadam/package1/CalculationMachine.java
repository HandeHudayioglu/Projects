package com.bilgeadam.package1;

public class CalculationMachine {

	public static void main(String[] args) {
		
		System.out.println(sum(2,3));
		System.out.println(diff(5,2));
		System.out.println(multiply(4,7));
		System.out.println(divide(15,3));
		System.out.println(mod(12,5));
		

	}
	
	public static int sum(int n1,int n2) {
		return n1 + n2;

}
	public static int diff(int n1,int n2) {
		return n1-n2;
	}
	
	public static int multiply(int n1,int n2) {
		return n1*n2;
	}
	public static int divide(int n1,int n2) {
		return n1 / n2;
	}
	public static int mod(int n1,int n2) {
		return n1%n2;
	}
}
