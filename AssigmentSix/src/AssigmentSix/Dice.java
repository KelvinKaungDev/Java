package AssigmentSix;

import java.util.Random;

public class Dice {

	private int face;
	
	public static void main(String args[])
	{
		Dice randomDice = new Dice();
		System.out.print(randomDice);
	}
	
	public Dice() 
	{
		roll();
	}
	
	public Dice(int value)
	{
		if(value > 1 || value < 7) {
			this.face = value;
		} else {
			roll();
		}
	}
	
	public int getFace()
	{
		return this.face;
	}
	
	public int roll()
	{
	  Random rand = new Random();
	  int upperbound = 7;
	  int face_random = rand.nextInt(upperbound); 
	  
	  return this.face = face_random;
	}
	
	public String toString()
	{
		return "This result is " + this.face;
	}

}
