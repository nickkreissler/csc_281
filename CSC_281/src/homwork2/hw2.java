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