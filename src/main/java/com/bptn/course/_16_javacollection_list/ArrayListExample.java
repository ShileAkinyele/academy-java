package com.bptn.course._16_javacollection_list;

//importing the classes because they are part of the java.util package
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
public static void main(String[] args) {
		
	
//there are two ways to declare an ArrayList
		//1st way of declaring ArrayList
		//ArrayList<Integer> arrayList = new ArrayList<>();	//Integer represents E which is the return type can be an wrapper class data type
		//primitive values do not work with Arraylists, they need to be wrapped.arrayList represents an object 
		
		//2nd way of declaring ArrayList this more prefered cos it follows the Dependency inversion principle and allows flexible 
	     // and not concrete implementation.
		List<Integer> arrayList = new ArrayList<>();
		
		//Adding  values to arrayList
		arrayList.add(100);
		arrayList.add(200);
		arrayList.add(300);
		arrayList.add(300);  //ArrayList allow duplicates
		arrayList.add(400);
		arrayList.add(null); //ArrayList allow null values
		arrayList.add(null); //ArrayList allows duplicate null values
		
		
		System.out.println(arrayList);//printing the elements in an arraylist
		
		//The size of the arraylist(shows the length of the arraylist)
		System.out.println("The size of arraylist: "+ arrayList.size());
		
		//Access the first element 
		System.out.println("The first element is: "+ arrayList.get(0));
		
		//Update the element at index 2, the first number is the index of the value that needs to be updated, while the second number 
		//is the value you are updating to and using set replaces an element thats the diff btwn set and add.
		arrayList.set(2, 250);
		
		System.out.println("Updated ArrayList" + arrayList);//printing out the list with the replaced value
		
		arrayList.set(5, 450); //setting the 5th index as 450
		
		System.out.println("Updated ArrayList" + arrayList);//printing out the list with the replaced value
		
		arrayList.add(7, 500); //the .add allows you add without specifying an index which will be at the bottom, or you can specify like
		//this example given adding 500 to the 7th index
		
		System.out.println("Updated ArrayList" + arrayList);//printing out the list with the replaced value
		
		//Remove an element from index 4, when you remove an element with an index it returns an element, when done with an object, it returns a boolean
		System.out.println("The element removed is: "+ arrayList.remove(4));//when elements are removed the rest of the elements shift
		//to the left by 1
		
		
		//getting the size of the ArrayList you use a .size() method
		System.out.println("The size of arraylist: "+ arrayList.size());
		
	
		//Elements in the Array list can be gotten by using either the traditional for loop or the for each loop
		//traditional is mostly used when indexed while for each is mostly used to access unindexed elements
		//Accessing the elements using traditional for-loop
		for(int i=0 ; i< arrayList.size() ;i++) {
			
			System.out.println(arrayList.get(i));
		}
		
		//Access the elements using for each loop
		for(Integer element: arrayList) {
			
			System.out.println(element);//printing out the elements from the for loop
		}

	}


}

//NOTE!!!

//<> diamond operator ->Java Generics


//1. SOLID principles 
//D- > Dependency inversion principle
//High-level modules should not depend on low-level modules. Both should depend on abstractions.
//Abstractions should not depend on details. Details should depend on abstractions.
///List is an abstraction (an interface), while ArrayList is a concrete implementation (a detail).



//1. The 1st way of declaring is relying on concrete implementation which does not follow Dependency Inversion Principle

//2. The 2nd of declaring is relying on Abstraction which follows DIP

//3.  ArrayList<Integer> arrayList = new ArrayList<>();  
//The arrayList object has access to both List methods and any methods specific to the ArrayList class 
//(like trimToSize() and ensureCapacity()).


//4. List<Integer> arrayList = new ArrayList<>();
//The arrayList object can only call methods defined in the List interface. You won’t have access to ArrayList-specific methods.

//5. array[0] --> access the first element in an array
//arrayList.get(0) ->access the first element in an ArrayList

//6. array.length -->length of an array
//arrayList.size() --> length of an ArrayList

//https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/ArrayList.html(documentation)



