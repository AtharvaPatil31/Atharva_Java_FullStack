package Person;

public class Person implements Cloneable {
	

	
		private String name;
		private int age;
	    @Override
	    public Object clone() throws CloneNotSupportedException {
	        return super.clone();
	    }
		
		

		public  Person() {
			this("Polo",21);
		}

		public Person(String name, int age) { //Encapsulation
			this.name = name;
			this.age= age;
		}
		public void print() {
			System.out.println("Name: "+ name+", Age: "+age);
		}
		
	@Override
		public String toString() {
			return "personn [name=" + name + ", age=" + age + "]";
		}

	@Override
	public boolean equals(Object obj)  // here object obj is p2 and this is p1 
	{
		
		if ( obj instanceof Person ) {
			 Person p = ( Person) obj;
			if(this.age==p.age& name.equals(p.name)) {
				return true;
			}
		}
		return false;
		

	}

	public static void main(String[] args) throws CloneNotSupportedException {
		
		 Person p1 = new  Person("Polo",21);
		p1.print();
		 Person p2 = new  Person();
		p2.print();
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p1); //classname@hexcode implicitly calls toString() on object
		System.out.println(p1.equals(p2));
		 Person p3 = ( Person) p1.clone();
		System.out.println("P3 is: " + p3);
		
	}


	}


