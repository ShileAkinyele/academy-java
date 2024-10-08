package com.bptn.course._16_javacollection_list._arraylist_coding_activities;


import java.util.*;

public class StudentList {
	
   // main method for testing
   public static void main(String[] args) {
      ArrayList<Student> roster = new ArrayList<Student>();
      roster.add(new Student("Skyler", "skyler@sky.com", 323171));
      
      // add your code here
      roster.add(new Student("Ayanna", "ayanna@gmail.com", 789012));
      System.out.println(roster);
   }
 }
