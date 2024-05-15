package vector;
import java.util.Iterator;
import java.util.Vector;
public class Main {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(3,2);
		System.out.println("Capacity: "+v.capacity());
		System.out.println("Initial Size: "+v.size());
		v.addElement(1); 
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		System.out.println("Updated Capacity: "+v.capacity());
		System.out.println("updated Size: "+v.size());
		
		Iterator<Integer> vItr = v.iterator();
		
		while(vItr.hasNext()) {
			System.out.print(vItr.next()+ " ");
		}
	}
}