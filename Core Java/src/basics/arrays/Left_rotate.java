package basics.arrays;

import java.util.Scanner;

public class Left_rotate {
	private int[] arr=new int[5];
	public void getinput() {
		System.out.println("Enter 5 array elements");
		try (Scanner sc = new Scanner(System.in)) {
			for(int i=0;i<this.arr.length;i++) {
				this.arr[i]=sc.nextInt();
				
			}
			sc.close();}
	}
	public void display() {
		System.out.println("Array1:");
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println("\n");
	}
	public int[] rotate(int n) {
		int t=0;
		int[] tarr=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
		if(n<arr.length) {
			tarr[i]=arr[n];
			n++;
		}
		else if(n>=arr.length) {
			tarr[i]=arr[t];
			t++;
		}
	}
		return tarr;
		
	}

}
