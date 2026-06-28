package com.atharva.Stock_Singleton;

public class Broker {
	

	    private Exchange ex;

	    public Broker() {
	        ex = Exchange.getInstance();
	    }

	    public void getQuote() {
	        System.out.println("Broker sees quote: " + ex.getQuote());
	    }
	}

