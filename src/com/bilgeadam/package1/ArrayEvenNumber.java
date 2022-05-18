package com.bilgeadam.package1;

import java.util.ArrayList;

public class ArrayEvenNumber {
	
	public static void main(String[] args) {
	
		
		ArrayList<Integer>EvenNumbers = new ArrayList<>();
		ArrayList<Integer>OddNumbers = new ArrayList<>();
	 
		
		for(int i=1; i<=100 ; i++) {
		if (i%2==0) {
			
			
			EvenNumbers.add(i);
			
			
		} else {
			
			
			OddNumbers.add(i);
			
			
		}
		
	}
		System.out.println("Odd Numbers: "+OddNumbers);
		System.out.println("Even Numbers: " +EvenNumbers);
		
		for (int i=0; i<10; i++) {
			EvenNumbers.remove(Integer.valueOf(i));
		}
		System.out.println("Even numbers greater than 10: " +EvenNumbers);
}
}
	
	

	
	

	


	

