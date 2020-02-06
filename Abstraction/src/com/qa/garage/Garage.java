package com.qa.garage;

public class Garage {
	public static void main(String[] args) {
		ArrayList<vehicle> Vehicles = new ArrayList<Vehicle>();
		Vehicle.add(new Car('red', true));
		Vehicle.add(new Motorcycle('green', 150));
		Vehicles.Stream().forEach(
				Vehicle -> System.out.println(Vehicle, bill());
	}

}
