package com.atharva.MultiThreading;

public class Threads_App01 extends Thread {
	
	// Approach 1
		private int data; // This is the state
		public Threads_App01(String name) {
			super(name);
		}
		@Override
		public void run() {
			Thread ct = Thread.currentThread(); // Tell u which thread is currently running!
			String tname = ct.getName();
			for(int c=1;c<=50;c++) {
				System.out.println(tname+ ":" + ++data);
			}
		}
		public static void main(String[] args) {
			Threads_App01 t1 = new Threads_App01("First");
			Threads_App01 t2 = new Threads_App01("Second");
			Threads_App01 t3 = new Threads_App01("Third");
			
			t1.setPriority(MAX_PRIORITY);
			t3.setPriority(MIN_PRIORITY);
			t1.start(); // It is responsible to create the thread for each 
			t2.start();
			t3.start();
			Thread ct = Thread.currentThread(); // Tell u which thread is currently running!
			String tname = ct.getName();
			for(int c=1;c<=50;c++) {
				System.out.println(tname+ ":" + ++c);

		}
		

	}
	}


