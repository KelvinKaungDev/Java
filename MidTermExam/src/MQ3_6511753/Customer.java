package MQ3_6511753;

public class Customer {

	private String id;
	private String name;
	private Double amount;
	
	public Customer(String id,String name,Double amount)
	{
		this.id = id;
		this.name = name;
		this.amount = amount;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public String toString()
	{
		return String.format("%S %S %f", this.id, this.name, this.amount);
	}
	
	
//	Kaung Htet Oo (6511753)

}
