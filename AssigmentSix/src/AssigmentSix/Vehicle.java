package AssigmentSix;

public class Vehicle {
	
	private String make;
	private String model;
	private int year;
	
	public Vehicle(String make, String model, int year)
	{
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public String getMake()
	{
		return this.make;
	}
	
	public String getModel()
	{
		return this.model;
	}
	
	public int getYear()
	{
		return this.year;
	}
	
	public void setMake(String make) 
	{
		this.make = make;
	}
	
	public void setModel(String model) 
	{
		this.model = model;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
	
	public String toString()
	{
		return String.format("%S %S %d", this.make, this.model, this.year);
	}
	
}
