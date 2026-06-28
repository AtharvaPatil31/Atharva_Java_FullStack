package com.atharva.Stock_Singleton;

public class Holder {

	    private Exchange ex;

	    public Holder() {
	        ex = Exchange.getInstance();
	    }

	    public void viewQuote() {
	        System.out.println("Holder sees quote: " + ex.getQuote());
	    }
	}

