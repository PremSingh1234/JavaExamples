package com.qa.evolution;

public class Runner {
	public static void main(String[] args) {
		RattleSnake james = new RattleSnake();
		BlackMamba tyler = new BlackMamba();
		Snake a = (Snake) james;
		Snake b = (Snake) tyler;
		RattleSnake stillJames = (RattleSnake) a;
		RattleSnake notJames = (RattleSnake) b;// - ERROR
		
		//ArrayList<Snake> Snakes = new ArrayList<Snake>();
		//Snakes.add(a);
		//Snakes.add(b);
		
	}

}
