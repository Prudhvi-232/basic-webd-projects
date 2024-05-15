package tignt_coupling;

class A {
	B b;
	public A() {
		b= new B();
	}
	public void display() {
		System.out.println("Inside class A");
		b.display();
	}

}