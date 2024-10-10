package com.bptn.course._16_javacollection_list.linkedList;

//Import all classes 
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class LinkedListExample {
public static void main(String[] args) {
		//LinkedList are easier on memory than ArrayList when items are being added or removed frequently
	//difference between LinkedList and ArrayList revolves around how they are implemented behind the scenes
		LinkedList<String> colors= new LinkedList<>();//declaring a linked list
		
		//add colours to the list using .add()
		colors.add("puple");
		colors.add("white");
		colors.add("yellow");
		colors.add("orange");
		colors.add("pink");
		
		//printing out the list
		System.out.println("LinkedList after adding colors: "+ colors);
		
		
		
}
}
