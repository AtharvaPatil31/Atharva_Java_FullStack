package Person;

public class Generics {
	
			private Object data;
			
			public Generics( Object data) {
				this.data=data;
				
			}

			public Object getData() {
				return data;
			}

			public void setData(Object data) {
				this.data = data;
			}
			
			public static void main(String[] args) {
				
				Generics g1 = new Generics("Hola");
				g1.setData(100);// objects are loosely typed
				System.out.println(g1.getData());
				
				Generics g2 = new Generics(3.14);
				System.out.println(g2.getData());
				
				Generics g3 = new Generics(new Person("Kim", 22));
				System.out.println(g3.getData());
				
				
			}
		}

