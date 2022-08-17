package MQ3_6511753;

public class Member extends Customer{
	
	private String memberID;
	private int discountRate;
	
	public Member(String id, String name, Double amount, String memberID) {
		super(id, name, amount);
		this.memberID = memberID;
	}

	public String getMemberID() {
		return memberID;
	}
	
	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}
	
	public int getDiscountRate() {
		return discountRate;
	}
	
	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	
	public double getAmountAfterDiscount()
	{
		double discountRate = this.getDiscountRate() * 0.01;
		double amount = this.getAmount();
		
		double d = amount * discountRate;
		double result = amount - d;
		
		return result;
	}
	
	public String toString()
	{
		return String.format("%S %S %S amount of shopping after discount is %f", this.getId(), this.memberID, this.getName(), this.getAmountAfterDiscount());
	}
	
//	Kaung Htet Oo (6511753)
}
