package AssigmentSix;

public class AmericanRobin extends Bird{

	public AmericanRobin() {
		super("Americanrobin", "red breast");
	}
	
	public static void main (String args[])
	{
		Bird newBird = new AmericanRobin();
		System.out.print(newBird);
	}
	
}
