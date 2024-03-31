// Create a program that reads a list of strings and concatenates them into a single string using the Stream API.
// Avoid using lambda expressions for concatenation


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lab3_a4 {

	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("Greetings ", "Sir/Madam, ", "Have a nice", " day.");
		System.out.println("Concatenated string: " + stringList.stream().collect(Collectors.joining()));

	}

}