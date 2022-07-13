package WeekThreeAssigment;

import java.util.Scanner;

public class ExtractLastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		extractLastDigit(number);
	}
	
	public static int extractLastDigit(int number) {
		String numberString = Integer.toString(number);
		int[] numberArray = new int[numberString.length()];
		
		for(int i = 0; i < numberString.length(); i++) {
			numberArray[i] = numberString.charAt(i) - '0';
		}
		
		int lastNumber = numberArray[numberArray.length - 1];
		System.out.print(lastNumber);
		
		return 0;
	}

}
