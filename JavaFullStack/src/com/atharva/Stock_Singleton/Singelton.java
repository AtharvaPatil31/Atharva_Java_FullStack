package com.atharva.Stock_Singleton;

public class Singelton {
	

	    private static Singelton stock;

	    private Singelton() {
	    }

	    public static Singelton getStock() {
	        if (stock == null) {
	            stock = new Singelton();
	        }
	        return stock;
	    }
	}