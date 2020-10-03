import java.text.NumberFormat;

public class Rectangle {

	// Fields
	private double length;
	private double width;

	// Constructors
	public Rectangle() {
		length = 0.0;
		width = 0.0;

	}
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	// Setters & Getters
	public void setLength(double length) {
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getWidth() {
		return width;
	}

	// Helper Method

	public double getArea() {
		double area = width * length;
		return area;
	}

	public double getPerimeter() {
		double Perimeter = (length * 2) + (width * 2);
		return Perimeter;
	}

	public String getAreaFormatted() {
		double area = this.getArea();
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMinimumFractionDigits(3);
		String numberFormatted = number.format(number);
		return numberFormatted;
	}

	public String getPerimeterFormatted() {
		double perimeter = this.getPerimeter();
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMinimumFractionDigits(3);
		String numberFormatted = number.format(perimeter);
		return numberFormatted;
	}
}
