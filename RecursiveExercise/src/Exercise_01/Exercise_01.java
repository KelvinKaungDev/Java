package Exercise_01;

public class Exercise_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dog_number = 2;
		int result = doglegs(dog_number);
		System.out.print("Dog number is" + dog_number + "dog legs are" + result);
	}
	
	public static int doglegs(int n) {
		
		if(n > 0) {
			return doglegs(n -1) + 4;
		} else {
			return 0;
		}
		
	}


}
