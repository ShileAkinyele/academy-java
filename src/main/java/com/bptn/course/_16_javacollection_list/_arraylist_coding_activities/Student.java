package com.bptn.course._16_javacollection_list._arraylist_coding_activities;

class Student {

	   private String name;
	   private String email;
	   private int id;

	   public Student(String initName, String initEmail, int initId) {
	      name = initName;
	      email = initEmail;
	      id = initId;
	   }

	   // toString() method
	   public String toString() {
	     return id + ": " + name + ", " + email;
	   }

	}
