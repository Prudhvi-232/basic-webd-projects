package extendedInterface;

public class B implements ExtendedInterface{
	@Override
	public void meth1() {
		System.out.println("Method 1 of Interface A");	
	}
	@Override
	public void meth2() {
		System.out.println("Method 2 of Interface A");
	}
	@Override
	public void meth3() {
		System.out.println("Method 3 of Interface ExtendedInterface");
	}
}