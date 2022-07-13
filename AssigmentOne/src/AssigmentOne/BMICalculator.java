package AssigmentOne;

import java.util.Locale;
import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		System.out.print("Enter your Weight in KG - ");
		float weight = scanner.nextFloat();
		System.out.print("Enter your Height in Meter - ");
		float height = scanner.nextFloat();
		float result = weight / (height * height);

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
