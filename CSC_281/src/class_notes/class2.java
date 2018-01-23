package class_notes;
import java.util.Scanner;
public class class2 {

	public static void main(String[] args) {
		double feet;
		String name;
		String name2;
		// TODO Auto-generated method stub
		//Constants in all caps includes keyword final. Constants are constant
		//Scanner ourScanner = new Scanner(System.in); 
		// ourScanner.close();
		//use just next() without spaces. spaces quit the program and store the next word in the variable
		//Double.parseDouble() turns string into double (use int to change to int)
		Scanner ourScanner = new Scanner(System.in);
		System.out.print("do something: ");
		feet = ourScanner.nextDouble();
		System.out.println("Name: ");
		name = ourScanner.next();
		System.out.println(name);
		System.out.println("Name: ");
		name2 = ourScanner.next();
		System.out.println(name2);
		int[] scores1 = {95,85};
		System.out.println(scores1);
		ourScanner.close();
		System.out.println(feet*(double)6.1);
		int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
		System.out.println(intArray);
	}

}
