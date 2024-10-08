package com.bptn.course._16_javacollection_list._arraylist_coding_activities;

import java.util.*;  // import all classes in this package.

public class ListGetSet {
	
   public static void main(String[] args) {
	   
	   //declaring the array list 
      ArrayList<String> nameList = new ArrayList<String>();
      nameList.add("Diego");
      nameList.add("Grace");
      nameList.add("Deja");
      
      //printing out the elements in the list
      System.out.println(nameList);

      // add code here
     // printing the last element in the nameList
     System.out.println(nameList.get(nameList.size()-1));

     //changing the first name in the list
     nameList.set(0,"Shileola");


    // printing the list again
    System.out.println(nameList);
   }
}



