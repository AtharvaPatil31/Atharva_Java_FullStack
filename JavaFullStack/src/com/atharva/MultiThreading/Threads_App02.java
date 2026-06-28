package com.atharva.MultiThreading;

public class Threads_App02 implements Runnable {
	
		private int data; // This is the state
		
		@Override
		public void run() {
			String tname = Thread.currentThread().getName(); // Tell u which thread is currently running!
			for(int c=1;c<=50;c++) {
				System.out.println(tname+ ":" + ++data);
			}
		}
		public static void main(String[] args) {
			Threads_App02 rn = new Threads_App02();
			Thread t1 = new Thread(rn,"First");
			Thread t2 = new Thread(rn,"Second");
			Thread t3 = new Thread(rn,"Third");
			
			t1.start(); //  
			t2.start();
			t3.start();
					}
	}


