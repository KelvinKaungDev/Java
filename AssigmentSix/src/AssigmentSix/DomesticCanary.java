package AssigmentSix;

public class DomesticCanary extends Bird{

	public DomesticCanary() {
		super("Domesticcanary", "yellow, orange, black, brown, white, red");
	}
	
	public static void main(String args[])
	{
		DomesticCanary newBird = new DomesticCanary();
		
		System.out.print(newBird);
	}

}
