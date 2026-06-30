package QueueDemo;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

    	System.out.println("QUEUE IMPLEMENTATION");
    	System.out.println("-----------------------");
        // Queue Implementation
        Queue<String> que = new LinkedList<String>();

        que.offer("Apple");
        que.offer("Banana");
        que.offer("Cherry");

        System.out.println("Front Element: " + que.peek());
        System.out.println("Hi!"); // Fetch value but doesn't remove

        while (!que.isEmpty()) {
            System.out.println(que.poll()); // Fetch value and remove from Queue
        }
    	System.out.println("  ");

        Deque<String> deque = new LinkedList<>();
        
        System.out.println("DEQUEUE IMPLEMENTATION");
    	System.out.println("-----------------------");


        deque.offerFirst("XUV7X0");
        deque.offerLast("BMW X1");
        deque.offerLast("Toyota Fortuner");
        deque.offerFirst("Kia Carens");
        while (!deque.isEmpty()) {
            System.out.println(deque.poll());// Fetch value and remove from Dequeue
        }
        while (!deque.isEmpty()) {
            System.out.println(deque.pollFirst());// Fetch value and remove from Dequeue
        }
        while (!deque.isEmpty()) {
            System.out.println(deque.pollLast());// Fetch value and remove from Dequeue
        }

    }
}