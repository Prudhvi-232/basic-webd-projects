package loose_coupling;

public class Main {

	public static void main(String[] args) {
		Show b = new B();
		Show c = new C();
		
		A a1 = new A(b);
		   a1.display();
		   
		A a2 = new A(c);
		  a2.display();
		

	}

}