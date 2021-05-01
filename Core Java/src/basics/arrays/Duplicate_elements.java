package basics.arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Duplicate_elements {
	private int[] arr=new int[5];
	public void getinput() {
		System.out.println("Enter 5 array elements");
		try (Scanner sc = new Scanner(System.in)) {
			for(int i=0;i<this.arr.length;i++) {
				this.arr[i]=sc.nextInt();
			}
		}
	}
	public void display() {
		System.out.println("Array1:");
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}
	public Set<Integer> duplicate_elements() {
		Set<Integer> tarr=new HashSet<>();
		System.out.println("\n-----------------");
		for(int a=0;a<arr.length;a++) {		
			for(int b=1;b<arr.length;b++) {
				if (arr[a]==arr[b]) {
					tarr.add(arr[a]);
				}
			}
	}return tarr;
}
	}
