package com.bilgeadam.package1;

public class vacuumRobot {
	
	private int batteryCapacity=100;  
	int distanceTravelledForward;
	int distanceTravelledRight;
	boolean checkMap;
	int checkDust=0 ;
	
	
	private void remainingBattery() {
		System.out.println("Remaining Battery: "+batteryCapacity);
		if(batteryCapacity<=25) {
			System.out.println("Battery is low! Returning to the charging unit!");
		}
	
	}
	
    void charge() {
		
		if(batteryCapacity>=100) {
			System.out.println("Battery Full! Robot is starting.");
		}else {
			batteryCapacity++;
			remainingBattery(); 
		}
		
}
    
     void map() {
    	 
    	 if (batteryCapacity<=25) {
    		 System.out.println("Battery is low! Returning to the charging unit!");
    	 }
    		 else if (checkMap==false) {
    			 distanceTravelledForward++;
    			 checkDust+=5;
    			 
    			 
    		 }
    		 else if(checkMap==true) {
    			 distanceTravelledRight++;
    			 checkDust+=5;
    		 
    	 }
     }
     
     void dustStatus () {
    	 
    	 if (checkDust>=50) {
    		 System.err.println("Check the dust chamber!");
    	 }
    	 else if (checkDust<50) {
    		map();
    		
    	 }
    	 
    	 
     }
     
     void oneMeterForward () {
    	 if (batteryCapacity<=25) {
    		 remainingBattery();
    	 }
    	 else {
    		 distanceTravelledForward++;
    		 batteryCapacity-=5;
    		 remainingBattery();
    		 checkDust+=5;
    		 dustStatus();
    	 }
     }
     
     void oneMeterRight () {
    	 if (batteryCapacity<=25) {
    		 remainingBattery();
    	 }
    	 else {
    		 distanceTravelledRight++;
    		 batteryCapacity-=5;
    		 remainingBattery();
    		 checkDust+=5;
    		 dustStatus();
    	 }
     }
      
     void oneMeterBackward () {
    	 if (batteryCapacity<=25) {
    		 remainingBattery();
    	 }
    	 else {
    		 distanceTravelledForward--;
    		 batteryCapacity-=5;
    		 remainingBattery();
    		 checkDust+=5;
    		 dustStatus();
    	 }
     }
     
     void oneMeterLeft () {
    	 if (batteryCapacity<=25) {
    		 remainingBattery();
    	 }
    	 else {
    		 distanceTravelledRight--;
    		 batteryCapacity-=5;
    		 remainingBattery();
    		 checkDust+=5;
    		 dustStatus();
    	 }
     }
     
     void room1 () {
    	 
    	 oneMeterForward();
    	 oneMeterBackward();
    	 oneMeterRight();
    	 oneMeterLeft();
    	 
    	 System.out.println("The room1 cleaned.");
    	 
    	 dustStatus();
    	 charge();
    	 
     }
      
     


   void room2() {
	   
	   oneMeterForward();
	   oneMeterBackward();
	   oneMeterRight();
	   oneMeterLeft();
	   oneMeterForward();
	   oneMeterBackward();
	   oneMeterRight();
	   oneMeterLeft();
	   
	   System.out.println("The room2 cleaned.");
	   
	   dustStatus();
	   charge();
   }
   
   void kitchen() {
	   
	   oneMeterForward();
	   oneMeterBackward();
	   oneMeterRight();
	   oneMeterLeft();
	   
	   System.out.println("The kitchen cleaned.");
	   
	   dustStatus();
	   charge();
   }
}
