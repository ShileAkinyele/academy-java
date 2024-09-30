package com.bptn.course._06_big_coding_challenges;

import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		//create an object called scanner of the Scanner class 
				Scanner scanner = new Scanner (System.in);
				
				//since the number needed to be guessed has been given as 23 assign it to a variable called target number,this will be the number the user has to guess
				int targetNumber = 23;
				
				//will create a while true loop which will allow the user to guess a number of times and will only break when the user guesses 23
				while (true) {
					
					System.out.print("Enter your guess (between 1 and 100): "); //prompt to tell user to enter their guess
					int numberGuessed = scanner.nextInt(); ////to accept the user's guess
					
					//ensure guess is between 1 and 0 by setting an if condition which checks if the guess is less than one or greater then 100
					if (numberGuessed <1 || numberGuessed > 100) {
						System.out.println("Please enter a number between 1 and 100.");//message to print out if guess is not within range
						
						continue; // this will prevent the rest of the loop from executing if the guess does not meet the criteria 
						
					}
					
					if (numberGuessed < targetNumber ) {//comparing the numberguessed to the target number and setting return statements
						System.out.println("Too low! Try again.");
						
					}else if (numberGuessed > targetNumber ) {
						System.out.println("Too high! Try again.");
						
					}else {
						System.out.println("Congratulations! You guessed the number correctly!");
						break; 
					}
					
					
					
				}

				//close the scanner
				scanner.close();

	}

}
