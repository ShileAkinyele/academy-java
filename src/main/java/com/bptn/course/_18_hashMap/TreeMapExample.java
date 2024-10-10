package com.bptn.course._18_hashMap;

//importing the class
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		//create  an object 
		TreeMap<String, Integer> treemap = new TreeMap<>();
		
		treemap.put("Toronto", 10000); //population to the city
		treemap.put("Burlington", 4000);
		treemap.put("Ottawa", 2000);
		treemap.put("London", 500);
		treemap.put("Scorborough", 20000);
	//	map.put(null, 200); // throws NullPointerException because it does not allow to add null keys but multiple null values can be added
		
		treemap.put("Brampton", null);
		treemap.put("Hamilton", null);
		
		treemap.put("Toronto", 300000);
		
		System.out.println(treemap);
		
		//Using remove method to remove key-pair value
		treemap.remove("Burlington");
		
		System.out.println(treemap);
		
		//Get the first key of the map, this gets the first key
		System.out.println("The first key of the map: "+ treemap.firstKey());
		
		//Get the first entry of the map this returns the key value pair of the first entry
		System.out.println("The first entry of the map: "+ treemap.firstEntry());
		
		//Loop through the map using keySet() method
		for(String key: treemap.keySet()) {
			
			System.out.println("The key is: "+ key + " the value is: "+ treemap.get(key));
		}
		
		//subMap() method of TreeMap without using the boolean to include the toKey
		
		System.out.println("The sub map from Brampton to Ottawa excluding Ottawa " + treemap.subMap("Brampton", "Ottawa"));
		
		//subMap() method of TreeMap by including the boolean to include the toKey
		
		System.out.println("The sub map from Brampton to Ottawa including Ottawa  "+ treemap.subMap("Brampton", true, "Ottawa", true));
		
		//headMap(K toKey) method
		
		System.out.println("The map strictly less than key london: "+ treemap.headMap("London"));

	}

}

//Note
//it overrides the value of the key if there are duplicates.

//Insertion order- natural ascending order of the keys, the use of constructors can help alter this order
//Does not allow null values for the keys
//It allows multiple null values for the "values"
//Keys do not allow duplicates - if we try to insert a key once again, it will update it's value rather than creating the key again




