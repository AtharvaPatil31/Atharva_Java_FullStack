package com.atharva.Bank;

public class Accounts {
	
	    private double balance;
	    private double overdraft;

	    public Accounts() {}

	    public Accounts(double balance) {
	        this.balance = balance;
	        overdraft = 10000;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount);
	        }
	    }

	    public void withdraw(double amount) throws ee {

	        if (amount <= balance) {
	            balance -= amount;
	        }
	        else if (amount <= balance + overdraft) {
	            double remaining = amount - balance;
	            balance = 0;
	            overdraft -= remaining;
	        }
	        else {
	            throw new ee("Insufficient funds!");
	        }
	    }

	    @Override
	    public String toString() {
	        return "Account Balance=" + balance +
	               ", Overdraft=" + overdraft ;
	    }
	}

