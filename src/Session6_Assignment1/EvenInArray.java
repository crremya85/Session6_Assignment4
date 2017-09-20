package Session6_Assignment1;

public class EvenInArray { // Class Declaration with an Array 

	public static void main(String[] args) { // Main method which is static and is called first upon program execution
		
		int a[] = new int[10]; // Declaration and initialization of array of size 10
		
		System.out.println("Even Numbers in an Array"); // Prini
		System.out.println("***********************");
			
		for(int i=1;i<10;i++) // for loop for initializing value to the array and checking even number.
		{
			a[i]=i;           // Passing value 1 to 10 to the array initialized
			if(a[i]%2==0)     // Checking if the number is 0
			{
				System.out.println(a[i]+" ");   // if condition evaluates to true even number alone will be printed
			}
		}  // for loop closed here
		
	 } // Main method is closed here

} // Class Declaration ends here
