package Exercise2D;

import javax.swing.Spring;

public class ReverseWord {

	public static void main(String[] args) {
		String myString = "Hello World";
		String reverseString = reverseWord(myString);
		System.out.print(reverseString);
	}
	
	public static String reverseWord(String word)
	{
		String[] myWord = word.split(" ");
		String newWord = "";
		
		for(String str : myWord)
		{
			char[] ch = new char[str.length()];
			for(int i = 0; i < ch.length; i++)
			{
				ch[ch.length - 1 - i] = str.charAt(i);
			}
			newWord += String.valueOf(ch);
		}
		
		return newWord;
	}

}
