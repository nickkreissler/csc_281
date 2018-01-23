
import java.util.*;

// Put your name here
// Put your collaboration statement here

public class Hw2 {

	// Do not modify this method, except to comment and uncomment test code
	public static void main(String[] args) {
		
		try
		{
			int [] ages = enterAges();
			System.out.println("The ages:");
			printArray(ages);
			System.out.println("The number of ages >= 20: " + countValues(ages, 20));
			System.out.println("The number of ages >= 50: " + countValues(ages, 50));
			// A call that will cause problems for a non-empty, positive ages array
			//System.out.println("The number of ages >= -1: " + countValues(ages, -1)); // line 1
			// Two arrays that will cause problems -- put them into your code to test that
			// the method that counts ages handles erroneous arrays correctly
			// The line numbers are referenced in the assignment description
			//int [] empty = new int[0]; // line 2
			//System.out.println("The count for empty is: " + countValues(empty, 0)); // line 3
			//int [] incorrect = {23, 8, -1}; // line 4
			//System.out.println("The count for incorrect is: " + countValues(incorrect, 0)); // line 5
			//System.out.println("The 
		}

		catch (IllegalArgumentException exception)
		{
			System.out.println("The computation of the count failed.");
			System.out.println(exception);
		}
	}
	
	// A method that prints a 1D int array to standard output, all on one line with commas between each element
	public static void printArray(int[] output) {
	
	}

	// A method that enters ages from the user into an array
	// It forces the user to enter positive values for the number of elements and
	// non-negative values for the ages
	public static int[] enterAges() {
			Scanner scanner = new Scanner(System.in);
			int x = -1;
			while (x < 0) {
				System.out.println("How long is the array: ");
				x = scanner.nextInt();
				
				
				}
			
			int[] l = new int[x];
			
			
			for (int i = 0; i < l.length; i++) {
				System.out.println("Enter an age: ");
				while (scanner.nextInt() < 0) {
					System.out.println("Enter an age greater than 0: ");
				}
				l[i] = scanner.nextInt();
			
				
			}
		scanner.close();
		// A stub -- remove when you implement the method
		return new int[0];
	}

	// A method that returns the number of ages greater than or equal to value in
	// the array ages
	// If an empty array or an array with negative values is passed as a parameter
	// it raises an IllegalArgumentException
	// If value is < 0 it also raises an IllegalArgumentException
	public static int countValues(int [] ages, int value) throws IllegalArgumentException {
		
		// A stub -- remove when you implement the method
		return 0;
	}
}