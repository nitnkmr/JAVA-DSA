package JavaDsa01Augest;

import java.util.Scanner;

public class FindAbsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=0;j<n;j++) {
				sum+=Math.abs(a[i]-a[j]);
			}
		
		System.out.println(sum);
		}
	}

}
