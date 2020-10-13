package spencer.app;

import java.time.LocalDate;

import spencer.business.Reservation;

public class ReservationCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Reservation Calculator");

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			LocalDate arrivalDate = Console.getLocalDate("arrival");
			LocalDate departureDate = Console.getLocalDate("departure");

			Reservation res = new Reservation(arrivalDate, departureDate);

			System.out.println("Arrival date: " + res.getArrivalDateFormatted());
			System.out.println("Departure date: " + res.getDepartureDateFormatted());
			System.out.println("Price: " + res.getPricePerNightFormatted());
			System.out.println("Total Price: " + res.getTotalPriceFormatted() + " for " + res.getNumberOfNights());
			System.out.println();

			choice = Console.getString("Continue? (y/n)");
		}
	}

}
