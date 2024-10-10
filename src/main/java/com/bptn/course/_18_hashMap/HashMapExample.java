package com.bptn.course._18_hashMap;

//importing classes
import java.util.HashMap;
import java.util.Map;

//Maps consist of key and values stored as key value pairs, for every key there is a value
//All keys must be unique 



public class HashMapExample {

	public static void main(String[] args) {
		
		//create an object
		Map<String, Integer> hashMap = new HashMap<>(); //the first wrapper class if for the key, the next is for the value
		
		//add key value pair to the map
		hashMap.put("Angie", 33);
		hashMap.put("Steve", 34);
		hashMap.put("John", 35);
		hashMap.put("Angie", 32);
		hashMap.put("Jane", 34);
		hashMap.put("Shile", 50);
		hashMap.put(null, 20);
		hashMap.put("Sarah", null);
		hashMap.put("Johnson", null);
		
		//printing out the Map
		System.out.println(hashMap);
		
		
		
		//using a keySet method to return the set view of the keys
		for(String key: hashMap.keySet()) {
			System.out.println("Name: "+key + " Age: "+ hashMap.get(key));
			
		}
		
		//getting the age of john and printing it
		System.out.println("Age of John is: "+ hashMap.get("John"));
		
		//updating the value of an existing key
		hashMap.replace("Jane", 40);
		
		System.out.println("The new age of Jane is: "+ hashMap.get("Jane"));
		
		//check if the key is present in the map using containskey (object k) method , gives a boolean return type
		if (hashMap.containsKey("Jane")) {
			System.out.println("The key is existing in the map");
			
		}else {
			System.out.println("The key is not existing in the map");
		}
		
		//putIfAbsent(Object k, Object v) is used to add a key value pair if a key does not exist in the map.
		//its a safer way of putting values than just using the put method, as it does not override, the put method overrides
		hashMap.putIfAbsent("Shile", 60);
		System.out.println(hashMap);
		
		//iterating through the hashMap using entrySet() method 
		for(Map.Entry<String, Integer> entry: hashMap.entrySet()) {
			System.out.println("Name: "+entry.getKey() + "Age: "+ entry.getValue());
		}

	}

}

//Note!!!

//hashMap does not preserve insertion order, it does not take duplicates and overrides the first duplicate if there exists any
//for the key because the keys always have to be unique,on the the other hand values can have duplicates.
//keys behave like sets while values behave like lists
//also a key can be tied to an object but not to many values.

//Major key takeaways:
//1. Does it preserve insertion order? No
//2. Does keys allow null values? Yes max 1 null value (Similar to a set)
//3. Does values allow null value? Yes values can consist of null value(-Multiple null value similar to List)
//4. Does keys allow duplicates? if we try to add a key once again, it overrides the value rather than creating a new <K,V> pair
//5. Does values allow duplicates? Yes



