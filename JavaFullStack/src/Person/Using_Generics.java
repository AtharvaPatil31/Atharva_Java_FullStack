package Person;

public class Using_Generics <T>{
	
		
		private T data;
		
		public Using_Generics( T data) {
			this.data=data;
			
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}
		
		public static void main(String[] args) {
			
			Using_Generics<String> g1 = new Using_Generics<String>("Hola");
			System.out.println(g1.getData());
			
			Generics g2 = new Generics(3.14);
			System.out.println(g2.getData());
			
			Generics g3 = new Generics(new Person("Kim", 22));
			System.out.println(g3.getData());
			
			
		}

	}

