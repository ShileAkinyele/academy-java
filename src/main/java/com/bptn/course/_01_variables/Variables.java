package com.bptn.course._01_variables;

public class Variables {

	public static void main(String[] args) {

		//DECLARING FIRST AND SECOND NUMBER 
				int firstNumber = 40;
				int secondNumber = 20;
				//PERFORMING ARITHMETIC OPERATIONS
				
				//Addition
				int sumNumber = firstNumber + secondNumber;
				
				//Subtraction
			    int minusNumber = firstNumber - secondNumber;
				
				//Multiplication
				int timesNumber = firstNumber * secondNumber;
				
				//Division
				int divideNumber = firstNumber / secondNumber;
				
				//Modulus
				int modulus = firstNumber % secondNumber;
				
				//PRINTING OUT RESULTS
				System.out.println("number1 is "+firstNumber);
				System.out.println("number2 is " +secondNumber);
				System.out.println("number2 plus number1 is " +sumNumber);
				System.out.println("number2 minus number1 is " +minusNumber);
				System.out.println("number2 times number1 is " +timesNumber);
				System.out.println("number2 divided by number1 is " +divideNumber);
				System.out.println("modulus  is " + modulus);
				
				
				//Reassigning values 
				firstNumber = 50;
				secondNumber = 20;
				
				//printing newly assigned values 
				
				System.out.println("number1 is "+firstNumber);
				System.out.println("number2 is " +secondNumber);
				
				//Declaring a character and string variable 
				char grade = 'B';
				String name = "shileola";
				
				//printing the character and string variables
				System.out.println("grade is "+grade);
				System.out.println("name is " +name);
				
				
	}
}
