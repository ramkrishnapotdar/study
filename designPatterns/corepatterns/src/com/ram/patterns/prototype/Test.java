package com.ram.patterns.prototype;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Game game1 = new Game();
		game1.setId(1);
		game1.setName("abc");
		game1.setMembership(new Membership());
		
		
		Game game2 = game1.clone();

		System.out.println(game1);
		System.out.println(game2);
		
		Game game3 = new Game(game2);
		
		System.out.println(game3);
	}

}
