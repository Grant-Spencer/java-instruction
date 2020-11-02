package prs.ui;

import java.util.List;

import prs.busines.Product;
import prs.db.ProductDb;
import prs.db.UserDb;
import prs.exception.PrsDataException;

public class PrsApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the PRS App");
		System.out.println();

		System.out.println("COMMANDS");
		System.out.println("loging - Login");
		System.out.println("logout - Logout");
		System.out.println("prod_la - List all products");
		System.out.println("exit - Exit the application");
		System.out.println();

		User authenticatedUser = null;

		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
			command = Console.getString("Enter command: ");

			if (command.equalsIgnoreCase("login")) {
				authenticatedUser = login();

				if (authenticatedUser == null) {
					System.out.println("Username/password not found");
				} else {
					System.out.println("Welcome, " + authenticatedUser.getFirstName());
				}
			} else if (command.equalsIgnoreCase("logout")) {
				authenticatedUser = null;
			} else if (authenticatedUser != null) {

			}
			switch (command.toLowerCase()) {
			case "login":
				login();
				break;

			case "prod_la":
				listProducts();
				break;

			case "prod_a":
				addProduct();
				break;

			case "user_la":
				listUsers();
				break;

			case "exit":
				// Nothing to do
				break;
			default:
				System.out.println("Invalid command");
				break;
			}
		}

	}

	private static void listProducts() {
		try {
			ProductDb productDb = new ProductDb();
			List<Product> products = productDb.getAll();

			for (Product product : products) {
				System.out.println(product);
			}
			System.out.println();
		} catch (PrsDataException e) {
			System.err.println("Couldn't retrieve products. Msg: " + e.getMessage());
		}
	}

	private static User login() {
		try {
			String userName = Console.getString("User Name: ");
			String password = Console.getString("Password: ");

			UserDb userDb = new UserDb();
			User user = userDb.autheticateUser(userName, password);

			return user;
		} catch (PrsDataException e) {
			System.err.println("Error logging in. Msg: " + e.getMessage());
			return null;
		}
	}

	private static void listProducts() {
		try {
			productDb product Db = new ProductDb();
			List<Product> products = productDb.getAll();
			
			System.out.println("Products:");
			for (Product product : products) {
				System.out.println(product);
				}
			System.out.println();
		}
	}
}