package vararguments;
public class VarArgs {
	void varTest(double ...v) {
		System.out.println("Number of parameter "+v.length);
		// System.out.println();
		double sum =0;
		for(double x : v) {
			//System.out.print(x + " ");
			sum = sum+x;		
		}
		System.out.println("sum "+sum);
	}
}