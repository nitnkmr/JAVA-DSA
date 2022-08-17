package JavaDsa14july;

import java.util.Scanner;

public class PeakElementoftheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=1;i<n-1;i++) {
			if(a[i]>a[i-1] && a[i]>a[i+1]) {

		}
		System.out.println(a[i]);
		}
	}

}
