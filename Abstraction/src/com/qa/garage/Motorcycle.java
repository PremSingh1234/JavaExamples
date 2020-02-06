package com.qa.garage;

public class Motorcycle extends Vehicle{
	private int handles = 2;
	
	public Motorcycle() {
		super(200);
	}
	
	@Override
	public float bill() {
		if(handles == 2) {
			return 20;
	}
	    else {
	    	return 0;
	}
		}

	public int getHandles() {
		return handles;
	}

	public void setHandles(int handles) {
		this.handles = handles;
	}

}
