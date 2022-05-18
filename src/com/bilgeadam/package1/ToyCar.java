package com.bilgeadam.package1;

public class ToyCar {

	private int batteryCapacity=5;  // burda private dedik alttaki değişkenlerde neden demedik? 
	int distanceTravelledForward;
	int distanceTravelledRight;
	
	private void remainingBattery() {
		System.out.println("Remaining Battery: "+batteryCapacity);
		if(batteryCapacity<=0) {
			System.out.println("Dead Battery! Please charge!");
		}
	}
	void charge() {
		
		if(batteryCapacity>=5) {
			System.out.println("Battery Full!");
		}else {
			batteryCapacity++;
			remainingBattery();  // burayı anlamadım neden her else/if in sonuna remaining battery koyuyoruz
		}
		
	}
	
	void moveOneMeterForward() {
		if(batteryCapacity<=0) {
			remainingBattery();
		}else {
		distanceTravelledForward++;
		batteryCapacity--;
		System.out.println("\nCurrent Position: "+distanceTravelledForward+","+distanceTravelledRight); // neden + distancetravelledright dedik bu metod sadece ileri gitmesini ilgilendiriyor demesek de olur mu
		remainingBattery();
		}
	}
	
	void moveOneMeterBackward() {
		if(batteryCapacity<=0) {
			remainingBattery();
		}else {
		distanceTravelledForward--;
		batteryCapacity--;
		System.out.println("\nCurrent Position: "+distanceTravelledForward+","+distanceTravelledRight);
		remainingBattery();
		}
	}
	void moveOneMeterRight() {
		if(batteryCapacity<=0) {
			remainingBattery();
		}else {
		distanceTravelledRight++;
		batteryCapacity--;
		System.out.println("\nCurrent Position: "+distanceTravelledForward+","+distanceTravelledRight);
		remainingBattery();
		}
	}
	void moveOneMeterLeft() {
		if(batteryCapacity<=0) {
			remainingBattery();
		}else {
		distanceTravelledRight--;
		batteryCapacity--;
		System.out.println("\nCurrent Position: "+distanceTravelledForward+","+distanceTravelledRight);
		remainingBattery();
		}
	}
	
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

