package com.qa.circus;

public class Elephant {
	String species;
	String colour;
	int legs;
	
	public void getPainted(String paint) {
		colour = paint;
	}
	/**
	 * This creates an Elephant
	 * @param species this is the species
	 * @param colour colour of the elephant
	 * @param legs how many legs 
	 */
	public Elephant(String species, String colour, int legs) {	
	this.species = species;
	this.colour = colour;
	this.legs = legs;
	}

}
