package Exercise_01;

public class Exercise_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printStarAndNumber(5);
	}

	public static void printStarAndNumber(int n) {
		if(n == 0) {
			return;
		} else {
			printStarAndNumber(n -1);
			System.out.print(".".repeat(n));
			System.out.print(n);
		}
	}
}
