package com.bptn.course._16_javacollection_list._coding_34;


//importing classes
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main1 {
	
   //second way to convert ArrayList to an Array
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<String>();
		
		//adding the elements 
		nameList.add("Robert");
		nameList.add("Samson");
		nameList.add("Alex");
		nameList.add("William");
		
		//printing out the elements in the list
		System.out.println("Elements of List: "+ nameList);
		
		//Declare an array whose length is equals to size of the ArrayList
		String [] output = new String [nameList.size()];
		
		output = nameList.toArray(output);
		
		//Print the elements in the array
		System.out.println("Elements of array"+Arrays.toString(output));
		
		

	}

}
