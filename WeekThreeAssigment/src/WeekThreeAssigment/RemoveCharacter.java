package WeekThreeAssigment;

import java.util.Scanner;

public class RemoveCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String inputString = scanner.next();
		int inputInteger = scanner.nextInt();
		
		removeCharacter(inputString, inputInteger);
	}
	
	public static String removeCharacter(String str, int n) {
		String getSingleCharacter = String.valueOf(str.charAt(n));
		
		String newStr = str.replace(getSingleCharacter, "");
		System.out.print(newStr);
		
		return "";
	}

}
