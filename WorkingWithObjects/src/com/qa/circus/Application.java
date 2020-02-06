package com.qa.circus;
public class Application {
		public static void main(String[] args) {
			Elephant dumbo = new Elephant("Asian", "Grey", 3);
			//dumbo.species = "Asian";
			//dumbo.colour = "Grey";
			//dumbo.legs = 3;
			Elephant nelle = new Elephant("African", "Brown", 4);
			//nelle.species = "African";
			//nelle.colour = "Brown";
			//nelle.legs = 4;
			//dumbo.getPainted("Red"); - Longer version
			
			System.out.println(dumbo.species);
			System.out.println(dumbo.legs);
			System.out.println(dumbo.colour);
			System.out.println(nelle.legs);
			System.out.println(nelle.colour);
			System.out.println(nelle.species);
			
			
		}
		
}