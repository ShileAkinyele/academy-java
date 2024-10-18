package com.bptn.course._junit_books;

public class Textbook extends Book {
	//Define a private int instance variable edition
	  private int edition;
	   
	//Define a constructor for Textbook that takes three parameters: a string title, a double price, and an int edition
	public Textbook(String title, double price, int edition){
	  super(title,price); //using super keyword to call title and price from the superclass constructor
	  this.edition = edition;
	}
	//Define a method called getBookInfo that overrides the getBookInfo method in the superclass
	@Override
	public String getBookInfo(){
	  return super.getBookInfo()+ " - " + edition;
	}

	//Define a method calledgetEdition that returns the value of edition
	public int getEdition(){
	  return edition;
	}

	//Define a method calledcanSubstituteFor that takes a Textbook object other as parameter
	public boolean canSubstituteFor(Textbook other){
	  return this.edition >= other.getEdition() && this.getTitle().equals(other.getTitle());
	}

	}
