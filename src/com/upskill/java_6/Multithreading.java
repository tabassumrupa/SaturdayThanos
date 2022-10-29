package com.upskill.java_6;

public class Multithreading {
	/* Multithreading is a Java feature that allows concurrent execution of two or more parts of a program.
	
	Threads can be created by using two mechanisms : 

		1. Extending the Thread class 
		2. Implementing the Runnable Interface */

	public static void main(String[] args) {
		int n = 4;
		for (int i =0; i< n; i++){
			MultithreadingDemo MultithreadingDemoObj = new MultithreadingDemo(); // Extending the Thread class
			MultithreadingDemoObj.start();	
		}
		
		int m = 3;
		for (int i =0; i< m; i++){
			Thread MultithreadingDemo2Obj = new Thread(new MultithreadingDemo2()); // Implementing the Runnable Interface
			MultithreadingDemo2Obj.start();
		}
	}
}

class MultithreadingDemo extends Thread {						// Extending the Thread class
	public void run(){
		try{
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		} catch (Exception e){
			System.out.println("Exception is caught");
		}
	}
}

class MultithreadingDemo2 implements Runnable{					// Implementing the Runnable Interface
	public void run(){
		try{
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		} catch (Exception e){
			System.out.println("Exception is caught");
		}
	}
}
