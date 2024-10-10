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
