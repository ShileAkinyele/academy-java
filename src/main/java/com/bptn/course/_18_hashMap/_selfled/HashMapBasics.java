package com.bptn.course._18_hashMap._selfled;


//importing the HashMap class
import java.util.HashMap;

public class HashMapBasics {

  public static void main(String[] args) {
      // Instantiate HashMap and try to use some of the methods listed above.

    HashMap<String, Integer> map = new HashMap<>();
   // adding values 
    map.put("c", 20);
    map.put("d", 30);
    map.put("e", 100);
   
   System.out.println(map);

   //getting the value of class
   System.out.println(map.get("c"));


   // Instantiate HashMap and try to use some of the methods listed above.

    HashMap<String, String> map2 = new HashMap<>();
   // adding values 
    map2.put("shileola", "softwareEngineer");
    map2.put("tunde", "accountant");
    map2.put("shola", "doctor");
   
   System.out.println(map2);
   
   //getting the value of shileola
   System.out.println(map2.get("shileola"));
   
   //Removing a key 
   map2.remove("shileola");

   System.out.println(map2);
   

  }


}