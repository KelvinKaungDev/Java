package AssigmentThree;

import java.util.Scanner;

public class ExerciseTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputOne, inputTwo, result;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		inputOne = scanner.nextInt();
		
		System.out.print("Enter the second number: ");
		inputTwo = scanner.nextInt();
		
		result = computeLargeValue(inputOne, inputTwo);
		System.out.print("The largest number is " + result);
	}
	
	public static int computeLargeValue(int inputOne, int inputTwo) {
		if(inputOne < inputTwo) {
			return inputTwo;
		} else {
			return inputOne;
		}
	}

}
