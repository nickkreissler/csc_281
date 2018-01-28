package homework3;
import java.util.*;

public class Hw3 {
	
		// Do not modify this method
		// When you have corrected the getLargest method this method will be fine as is
		public static void main(String[] args) {
			Scanner aScan = new Scanner(System.in);
		
			System.out.println("How many cities are there? ");
			int max = getPosInt(aScan);
	
			String[] cities = getCities(max, aScan);
			System.out.println("The maximum city (alphabetically) you entered is: ");
			System.out.println(getLargest(cities));
			
			aScan.close();	
		}
		
		// Write this method
		public static int getPosInt(Scanner theScan) {
			
			System.out.println("Entering the getPosInt method ...");
			// Put code here to complete the method as described
			System.out.print("Enter a positive (> 0) whole number: ");
			
			int x = theScan.nextInt();
			
			while (x < 0) {
				System.out.println("Please enter a positive (> 0) number.");
				System.out.print("Enter a positive (> 0) whole number:");
				x = theScan.nextInt();
				
			}
			System.out.println("Leaving the getPosInt method ...");
			// The following is a stub -- delete it and replace it with the correct return
			return x;
		}
		
		// Write this method
		public static String[] getCities(int m, Scanner theScan) {
			String[] cities = new String[m];
			
			System.out.println("Entering the getCities method ...");
			// Put code here to complete the method as described
			theScan.nextLine();
			for (int i = 0; i < m; i++) {
				System.out.print("Enter a city: ");
				cities[i] = theScan.nextLine();
			
				
			}
			System.out.println("Leaving the getCities method ...");
			// The following is a stub -- delete it and replace it with the correct return
			return cities;
		}
		
		// The method below contains compilation and runtime errors which you 
		// should: 1. correct and 2. mark so that I can see the changes you've made.
		// Do not change the basic functioning of the method -- just make it run.
		// There are a total of five mistakes
		public static String getLargest(String[] sArray) {
			System.out.println("Entering the getLargest method ...");
			int maxPos = 0;
			for (int index = 1; index < sArray.length; index++)
	    	{
	        	if (sArray[index].compareTo(sArray[maxPos]) > 0) 
	            	maxPos = index;
	    	}
			System.out.println("Leaving the getLargest method ...");
			return sArray[maxPos];
}
}
	


