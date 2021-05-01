package basics.arrays;

import java.util.Scanner;

public class Frequency_element {
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
	public void frequencyofelement() {
		System.out.println("\n-----------------");
		for(int a:arr) {
			int c=0;
			for(int b:arr) {
				if (a==b) {c++;}
			}
			System.out.print(c+" ");
	}
	}
}
