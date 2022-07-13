package AssigmentThree;

import java.util.Scanner;

public class ExerciseThreeSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputOne, inputTwo, inputThree, finalResult;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		inputOne = scanner.nextInt();
		
		System.out.print("Enter the second number: ");
		inputTwo = scanner.nextInt();
		
		System.out.print("Enter the third number: ");
		inputThree = scanner.nextInt();
		
		finalResult = computeLargeValue(inputOne, inputTwo, inputThree);
		System.out.print("The largest number is " + finalResult);
	}
	
	public static int computeLargeValue(int inputOne, int inputTwo, int inputThree) {
		int resultOne = Math.max(inputOne, inputTwo);
		return Math.max(resultOne, inputThree);
	}

}
