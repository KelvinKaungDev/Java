package AssigmentThree;

import java.util.Scanner;

public class ExerciseThreeOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputOne, inputTwo, inputThree, result;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		inputOne = scanner.nextInt();
		
		System.out.print("Enter the second number: ");
		inputTwo = scanner.nextInt();
		
		System.out.print("Enter the third number: ");
		inputThree = scanner.nextInt();
		
		result = computeLargeValue(inputOne, inputTwo, inputThree);
		System.out.print("The largest number is " + result);
	}
	
	public static int computeLargeValue(int inputOne, int inputTwo, int inputThree) {
		if(inputOne > inputTwo && inputOne > inputThree) {
			return inputOne;
		} else if(inputTwo > inputOne && inputTwo > inputThree){
			return inputTwo;
		} else {
			return inputThree;
		}
	}



}
