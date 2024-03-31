/*Assignment-2. Write a Java program that reads two numbers from the console.  
Add two numbers and print the output on the console. Use java.io.Console Class to read lines from the console.
Convert the Strings to numbers before carrying out the mathematical operations.*/


import java.io.Console;

public class Lab3_a2 {

	public static void main(String[] args) {
		
		Console c = System.console();
		if (console == null) {
			System.err.println("No console.");
			System.exit(1);
		}

		// accepting string input from user
		String input1 = c.readLine("Enter the first number: ");
		String input2 = c.readLine("Enter the second number: ");

		try {
			
			double num1 = Double.parseDouble(input1);
			double num2 = Double.parseDouble(input2);

			double sum = num1 + num2;

			console.printf("Sum of %.2f and %.2f is: %.2f%n", num1, num2, sum);
		} catch (NumberFormatException e) {
			console.printf("Invalid input. Please enter valid numbers.%n");
		}

	}

}