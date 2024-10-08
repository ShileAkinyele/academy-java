package com.bptn.course._16_javacollection_list._knowledgecheck;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        //create an Arraylist to store names
        ArrayList<String> names = new ArrayList<String>();

        //defining an array of friends
        String[] friends = {"Sam", "Jessica", "Mark", "Alexis"};

        // creating a for loop to add each name to the names Arraylist
        for (int i = 0; i < friends.length; i++) {
            names.add(friends[i]);
        }
        System.out.println(names);
    }
}

//fixed the above by removing the equal sign from the less than, to take
//care of the ArrayIndexOutOfBoundsException.
//the elements contained in the list are 4 but indexing satrts at zero
//if we say <= lenght it checks for a 4th index which doesnt exist which will
//lead to an error.
