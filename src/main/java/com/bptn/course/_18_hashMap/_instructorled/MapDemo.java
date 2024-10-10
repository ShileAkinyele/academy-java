package com.bptn.course._18_hashMap._instructorled;

//importing classes
import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> numbers = new HashMap<>();
		numbers.put(1, "one");
		numbers.put(2, "two");
		numbers.put(3, "three");
		numbers.put(4, "four");
		numbers.put(5, "five");
		numbers.put(6, "six");
		numbers.put(7, "seven");
		numbers.put(8, "eight");
		numbers.put(9, "nine");
		numbers.put(10, "ten");
		
		//print the map using entrySet()
		for (Map.Entry<Integer,String> entry : numbers.entrySet()) {
		 
			System.out.println(entry.getKey()+ " : "+ entry.getValue());
		}
		
	  //Removing the key 7
		numbers.remove(7);
		
	 //Add another key-value pair for eleven: key: 11, value: eleven.
		numbers.put(11, "eleven");
		
		
	//printing the map using the keySet()
		for(Integer key: numbers.keySet()) {
			
			System.out.println(key + " : " + numbers.get(key));
		}

	}

}

