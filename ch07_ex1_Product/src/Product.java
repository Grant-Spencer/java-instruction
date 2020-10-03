import java.text.NumberFormat;

public class Product {

	// Fields, aka member variables, aka instance variables
	private String code;
	private String description;
	private double price;
	
	// Static Variables
	private static int instanceCount = 0;

	// constructors
	public Product() {
		code = "";
		description = "";
		price = 0;
		
		instanceCount++;
	}

	public Product(String codeParam, String descParam, double priceParam) {
		code = codeParam;
		description = descParam;
		price = priceParam;

		instanceCount++;
	}

// Setters and getters
	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

// Helper methods
	public String getPriceFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(price);
	}

	public String getPriceNumberFormatted() {
		NumberFormat numberFormatter = NumberFormat.getNumberInstance();
		numberFormatter.setMaximumFractionDigits(2);
		numberFormatter.setMinimumFractionDigits(2);
		String formatted = numberFormatter.format(price);
		return formatted;
	}

	public void publicProduct(String string) {
		// TODO Auto-generated method stub

	}
// Static methods
	public static int getInstanceCount() {
		return instanceCount;
		
	}
}