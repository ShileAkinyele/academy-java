package com.bptn.course._04_arrays;

public class Array {

	public static void main(String[] args) {

//Declare and initialize an array with 6 values 
		int[] myArray = {3,5,7,9,11,13};

//Print the first and second element to the console
		System.out.println("First element: " + myArray[0]);
		System.out.println("First element: " + myArray[1]);

//Update first element to 30
		myArray[0]=30;
		System.out.println("Updated First element: " + myArray[0]);
//Updating last element of the array using length property
		myArray[myArray.length-1] = 130;
		System.out.println("Updated last element: " + myArray[myArray.length-1]);

		
	}
}
