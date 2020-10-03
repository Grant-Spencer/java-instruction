
public class Employee extends Person {
	
	//Fields
	private String ssn;
	//Constructors
	public employee(String firstName, String lastName, String ssn) {
		super(firstName, lastName);
		this.ssn = ssn;
		
	}
	//Getters and setters
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	//Overrides
	@Override
	public String toString() {
		String maskedSsn = "xxx-xxxx-" + ssn.substring(ssn.length() - 4);
	}
}
