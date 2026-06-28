package com.atharva.Library;

public class Book {
	
	    private String title;
	    private Member mbr;

	    public Book(String title) {
	        this.title = title;
	    }

	    public Member getMember() {
	        return mbr;
	    }

	    public void setMember(Member mbr) {
	        this.mbr = mbr;
	    }

	    public String getTitle() {
	        return title;
	    }

	    @Override
	    public String toString() {
	        return title;
	    }

	    public void status() {
	        if (mbr == null) {
	            System.out.println(title + " is not issued to any member");
	        } else {
	            System.out.println(title + " is issued to " + mbr);
	        }
	    }
	}

