package AssigmentSeven;

public class Students {
	
	private String type;
	private String firstName;
	private String lastName;

	public Students(String type, String fristName, String lastName)
	{
		this.type = type;
		this.firstName = fristName;
		this.lastName =lastName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
