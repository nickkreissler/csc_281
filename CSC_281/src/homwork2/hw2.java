//Nick Kreissler

//Collaborators = 0

package homwork2;


import java.util.Scanner;

public class hw2 {

	public static void main(String[] args) {
		try
		{
			int [] ages = enterAges();
			System.out.println("The ages:");
			printArray(ages);
			System.out.println("The number of ages >= 20: " + countValues(ages, 20));
			System.out.println("The number of ages >= 50: " + countValues(ages, 50));
			System.out.println("TEST:");
			Scanner jon = new Scanner(System.in);
			int fas = jon.nextInt();
			System.out.println(fas);
			jon.close();
			// A call that will cause problems for a non-empty, positive ages array
			//System.out.println("The number of ages >= -1: " + countValues(ages, -1)); // line 1
			// Two arrays that will cause problems -- put them into your code to test that
			// the method that counts ages handles erroneous arrays correctly
			// The line numbers are referenced in the assignment description
			//int [] empty = new int[0]; // line 2
			//System.out.println("The count for empty is: " + countValues(empty, 0)); // line 3
			//int [] incorrect = {23, 8, -1}; // line 4
			//System.out.println("The count for incorrect is: " + countValues(incorrect, 0)); // line 5
		}
		catch (IllegalArgumentException exception)
		{
			System.out.println("The computation of the count failed.");
			System.out.println(exception);
		}
	}
	
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
		return l;
	}

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
		return x;
	}
}