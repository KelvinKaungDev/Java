package AssigmentSeven;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
	
	private int first_roll = 0;
	private int second_roll = 0;
	private int third_roll = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiceGame predict = new DiceGame();
	}
	
	public DiceGame()
	{
		FirstRoll();
		System.out.println("The first number is : " + this.first_roll);
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your predict 1 to 18 : ");
		int predict_face = s.nextInt();
		
		SecondRoll();
		ThirdRoll();
		
		if(predict_face == this.third_roll)
		{
			System.out.println("You are Win");
			System.out.println("The first roll is " + this.first_roll);
			System.out.println("The second roll is " + this.second_roll);
			System.out.println("The third roll is " + this.third_roll);

		} else {
			System.out.println("You are Lost and correct answer is " + this.third_roll);
			System.out.println("The first roll is " + this.first_roll);
			System.out.println("The second roll is " + this.second_roll);
			System.out.println("The third roll is " + this.third_roll);
		}
	}

	public void FirstRoll()
	{
		Random rand = new Random();
		int rand_face = rand.nextInt(1,7);
		this.first_roll += rand_face;
	}
	
	public void SecondRoll()
	{
		Random rand = new Random();
		int rand_face = rand.nextInt(1,7);
		this.second_roll = this.first_roll + rand_face;
	}
	
	public void ThirdRoll()
	{
		Random rand = new Random();
		int rand_face = rand.nextInt(1,7);
		this.third_roll = this.second_roll + rand_face;
	}

}
