package com.bptn.course._16_javacollection_list._knowledgecheck;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {1, 44, 7, 9, -16, 3};
        //for (int i = 0; i < nums.length; i ++) {
        //}
        for (int num : nums){//using a for each instead of a for loop
            values.add(num);
        }
        System.out.println("Expected Result:\t [1, 44, 7, 9, -16, 3]");
        System.out.println("Your Result:\t\t " + values);
    }
}
