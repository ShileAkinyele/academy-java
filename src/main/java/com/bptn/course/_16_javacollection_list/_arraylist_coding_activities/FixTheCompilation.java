package com.bptn.course._16_javacollection_list._arraylist_coding_activities;


import java.util.ArrayList;

public class FixTheCompilation {
    
    public static void printEvenElements(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0)
            {
                System.out.print(list.get(i) + ", ");
            }
        }
    }

    public static void main(String[] args)
    {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {1, 44, 7, 9, -16, 3, 2};
        for (int i = 0; i < nums.length; i ++)
        {
            values.add(nums[i]);
        }
        System.out.println("Expected output: 44, -16, 2,");
        System.out.print("Your output: ");
        printEvenElements(values);
        System.out.println();
    }
}
// insert a () at the end of the .size method
//i should be in a round bracket () not a square bracket 
//in the print statement and also should use the .get() method
//to access it.