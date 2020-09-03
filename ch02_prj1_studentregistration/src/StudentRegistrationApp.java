import java.util.Scanner;

public class StudentRegistrationApp {

	public static void main(String[] args) {
		//welcome message
		System.out.println("Student Registration Form");
		Scanner sc = new Scanner(System.in);
		
		//get user input
		System.out.print("Enter first name: ");
		String firstName = sc.next() ;
		System.out.print("Enter last name: ");
		String lastName = sc.next();
		System.out.println("Enter year of birth");
		int year = sc.nextInt();
		
		//biz logic
		String tempPwd = firstName + "*" +year;
		
		//display output
		System.out.println("Welcome "+firstName+" "+lastName+"!");
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is: "+tempPwd);
		
		//goodbye
		System.out.println("Goodbye");
		
	}

}
