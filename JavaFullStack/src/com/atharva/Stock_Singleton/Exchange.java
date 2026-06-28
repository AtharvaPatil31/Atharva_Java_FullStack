package com.atharva.Stock_Singleton;

public class Exchange {
	

	    private static Exchange instance;
	    private double quote;

	    private Exchange() {
	        quote = 1000.0;
	        System.out.println("Stock Exchange Created");
	    }

	    public static Exchange getInstance() {
	        if (instance == null) {
	            instance = new Exchange();
	        }
	        return instance;
	    }

	    public double getQuote() {
	        return quote;
	    }

	    public void setQuote(double quote) {
	        this.quote = quote;
	    }
	}

