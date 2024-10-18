package com.bptn.course._junit_books;

public class Book {

	  //In the Book class, define two private instance variables: title and price
	   private double price;
	   private String title;

	  //Define a constructor within the Book class that takes two parameters: title and price
	   public Book(String title, double price) {
	    this.price = price;
	    this.title = title;
	    }

	  // Define a getter method named getTitle
	  public String getTitle(){
	    return title;
	  }

	  //Define a method named getBookInfo
	  public String getBookInfo(){
	    return title + " - " + price;
	  }
	}


