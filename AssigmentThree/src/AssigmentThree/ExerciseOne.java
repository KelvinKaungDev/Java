package AssigmentThree;

import java.util.Scanner;

public class ExerciseOne {
	
	public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
        	 System.out.println("Enter number: ");
             String number = scanner.next();
             
             if (number.equals("n") || number.equals("N")) {
            	 break;
             }
             
        	if(Integer.parseInt(number) >= 0 ) {
        		System.out.println("Positive");
        	} else if(Integer.parseInt(number) < 0){
        		System.out.println("Negative");
        	}
        }
    }
}
