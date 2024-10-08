package com.bptn.course._16_javacollection_list._coding_34;

//importing classes
import java.util.ArrayList;
import java.util.List;


public class Main {

	//converting an Arraylist to an Array using the first method.
    public static void main(String[] args) {
        
       List<String> nameList = new ArrayList<String>();

       nameList.add("Robert");
       nameList.add("Samson");
       nameList.add("Alex");
       nameList.add("William");
       
       System.out.println("Elements of List: " + nameList);

       // Create an array of String named output of the same size as nameList.
       // Hint: use the size() method. 
       String [] output = new String[nameList.size()];
        
       // Fetch the elements from the nameList and insert them into the newly created array.
       // Hint: Use the get() method to fetch the elements from the arraylist
      for(int i=0; i<nameList.size() ;i++){
          output[i] = nameList.get(i);
      }
        System.out.print("Elements of Array: ");
        for (int i = 0 ; i < output.length ; i++){
            System.out.print(output[i] + "  ");
        }

    }
}
