package com.bptn.course._17_javacollection_set;

//import classes
import java.util.HashSet;
import java.util.Set;


//Sets do not consist of duplicate values and the data is not indexed because it is maintained using a hash table which uses a hash
//code to determine how data will be stored
public class HashSetExample {

	public static void main(String[] args) {
	
		//creating a  HashSet object 
		
		Set<String> hashSet = new HashSet<>();
			
		//adding values 
		
		hashSet.add("apple");
		hashSet.add("banana");
		hashSet.add("cherry");
		hashSet.add("mango");
		hashSet.add("apple");
		hashSet.add(null);
		
		//printing out the values 
				
	System.out.println("The HashSet of fruits: "+ hashSet );

	}

}

//Note
//it does not allow for duplicates and takes a maximum of 1 null value
//it can give any order as it does not preserve insertion order
//does not allow for duplicates, when you input duplicates it only picks one of the values.



//Major key takeaways:

//1. Insertion Order - NO
//2. It allows null values? It allows max 1 null value
//3. It allows duplicates ? NO
//4. Underlying implementation- Hash Table
//5. Is a HashSet indexed ? - NO
