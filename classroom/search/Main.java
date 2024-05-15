package search;

public class Main {

	public static void main(String[] args) {
		int a[] = new int[] {2,3,4,6,7,8};
		 int item = 6;
		 BinarySearch bs = new BinarySearch();
		 int index = bs.search(a, 0, a.length-1, item);
		 if(index == -1) {
			 System.out.println("Item "+item +"Does not exist");
		 }
		 else {
			 System.out.println("Item "+item +"\nDoes exist at index "+index);
		 }
		

	}

}