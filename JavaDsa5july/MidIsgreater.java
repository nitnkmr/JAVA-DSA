package JavaDsa5july;

import java.util.Scanner;

public class MidIsgreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int mid=0;
		mid=n/2;
		if(ar[mid]%2==0 && ar[mid]>n) {
			System.out.println("found");
		}
		else
			System.out.println("not found");

	}

}
