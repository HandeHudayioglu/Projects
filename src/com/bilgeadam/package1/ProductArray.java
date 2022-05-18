package com.bilgeadam.package1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductArray {

	public static void main(String[] args) {
		
		ArrayList<String>Product = new ArrayList<> ();
		ArrayList<String>ChoiceProduct = new ArrayList<>();
		Product.add("Apple");
		Product.add("Soap");
		Product.add("Chips");
		Product.add("Napkin");
		Product.add("Pasta");
		Product.add("Detergent");
		Product.add("Tea");
		Product.add("Coffee");
		
		System.out.println(Product);
		
		
		while(true) {
			Scanner input = new Scanner(System.in);
			System.out.println("Which products would you like to buy?");
			String choice = input.nextLine();
			
		
			ChoiceProduct.add(choice);
			System.out.println(ChoiceProduct);

	}

}
}
