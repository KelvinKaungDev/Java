package AssigmentTwo;
import java.util.*;  

public class BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your Weight - ");
		int weight = s.nextInt();
		System.out.print("Enter your Height - ");
		int height = s.nextInt();
		int result = weight / height;

		if(result < 18.5) {
			System.out.print("Underweight");
		} else if (18.5 <= result || result < 25) {
			System.out.print("Normal");
		} else if (25 <= result || result < 30) {
			System.out.print("Overweight");
		} else {
			System.out.print("Obese");
		}
	}

}
