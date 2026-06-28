package com.atharva.Cars;

public class Features {
	
	    private String model;
	    private String[] features;

	    public Features(String model, String[] features) {
	        this.model = model;
	        this.features = features;
	    }

	    public void specs() {
	        System.out.println("Features of" + model);
	        for (String f : features) {
	            System.out.println(f);
	        }
	    }

	    public static void main(String[] args) {

	        String[] cretaFeatures = {
	        	"Auto Booster Headlights",
	            "Sunroof",
	            "Airbags",
	        };

	        String[] tharFeatures = {
	            "Electric Vehicle",
	            "Cruise Control",
	            "Airbags",
	        };

	        Features car1 = new Features(": Mahindra XUV 7X0", cretaFeatures);
	        Features car2 = new Features(": Tata Harrier", tharFeatures);

	        car1.specs();

	        System.out.println();

	        car2.specs();
	    }
	}

