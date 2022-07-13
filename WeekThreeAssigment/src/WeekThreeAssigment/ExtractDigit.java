package WeekThreeAssigment;

import java.util.Arrays;
import java.util.Scanner;

public class ExtractDigit {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		int position = scanner.nextInt();
		
		extractDigit(number, position);
	}
	
	public static int extractDigit(int number, int position) {
		String numberString = Integer.toString(number);
		int[] numberArray = new int[numberString.length()];
		
		for(int i = 0; i < numberString.length(); i++) {
			numberArray[i] = numberString.charAt(i) - '0';
		}
		
		System.out.print(numberArray[position]);

		return 0;
	}

}
