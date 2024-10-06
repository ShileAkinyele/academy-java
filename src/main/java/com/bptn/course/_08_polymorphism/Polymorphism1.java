package com.bptn.course._08_polymorphism;

//Parent class
class Animal{
	
	void makeSound() {
		System.out.println("Animal makes a sound");
	}
	

}

//Sub class
class Dog extends Animal{
	
	
	@Override
	void makeSound() {
		System.out.println("Dog barks");
	}
	
	//it can also have its own methods
	
}


public class Polymorphism1 {

	public static void main(String[] args) {
		
		//create an object of Animal class
		Animal a1= new Animal();
		a1.makeSound();
		
		//create an object from Dog class
		Dog d1 =new Dog();
		d1.makeSound();


	}

}


//Major key takeaways
//Method overriding
//1. Scenario- when the subclass decides to override an existing method in the parent class
//2. Name of the method, return type of the method and number of parameters in the overriden method should be the same
//3. By convention, the overriden method has @Override annotation above its method signature
//4. Static methods in the parent class cannot be overriden
//5. Run-time polymorphism
