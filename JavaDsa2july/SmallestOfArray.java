package JavaDsa2july;

import java.util.Scanner;

public class SmallestOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int small=a[0];
		for(int i=0;i<n;i++) {
			if(a[i]<small) {
				small=a[i];
			}
		}
		System.out.println(small);


	}

}
