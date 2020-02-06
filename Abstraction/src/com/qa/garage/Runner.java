package com.qa.garage;

public class Runner {
	public static void main(String[] args) {
		//Vehicle vehicle = new Vehicle; - ERROR cause Vehicle is abstract
		Car car = new Car();
		System.out.println(car.getTopSpeed());
		System.out.println(car.getColour());
		System.out.println(car.getAmountOfdoors());
		System.out.println(car.bill());
		
		Motorcycle motorcycle = new Motorcycle();
		System.out.println(motorcycle.getTopSpeed());
		System.out.println(motorcycle.getHandles());
		System.out.println(motorcycle.bill());
		
		Boat boat = new Boat();
		System.out.println(boat.getTopSpeed());
		System.out.println(boat.getBoatCapcity());
		System.out.println(boat.bill());
				
	}
	
}
