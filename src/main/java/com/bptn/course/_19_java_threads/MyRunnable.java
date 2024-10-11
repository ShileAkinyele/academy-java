package com.bptn.course._19_java_threads;

//Step 1. Created a class that implements Runnable interface
public class MyRunnable implements Runnable {
	
	
	@Override
	public void run() {
		 
		for(int i=0; i<100; i++) {
			
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				System.out.println("Interuppted exception has occurred: "+ e.getMessage());
			}
		}
		
	}
	
	
	

	public static void main(String[] args) {
		

		//Step 2: Create an object of MyRunnable (class that implements the Runnable interface)
		MyRunnable myObj = new MyRunnable();
		
		//Step 3: Create an object from the Thread class and pass the object created in Step 2 into the constructor
		//of Thread class
		Thread thread = new Thread(myObj);
		
		//Step 4: Start the thread using start()
		thread.start();
		

	}



}


//Steps to create a thread using Runnable interface
//Step 1. Created a class that implements Runnable interface
//Step 2: Create an object of MyRunnable (class that implements the Runnable interface)
//Step 3: Create an object from the Thread class and pass the object created in Step 2 into the constructor
//of Thread class
//Step 4: Start the thread using start()

//sleep() ->its a static method 
//Throws:
//IllegalArgumentException - if the value of millis is negative
//InterruptedException - if any thread has interrupted the current thread. 
//The interrupted status of the current thread is cleared when this exception is thrown

//InterruptedException is a checked exception and hence java wants you to deal with it by surrounding it with a try/catch