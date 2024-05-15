package sorting;

public class Sorting {
	private int a[];
	Sorting(int a[]){
		this.a = a;
	}
	int [] insertionSort() {
		int key,i,j;
		for(i =1; i<a.length;i++) {
			j= i-1;
			key= a[i];
			while(j>=0 && key < a[j]) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1]=key;
		}
		return a;
	}
}