package com.atharva.InterCommm;

public class InterComm {
		
	    private int value;
	    private boolean flag = false;

	    public synchronized void set() {
	        while (flag) {
	            try {
	                wait();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }

	        value = (int) (Math.random() * 10);
	        System.out.println("Set: " + value);

	        flag = true;
	        notify();
	    }

	    public synchronized void get() {
	        while (!flag) {
	            try {
	                wait();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }

	        System.out.println("Get: " + value);

	        flag = false;
	        notify();
	    }

	    public static void main(String[] args) {

	        InterComm data = new InterComm();

	        Producer producer = new Producer(data);
	        Consumer consumer = new Consumer(data);

	        producer.start();
	        consumer.start();
	    }
	}

	class Producer extends Thread {

	    private InterComm data;

	    public Producer(InterComm data) {
	        this.data = data;
	    }

	    @Override
	    public void run() {
	        while (true) {
	            data.set();

	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	            }
	        }
	    }
	}

	class Consumer extends Thread {

	    private InterComm data;

	    public Consumer(InterComm data) {
	        this.data = data;
	    }

	    @Override
	    public void run() {
	        while (true) {
	            data.get();

	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	            }
	        }
	    }
	}

