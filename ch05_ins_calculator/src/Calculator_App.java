import java.util.Scanner;

class Calculator_App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String choice;
		
		do {
			System.out.println("Enter first operand: ");
			int operand1 = sc.nextInt();
			System.out.println("Enter second operand: ");
			int operand2 = sc.nextInt();
			System.out.println("Enter operation (+ - * /) : " );
			String operation = sc.next();
			
			int answer = 0;
			switch (operation ) {
			case "+":
				answer = sum(operand1, operand2);
				break;
			case "-":
				answer: difference(operand1, operand2);
			break;
				default:
					System.out.println("Unknown operation");
			}
			
			System.out.println("The answer is " + answer);
			
			System.out.println("Continue? (y/n) ")
			; choice = sc.next();
		} while (choice.equalsIgnoreCase("y"));
	}
private static int sum(int op1, int op2) {
	System.out.println("In Sum method");
	
	int result = op1 + op2;
	
	return result;
}
}

private static int difference(int op1, int op2 ) {
	int result = op1 - op2;
	return result;
}