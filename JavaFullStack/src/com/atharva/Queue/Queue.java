package com.atharva.Queue;

public class Queue {
	
	    private int[] arr;
	    private int front;
	    private int rear;
	    private int capacity;

	    public Queue(int size) {
	        arr = new int[size];
	        capacity = size;
	        front = 0;
	        rear = -1;
	    }

	    public void enqueue(int value) {
	        if (isFull()) {
	            System.out.println("Queue Overflow");
	            return;
	        }
	        arr[++rear] = value;
	    }

	    public int dequeue() {
	        if (isEmpty()) {
	            System.out.println("Queue Underflow");
	            return -1;
	        }
	        return arr[front++];
	    }

	    public int peek() {
	        if (isEmpty()) {
	            System.out.println("Queue is Empty");
	            return -1;
	        }
	        return arr[front];
	    }

	    public boolean isEmpty() {
	        return front > rear;
	    }

	    public boolean isFull() {
	        return rear == capacity - 1;
	    }

	    public void display() {
	        if (isEmpty()) {
	            System.out.println("Queue is Empty");
	            return;
	        }

	        System.out.print("Queue: ");
	        for (int i = front; i <= rear; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }
	}

