package Exercise_01;

public class Exercise_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reversePrintNumberPoints(5);
	}
	
	public static void reversePrintNumberPoints(int n) {
		if(n == 0) {
			return;
		} else {
			reversePrintNumberPoints(n - 1);
			System.out.print(n);
			System.out.print(".".repeat(n));
		}
	}
}
