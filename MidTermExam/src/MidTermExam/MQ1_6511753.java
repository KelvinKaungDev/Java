package MidTermExam;

import java.util.Scanner;

public class MQ1_6511753 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your input : ");
		String input = scanner.nextLine();
		int result = mostRepeated(input);
		System.out.print(result);
	}
	
	public static int mostRepeated(String inStr)
	{
		char[] array = inStr.toCharArray();
				int count = 1;
				int max = 0;
				char maxChar = 0;
				for(int i=1; i<array.length; i++){ 
				    if(array[i]==array[i-1]){
				        count++;
				    } else {
				        if(count>max){ 
				            max=count;
				            maxChar=array[i-1];
				        }
				        count = 1; 
				    }
				}
				if(count>max){
				    max=count; 
				    maxChar=array[array.length-1];
				}
				System.out.println("Longest run: "+max+", for the character "+maxChar);
				return maxChar;
	}

}


//Kaung Hte Oo ( 6511753)
