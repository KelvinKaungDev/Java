package AssigmentSix;

public abstract class Bird extends Animals{

	public Bird(String kind, String appearance) {
		super(kind, appearance);
	}
	
	public void eat()
	{
		System.out.print("Eats seeds and insects");
	}
	
	public void move()
	{
		System.out.print("Files throught the air");
	}
}
