package com.bptn.course._02_scanner;

import java.util.Scanner;

public class JavaInput {

	public static void main(String[] args) {
		//step1 create scanner which is the object of the Scanner class	
	     // className ObjectName(which can be anything)= new ClassName().object name here is scanner
			Scanner scanner = new Scanner(System.in);
			
		//step2 create a variable which will store the data type, here it will be a string since we are using username
			String userName;
			
		//step 3 ask the user to enter username by printing "Enter Username"
			System.out.println("Enter the username :");
			
		//step 4 assign the username variable to a method of the object depending on the datatype
			userName = scanner.nextLine();
			
		//step 5 print user name in the console
			System.out.println("The username is " + userName);
			
		//step 6 close the scanner
			scanner.close();
			

	}

}
