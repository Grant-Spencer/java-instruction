package spencer.ui;

import java.util.Scanner;

public class Console {

	private static Scanner sc = new Scanner(System.in);

	public static void displayLine() {
		System.out.println();
	}

	public static String getString(String prompt) {
		System.out.print(prompt);
		String s = sc.next(); // read user entry
		sc.nextLine(); // discard any other data entered on the line
		return s;
	}

	/**
	 * 
	 * @param s
	 */
	public static void displayLine(String s) {
		System.out.println(s);
	}

	/**
	 * Prompts the user for a String
	 * 
	 * @param prompt The prompt to display before getting input
	 * @return The String entered by the user
	 */
	public static String getString(String prompt, String allowedValOne, String allowedValTwo) {
		String value = "";
		boolean isValid = false;
		while (!isValid) {
			value = getString(prompt);
			if (value.equalsIgnoreCase(allowedValOne) || value.equalsIgnoreCase(allowedValTwo)) {
				isValid = true;
			} else {
				System.out.println("Invalid entry, please enter " + allowedValOne + " or " + allowedValTwo);
			}
			;
		}

		return value;
	}

	public static int getInt(String prompt) {
		int i = 0;
		while (true) {
			System.out.print(prompt);
			try {
				i = Integer.parseInt(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Error! Invalid integer. Try again.");
			}
		}
		return i;
	}

	public static double getDouble(String prompt) {
		double d = 0;
		while (true) {
			System.out.print(prompt);
			try {
				d = Double.parseDouble(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Error! Invalid decimal. Try again.");
			}
		}
		return d;
	}
}