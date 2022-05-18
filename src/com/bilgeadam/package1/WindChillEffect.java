package com.bilgeadam.package1;

import java.util.Scanner;

public class WindChillEffect {

	public static void main(String[] args) {
		
		double windspeed,tempF,tempK,wctK,wctF;
		
		Scanner scan = new Scanner (System.in) ;
        
        System.out.print("Enter wind speed : ") ;
		windspeed = scan.nextDouble(); 
		
		System.out.print("Enter temperature:  ");
		tempF = scan.nextDouble();
		
		wctF= 33 + (0.478 + (0.237 * Math.pow(windspeed, 0.5)) -(0.0124*windspeed)*(tempF - 33));
		
		System.out.println("Wind Chill Effect (F): " + wctF);
		
		tempK= (((tempF + 459.67)*5)/9);
		
		wctK= 33 + (0.478 + (0.237 * Math.pow(windspeed, 0.5)) - (0.0124*windspeed)*(tempK - 33));
		
		System.out.println("Wind Chill Effect (K): " +wctK);
		
		
		

	}

}
