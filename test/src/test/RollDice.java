package test;

import java.util.Random;

public class RollDice {

	public static void main(String[] args) {	
		int randomNumber = rollDice();
		System.out.print(randomNumber);
	}
	
	public static int rollDice()
	{
		Random rand = new Random();
		return rand.nextInt(1,7);
	}
	

}
