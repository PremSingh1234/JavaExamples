package com.qa.petstore;

public class Cat {
	private String name;
	public Cat(String name) {
		this.name = name;
		
	}
	
	public Cat() {
		this.name = name = "Stray bad";
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
