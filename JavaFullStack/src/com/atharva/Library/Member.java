package com.atharva.Library;

public class Member {

	    private String name;
	    private Book  bk;

	    public Member(String name) {
	        this.name = name;
	    }

	    public Book  getBook() {
	        return bk;
	    }

	    public void issueBook(Book b) {
	        if (bk != null) {
	            System.out.println(name + " already has a book");
	            return;
	        }

	        if (b.getMember() != null) {
	            System.out.println(b.getTitle() + " is already issued");
	            return;
	        }

	        bk = b;
	        b.setMember(this);

	        System.out.println(name + " issued " + b.getTitle());
	    }

	    public void returnBook() {
	        if (bk == null) {
	            System.out.println(name + " has no book to return");
	            return;
	        }

	        System.out.println(name + " returned " + bk.getTitle());

	        bk.setMember(null);
	        bk = null;
	    }

	    @Override
	    public String toString() {
	        return "Member [Name=" + name + "]";
	    }

	    public void status() {
	        if (bk == null) {
	            System.out.println(name + " has not issued any book");
	        } else {
	            System.out.println(name + " has issued " + bk.getTitle());
	        }
	    }
	}

