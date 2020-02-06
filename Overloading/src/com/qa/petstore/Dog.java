package com.qa.petstore;

public class Dog {
	private String name;
	public Dog(String name) {
		this.name = name;
		
	}
	
	public Dog() {
		this.name = name = "Stray good";
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
