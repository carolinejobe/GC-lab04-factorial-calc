import java.util.Scanner;

/**
 * @author Caroline
 * Calculates the factorial of an integer from 1 to 10.
 */
public class Lab4FactorialCalc {

	static Scanner input = new Scanner(System.in);
	static String play;
	
	public static void main(String[] args) {

		System.out.println("Wecome to the Factorial Calculator!");
		play = "y";	//initialize object to enter while loop

		while (play.equalsIgnoreCase("y")) {
			
			int answer = getRangedInteger();  //get valid input from the user that is btwn 1-10

			System.out.println("The factorial of " + answer + " is equal to " + calculateFactorial(answer) + ".");
			System.out.println("You can also get " + getFactorialWithRecursion(answer) + " using recursion.");
			continueOrQuit(input);
		}
		System.out.println("Happy Birthday Kamel!");
	}
	
	//calculate factorial of user input using for loop
	private static long calculateFactorial(int answer) {
		long result = 1;
		for (int i = 1; i <= answer; i++) {
			result = result * i;
		}
		return result;
	}
	
	//calculate factorial of user input using recursion
	private static int getFactorialWithRecursion(int answer) {
		if (answer>1) {
			answer = answer * getFactorialWithRecursion(answer-1);
		}
		else {
			return 1;
		}
		return answer;
	}

	//prompt user to continue or not. initialized to "y"
	private static void continueOrQuit(Scanner input) {
		System.out.println("Would you like to enter another number? (y/n)");
		play = input.next();
	}

	//get int from user input
	private static int getInteger(String question) {
		System.out.println(question);
		while (!input.hasNextInt()) {
			System.out.println("You have entered invalid data. Please enter a whole number. ");
			input.next();
		}
		int answer = input.nextInt();
		return answer;
	}

	//get int 1-20 from user input
	private static int getRangedInteger() {
		int answer = getInteger("Enter a number between 1 and 10: ");
		while (answer > 10 || answer < 1) {
			answer = getInteger("Please enter a positive, whole number less than or equal to 10.");
		}
		return answer;
	}
}
