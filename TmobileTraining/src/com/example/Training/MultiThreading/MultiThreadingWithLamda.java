package com.example.Training.MultiThreading;

public class MultiThreadingWithLamda {
	
	public static void main(String[] args) {
		 Runnable myThread = () ->
	        {
	 
	          
	            Thread.currentThread().setName("myThread");
	            System.out.println(
	                Thread.currentThread().getName()
	                + " is running");
	        };
	 
	   
	        Thread run = new Thread(myThread);
	 
	        // Starting the thread
	        run.start();
	        
//	        System.out.println("____________________________________________________________________________________");
	        
//	        Runnable basic = () ->
//	        {
//	 
//	            String threadName
//	                = Thread.currentThread().getName();
//	            System.out.println("Running common task by "
//	                               + threadName);
//	        };
//	 
//	     
//	        Thread thread1 = new Thread(basic);
//	        Thread thread2 = new Thread(basic);
//	 
//	       
//	        thread1.start();
//	        thread2.start();
	}

}
