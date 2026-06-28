package com.atharva.StringValidation;

public class StringValidation {
	

		public static void main(String[] args) {
			String s1="Hello";
			String s2= new String("Hello");
			String s3="Hello";
			
			 System.out.println(s1==s3); // here s1 and s3 are stored in string pool.
			 System.out.println(s1==s2); 
			s1=s1+" World";
			// System.out.println(s1);
			
			String name="Atharva";
			String nameRegex = "[A-Z]{1}[a-z]{3,}";
			System.out.println(name.matches(nameRegex));
			
			String phone="9822746322";
			String phoneRegex = "[6-9][0-9]{9}";
			System.out.println(phone.matches(phoneRegex));
			
			String email="test@gmail.com";
			String emailRegex ="^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
			System.out.println(email.matches(emailRegex));

			// her we are using new keyword to store string in the heap.	
			
		}
	}
