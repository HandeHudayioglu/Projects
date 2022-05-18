package com.bilgeadam.package1;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {

		double height, weight, BMI;
		String female;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your gender :");
		female = scanner.next();

		System.out.print("Enter your height :");
		height = scanner.nextDouble();

		System.out.print("Enter your weight :");
		weight = scanner.nextDouble();

		BMI = (weight * 10000) / (height * height);

		if (female.equals("WOMEN")) {

			if (BMI < 19) {
				System.out.println("WEAK");
			} else if (BMI <= 24) {
				System.out.println("NORMAL");
			} else if (BMI <= 30) {
				System.out.println("FAT");
			} else {
				System.out.println("OBESE");
			}
		}
		if (!female.equals("WOMEN")) {

			if (BMI < 20) {
				System.out.println("WEAK");
			} else if (BMI <= 25) {
				System.out.println("NORMAL");
			} else if (BMI <= 30) {
				System.out.println("FAT");
			} else {
				System.out.println("OBESE");
			}
		}
	}

}