package com.bptn.course._16_javacollection_list._knowledgecheck;

import java.util.ArrayList;

public class Test7 {
    public static String findLongest(ArrayList<String> list) {
        //code here
        String longest ="";

        for (String word:list){
            if(word.length()> longest.length()){
                longest = word;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Strings
        ArrayList<String> values = new ArrayList<String>();
        String[] words = {"singapore", "cattle", "metropolitan", "turnstile"};
        for (int i = 0; i < words.length; i ++) {
            values.add(words[i]);
        }
        System.out.println("Expected Result:\t metropolitan");
        System.out.print("Your Result:\t\t ");
        System.out.println(findLongest(values));
    }
}

