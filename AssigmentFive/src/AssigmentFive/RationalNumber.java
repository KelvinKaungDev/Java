package AssigmentFive;

public class RationalNumber {

	private int numerator;
	private int denominator;
	private double result;
	
	public RationalNumber() 
	{
		this.numerator = 0;
		this.denominator = 1;
	}
	
	public RationalNumber(int num, int deno) 
	{
		if(deno <= 0) {
			this.numerator = num;
			this.denominator = 1;
		} else {
			this.numerator = num;
			this.denominator = deno;
		}
	}
	
	public void add(RationalNumber r) 
	{
		this.numerator = (this.numerator * r.denominator) + (this.denominator * r.numerator);
		this.denominator = this.denominator * r.denominator;
	}
	
	public void subtract(RationalNumber r) 
	{
		this.numerator = (this.numerator * r.denominator) - (this.denominator * r.numerator);
		this.denominator = this.denominator * r.denominator;
	}
	
	public void multiply(RationalNumber r) 
	{
		this.numerator = this.numerator * r.numerator;
		this.denominator = this.denominator * r.denominator;
	}
	
	public void divide(RationalNumber r) 
	{
		this.numerator = this.numerator * r.denominator;
		this.denominator = this.denominator * r.numerator;
	}
	
	public void invert()
	{
		int temp;
		temp = this.numerator;
		this.numerator = this.denominator;
		this.denominator = temp;	
	}
	
	public double toDouble()
	{
		return (double)this.numerator / this.denominator;
	}
	
	public void reduce()
	{
		int gcd = this.gcd(this.numerator, this.denominator);
		this.numerator = this.numerator / gcd;
		this.denominator = this.denominator /gcd;
		System.out.print(this.numerator + "/" + this.denominator);
	}
	
	private int gcd(int a, int b)
	{
		int t = 0;
		
	    while (b != 0) {
	        t = b;
	        b = a % b;
	        a = t;
	    }
        return a;
        
	}
		
	public String toString()
	{
		return "The numerator is " + this.numerator + " and the denominator " + this.denominator;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		RationalNumber myNum = new RationalNumber(6,9);
		myNum.multiply(new RationalNumber(3,9));
		System.out.print(myNum.toString());
	}

}
