package MQ3_6511753;

public class NonMember extends Customer{

	private double discountVoucher = 0;
	
	public NonMember(String id, String name, Double amount, Double discountVoucher) {
		super(id, name, amount);
		this.discountVoucher = discountVoucher;
	}
	
	public double getDiscountVoucher() {
		return discountVoucher;
	}
	
	public void setDiscountVoucher(double discountVoucher) {
		this.discountVoucher = discountVoucher;
	}
	
	public double getAmountAfterDiscount()
	{
		double discountRate = this.discountVoucher * 0.01;
		double amount = this.getAmount();
		
		double d = amount * discountRate;
		double result = amount - d;
		
		return result;	
	}
	
	public String toString()
	{
		return String.format("%S %S amount of shopping after applied with the discount voucher is %f", this.getId(), this.getName(), this.getAmountAfterDiscount());

	}
	
//	Kaung Htet Oo (6511753)

}
