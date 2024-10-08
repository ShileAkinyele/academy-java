package com.bptn.course._16_javacollection_list._knowledgecheck;


import java.util.ArrayList;

public class Test5 {
    public static int sumNegValues(ArrayList<Integer> list) {
        //code here
        //initializing the sum variable to 0
        Integer sum = 0;

        //iterating through the list to add negative values to the sum
        for (Integer num : list){
            // if condition to check if a number is negative
            if (num < 0){
                sum += num; //adding the negative numbers to the sum
            }

        }

          // to Return value os the total sum of negative numbers
          return sum;

        



    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {-2, 34, -11, 9, -6, 3};
        for (int i = 0; i < nums.length; i ++) {
            values.add(nums[i]);
        }
        System.out.println("Expected Result:\t -19");
        System.out.print("Your Result:\t\t ");
        System.out.println(sumNegValues(values));
    }
}
