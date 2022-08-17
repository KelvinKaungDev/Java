package test;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter you dog number : ");
		int dogCount = scanner.nextInt();
		
		System.out.print(calculateDogLeg(dogCount));
	}
	
	public static int calculateDogLeg(int count)
	{
		if(count <= 0 )
		{
			return 0;
		} else {
			return calculateDogLeg(count - 1) + 4;
		}
	}
}
