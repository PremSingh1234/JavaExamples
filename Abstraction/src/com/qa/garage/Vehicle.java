package com.qa.garage;

public abstract class Vehicle {
	
	private int topSpeed;
	private String colour;

	public Vehicle(int topSpeed) {
		super();
		this.topSpeed = topSpeed;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	public Vehicle(String colour) {
		super();
		this.colour = colour;
	}
	

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public float bill() {
		return 0;
	}



}
