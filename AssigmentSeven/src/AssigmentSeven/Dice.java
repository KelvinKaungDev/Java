package AssigmentSeven;

import java.util.Random;
import java.util.Scanner;

public class Dice{

	private int first_face = 0;
	private int second_face = 0;
	private int third_face = 0;
	private int final_face = 0;
		
	public Dice() 
	{
		FirstRoll();
		
		System.out.println("The first face is : " + this.first_face);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your predict number : ");
		int user_predict = scanner.nextInt();
		SecondRoll();
		ThirdRoll();
		
		
		if(user_predict == this.final_face)
		{
			System.out.println("You are Win");

		} else {
			System.out.println("You are Lost and correct answer is " + this.final_face);
			System.out.println("The first roll is " + this.first_face);
			System.out.println("The second roll is " + this.second_face);
			System.out.println("The third roll is " + this.third_face);
		}
	}
	
	public int getFace()
	{
		return this.final_face;
	}
	
	public void FirstRoll()
	{
	  Random rand = new Random();
	  int face_random = rand.nextInt(1, 7); 
	  
	  this.first_face = face_random;
	  this.final_face = this.first_face;
	}
	
	public int getFirstRoll()
	{
		return this.first_face;
	}
	
	public void SecondRoll()
	{
	  Random rand = new Random();
	  int face_random = rand.nextInt(1, 7); 
	  
	  this.second_face = face_random;
	  this.final_face += this.second_face;
	}
	
	public int getSecondRoll()
	{
		return this.second_face;
	}
	
	public void ThirdRoll()
	{
	  Random rand = new Random();
	  int face_random = rand.nextInt(1, 7); 
	  
	  this.third_face = face_random;
	  this.final_face += this.third_face;
	}
	
	public int getThirdRoll()
	{
		return this.third_face;
	}
	
}

