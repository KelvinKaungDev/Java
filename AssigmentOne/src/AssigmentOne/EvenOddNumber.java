package AssigmentOne;
import java.util.*;  

public class EvenOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your Input - ");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.print("Your number is Even number");
		} else {
			System.out.print("Your number is Odd number");
		}
	}
	

}
