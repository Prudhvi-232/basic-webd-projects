package stack_example;

public class Main {

	public static void main(String[] args) {
		// Stack s = new Stack(10);
		Istack istack = new Stack(10);
		istack.push(7);
		istack.push(8);
		System.out.println("Stack status before pop(): " + istack.topOf());
		istack.pop();
		System.out.println("Stack status after pop(): " + istack.topOf());

	}

}