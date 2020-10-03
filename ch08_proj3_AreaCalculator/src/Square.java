
public class Square extends Shape {
	//Fields
		private double width;
		
		//Constructors
		public Square(double width) {
			this.width = width;
		}
		
		//getters and setters
		public double getwidth() {
			return width;
		}
		public void setwidth(double width) {
			this.width = width;
		}
		
		//Overrides
		@Override
		public double getArea() {
			return width * width;
			
		}

	}


