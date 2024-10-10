package com.bptn.course._17_javacollection_set;
import java.util.HashSet;
//importing classes
import java.util.LinkedHashSet;
import java.util.Set;

//the LinkedHashset uses a hash table and a doubley linked list in its implementation but its elements are not indexed eventhough it
//preserves the insertion order
//it inherits methods from the hashset and implements the abstract methods in the set interface.
//cannot use traditional for loops cos its not indexed.

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		//creating a  LinkedHashSet object 
		
				Set<String> linkedhashSet = new LinkedHashSet<>();
					
				//adding values 
				
				linkedhashSet.add("apple");
				linkedhashSet.add("banana");
				linkedhashSet.add("cherry");
				linkedhashSet.add("mango");
				linkedhashSet.add("apple");
				linkedhashSet.add(null);
				
				//printing out the values 
						
			System.out.println("The LinkedHashSet of fruits: "+ linkedhashSet );

	}

}


// allows maximum one null value 
//does not allow duplicates 
//preserves the insertion order
