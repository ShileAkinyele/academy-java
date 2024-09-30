package com.bptn.course._04_arrays;

public class Array2 {

	public static void main(String[] args) {
	int[] myArray = {10,20,30,40,50} ; // can be written as int[] myArray =new int[5]
	// printing the length of the array 
	System.out.println("The length of the array: " + myArray.length);
	
	//printing the first element of the array
	System.out.println("First element of the array: " + myArray[0]);
	
	//printing out the second element of the array
	System.out.println("The length of the array: " + myArray[1]);
	
	//updating the first index
	myArray[0]=100;
	
	System.out.println("First element of the array: " + myArray[0]);
			

	}

}
