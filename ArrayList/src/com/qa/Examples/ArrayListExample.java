package com.qa.Examples;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		
		ArrayList<Integer> dogs = new ArrayList<Integer>();
		for(int i=1;i<=100;i++) {
			dogs.add(i);
			}
		int place = 10;
		dogs.remove(place-1);
		//System.out.println(dogs);
		}
	
}


