

public class Instruction_App {

	public static void main(String[] args) {
		double curVal = 5000;
		double monthInv = 100;
		double yearlyIntRate = 0.12;
	
	curVal = (curVal + monthInv) * (1 + yearlyIntRate / 12);
	
	System.out.println(curVal);
	}
	
	
//public static void main(String[] args) {
//		char letter1 = 'C';
//		
//		letter1++;
//		
//		System.out.println(letter1);
//		
//		
//}
//
//
////
//	public static void main(String[] args) {
//		int x = 7;
//		int y = 3;
//		
//		int remainder = x % y;
//		System.out.println(remainder);
//		
//		
//		double dblx = 7.0;
//		double dbly = 3.0;
//		
//		double divResult = dblx / dbly;
//		System.out.println(divResult);
//		
//		}
//	}

}
