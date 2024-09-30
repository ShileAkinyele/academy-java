package com.bptn.course._06_big_coding_challenges;

import java.util.Scanner;

public class PluralForm {

	public static void main(String[] args) {
		//create an object called scanner of the Scanner class 
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter the number: ");// prompt to allow user input number
		
		int amt = scanner.nextInt(); // declaring the amt variable as an integer and equating it to the object method to collect the user's choice
		scanner.nextLine();//because the the nextInt method above, so as to make sure the next string input is collected.
		
		System.out.print("Enter the singular noun: ");// prompt to allow user input the singular noun
		
		String word = scanner.nextLine();// declaring the word variable as an integer and equating it to the object method to collect the user's choice
		
		//declaring the variable that will print the plural of the word as string 
		String pluralWord;
		
		//setting the conditions t
		if (amt == 1) { //if the amount selected by the user is one the singular form of the word should be returned
			pluralWord = word;
		}
		
		// using the endswith method to check if a string ends with a particualr suffix, and setting the condition to check for words that end in y and not
		//ay, ey,oy or uy
		else if(word.endsWith("y") && ! (word.endsWith("ay") || word.endsWith("oy")|| word.endsWith("ey") || word.endsWith("uy"))) {
			pluralWord= word.substring(0, word.length() -1) + "ies";
		}
		
		//setting the condition to add es to words that end with s,sh or ch
		else if (word.endsWith("s")||word.endsWith("sh")|| word.endsWith("ch")) {
			pluralWord = word + "es";
			
		}
		// default condition if the listed above is not fulfilled
		else {
			pluralWord = word + "s";
			
			//printing the the result by concatenating the amount and the plural word
			System.out.println(amt + " " + pluralWord);
			
			
		}
		










	}

}
