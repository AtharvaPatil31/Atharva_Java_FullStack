package com.atharva.Cars;

public class Test {
	
	    private String model;
	    private String[] features;

	    public Test(String model, String... features) {
	        this.model = model;
	        this.features = features;
	    }

	    public void specs() {
	        System.out.println("Features of " + model);
	        for (String f : features) {
	            System.out.println(f);
	        }
	    }

	    public static void main(String[] args) {

	    	Test astor = new Test(
	                "MG Astor",
	                "Panoramic Sunroof",
	                "360 Camera",
	                "ADAS",
	                "Airbags"
	        );

	        astor.specs();
	    }
	}

