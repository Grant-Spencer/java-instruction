import java.text.NumberFormat;
import java.util.Scanner;

public class FutureValueApp {

	public static void main(String[] args) {
		System.out.println("The Future Value Calculator\n");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// get the input from the user
			System.out.print("Enter monthly investment:   ");
			double monthlyInvestment = sc.nextDouble();
			System.out.print("Enter number of years:      ");
			int years = sc.nextInt();

			  // convert yearly values to monthly values
            double monthlyInterestRate = interestRate / 12 / 100;
            int months = years * 12;

            // use a for loop to calculate the future value
            double futureValue = 0.0;
            for (int i = 1; i <= months; i++) {
                futureValue = (futureValue + monthlyInvestment) * 
                              (1 + monthlyInterestRate);
            }
            
			NumberFormat percentFormatter = NumberFormat.getPercentInstance();
			percentFormatter.setMinimumFractionDigits(1);
			percentFormatter.setMaximumFractionDigits(1);
			
			System.out.println("Year");
			for (double intRate = 0.05; intRate <= 0.065; intRate += 0.005) {
				System.out.println("\t" + percentFormatter.format(intRate));
			}
			System.out.println();
			
			
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			NumberFormat percent = NumberFormat.getPercentInstance();
			percent.setMinimunFractionDigits(1);
			
			int monthlyInvest = 100;
			System.out.println("Monthly investment: " + currency.format(monthlyInvest) + "\n");
			
			//Create the header row
			String table = "";
			String headerRow = "Year       "
					for (double rate = 0.05; rate <= 0.065 ; rate += 0.005) {
						headerRow += percent.format(rate/100) + "     ";
					}
			table += headerRow + "\n";
			
					
			
			// see if the user wants to continue
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
		System.out.println("Bye!");
	}
}