package com.atharva.LinkedList;

public class LinkedList <T> {
	

	    private class node {
	        private T data;
	        private node next;

	        public node(T data) {
	            this.data = data;
	        }

	        public T getdata() {
	            return data;
	        }
	    }

	    private node head, last;

	    public void add(T data) {
	        node n = new node(data);

	        if (head == null) {
	            head = n;
	            last = n;
	        } else {
	            last.next = n;
	            last = n;
	        }
	    }
	    public void insert(int index, T data) {
	    

	        node n = new node(data);

	        
	        if (index == 0) {
	            n.next = head;
	            head = n;

	            if (last == null) {
	                last = n;
	            }
	            return;
	        }

	        node temp = head;

	        for (int i = 0; i < index - 1 && temp != null; i++) {
	            temp = temp.next;
	        }

	        if (temp == null) {
	        	
	            System.out.println("Invalid index");
	            return;
	        }

	        n.next = temp.next;
	        temp.next = n;

	        if (n.next == null) {
	            last = n;
	        }
	    }

	    public void remove(int index) {
	    	
	    	

	        if (head == null) {
	            System.out.println("List is empty");
	            return;
	        }

	       if (index ==0) {
	    	   head=head.next;
	    	    }        if (index == 0) {
	            head = head.next;

	            if (head == null) { 
	                last = null;
	            }
	            return;
	        }

	        node temp = head;

	        
	        for (int i = 0; i < index - 1 && temp != null; i++) {
	            temp = temp.next;
	        }

	        if (temp == null || temp.next == null) {
	            System.out.println("Invalid index");
	            return;
	        }

	       
	        if (temp.next == last) {
	            last = temp;
	        }

	        temp.next = temp.next.next;
	    }
	    public void print() {
	        node t = head;

	        while (t != null) {
	            System.out.println(t.getdata());
	            t = t.next;
	        }
	    }  
	    
	}


