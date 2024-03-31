// Assignment-1. Write a Java program that reads an input file from the file system and outputs the content 
// of the file character by character. Use FileReader.read() method to read characters from the file. At the end,
// print the total number of characters present in the file. 


import java.io.FileReader;
import java.io.IOException;

public class Lab3_a1 {

	public static void main(String[] args) {
		String path = "";
		int charCount = 0;

		try (FileReader fileReader = new FileReader(path)) {
			int character;
			while ((character = fileReader.read()) != -1) {
				System.out.print((char) character); 
				charCount++;
			}
		} catch (IOException e) {
			System.err.println("Error reading the file: " + e.getMessage());
		}

		System.out.println("\nTotal number of characters in the file: " + charCount);

	}

}