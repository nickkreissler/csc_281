package homework1;

public class DiceProb {

	public static void main(String[] args) {
		int rounds = 1000;
		int r = 5;
		int total = 0;
		int z = 0;
		int x;
		// Declare extra variables here
		
		// Roll two 6-sided dice as many times as necessary to get a total of r 
		// rounds number of times
		// E.g. if r is 5 and rounds is 1000, we want to roll two dice as many times
		// as needed until we've seen a sum of 5 precisely 1000 times
		// The rolling of the dice will be doing using a call to rollDice
		// Don't duplicate that code in the main
		while (z < 1000) {
			x = rollDice();
			if (x == r) {
				z++;
		}
		total++;
	}
		System.out.println("It took " + total + " rounds to reach " + rounds + " rolls of " + r + ".");

	}
	
	public static int rollDice() {
		int x =(int) (1+ (Math.random()*6));
		int y =(int) (1+ (Math.random()*6));
		// A stub
		// Re-write this to simulate rolling two 6-sided die and return the sum of the rolls
		return (x+y);
		
	}

}
