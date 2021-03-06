public class CustomerTypeApp {

	public static void main(String[] args) {
		// display a welcome message
		System.out.println("Welcome to the Customer Type Test application\n");

		CustomerType ct = CustomerType.TRADE;
		
		double discPer = getDiscountPercent(ct.TRADE);
		
		System.out.println(discPer);
	}

	public static double getDiscountPercent(CustomerType custType) {
		switch (custType) {
		case RETAIL:
			return 0.1;
		case TRADE:
			return 0.3;
		case COLLEGE:
			return 0.2;
		default: // Shouldn't happen
			return 0.0;
		}
	}
}
