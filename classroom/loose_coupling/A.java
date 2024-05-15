package loose_coupling;

public class A {
	Show s;
	
	public A( Show s) {
		//s =s1;
		this.s =s;	
	}
	public void display() {
		System.out.println("Inside Class A");
		s.display();
	}

	
}
