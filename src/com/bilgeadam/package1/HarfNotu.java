package com.bilgeadam.package1;

import java.util.Scanner;

public class HarfNotu {

	public static void main(String[] args) {
		
		double vize1,vize2,sonsınav,ortalama;
		
        Scanner scan = new Scanner (System.in) ;
        
        System.out.print("1. vize notunuzu giriniz : ") ;
		vize1 = scan.nextDouble(); 
		
		System.out.print("2. vize notunuzu giriniz : ") ;
		vize2 = scan.nextDouble(); 
		
		System.out.print("Final notunuzu giriniz : ") ;
		sonsınav = scan.nextDouble(); 
		
		ortalama= (((vize1 + vize2)* 0.2) + (sonsınav*0.6));
		
		if(ortalama<49) {
			System.out.println("Ortalama " +ortalama +"   :FF");
		}
		else if(ortalama>=50 && ortalama<=59 ) {
			System.out.println("Ortalama " +ortalama+ "   :DD");
		}
		else if(ortalama>=60 && ortalama<=69) {
			System.out.println("Ortalama " +ortalama+ "   :CC");
		}
		else if(ortalama>=70 && ortalama<=79 ) {
			System.out.println("Ortalama " +ortalama+ "   :BB");
		}
		else if (ortalama>=80 && ortalama<=100 ) {
			System.out.println("Ortalama" +ortalama + "   :AA");
		}

	}

}
