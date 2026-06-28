package com.atharva.MultiThreading;

public class Deamon_Thread extends Thread {

		private int limit;
		
		public Deamon_Thread (int limit, String name) {
			super(name);
			this.limit=limit;
			}

		@Override
		public void run() {
			String tname = Thread.currentThread().getName();
			for(int c=1;c<=limit;c++) {
				System.out.println(tname + ": "+c);
			}
			
		}
		public static void main(String[] args) {
			Deamon_Thread d1 = new Deamon_Thread(50,"First");
			Deamon_Thread d2 = new Deamon_Thread(100,"Second");
			Deamon_Thread d3 = new Deamon_Thread(180,"Third");
			Deamon_Thread d4 = new Deamon_Thread(100000,"daemon");
			d4.setDaemon(true);
			
			d1.start();
			d2.start();
			d3.start();
			d4.start();
			
			
		}
}
