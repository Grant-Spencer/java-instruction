
public class Rectangle extends Square {
	//Fields
		private double height;
		
		//Constructors
		public Rectangle(double width, double height) {
			super(width);
			this.height = height;
		}
		
		//getters and setters
		public double getHeight() {
			return this.height;
		}
		public void setheight(double height) {
			this.height = height;
		}
		
		//Overrides
		@Override
		public double getArea() {
			return this.getwidth() * height;
			
		}

	}

