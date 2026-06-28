package com.atharva.Sam;

public class Sam {
	
	

	    @FunctionalInterface
	    interface Hello {
	        String greet();
	        default void demo() {
	        	System.out.println("Hellooooooo!!!");
	        	System.out.println("Hellooooooo!!!"+ teemp()
	        	);
	        }
	        static void Test () {
	        	System.out.println("Hello Test");
	        }
	        private String teemp() {
	        	return "Hello Trump!";
	        }
	    }

	    @FunctionalInterface
	    interface Printer {
	        void print(String name);
	    }

	    public static void main(String[] args) {

	        Hello h1 = () -> "Hello Lambda!";
	        System.out.println(h1.greet());

	        Hello h2 = () -> {
	            String msg = "Bonjour Lambda!";
	            return msg;
	        };

	        System.out.println(h2.greet());

	        Printer p1 = name -> System.out.println(name);
	        p1.print("Atharva");
	        
	        Printer p2 = System.out::println;
	        p2.print("Amaazing!!!");
	        h1.demo();
	        Hello.Test();
	        
	    }
	}


