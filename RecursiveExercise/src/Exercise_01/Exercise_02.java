package Exercise_01;

public class Exercise_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNumberDots(5);
	}
	
	public static void printNumberDots(int n) {
		if(n>0) {
			System.out.print(n);
			System.out.print(".".repeat(n));
			printNumberDots(n - 1);
		}
    } 
}
