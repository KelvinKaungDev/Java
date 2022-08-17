package MQ3_6511753;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer("1", "Kelvin", 123.34);
		
		System.out.println(customer);
		
		Member member = new Member("1", "Kelvin", 12.0, "1");
		member.setDiscountRate(50);
		member.getAmountAfterDiscount();
		
		System.out.println(member);
		
		NonMember nonMember = new NonMember("1", "Kelvin Kaung", 40.0, 50.0);
		nonMember.getAmountAfterDiscount();
		
		System.out.println(nonMember);
	}

}


//Kaung Htet Oo ( 6511753 )