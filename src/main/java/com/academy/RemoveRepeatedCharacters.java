package com.academy;



		import java.util.Scanner;

		public class RemoveRepeatedCharacters {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a string: ");
		        String input = scanner.nextLine();

		        StringBuilder result = new StringBuilder();

		        for (char c : input.toCharArray()) {
		            if (result.indexOf(String.valueOf(c)) == -1) {
		                result.append(c);
		            }
		        }

		        System.out.println("String with repeated characters removed: " + result.toString());

		        scanner.close();
		    }
		}

	

