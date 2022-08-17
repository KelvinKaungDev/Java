package AssigmentSeven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class GraduateStduent extends Students{
	
	private int firstTestResult;
	private int secondTestResult;
	private int thirdTestResult;
	private float avageScore;
	
	private String grade;
	private String subOne;
	private String subTwo;
	private String subThree;

	public GraduateStduent(String type, String fristName, String lastName, String subOne, String subTwo, String subThree,int firstResult, int  secondResult, int thirdResult) {
		super(type, fristName, lastName);
		
		this.setFirstTestResult(firstResult);
		this.setSecondTestResult(secondResult);
		this.setThirdTestResult(thirdResult);
		
		this.setSubOne(subOne);
		this.setSubTwo(subTwo);
		this.setSubThree(subThree);
		
		calculateAvgScore();
		calculate(this.grade);
	}

	public int getFirstTestResult() 
	{
		return firstTestResult;
	}

	public void setFirstTestResult(int firstTestResult) 
	{
		if(firstTestResult > 100 || firstTestResult < 0) 
		{
			this.firstTestResult = 0;
		} else 
		{
			this.firstTestResult = firstTestResult;
		}
	}

	public int getSecondTestResult() 
	{
		return secondTestResult;
	}

	public void setSecondTestResult(int secondTestResult) 
	{
		if(secondTestResult > 100 || secondTestResult < 0) 
		{
			this.secondTestResult = 0;
		} else 
		{
			this.secondTestResult = secondTestResult;
		}
	}

	public int getThirdTestResult() 
	{
		return thirdTestResult;
	}

	public void setThirdTestResult(int thirdTestResult) 
	{
		if(thirdTestResult > 100 || thirdTestResult < 0) 
		{
			this.thirdTestResult = 0;
		} else
		{
			this.thirdTestResult = thirdTestResult;
		}
	}
	

	public String getSubTwo() {
		return subTwo;
	}

	public void setSubTwo(String subTwo) {
		this.subTwo = subTwo;
	}

	public String getSubOne() {
		return subOne;
	}

	public void setSubOne(String subOne) {
		this.subOne = subOne;
	}

	public String getSubThree() {
		return subThree;
	}

	public void setSubThree(String subThree) {
		this.subThree = subThree;
	}
	
	public void calculateAvgScore() 
	{
		int allResult = this.firstTestResult + this.secondTestResult + this.thirdTestResult;
		this.avageScore = allResult / 3;
		
		if( this.avageScore >= 90 ) 
		{
			this.grade = "S";
		} else 
		{
			this.grade = "U";
		}
	}
	
	public void calculate(String grade) 
	{
		if(this.grade == "U")
		{
			System.out.println( "You are Graduate Student. Your currently score is " + this.avageScore + " and under 90 .So, You are failed");
		} else
		{
			System.out.println( "You are Graduate Student. Your currently score is " + this.avageScore + " and under 90 .So, You are passed");
		}
	}
	
	public float getAvageScore()
	{
		return this.avageScore;
	}
	
	public String getGrade()
	
	{
		return this.grade;
	}
	
	
	public static void main (String args[]) throws FileNotFoundException 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Your Grade : ");
		String grade = scanner.nextLine();
		
		System.out.println("Enter Your First Name : ");
		String firstName = scanner.nextLine();
		
		System.out.println("Enter Your Last Name : ");
		String lastName = scanner.nextLine();
		
		System.out.println("Enter Your First Subject Name : ");
		String firstSub = scanner.nextLine();
		
		System.out.println("Enter Your Second Subject Name : ");
		String secondSub = scanner.nextLine();
		
		System.out.println("Enter Your Third Subject Name :");
		String thirdSub = scanner.nextLine();
		
		System.out.println("Enter Your first subject result : ");
		int firstResult = scanner.nextInt();
		
		System.out.println("Enter Your second subject result : ");
		int secondResult = scanner.nextInt();
		
		System.out.println("Enter Your third subject result : ");
		int thirdResult = scanner.nextInt();
		
		GraduateStduent students = new GraduateStduent(grade, firstName, lastName, firstSub, secondSub, thirdSub, firstResult, secondResult, thirdResult);

		ArrayList<GraduateStduent> student = new ArrayList<>();
		
		File csvFile = new File("Graduate.csv");
		PrintWriter out = new PrintWriter(new FileOutputStream(csvFile, true /* append = true */)); 
		
		student.add(students);
		
		for (GraduateStduent graduate : student)
		{
			out.printf("%s, %s, %s, %s, %s, %s, %d, %d, %d, %f, %s\n", graduate.getType(), graduate.getFirstName(), graduate.getLastName(), graduate.getSubOne(), graduate.getSubTwo(), graduate.getSubThree(), graduate.getFirstTestResult(), graduate.getSecondTestResult(), graduate.getThirdTestResult(), graduate.getAvageScore(), graduate.getGrade());
		}
		
		out.close();
	}
}
