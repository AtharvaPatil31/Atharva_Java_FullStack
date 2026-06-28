package com.atharva.Stock_Singleton;

public class Test {


	    public static void main(String[] args) {

	        Singelton s1 = Singelton.getStock();
	        Singelton s2 = Singelton.getStock();

	        System.out.println(s1 == s2);
	    }
	}

