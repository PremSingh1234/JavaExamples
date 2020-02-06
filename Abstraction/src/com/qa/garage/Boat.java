package com.qa.garage;

public class Boat extends Vehicle{
	private int boatCapcity = 10;
	
	public Boat() {
		super(100);
	}
	
	@Override
	public float bill() {
		if(boatCapcity == 10) {
			return 500;
	}
	    else {
	    	return 0;
	}
		}
	
	public int getBoatCapcity() {
		return boatCapcity;
	}
	public void setBoatCapcity(int boatCapcity) {
		this.boatCapcity = boatCapcity;
	}

}
