package vararguments;
public class Main {
	public static void main(String[] args) {
		//meth1(a)
		//    meth1(a,b)
		//meth1(a,b,c)
		VarArgs obj = new VarArgs();
		obj   .varTest(1.0,2.1);
		obj.varTest(1);
		   obj.varTest(1,2,3);
		obj.varTest();
	}
}