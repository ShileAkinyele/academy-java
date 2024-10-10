package com.bptn.course._17_javacollection_set;

import java.util.LinkedHashSet;
//import classes
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		//creating a TreeSet object 
		
		Set<String> treeSet = new TreeSet<>();
			
		//adding values 
		
		treeSet.add("cherry");
		treeSet.add("apple");
		treeSet.add("banana");
		treeSet.add("mango");
		treeSet.add("apple");
		//treeSet.add(null);
		
		//printing out the values 
				
	System.out.println("The LinkedHashSet of fruits: "+ treeSet );
	}

}
