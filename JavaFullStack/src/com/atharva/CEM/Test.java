package com.atharva.CEM;

public class Test {
	
		public static void main(String[] args) {
			Employee e =new Employee(1000);
			System.out.println(e.getSalary());
			Manager m = new Manager(1500,800);
			System.out.println(m.getSalary());
			Clerk c= new Clerk(1200,400);
			System.out.println(c.getSalary());
			
			showSalary(m);
			showSalary(c);
		}
			
			private static void showSalary(Employee e) {
				if (e instanceof Manager) {
					System.out.println("Employee Salary is: "+e.getSalary());
				}
				else
				{
					System.out.println("Clerk's Salary is: "+e.getSalary());	
				}
					
			
			}
	}


