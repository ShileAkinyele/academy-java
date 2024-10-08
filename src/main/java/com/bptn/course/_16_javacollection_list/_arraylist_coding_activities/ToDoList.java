package com.bptn.course._16_javacollection_list._arraylist_coding_activities;

import java.util.*;

public class ToDoList {
    
   public static void main(String[] args) {
      // Rewrite this code to use an ArrayList instead of an array
      //String[] toDoList = new String[3];
      //toDoList[0] = "Do homework";
      //toDoList[1] = "Help make dinner";
      //toDoList[2] = "Call grandma";

      // changing element at index 1
      //toDoList[1] = "Order pizza";

      //System.out.println(toDoList.length + " things to do!");
      //System.out.println("Here's the first thing to do: "
          // + toDoList[0] );

      // remove item 0 and move everything down
      //  (this can be done in 1 command with ArrayList)
     // toDoList[0] = toDoList[1];
     // toDoList[1] = toDoList[2];
     // toDoList[2] = "";

     // System.out.println("Here's the next thing to do: "
        //   + toDoList[0] );

        // step 1 Declare the array list  in the Order
        //Class name data type object name = new Class name <>()

        ArrayList<String> newList = new ArrayList<>();
        
        //Step 2 add the elements using .add() method
        newList.add("Do homework");
        newList.add("Help make dinner");
        newList.add("Call grandma");

        //Step 3 changing element at index 1
        newList.set(1, "Order pizza");

        //printing out the size of the arraylist and the things to do
        System.out.println(newList.size() + "things to do!");

        //printing out the first thing to do 
        System.out.println("Here's the first thing to do: "+ newList.get(0));
        
        // removing the first index
        newList.remove(0);

        //printing the next thing to do 
        System.out.println("Here's the next thing to do: " + newList.get(0));
   }


}
