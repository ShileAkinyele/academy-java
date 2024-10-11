package com.bptn.course._19_java_threads;

//threading using the extends keyword

class F extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {

			System.out.println("Hi Java");
		}
	}

}

class E extends Thread{

	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {

			System.out.println("Hello Java");
		}
	}

}

public class MyThread2 {

	public static void main(String[] args) {

		//Create an object of class A
		
		F myObj = new F();
		
		myObj.start();
		
		E myObj1 = new E();
		
		myObj1.start();
		
		System.out.println("Main thread");
		
		
	}

}

//Major key takeaways:
//1. Class A and B are running with the context of the main thread and hence it is not executed as separate thread
//2. Class A and B are extending Thread class
//3. the start() method executes it as a separate thread
//4. its not recommended to call the run method directly because it runs within the context of the main thread
