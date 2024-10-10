package com.bptn.course._18_hashMap;

import java.util.HashMap;
//importing classes
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		//create an object
				Map<String, Integer> linkedhashMap = new LinkedHashMap<>(); //the first wrapper class if for the key, the next is for the value
				
				//add key value pair to the map
				linkedhashMap.put("Angie", 33);
				linkedhashMap.put("Steve", 34);
				linkedhashMap.put("John", 35);
				linkedhashMap.put("Angie", 32);
				linkedhashMap.put("Jane", 34);
				linkedhashMap.put("Shile", 50);
				linkedhashMap.put(null, 20);
				linkedhashMap.put("Sarah", null);
				linkedhashMap.put("Johnson", null);
				
	 //printing out the map
				System.out.println(linkedhashMap); //preserves insertion order using the keys
				
				
	//accessing a value in the linkedhashmap, this can be done using the .get method followed by the key representing the value
				System.out.println("Jane's age is "+ linkedhashMap.get("Jane"));
				
	//loop over linkedHashMap using entrySet() method
				for(Map.Entry<String, Integer> entry: linkedhashMap.entrySet()) {
					System.out.println("Name: "+entry.getKey() + "Age: "+ entry.getValue());
				}

		//looping over the map using an iterator //remember to always import iterator
				Iterator <Map.Entry<String, Integer>> it = linkedhashMap.entrySet().iterator();
				
				while(it.hasNext()) {
					Map.Entry<String, Integer> entry = it.next();
					System.out.println("Name: "+ entry.getKey() + " Age: " + entry.getValue());
				}
				
	}

}

//Note 
//when it overrides it maintains the first insertion order of the previous key value pair position but the values get updated.


//Major key takeaways:
//1. Does it preserve insertion order? Yes
//2. Does keys allow null values?  Yes it allows max one null value
//3. Does values allow null value?   Yes values can consist of null value(-Multiple null value similar to List)
//4. Does keys allow duplicates?  if we try to add a key once again, it overrides the value rather than creating a new <K,V> pair
//and maintains the order of the first key-value
//5. Does values allow duplicates? Yes

