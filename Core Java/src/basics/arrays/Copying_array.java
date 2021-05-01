package basics.arrays;

import java.util.Scanner;

public class Copying_array {
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
	public int[] copy() {
		int[] arr1=new int[arr.length];
		int i=0;
		for(int a:arr) {
			arr1[i]=a;
		i++;
			}
		
		return arr1;
		
	}
}
