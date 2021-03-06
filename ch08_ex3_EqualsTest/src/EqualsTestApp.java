public class EqualsTestApp {

    public static void main(String args[]) {
        System.out.println("Welcome to the Equals Tester\n");

        //Both variables refer to different objects that store the same data
        Product product1 = new Product();
        Product product2 = new Product();

        if (product1.equals(product2)) {
            System.out.println("The Product class is comparing data.");
        } else {
            System.out.println("The Product class is comparing references.");
        }

        //Both variables refer to different objects that store the same data
        LineItem li1 = new LineItem();
        li1.setProduct(product1);
        LineItem li2 = new LineItem();
        li2.setProduct(product2);
        if (li1.equals(li2)) {
            System.out.println("The LineItem class is comparing data.");
        } else {
            System.out.println("The LineItem class is comparing references.");
        }

        System.out.println();
    
    boolean prodEqualsLineItem = product1.equals(li1);
    System.out.println("product1.equals(li1) returned " + prodEqualsLineItem);
    }
    @Override
    	public boolean equals(Object object) {
		if (object instanceof LineItem) {
			LineItem other = (LineItem) object;
			if (product.equals(other.getProduct()) && quantity == other.getQuantity()) {
				return true;
			}
		}
		return isEquals;
	}
    }
}
