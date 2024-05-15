package sorting;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int size = sc.nextInt();
		 int a[] = new int[size];
		 
		 for(int i=0; i< size; i++) {
			 a[i]= sc.nextInt();
		 }
		 
		 // call the Sorting class
		 
		 Sorting s = new Sorting(a);
		         
		 int sortedArray[] =s.insertionSort();
		 for(int i=0; i < sortedArray.length; i++) {
			 System.out.print(sortedArray[i]+" ");
		 }
		 sc.close();      
	}
}

