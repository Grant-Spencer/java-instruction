
public class SwitchExampleApp {

	public static void main(String[] args) {
		String productCode = "hm01";
		String productDescription;
		
		if (productCode.equals("hm01")) {
			productDescription = "Hammer";
		}
		else if (productCode.equals("bn01")) {
			productDescription = "Box of Nails";
		}
		else {
			productDescription = "Product not found";
		}
		System.out.println("productDescription via if/else: " + productDescription);
		
		switch (productCode ) {
		case "hm01":
			productDescription = "Hammer";
			break;
		case "bn01":
			productDescription = "Box of Nails";
			break;
		default:
			productDescription = "Product not found";
			break;
			
		}
		System.out.println("productDescription via switch "+ productDescription);
	}
	
	

}
