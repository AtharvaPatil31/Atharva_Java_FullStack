package com.atharva.BigBazzar;
import java.util.LinkedList;

public class Cart {
	
		

		
			private LinkedList<Product> items;
		    private double total;

		    public Cart() {
		    	items = new LinkedList<>();
		    }

		    public void addtoCart(Product p) throws MyException {

		        if (items.size() > 5) {
		            throw new MyException("Cart is full!");
		        }

		        items.add(p);
		        total += p.getPrice();

		        System.out.println(p.getName() + " added to cart.");
		    }

		    public void checkout() {

		        System.out.println("--- Items in Cart ---");

		        for (Product p : items) {
		            System.out.println(p);
		        }

		        System.out.println("--------------------------------------------");
		        System.out.println("Total Amount = " + total);
		    }
		

	}


