import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Interest Calculator");
		Scanner sc = new Scanner(System.in);
	
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// Get input from user
			System.out.print("Enter loan amount: ");
			BigDecimal loanAmount = sc.nextBigDecimal();
			
			System.out.print("Enter interest rate: ");
			BigDecimal interestRate = sc.nextBigDecimal();
			
			
			// Perform the calculation
			BigDecimal interest = loanAmount.multiply(interestRate);
			interest = interest.setScale(2, RoundingMode.HALF_UP);
			
			
			// Display the results
			NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
			NumberFormat percentFormatter = NumberFormat.getPercentInstance();
			percentFormatter.setMaximumFractionDigits(3);
			
			String loanAmountStr = currencyFormatter.format(loanAmount);
			String interestRateStr = percentFormatter.format(interestRate);
			String interestStr = currencyFormatter.format(interest);
			
			String outputMessage = 
					"Loan Amount: "   	+	 loanAmountStr 	+ "\n" 	+ 
					"Interest Rate: " 	+ 	interestRateStr + "\n" 	+
					"Interest: " 		+ 	interestStr 	+ "\n";
			
			System.out.println(outputMessage);
					
			// Prompt to continue
			System.out.println("continue? (y/n) ");
			choice = sc.next();
		}
				
				
				
				System.out.println("Goodbye");
	}

}
