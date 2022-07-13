package WeekThreeAssigment;

import java.util.Scanner;

public class RemoveAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String inputString = scanner.next();
		char inputCharacter = scanner.next().charAt(0);
		
		removeAll(inputString, inputCharacter);
	}
	
	public static String removeAll(String str, char ch) {
		String strNew = str.replace(String.valueOf(ch), "");
		System.out.print(strNew);
		
		return "";
	}

}
