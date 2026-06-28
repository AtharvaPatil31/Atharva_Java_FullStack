package com.atharva.Bank;

public class Test {
	

	    public static void main(String[] args) {

	        Accounts ac = new Accounts(5000);
	        System.out.println(ac);

	        try {
	            ac.withdraw(3000);
	            System.out.println(ac);

	            ac.withdraw(7000);
	            System.out.println(ac);

	            ac.deposit(2000);
	            System.out.println(ac);

	            ac.deposit(5000);
	            System.out.println(ac);

	        } catch (ee e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}


