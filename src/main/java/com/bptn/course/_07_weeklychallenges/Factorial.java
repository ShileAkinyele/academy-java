package com.bptn.course._07_weeklychallenges;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		//create an object called scanner of the Scanner class 
				Scanner scanner = new Scanner (System.in);
				
				System.out.println("Enter a number to find its factorial: ");// prompt to allow a user enter a number
				int number = scanner.nextInt(); //to accept the user's input 
				
				if (number<0) {
					System.out.println("Factorial is not defined for negative numbers.");
					
				}else {
					long factorial =1; //declaring the factorial variable as a long data type and equating to one as the factorial of 0 is equal to 1
					
					//writing for loop to calculate the factorial
					for (int i=1; i <= number; i++) {
						factorial *=i; 
					}
					
					//printing out the result
					System.out.println("The factorial of " + number+ " is "+ factorial);
					
					//close the scanner
					scanner.close();
				}
				
				

	}

}
