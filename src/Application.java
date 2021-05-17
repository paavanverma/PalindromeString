package src;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Application {

	public static void main(String[] args) {
		
		String checkMore;
		do{
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter a string to check if it is Palindrome: ");
			String inputString = scanner.next();
			
			boolean output = IntStream.range(0, inputString.length() / 2)
								.allMatch(i -> inputString.toLowerCase().charAt(i) == inputString.toLowerCase().charAt(inputString.length() - i - 1));
				
			if(output)
				System.out.println(inputString + " is Palindrome !!");
			else
				System.out.println(inputString + " is not Palindrome !!");
			
			System.out.print("Do you want to check more strings? Enter Yes or No: ");
			checkMore = scanner.next();
		}
		while(checkMore.equalsIgnoreCase("yes"));

		if(!checkMore.equalsIgnoreCase("no"))
			throw new RuntimeException("Invalid input.. Hence exiting !!");
	}
}
