package test;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		String dslf= reverseWord("hello");
		System.out.print(dslf);
	}
	
	public static String reverseWord(String input)
	{
		String[] splitted = input.split(" ");
		String newReverse = "";
		
		for(String str : splitted)
		{
			char[] x = new char[str.length()];
			for(int i = 0; i < x.length; i++)
			{
				x[x.length - 1 - i] = str.charAt(i);
			}
			
			newReverse += String.valueOf(x);
		}
		
		return newReverse;
	}

}
