package Session6_Assignment2;
import java.util.*;

public class ExceptionHandling { // Class declaration with the main method for handling Negative age

	public static void main(String args[]) // Main method declaration
	{
	Scanner sc = new Scanner(System.in); // Scanner class object initialization to receive input from user
	
	System.out.println("Enter Your Age"); // Receiving input from user
	int age = sc.nextInt();
	
	try                       // try block to check the exception
	{
		if(age<0)             // Checking if user input is less than 0  
		{
			throw new MyException("Age Cannot be Negative!!"); // if condition is true the user-defined Exception will be called
		}
	}	  // try block ends here
		catch(MyException ex) // Catch block where object is created for the exception class and the method is called 
		{
			System.out.println(ex);
		}
	}	 // main method ends here
  
}// Class declaration ends here

