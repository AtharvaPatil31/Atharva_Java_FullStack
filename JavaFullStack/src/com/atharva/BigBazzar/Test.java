package com.atharva.BigBazzar;

public class Test {
	
	    public static void main(String[] args) {
	  
	        Product p1 = new Product("Milk", 70.00);
	        Product p2 = new Product("Rice", 400.15);
	        Product p3 = new Product("Trimmer", 1200.00);
	        Product p4 = new Product("Mobile", 120000.00);
	        Product p5 = new Product("Trimmer", 1200.00);
	        Product p6 = new Product("Mobile", 120000.00);
	        
	      
	        Cart myCart = new Cart();
	        
	        try {
	        myCart.addtoCart(p1);
	        myCart.addtoCart(p2);
	        myCart.addtoCart(p3);
	        myCart.addtoCart(p4);
	        myCart.addtoCart(p5);
	        myCart.addtoCart(p6);
	        
	        System.out.println();
	        
	    
	        myCart.checkout();
	        System.out.println();
	    }
	        catch (MyException e) {
	        	System.out.println(e.getMessage());
	        	}
	        }
	}


