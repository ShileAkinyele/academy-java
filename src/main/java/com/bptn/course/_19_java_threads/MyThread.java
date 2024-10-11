package com.bptn.course._19_java_threads;





class A {
	public void show() {
		for (int i =0; i<100; i++) {
			System.out.println("Hi Java");
			
		}
	}
 
}


class B {
	public void show() {
		for (int i =0; i<100; i++) {
			System.out.println("Hello Java");
		}	
}

}



public class MyThread {

	public static void main(String[] args) {
		
          //Create an object of class A
		A myobj = new A();
		myobj.show();
		
		//Create an object of class B
		B myobj2 = new B();
		myobj2.show();
	}

}
//Note when it is not a thread it will print in sequence when you call the moth show, the method is not executed as a separate thread. 