package Session6_Assignment3; // Package containing Binary search algorithm to find an element in an array
import java.util.*;
public class BinarySearchArray {// class declaration containing main method
	public static void main(String[] args) { // Main method declaration
		
		int first,last,middle,array[]; // Variable declaration
		Scanner sc = new Scanner(System.in); // scanner class object to receive input from the user
		
		System.out.println("Enter the number of elements in Array"); // Checking with user for the maximum number of inputs
		int n = sc.nextInt();
		array = new int[n]; // initializing array with the number of inputs as specified by the user
		
		System.out.println("Enter " +n+ " elements in ascending order");
 		for(int i=0;i<n;i++)
 			array[i] = sc.nextInt(); // receiving the user inputs into the array
 		
 		System.out.println("Enter value to find");
 	    int search = sc.nextInt();  // Receiving the search value from the user
 		
 		first = 0;  // Initializing the first, last and middle value of the array
 		last = n-1;  // to formulate the logic of the binary search algorithm
 		middle = (first+last)/2;
 		
 		while( first <= last ) // Using while ensuring search is within the array limit
 	    {
 	      if ( array[middle] < search ) // if the middle value of the array is less than the search value
 	        first = middle + 1;         // then the pointer will be moved to next element to middle
 	      else if ( array[middle] == search )  // otherwise if search value is equal to middle value print it
 	      {
 	        System.out.println(search + " found at location " + (middle + 1) + "."); // Printing the value with the index location
 	        break;
 	      }
 	      else
 	         last = middle - 1; // if not then the last value to be search is one value less than middle
 	  	      middle = (first + last)/2; // reinitializing the middle value
 	   }
 	   if ( first > last ) // checking if the entire list is checked for the search value
 	      System.out.println(search + " is not present in the list.\n"); // then value not present will be printed
	}
}
