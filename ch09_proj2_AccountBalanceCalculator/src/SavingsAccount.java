
public class SavingsAccount extends Account {
	// Fields
	private double monthlyInterestRate;
	private double calculatedInterest;
	
	// Constructors
	
	public SavingsAccount() {
		monthlyInterestRate = 0.0;
		calculatedInterest = 0.0;
	}
	
	public SavingsAccount(double initialBalance, double monthlyInterestRate) {
		super(initialBalance);
		this.monthlyInterestRate = monthlyInterestRate;
		calculatedInterest = 0.0;
	}
	// Gtters
	public double getMonthlyInterestRate() {
		return monthlyInterestRate;
	}
	
	public double getCalculatedInterest() {
		return calculatedInterest;
	}
	//Helpers
	public void applyMonthlyInterest() {
		calculatedInterest = balance * monthlyInterestRate / 100.0;
		balance += calculatedInterest;
		
	}
}
