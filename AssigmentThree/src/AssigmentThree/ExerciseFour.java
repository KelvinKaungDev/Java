package AssigmentThree;

import java.util.Random;

public class ExerciseFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = rollDice();
		System.out.print("Random integer value from 1 to 6 : " + result);
	}
	
	public static int rollDice() {
		Random rand = new Random();
		return rand.nextInt(5) + 1;
	}

}
