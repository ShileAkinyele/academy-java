package com.bptn.course._02_scanner;

import java.util.Scanner;

public class NegativeNumbers {

	public static void main(String[] args) {
		//Declare Variable In the main method, declare an integer variable to store the user’s input.
				int choice;
				
				//Create Scanner Object Instantiate a Scanner object to read user input.
				Scanner myObj = new Scanner(System.in);
				
				// Prompt User Display a message prompting the user to enter a number.
				System.out.println("Enter a number:" );
				
				//Use the appropriate method from the Scanner object to read the user’s input and store it in the declared variable.
				choice = myObj.nextInt();
				
				//Check for Positive or Negative: Create conditions to determine if the entered number is positive or negative.
				if (choice > 0) {
					System.out.println("positive number");
				}else if (choice < 0) {
					System.out.println("negative number");
				}else {
					System.out.println("number is zero");
					
				}
				//Print Result: Print a message indicating whether the number is positive or negative.
				System.out.println("The number is "+ choice);
				
				// close the scanner
				myObj.close();


	}

}
