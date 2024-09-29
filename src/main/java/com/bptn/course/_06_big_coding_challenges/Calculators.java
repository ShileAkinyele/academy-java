package com.bptn.course._06_big_coding_challenges;

import java.util.Scanner;

public class Calculators {

	public static void main(String[] args) {
		//create an object called scanner of the Scanner class 
				Scanner scanner = new Scanner (System.in);
		        
				
				//declare variables to be used (used double for firstNumber and secondnumber cos it takes both integer and floating data
				int userInput;
				double num1;
				double num2;
				double result;
				
				do {
				
				//provide the calculator menu the user can choose from
				System.out.println("/…Calculator Menu…/");
				System.out.println("Press 1 for addition");
				System.out.println("Press 2 for subtraction");
				System.out.println("Press 3 for multiplication");
				System.out.println("Press 4 for division");
				System.out.println("Press 5 to square a number");
				System.out.println("Press 6 to find a square root");
				System.out.println("Press 7 to find the reciprocal");
				
				//to accept the user's input 
				userInput = scanner.nextInt();
				
				//setting the conditions for the different possible userinput
				
				if (userInput == 1) {  //input that does an addition
					
					System.out.println("Enter first number: ");
					num1= scanner.nextDouble();
					System.out.println("Enter second number: ");
					num2= scanner.nextDouble();
					result = num1+num2;
					System.out.println("The sum of " + num1 + " and " + num2 + " is "+ result);
							
				}else if (userInput == 2) { //input that does subtraction
					System.out.println("Enter first number: ");
					num1= scanner.nextDouble();
					System.out.println("Enter second number: ");
					num2= scanner.nextDouble();
					result = num1 - num2;
					System.out.println("The difference between " + num1 + " and " + num2 + " is "+ result);
							
				}else if (userInput == 3) { // input that does multiplication
					System.out.println("Enter first number: ");
					num1= scanner.nextDouble();
					System.out.println("Enter second number: ");
					num2= scanner.nextDouble();
					result = num1 * num2;
					System.out.println("The product of the numbers " + num1 + " and " + num2 + " is "+ "= " +result);
						
				}else if (userInput == 4) { // input that does division
					System.out.println("Enter first number: ");
					num1= scanner.nextDouble();
					System.out.println("Enter second number: ");
					num2= scanner.nextDouble();
					
					if (num2 !=0) {
						result= num1 / num2;
						double remainderValue = num1 % num2;
						System.out.println("Dividing " + num1 + " by "+ num2+ " the quotient is "+ result);
						System.out.println("The remainder is "+ remainderValue);
					} else {
						System.out.println("cannot divide by zero.");
						
					}	
					
				}else if (userInput == 5) { // input that squares a number
					System.out.println("Enter a number to find the square: ");
					num1= scanner.nextDouble();
					result = num1 * num1;
					System.out.println("The square of the number "+ num1 + " is "+ "= "+ result);
					
				}else if (userInput == 6) { // input that finds the square root 
					System.out.println("Enter a number to find the Square Root: ");
					num1= scanner.nextDouble();
					if (num1 >=0){
						result = Math.sqrt(num1);
						System.out.println("The Square Root of the number "+ num1 + " is "+ "= "+ result);	
					} else {
						System.out.println("cannot find the square root of a negative number");
					}
					
				}else if (userInput == 7) {// input that finds the Reciprocal
					System.out.println("Enter a number to find the Reciprocal: ");
					num1= scanner.nextDouble();
					if(num1 != 0) {
						result = 1 / num1;
						System.out.println("The Reciprocal of the number "+ num1 + " is "+ "= "+ result);
						
					}else {
						System.out.println("cannot find the Reciprocal of zero ");
					}
					
					
				}else { // setting the invalid choice condition, if none of the above number of choices from calculator menu are selected.
					System.out.println("Invalid choice! Please make a valid choice");
				}
				
				// setting the instruction for  the user to continue or exit 
				System.out.println("To continue calculation press 1, else press any other number to exit");
				userInput = scanner.nextInt();
				
			}while (userInput==1);
			
			   //Ending the program
		       System.out.println("Exiting the calculator ...");
		       scanner.close();
					

	}

}
