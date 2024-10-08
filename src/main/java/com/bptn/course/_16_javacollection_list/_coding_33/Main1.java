package com.bptn.course._16_javacollection_list._coding_33;

//import packages
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//second way to convert an array to an array list without using for loops or methods

public class Main1 {

	public static void main(String[] args) {
		
		String [] cars = {"Volvo","Honda","Ford"};
		
		List <String> newList = new ArrayList<>(Arrays.asList(cars));//the .aslist() method assigns values directly,without having to
		//use the .add() which assigns values individually, it converts an arraylist to a fixed list and can still be manipulated 
		
		System.out.println("The converted arraylist is: "+ newList);
	}

}
