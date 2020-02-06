package com.qa.garage;

public class Car extends Vehicle {
	private int amountOfdoors = 4;

	public Car() {
		super(250);
	}
	
	@Override
	public float bill() {
		if(amountOfdoors == 4) {
			return 225;
	}
		else {
			return 0; 
		}
	}

	public int getAmountOfdoors() {
		return amountOfdoors;
	}
	
	public void setAmountOfdoors(int amountOfdoors) {
		this.amountOfdoors = amountOfdoors;
	}

}