
public class AnimalCounterApp {

	public static void count(Countable c, int maxCount) {
		
		for (int i = 0; i < maxCount; ++i) {
			c.incrementCount();
			System.out.println(c.getCountString());
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		System.out.println("Counting Alligators...");
		System.out.println();
		
		//Count an alligator three times
		Alligator a = new Alligator();
		count(a, 3);

		System.out.println("Counting sheep...");
		System.out.println();
		
		Sheep blackie = new Sheep();
		blackie.setName("Blackie");
		count(blackie, 2);
		
		Sheep dolly; 
		try {
			dolly = (Sheep)blackie.clone();
			dolly.setName("Dolly");
					 count(dolly, 3);
		} catch (CloneNotSupportedException e) {
			System.out.println("Error cloning blackie");
		}
		
		
	}

}
