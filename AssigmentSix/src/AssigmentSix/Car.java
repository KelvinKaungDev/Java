package AssigmentSix;

public class Car extends Vehicle {

	private int numberWheels;
	
	public Car(String make, String model, int year, int numberWheels) {
		super(make, model, year);
		this.numberWheels = numberWheels;
	}
	
	public int getWheels()
	{
		return this.numberWheels;
	}
	
	public void setWheels(int numberWheels)
	{
		this.numberWheels = numberWheels;
	}
	
	public String toString()
	{	
		return String.format("%S %S %d The number Wheels is %d", getMake(), getModel(), getYear(), this.numberWheels);
	}

}