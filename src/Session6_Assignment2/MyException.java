package Session6_Assignment2; // Package with class extending Exception class to handle exceptions

public class MyException extends Exception{ // Class declaration extending Exception class

	String errorMessage;  // String declared to display user defined exception
	
	public MyException(String errorMessage) // Constructor to pass the message
	{
		this.errorMessage = errorMessage;
	}
	
	public String toString()  // String method to return the error message
	{
		return errorMessage;
	}
}
