package homework;

import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			int [] empty = new int[0]; // line 2
			System.out.println("The count for empty is: " + countValues(empty, 0)); // line 3
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
		for (int i = 0; i < output.length; i++) {
			if (i == output.length-1) {
				System.out.print(output[i]);
			}
			else {
			System.out.print(output[i] + ", ");
			}
		}
	System.out.println();
	}

	// A method that enters ages from the user into an array
	// It forces the user to enter positive values for the number of elements and
	// non-negative values for the ages
	public static int[] enterAges() {
			Scanner scanner = new Scanner(System.in);
			int x = 0;
			int y;
			while (x <= 0) {
				System.out.print("How many ages (> 0) are there? ");
				x = scanner.nextInt();
				}
			
			int[] l = new int[x];
			
			for (int i = 0; i < l.length; i++) {
				System.out.print("Enter a non-negative (>= 0) age: ");
				y = scanner.nextInt();
				while (y < 0) {
					System.out.println("Im sorry but that value was negative.");
					System.out.print("Enter a non-negative (>= 0) age: ");
					y = scanner.nextInt();
				}
				
				l[i] = y;	
			}
			
		scanner.close();
		// A stub -- remove when you implement the method
		return l;
	}

	// A method that returns the number of ages greater than or equal to value in
	// the array ages
	// If an empty array or an array with negative values is passed as a parameter
	// it raises an IllegalArgumentException
	// If value is < 0 it also raises an IllegalArgumentException
	public static int countValues(int [] ages, int value) throws IllegalArgumentException {
		if (value < 0) {
			throw new IllegalArgumentException("Negative Value Provided");
		}
		if (ages.length == 0) {
			throw new IllegalArgumentException("Empty Array Provided");
		}
	
		int x = 0;
		for (int i = 0; i < ages.length; i++) {
			if (ages[i] < 0) {
				throw new IllegalArgumentException("Negative Age Provided");
			}
			if (ages[i] >= value) {
				x++;
			}
		}
		// A stub -- remove when you implement the method
		return x;
	}
}