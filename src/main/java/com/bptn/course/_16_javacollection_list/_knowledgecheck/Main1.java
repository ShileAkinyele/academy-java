package com.bptn.course._16_javacollection_list._knowledgecheck;

import java.util.List;
import java.util.ArrayList;
// Run this code, examine it, then answer the short answer question below:
public class Main1 {

    public static void main(String[] args) {
        
        List<Integer> grades =new ArrayList<>();
        
        //add elements { 1, 2, 3 };
        grades.add(1);
        grades.add(2);
        grades.add(3);
        
        System.out.printf("The size of the array is %d", grades.size());
    }
}
