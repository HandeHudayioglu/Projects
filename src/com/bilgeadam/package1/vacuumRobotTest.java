package com.bilgeadam.package1;



import java.util.Scanner;

public class vacuumRobotTest {

	public static void main(String[] args) {
		
		
		vacuumRobot robot = new vacuumRobot();
		
		while(true) {
		
			Scanner scan = new Scanner(System.in);
			System.out.println("The robot is starting.");
			System.out.println(" a-Room1\n b-Room2\n c-Kitchen");
			System.out.println("Please select the room do you want to clean?");
			String select = scan.nextLine();
			
            
			switch (select.toLowerCase())  {
			
			case "a":
				robot.room1();
				break;
			case "b":
				robot.room2();
				break;
			case "c":
				robot.kitchen();
				break;
				default:
				System.out.println("Invalid entry!");
				break;
			}
			
			
			
		
			
}
}
}



