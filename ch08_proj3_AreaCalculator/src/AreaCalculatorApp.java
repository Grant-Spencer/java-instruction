
public class AreaCalculatorApp {

	private static void printArea(String shapeName, Shape shape) {
		System.out.println("The area of the " + shapeName + "you entered is " + shape.getArea());
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Area Calculator");

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			String csr = Console.getString("Calculate area of circle, square or rectangle? (c/s/r)");

			switch (csr) {
			case "c":
			case "C":
				double radius = Console.getDouble("enter radius: ");
				Circle circle = new Circle(radius);
			//	System.out.println("The area of the Circle you entered is " + circle.getArea());
				printArea("Circle", circle);
				
				break;

			case "s":
			case "S":
				double width = Console.getDouble("enter width: ");
				Square square = new Square(width);
			//	System.out.println("The area of the Square you entered is " + square.getArea());
				printArea("Square", square);
				break;

			case "r":
			case "R":
				width = Console.getDouble("enter width: ");
				double height = Console.getDouble("Enter Height: ");
				Rectangle rectangle = new Rectangle(width, height);
			//	System.out.println("The area of the Rectangle you entered is " + rectangle.getArea());
				printArea("Rectangle", rectangle);
				break;
			}
			
		}
	}
}
