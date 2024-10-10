package com.bptn.course._18_hashMap._instructorled;

//Import the HashMap class
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		
		//adding keys and values
		HashMap<String, Integer> people = new HashMap<>();
		
		people.put("Angie", 33);
		people.put("Steve", 30);
		people.put("John", 32);
		
		//printing the map
		 for (String key: people.keySet()) {
			 
			 System.out.println("Name: "+ key + ", Age: "+ people.get(key));
		 }
		

    }
	
	
	
	

}
