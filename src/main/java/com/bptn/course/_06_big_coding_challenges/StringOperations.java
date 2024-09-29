package com.bptn.course._06_big_coding_challenges;

import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
		//create an object called scanner of the Scanner class 
		Scanner scanner = new Scanner (System.in);
        //declare variables to be used collect user's choice.
		int userInput;
		
		do {//setting the do  of the do while loop which allows the conditions to keep running provided input !=6
			//provide the string menu the user can choose from
			System.out.println("/…String Menu…/");
			System.out.println("Press 1 for Palindrome Check");
			System.out.println("Press 2 to reverse a String");
			System.out.println("Press 3 to Concatenate two Strings");
			System.out.println("Press 4 for String Comparison");
			System.out.println("Press 5 to Calculate the Length of String");
			System.out.println("Enter option: ");
			
			
			// To collect the user's choice 
			userInput = scanner.nextInt();
			
			scanner.nextLine(); // we use this to prevent the string input step from beign skipped as the .nextInt() method 
			//does not go to the next line and collect the new string input.
			
			switch(userInput){ //using conditional switch statements to set certain conditions if certain choices are selected from the menu
			case 1:
				//when 1 is selected it will go to the palidrome checker
				
				System.out.println("Palindrome Check");//what displays when a user selects 1
				System.out.println("Enter a string: ");// prompt to allow a user enter a string
				String palindrome = scanner.nextLine();// declaring the palindrome variable as string and equating it to the object. nextLine() method which allow us print the string the user enters
				
				if(palindrome.equals(new StringBuilder(palindrome).reverse().toString())) {//Condition to check if a string is palindrome or not
					System.out.println(palindrome+ " is a palindrome");
					
				}else {
					System.out.println(palindrome+ " is not a palindrome");
				}
				break;
				
			case 2: 
				//when 2  is selected it will go to the reverse string
				
				System.out.println("Reverse a String");//what displays when a user selects 2
				System.out.println("Enter a string: ");// prompt to allow a user enter a string
				String reverseStr = scanner.nextLine();// declaring the reverse string variable as string and equating it to the object. nextLine() method which allow us print the string the user enters
				
				String reversed = new StringBuilder(reverseStr).reverse().toString(); // getting the result of the reverse of the inputed string using StringBuilder
				System.out.println("The reverse of the entered string is: "+ reversed);
				
				break;
				
			case 3:
				//when 3  is selected it will go to the Concatenate two Strings
				
				System.out.println("Concatenate two Strings");//what displays when a user selects 3
				System.out.println("Enter First string: ");// prompt to allow a user enter the first string
				String firstString = scanner.nextLine();// declaring the first string variable as string and equating it to the object. nextLine() method which allow us print the string the user enters
				System.out.println("Enter Second string: ");// prompt to allow a user enter the second string
				String secondString = scanner.nextLine();// declaring the second string variable as string and equating it to the object. nextLine() method which allow us print the string the user enters
				
				String concatenated =firstString + secondString ; //concatenating two strings using the plus operator
				System.out.println("The concatenated string is: "+ concatenated);
				
				break;
				
			case 4:
				//when 4  is selected it will go to the String Comparison
				System.out.println("String Comparison");//what displays when a user selects 4
				System.out.println("Enter First string: ");// prompt to allow a user enter the first string
				String string1 = scanner.nextLine();// declaring the first string variable as string and equating it to the object. nextLine() method which allow us print the string the user enters
				System.out.println("Enter Second string: ");// prompt to allow a user enter the second  string
				String string2 = scanner.nextLine();// declaring the second string variable as string and equating it to the object. nextLine() method which allow us print the string the user enters
				
				if (string1.equals(string2)) {//condition to compare two strings using the equals() method
					System.out.println("The entered strings are equal");
				}else {
					System.out.println("The entered strings are not equal");
				}
				break;
				
			case 5:
				//when 5  is selected it will go to the Calculate the Length of String
				System.out.println("Length of a string");//what displays when a user selects 4
				System.out.println("Enter a string: ");// prompt to allow a user enter a string
				String lengthStr = scanner.nextLine(); //declaring the length string variable as string and equating it to the object. nextLine() method which allow us print the string the user enters
				
				//Deriving the length of a string using the length() method.
				int length =lengthStr.length();//getting the result of the length of the inputed string using length method ()
				System.out.println("The length of the entered string is: "+ length);
				break;
				
			default:
				//Setting the return message for an invalid choice
				System.out.println("Invalid choice! Please make a valid choice.");
				
				scanner.close();
				
			
			
			}
				
			
}while(true); //setting the condition to exit the loop if an invalid choice is made.


	}

}
