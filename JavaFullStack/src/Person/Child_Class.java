package Person;

public class Child_Class <T,P> extends Using_Generics<T> {
	

		private P temp;
		
		
		public Child_Class(T data, P temp) {
			super(data);
			this.temp=temp;
		}
		
		public P getTemp() {
			return temp;
		}
		public void setTemp(P temp) {
			this.temp=temp;
		}
		public static void main(String[] args) {
			Child_Class<String, Integer> sd = new Child_Class<String, Integer>("Mona",99);
			System.out.println(sd.getData()+"\t"+sd.getTemp());
		}
		

	}


