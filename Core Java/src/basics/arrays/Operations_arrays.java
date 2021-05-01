package basics.arrays;

import java.util.Scanner;

public class Operations_arrays {
	private int[] arr=new int[6];
	public void getinput() {
		System.out.println("Enter 5 array elements");
		try (Scanner sc = new Scanner(System.in)) {
			for(int i=0;i<this.arr.length;i++) {
				this.arr[i]=sc.nextInt();
			}
		}
	}
	public int get_length() {
		return arr.length;
	}
	public void order_d() {
		System.out.println("Array1:");
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println("\n");
	}
	
	public void revrse_d() {
			System.out.println("Array1:");
			for(int a=arr.length;a>0;a++) {
				System.out.print(arr[a]+" ");
			}
	}
	public void even_position_d() {
		System.out.println("Array1:");
		for(int a=0;a<arr.length;a+=2) {
			System.out.print(a+" ");
		}
	}
	public void odd_position_d() {
		System.out.println("Array1:");
		for(int a=1;a<arr.length;a+=2) {
			System.out.print(a+" ");
		}
	}
	public void largest_d() {
		System.out.println("Array1:");
		int l=0;
		for(int a=0;a<arr.length;a++) {
			if(arr[a]>l)
			l=arr[a];
			}
		System.out.print("largest element is: "+l);
	}

	public void samallest_d() {
	System.out.println("Array1:");
	int s=0;
	for(int a=0;a<arr.length;a++) {
		if(arr[a]<s)
		s=arr[a];
		}
	System.out.print("smallest element is: "+s);
}
	public void sum_d() {
	System.out.println("Array1:");
	int s=0;
	for(int a=0;a<arr.length;a++) {
		s+=arr[a];
		}
	System.out.print("sum is: "+s);
}
	public int[] left_rotate(int n) {
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
	public int[] right_rotate(int a) {
		int t=0;
		int n=5-a;
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
	return tarr;}
	
	public int[] sort() {
		int t=0;
		for(int i=1;i<arr.length;i++) {
			for(int j=i;j>0;j--) {
			if(arr[j]<arr[j-1]) {
				t=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=t;
				
			}
			}
		}
		
		return arr;
	}
	public int[] rsort() {

		int t=0;
		for(int i=1;i<arr.length;i++) {
			for(int j=i;j>0;j--) {
			if(arr[j]>arr[j-1]) {
				t=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=t;
				
			}
			}
		}
		
		return arr;
	
	}
	public void Lsearch(int a) {
		for(int i=0;i<arr.length-1;i++) {
			if(a==arr[i]) {
				System.out.println("element "+a+" is in the position : "+i);
				break;
			}
		}
	}
	
	public void Bsearch(int a,int l,int s) {
		int m=(l+s)/2;
		if(a==arr[m]) {System.out.println("element found at the positon : "+m);}
		else if(a<arr[m]) {Bsearch(a, m-1, s);}
		else if(a>arr[m]) {Bsearch(a, l, m+1);}
		
	}
}
