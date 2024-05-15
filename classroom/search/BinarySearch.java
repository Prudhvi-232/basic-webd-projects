package search;

public class BinarySearch {
	
	public int search(int []a,int first, int last, int item) {
		int  mid = (last+first)/2;
		if(item == a[last]) {
			return last;
		}
		if(item == a[mid]) {
			return mid;
		}
		if(first == mid && a[mid] != item) {
			return -1;
		}
		else if (item < a[mid]) {
			return search(a,first,mid-1,item);
		}
		else if (item > a[mid]) {
			return search(a,mid+1,last,item);
		}
		return -1;
	}

}